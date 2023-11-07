package ar.edu.unlam.pb2;

public class Heladera extends Producto implements Electrodomestico {
	
	private boolean noFrost;
	private Integer garantia;

	public Heladera(Integer id, String descripcion, boolean noFrost, Integer garantia, String marca, Double precio) {
		super(id, descripcion, marca, precio);
		this.setNoFrost(noFrost);
		this.setGarantia(garantia);
	}
	
	public boolean isNoFrost() {
		return noFrost;
	}

	private void setNoFrost(boolean noFrost) {
		this.noFrost = noFrost;
	}

	@Override
	public Integer getGarantia() {
		return garantia;
	}

	private void setGarantia(Integer garantia) {
		this.garantia = garantia;
	}

}
