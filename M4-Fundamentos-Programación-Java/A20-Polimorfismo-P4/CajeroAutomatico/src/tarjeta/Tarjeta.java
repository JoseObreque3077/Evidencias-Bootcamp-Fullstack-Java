package tarjeta;

/**
 * Clase que representa a una tarjeta asociado a una cuenta.
 * @author José Obreque F.
 *
 */
public class Tarjeta {
	private String numTarjeta; //número de tarjeta
	private String tipoTarjeta; //tipo de tarjeta
	private boolean habilitada; //booleano que indica si la tarjeta está bloqueada o no
	
	/**
	 * Constructor de la clase Tarjeta.
	 * @param numTarjeta - número de tarjeta: String
	 * @param tipoTarjeta - tipo de tarjeta: String
	 */
	public Tarjeta(String numTarjeta, String tipoTarjeta) {
		this.numTarjeta = numTarjeta;
		this.tipoTarjeta = tipoTarjeta;
		this.habilitada = true;
	}
	
	/**
	 * Verifica si la tarjeta es válida o no.
	 * @param numTarjetaExt - número de tarjeta a comprobar: String
	 * @return boolean
	 */
	public boolean validarTarjeta(String numTarjetaExt) {
		if (!this.numTarjeta.equals(numTarjetaExt)) {
			return false;
		}
		else {
			return true;
		}
	}
	

	//Getters-Setters
	/**
	 * Método accesador del atributo numTarjeta.
	 * @return numTarjeta : String.
	 */
	public String getNumTarjeta() {
		return numTarjeta;
	}

	/**
	 * Método mutador del atributo numTarjeta.
	 * @param numTarjeta : String.
	 */
	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	/**
	 * Método accesador del atributo tipoTarjeta.
	 * @return (String) Tipo de tarjeta.
	 */
	public String getTipoTarjeta() {
		return tipoTarjeta;
	}

	/**
	 * Método mutador del atributo tipoTarjeta.
	 * @param tipoTarjeta - (String): Tipo de tarjeta.
	 */
	public void setTipoTarjeta(String tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}

	/**
	 * Método accesador del atributo habilitada.
	 * @return habilitada : boolean.
	 */
	public boolean isHabilitada() {
		return habilitada;
	}

	/**
	 * Método mutador del atributo habilitada.
	 * @param habilitada : boolean.
	 */
	public void setHabilitada(boolean habilitada) {
		this.habilitada = habilitada;
	}
}
