package ar.edu.unlam.pb2;

public class Zapatilla extends Producto implements Indumentaria {
	
	private String talle;
	private String color;

	public Zapatilla(Integer id, String descripcion, Integer talle, String marca, String color, Double precio) {
		super(id, descripcion, marca, precio);
		this.setTalle(talle);
		this.setColor(color);
	}

	@Override
	public String getTalle() {
		return talle;
	}

	private void setTalle(Integer talle) {
		this.talle = String.valueOf(talle);
	}

	@Override
	public String getColor() {
		return color;
	}

	private void setColor(String color) {
		this.color = color;
	}

}
