package operacion;
/**
 * Clase que representa a la Operacion 
 * @author José Obreque F.
 *
 */
public class Operacion {
	private String operacion;
	private String fecha;
	private String tipoCuenta;
	private String cliente;
	private String observaciones;
	
/**
 * Constructor de la clase Operacion 
 * @param operacion - operación realizada: String
 * @param fecha - fecha de la operación: String
 * @param tipoCuenta - tipo de cuenta: String
 * @param cliente - nombre del cliente: String
 * @param observaciones - observaciones de la operación: String
 */
	public Operacion(String operacion, String fecha, String tipoCuenta, String cliente, String observaciones) {
		this.operacion = operacion;
		this.fecha = fecha;
		this.tipoCuenta = tipoCuenta;
		this.cliente = cliente;
		this.observaciones = observaciones;
	}
	
	/**
	 * Muestra un resumen de los atributos de una transacción.
	 */
	public void mostrarHistorial() {
		String texto;
		texto = "Operación: " + this.operacion + ", fecha: " + this.fecha + ", Tipo de Cuenta: " +
		this.tipoCuenta + ", Nombre Cliente: " + this.cliente + ", Obs: " + this.observaciones;
		System.out.println(texto);
	}
	
	/**
	 * Método accesador del atributo operacion
	 * @return (String) Operación realizada.
	 */
	public String getOperacion() {
		return operacion;
	}
	
	/**
	 * Método mutador del atributo operacion.
	 * @param operacion - (String): Operación realizada.
	 */
	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}
	
	/**
	 * Método accesador del atributo fecha.
	 * @return (String) Fecha de la transacción.
	 */
	public String getFecha() {
		return fecha;
	}
	
	/**
	 *  Método mutador del atributo fecha
	 * @param fecha - (String) Fecha de la transacción.
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	/**
	 * Método accesador del atributo tipoCuenta
	 * @return (String) Tipo de cuenta
	 */
	public String getTipoCuenta() {
		return tipoCuenta;
	}
	
	/**
	 * Método mutador del atributo tipoCuenta
	 * @param tipoCuenta - (String) Tipo de cuenta
	 */
	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	
	/**
	 * Método accesador del atributo cliente
	 * @return (String) Nombre del cliente
	 */
	public String getCliente() {
		return cliente;
	}
	
	/**
	 * Método mutador del atributo cliente
	 * @param cliente - (String): Nombre del cliente
	 */
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	/**
	 * Método accesador del atributo observaciones
	 * @return (String) Observaciones.
	 */
	public String getObservaciones() {
		return observaciones;
	}
	
	/**
	 * Método mutador del atributo observaciones
	 * @param observaciones - (String): Observaciones.
	 */
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
}