package clases;

/**
 * Clase que representa un trabajo de mantención realizado a un auto.
 * @author José Obreque F.
 *
 */
public class Mantencion {
	private String tipoMant; //tipo de mantención a realizar
	private String obs; //observaciones
	private int monto; //monto del trabajo
	private Fecha fecha; //fecha de la mantención
	private Auto auto; //Composición: Auto al cual se le realiza la mantención
	
	/**
	 * Constructor de la clase Mantencion (sin parámetros), con datos de fecha y vehículo por defecto.
	 */
	public Mantencion() {
		this.tipoMant = "Cambio Aceite Motor";
		this.obs = "Aceite sintético especial GX";
		this.monto = 40000;
		this.fecha = new Fecha(monto, monto, monto);
		this.auto = new Auto();
	}
	
	/**
	 * Constructor de la clase Mantencion
	 * @param tipoMant - tipo de mantención: String
	 * @param obs - observaciones: String
	 * @param monto - monto a pagar: int
	 * @param fecha - fecha de la mantención: Fecha
	 * @param auto - auto al cual se le realiza la mantención: Auto
	 */
	public Mantencion(String tipoMant, String obs, int monto, Fecha fecha, Auto auto) {
		this.tipoMant = tipoMant;
		this.obs = obs;
		this.monto = monto;
		this.fecha = fecha;
		this.auto = auto;
	}
	
	@Override
	/**
	 * Permite imprimir directamente los atributos de una instancia de la clase Fecha.
	 * Método sobreescrito, con origen en la clase Object.
	 */
	public String toString() {
		String salida = "Patente: " + this.auto.getPatente() +
				" || Tipo Mant: " + this.tipoMant +
				" || Obs: " + this.obs +
				" || Monto: $" + this.monto +
				" || Fecha: " + this.fecha.toString();
		return salida;
	}
	
	/**
	 * Permite imprimir los atributos de una instancia de la clase Fecha.
	 * @return Cadena de texto con los valores de los parámetros: String
	 */
	public String impresion() {
		String salida = "Patente: " + this.auto.getPatente() +
				" || Tipo Mant: " + this.tipoMant +
				" || Obs: " + this.obs +
				" || Monto: $" + this.monto +
				" || Fecha: " + this.fecha.toString();
		return salida;
	}
	
	//Getters -- Setters
	
	/**
	 * Método accesador del atributo tipoMant.
	 * @return tipoMant : String.
	 */
	public String getTipoMant() {
		return tipoMant;
	}

	/**
	 * Método mutador del atributo tipoMant.
	 * @param tipoMant : String.
	 */
	public void setTipoMant(String tipoMant) {
		this.tipoMant = tipoMant;
	}

	/**
	 * Método accesador del atributo obs.
	 * @return obs : String.
	 */
	public String getObs() {
		return obs;
	}

	/**
	 * Método mutador del atributo obs.
	 * @param obs : String.
	 */
	public void setObs(String obs) {
		this.obs = obs;
	}

	/**
	 * Método accesador del atributo monto.
	 * @return monto : int.
	 */
	public int getMonto() {
		return monto;
	}

	/**
	 * Método mutador del atributo monto.
	 * @param monto : int.
	 */
	public void setMonto(int monto) {
		this.monto = monto;
	}

	/**
	 * Método accesador del atributo fecha.
	 * @return fecha : Fecha.
	 */
	public Fecha getFecha() {
		return fecha;
	}

	/**
	 * Método mutador del atributo fecha.
	 * @param fecha : Fecha.
	 */
	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	/**
	 * Método accesador del atributo auto.
	 * @return auto : Auto.
	 */
	public Auto getAuto() {
		return auto;
	}

	/**
	 * Método mutador del atributo auto.
	 * @param auto : Auto.
	 */
	public void setAuto(Auto auto) {
		this.auto = auto;
	}
}
