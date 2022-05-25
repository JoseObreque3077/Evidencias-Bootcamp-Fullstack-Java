package modelo;

public class Vehiculo {
	private String patente;
	private String marca;
	private int annFabricacion;
	private boolean vehiculoNuevo;
	private String tipo;
	
	public Vehiculo(String patente, String marca, int annFabricacion, boolean vehiculoNuevo, String tipo) {
		super();
		this.patente = patente;
		this.marca = marca;
		this.annFabricacion = annFabricacion;
		this.vehiculoNuevo = vehiculoNuevo;
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

	public int getAnnFabricacion() {
		return annFabricacion;
	}

	public void setAnnFabricacion(int annFabricacion) {
		this.annFabricacion = annFabricacion;
	}

	public boolean isVehiculoNuevo() {
		return vehiculoNuevo;
	}

	public void setVehiculoNuevo(boolean vehiculoNuevo) {
		this.vehiculoNuevo = vehiculoNuevo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
