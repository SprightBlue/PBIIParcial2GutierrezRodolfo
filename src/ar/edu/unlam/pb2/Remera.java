package ar.edu.unlam.pb2;

public class Remera extends Producto implements Indumentaria {
	
	private String talle;
	private String color;

	public Remera(Integer id, String descripcion, String talle, String marca, String color, Double precio) {
		super(id, descripcion, marca, precio);
		this.setTalle(talle);
		this.setColor(color);
	}

	@Override
	public String getTalle() {
		return talle;
	}

	private void setTalle(String talle) {
		this.talle = talle;
	}

	@Override
	public String getColor() {
		return color;
	}

	private void setColor(String color) {
		this.color = color;
	}

}
