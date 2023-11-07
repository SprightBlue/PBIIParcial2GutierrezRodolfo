package ar.edu.unlam.pb2;

import java.util.Objects;

public class Venta {
	
	private Integer dniDelComprador;
	private String nombreDelComprador;
	private Double importe;

	public Venta(Integer dniDelComprador, String nombreDelComprador) {
		this.setDniDelComprador(dniDelComprador);
		this.setNombreDelComprador(nombreDelComprador);
		this.importe = 0.0;
	}

	public Integer getDniDelComprador() {
		return dniDelComprador;
	}

	private void setDniDelComprador(Integer dniDelComprador) {
		this.dniDelComprador = dniDelComprador;
	}

	public String getNombreDelComprador() {
		return nombreDelComprador;
	}

	private void setNombreDelComprador(String nombreDelComprador) {
		this.nombreDelComprador = nombreDelComprador;
	}

	public Double getImporte() {
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe += importe;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dniDelComprador);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venta other = (Venta) obj;
		return Objects.equals(dniDelComprador, other.dniDelComprador);
	}

}
