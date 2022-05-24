package tarjeta;

/**
 * Clase que representa a una tarjeta asociado a una cuenta.
 * @author Jos� Obreque F.
 *
 */
public class Tarjeta {
	private String numTarjeta; //n�mero de tarjeta
	private String tipoTarjeta; //tipo de tarjeta
	private boolean habilitada; //booleano que indica si la tarjeta est� bloqueada o no
	
	/**
	 * Constructor de la clase Tarjeta.
	 * @param numTarjeta - n�mero de tarjeta: String
	 * @param tipoTarjeta - tipo de tarjeta: String
	 */
	public Tarjeta(String numTarjeta, String tipoTarjeta) {
		this.numTarjeta = numTarjeta;
		this.tipoTarjeta = tipoTarjeta;
		this.habilitada = true;
	}
	
	/**
	 * Verifica si la tarjeta es v�lida o no.
	 * @param numTarjetaExt - n�mero de tarjeta a comprobar: String
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
	 * M�todo accesador del atributo numTarjeta.
	 * @return numTarjeta : String.
	 */
	public String getNumTarjeta() {
		return numTarjeta;
	}

	/**
	 * M�todo mutador del atributo numTarjeta.
	 * @param numTarjeta : String.
	 */
	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	/**
	 * M�todo accesador del atributo tipoTarjeta.
	 * @return (String) Tipo de tarjeta.
	 */
	public String getTipoTarjeta() {
		return tipoTarjeta;
	}

	/**
	 * M�todo mutador del atributo tipoTarjeta.
	 * @param tipoTarjeta - (String): Tipo de tarjeta.
	 */
	public void setTipoTarjeta(String tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}

	/**
	 * M�todo accesador del atributo habilitada.
	 * @return habilitada : boolean.
	 */
	public boolean isHabilitada() {
		return habilitada;
	}

	/**
	 * M�todo mutador del atributo habilitada.
	 * @param habilitada : boolean.
	 */
	public void setHabilitada(boolean habilitada) {
		this.habilitada = habilitada;
	}
}
