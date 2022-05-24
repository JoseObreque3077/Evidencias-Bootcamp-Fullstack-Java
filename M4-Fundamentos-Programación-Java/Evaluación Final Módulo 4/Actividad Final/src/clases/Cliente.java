package clases;

/**
 * Clase que representa al cliente del taller mecánico.
 * @author José Obreque F.
 *
 */
public class Cliente {
	private String nombres; //primer y segundo nombre 
	private String apellidos; //primer y segundo apellido
	private String rut; //rut del cliente (Ej: 12345678-9)
	private String email; //email del cliente
	private String numContacto; //número de contacto del cliente
	
	/**
	 * Constructor de la clase Cliente (sin parámetros) con valores por defecto.
	 */
	public Cliente() {
		this.nombres = "Juan Alberto";
		this.apellidos = "Perez Abarzúa";
		this.rut = "15665772-9";
		this.email = "juan.perez@gmail.com";
		this.numContacto = "9-33465871";
	}
	
	/**
	 * Constructor de la clase Cliente (con todos los parámetros).
	 * @param nombres - primer y segundo nombre: String
	 * @param apellidos - primer y segundo apellido: String
	 * @param rut - rut del cliente: String
	 * @param email - email del cliente: String
	 * @param numContacto - número de contacto del cliente: String
	 */
	public Cliente(String nombres, String apellidos, String rut, String email,
			String numContacto) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.rut = rut;
		this.email = email;
		this.numContacto = numContacto;
	}
	
	@Override
	/**
	 * Permite imprimir directamente los atributos de una instancia de la clase Cliente.
	 * Método sobreescrito, con origen en la clase Object.
	 */
	public String toString() {
		return "Nombre: " + this.nombres + " " + this.apellidos + " || RUT: " + this.rut + " || Email: " + this.email + " || Teléfono: " + this.numContacto; 
	}
	
	/**
	 * Permite imprimir los atributos de una instancia de la clase Cliente.
	 * @return Cadena de texto con los valores de los parámetros: String
	 */
	public String impresion() {
		return "Nombre: " + this.nombres + " " + this.apellidos + " || RUT: " + this.rut + " || Email: " + this.email + " || Teléfono: " + this.numContacto; 
	}
	
	//Getters--Setters
	
	/**
	 * Método accesador del atributo nombres.
	 * @return nombres : String.
	 */
	public String getNombres() {
		return nombres;
	}

	/**
	 * Método mutador del atributo nombres.
	 * @param nombres : String.
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	/**
	 * Método accesador del atributo apellidos.
	 * @return apellidos : String.
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Método mutador del atributo apellidos.
	 * @param apellidos : String.
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Método accesador del atributo rut.
	 * @return rut : String.
	 */
	public String getRut() {
		return rut;
	}

	/**
	 * Método mutador del atributo rut.
	 * @param rut : String.
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}

	/**
	 * Método accesador del atributo email.
	 * @return email : String.
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Método mutador del atributo email.
	 * @param email : String.
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Método accesador del atributo numContacto.
	 * @return numContacto : String.
	 */
	public String getNumContacto() {
		return numContacto;
	}

	/**
	 * Método mutador del atributo numContacto.
	 * @param numContacto : String.
	 */
	public void setNumContacto(String numContacto) {
		this.numContacto = numContacto;
	}
}