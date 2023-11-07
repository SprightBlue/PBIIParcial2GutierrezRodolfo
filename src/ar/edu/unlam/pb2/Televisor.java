package ar.edu.unlam.pb2;

public class Televisor extends Producto implements Electrodomestico {
	
	private Integer pulgadas;
	private Integer garantia;

	public Televisor(Integer id, String descripcion, Integer pulgadas, Integer garantia, String marca, Double precio) {
		super(id, descripcion, marca, precio);
		this.setPulgadas(pulgadas);
		this.setGarantia(garantia);
	}
	
	public Integer getPulgadas() {
		return pulgadas;
	}
	
	private void setPulgadas(Integer pulgadas) {
		this.pulgadas = pulgadas;
	}

	@Override
	public Integer getGarantia() {
		return garantia;
	}

	private void setGarantia(Integer garantia) {
		this.garantia = garantia;
	}

}
