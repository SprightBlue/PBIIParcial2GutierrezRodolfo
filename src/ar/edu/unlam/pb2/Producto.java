package ar.edu.unlam.pb2;

public abstract class Producto {
	
	protected Integer id;
	protected String descripcion;
	protected String marca;
	protected Double precio;
	
	public Producto(Integer id, String descripcion, String marca, Double precio) {
		this.setId(id);
		this.setDescripcion(descripcion);
		this.setMarca(marca);
		this.setPrecio(precio);
	}

	public Integer getId() {
		return id;
	}

	protected void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	protected void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getMarca() {
		return marca;
	}

	protected void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPrecio() {
		return precio;
	}

	protected void setPrecio(Double precio) {
		this.precio = precio;
	}

}
