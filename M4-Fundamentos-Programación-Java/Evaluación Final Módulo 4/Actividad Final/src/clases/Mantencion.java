package clases;

/**
 * Clase que representa un trabajo de mantenci�n realizado a un auto.
 * @author Jos� Obreque F.
 *
 */
public class Mantencion {
	private String tipoMant; //tipo de mantenci�n a realizar
	private String obs; //observaciones
	private int monto; //monto del trabajo
	private Fecha fecha; //fecha de la mantenci�n
	private Auto auto; //Composici�n: Auto al cual se le realiza la mantenci�n
	
	/**
	 * Constructor de la clase Mantencion (sin par�metros), con datos de fecha y veh�culo por defecto.
	 */
	public Mantencion() {
		this.tipoMant = "Cambio Aceite Motor";
		this.obs = "Aceite sint�tico especial GX";
		this.monto = 40000;
		this.fecha = new Fecha(monto, monto, monto);
		this.auto = new Auto();
	}
	
	/**
	 * Constructor de la clase Mantencion
	 * @param tipoMant - tipo de mantenci�n: String
	 * @param obs - observaciones: String
	 * @param monto - monto a pagar: int
	 * @param fecha - fecha de la mantenci�n: Fecha
	 * @param auto - auto al cual se le realiza la mantenci�n: Auto
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
	 * M�todo sobreescrito, con origen en la clase Object.
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
	 * @return Cadena de texto con los valores de los par�metros: String
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
	 * M�todo accesador del atributo tipoMant.
	 * @return tipoMant : String.
	 */
	public String getTipoMant() {
		return tipoMant;
	}

	/**
	 * M�todo mutador del atributo tipoMant.
	 * @param tipoMant : String.
	 */
	public void setTipoMant(String tipoMant) {
		this.tipoMant = tipoMant;
	}

	/**
	 * M�todo accesador del atributo obs.
	 * @return obs : String.
	 */
	public String getObs() {
		return obs;
	}

	/**
	 * M�todo mutador del atributo obs.
	 * @param obs : String.
	 */
	public void setObs(String obs) {
		this.obs = obs;
	}

	/**
	 * M�todo accesador del atributo monto.
	 * @return monto : int.
	 */
	public int getMonto() {
		return monto;
	}

	/**
	 * M�todo mutador del atributo monto.
	 * @param monto : int.
	 */
	public void setMonto(int monto) {
		this.monto = monto;
	}

	/**
	 * M�todo accesador del atributo fecha.
	 * @return fecha : Fecha.
	 */
	public Fecha getFecha() {
		return fecha;
	}

	/**
	 * M�todo mutador del atributo fecha.
	 * @param fecha : Fecha.
	 */
	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	/**
	 * M�todo accesador del atributo auto.
	 * @return auto : Auto.
	 */
	public Auto getAuto() {
		return auto;
	}

	/**
	 * M�todo mutador del atributo auto.
	 * @param auto : Auto.
	 */
	public void setAuto(Auto auto) {
		this.auto = auto;
	}
}
