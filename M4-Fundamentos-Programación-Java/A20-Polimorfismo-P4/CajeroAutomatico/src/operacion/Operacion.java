package operacion;
/**
 * Clase que representa a la Operacion 
 * @author Jos� Obreque F.
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
 * @param operacion - operaci�n realizada: String
 * @param fecha - fecha de la operaci�n: String
 * @param tipoCuenta - tipo de cuenta: String
 * @param cliente - nombre del cliente: String
 * @param observaciones - observaciones de la operaci�n: String
 */
	public Operacion(String operacion, String fecha, String tipoCuenta, String cliente, String observaciones) {
		this.operacion = operacion;
		this.fecha = fecha;
		this.tipoCuenta = tipoCuenta;
		this.cliente = cliente;
		this.observaciones = observaciones;
	}
	
	/**
	 * Muestra un resumen de los atributos de una transacci�n.
	 */
	public void mostrarHistorial() {
		String texto;
		texto = "Operaci�n: " + this.operacion + ", fecha: " + this.fecha + ", Tipo de Cuenta: " +
		this.tipoCuenta + ", Nombre Cliente: " + this.cliente + ", Obs: " + this.observaciones;
		System.out.println(texto);
	}
	
	/**
	 * M�todo accesador del atributo operacion
	 * @return (String) Operaci�n realizada.
	 */
	public String getOperacion() {
		return operacion;
	}
	
	/**
	 * M�todo mutador del atributo operacion.
	 * @param operacion - (String): Operaci�n realizada.
	 */
	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}
	
	/**
	 * M�todo accesador del atributo fecha.
	 * @return (String) Fecha de la transacci�n.
	 */
	public String getFecha() {
		return fecha;
	}
	
	/**
	 *  M�todo mutador del atributo fecha
	 * @param fecha - (String) Fecha de la transacci�n.
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	/**
	 * M�todo accesador del atributo tipoCuenta
	 * @return (String) Tipo de cuenta
	 */
	public String getTipoCuenta() {
		return tipoCuenta;
	}
	
	/**
	 * M�todo mutador del atributo tipoCuenta
	 * @param tipoCuenta - (String) Tipo de cuenta
	 */
	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	
	/**
	 * M�todo accesador del atributo cliente
	 * @return (String) Nombre del cliente
	 */
	public String getCliente() {
		return cliente;
	}
	
	/**
	 * M�todo mutador del atributo cliente
	 * @param cliente - (String): Nombre del cliente
	 */
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	/**
	 * M�todo accesador del atributo observaciones
	 * @return (String) Observaciones.
	 */
	public String getObservaciones() {
		return observaciones;
	}
	
	/**
	 * M�todo mutador del atributo observaciones
	 * @param observaciones - (String): Observaciones.
	 */
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
}