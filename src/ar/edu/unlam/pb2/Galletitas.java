package ar.edu.unlam.pb2;

public class Galletitas extends Producto implements Comestible{
	
	private String fechaDeElaboracion;
	private String fechaDeVencimiento;

	public Galletitas(Integer id, String descripcion, String fechaDeElaboracion, String fechaDeVencimiento, String marca, Double precio) {
		super(id, descripcion, marca, precio);
		this.setFechaDeElaboracion(fechaDeElaboracion);
		this.setFechaDeVencimiento(fechaDeVencimiento);
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
	
}
