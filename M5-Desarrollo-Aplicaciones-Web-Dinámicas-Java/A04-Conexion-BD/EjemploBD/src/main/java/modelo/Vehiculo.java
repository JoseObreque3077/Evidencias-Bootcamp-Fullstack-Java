package modelo;

public class Vehiculo {
	private String patente;
	private String marca;
	private int anio;
	private boolean estado;
	private String tipo;
	
	public Vehiculo(String patente, String marca, int anio, boolean estado, String tipo) {
		this.patente = patente;
		this.marca = marca;
		this.anio = anio;
		this.estado = estado;
		this.tipo = tipo;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
