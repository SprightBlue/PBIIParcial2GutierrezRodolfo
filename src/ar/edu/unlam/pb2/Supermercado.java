package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Supermercado {
	
	String nombre; // Nombre del supermercado
	private Set<Producto> productosExistentes; // Listado de productos que se comercializan
	private List<Producto> productosDisponibles; // Detalle de cada producto ingresado
	private Map<Integer, Venta> ventasRealizadas; // Listado de ventas realizadas (identificadas por el n�mero de venta)
	Integer contadorDeVentas; // Identificador del n�mero de venta
	
	public Supermercado(String nombre) {
		this.setNombre(nombre);
		this.productosExistentes = new TreeSet<Producto>(new Comparator<Producto>() {

			@Override
			public int compare(Producto producto1, Producto producto2) {
				return producto1.getId().compareTo(producto2.getId());
			}
			
		});
		this.productosDisponibles = new ArrayList<Producto>();
		this.ventasRealizadas = new HashMap<>();
		this.contadorDeVentas = 0;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void ingresarProducto(Producto nuevo) {
		if(!this.productosExistentes.contains(nuevo)) {
			this.productosExistentes.add(nuevo);
		}
		this.productosDisponibles.add(nuevo);
	}

	public Set<Producto> getOfertaDeProductos() {
		return this.productosExistentes;
	}
	
	public Integer getStock(Integer codigo) {
		Integer cantidad = 0;
		Iterator<Producto> iterador = this.productosDisponibles.iterator();
		while(iterador.hasNext()) {
			Producto productoIterado = iterador.next();
			if(productoIterado.getId().equals(codigo)) {
				cantidad++;
			}
		}
		return cantidad;
	}

	private Boolean productoExiste(Integer codigoDeProducto) throws ProductoInexistente{
		// Verifica si un producto existe
		Producto productoBuscado = null;
		Iterator<Producto> iterador = this.productosExistentes.iterator();
		Boolean encontrado = false;
		while(!encontrado && iterador.hasNext()) {
			Producto productoIterado = iterador.next();
			if(productoIterado.getId().equals(codigoDeProducto)) {
				productoBuscado = productoIterado;
				encontrado = true;
			}
		}
		if(productoBuscado==null) {
			throw new ProductoInexistente();
		}
		return encontrado;
	}
	
	private Producto getProductoPorCodigo(Integer codigoDeProducto) throws ProductoSinStock {
		// Busca la disponibilidad de un producto
		Producto productoBuscado = null;
		Iterator<Producto> iterador = this.productosDisponibles.iterator();
		boolean encontrado = false;
		while(!encontrado && iterador.hasNext()) {
			Producto productoIterado = iterador.next();
			if(productoIterado.getId().equals(codigoDeProducto)) {
				productoBuscado = productoIterado;
				this.productosDisponibles.remove(productoIterado);
				encontrado = true;
			}
		}	
		if(productoBuscado==null) {
			throw new ProductoSinStock();
		}		
		return productoBuscado;
	}
	
	public Integer registrarNuevaVenta(Integer dniDelComprador, String nombreDelComprador) {
		// Registra una nueva venta
		ventasRealizadas.put(++contadorDeVentas, new Venta(dniDelComprador, nombreDelComprador));
		return contadorDeVentas;
	}
		
	public Venta getVenta(Integer nueroDeVenta) {
		// Devuelve una venta en funci�n de su n�mero identificatorio
		return this.ventasRealizadas.get(nueroDeVenta);
	}

	public void agregarAlCarrito(Integer numeroDeVenta, Integer codigoDeProducto) throws ProductoSinStock, ProductoInexistente {
		// Incorpora al carrito de compras de la venta identificada por el "numeroDeVenta", el producto identificado por el "codigoDeProducto"
		Venta ventaBuscada = this.ventasRealizadas.get(numeroDeVenta);
		this.productoExiste(codigoDeProducto);
		Producto productoBuscado = this.getProductoPorCodigo(codigoDeProducto);
		ventaBuscada.setImporte(productoBuscado.getPrecio());
	}


}
