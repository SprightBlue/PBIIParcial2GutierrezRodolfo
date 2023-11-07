package ar.edu.unlam.pb2;

public class Carne extends Producto implements Comestible {
	
	private String fechaDeElaboracion;
	private String fechaDeVencimiento;
	private Double kilos;

	public Carne(Integer id, String descripcion, String fechaDeElaboracion, String fechaDeVencimiento, Double kilos, String marca, Double precio) {
		super(id, descripcion, marca, precio);
		this.setFechaDeElaboracion(fechaDeElaboracion);
		this.setFechaDeVencimiento(fechaDeVencimiento);
		this.setKilos(kilos);
	}

	@Override
	public String getFechaDeElaboracion() {
		return fechaDeElaboracion;
	}

	@Override
	public String getFechaDeVencimiento() {
		return fechaDeVencimiento;
	}
	
	private void setFechaDeElaboracion(String fechaDeElaboracion) {
		this.fechaDeElaboracion = fechaDeElaboracion;
	}

	private void setFechaDeVencimiento(String fechaDeVencimiento) {
		this.fechaDeVencimiento = fechaDeVencimiento;
	}

	public Double getKilos() {
		return kilos;
	}

	private void setKilos(Double kilos) {
		this.kilos = kilos;
	}

}
