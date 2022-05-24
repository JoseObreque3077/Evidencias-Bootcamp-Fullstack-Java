package clases;

/**
 * Clase que representa a un auto a ser trabajado en el taller mecánico.
 * @author José Obreque F.
 *
 */
public class Auto {
	private String patente; //patente
	private String marca; //marca
	private String modelo; //modelo 
	private String ann; //año de fabricación
	private Cliente propietario; //Composición: dueño del auto (instancia de la clase Cliente)
	
	/**
	 * Constructor de la clase Auto.
	 * @param patente - patente del vehículo: String
	 * @param marca - marca del vehículo: String
	 * @param modelo - modelo del vehículo: String
	 * @param ann - año de fabricación del vehículo: int
	 * @param propietario - propietario del vehículo: Cliente
	 */
	public Auto(String patente, String marca, String modelo, String ann, Cliente propietario) {
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
		this.ann = ann;
		this.propietario = propietario;
	}
	
	/**
	 * Constructor de la clase Auto (sin parámetros), con datos de cliente y vehículo por defecto.
	 */
	public Auto() {
		this.patente = "JV1313";
		this.marca = "Chevrolet";
		this.modelo = "Suburban";
		this.ann = "2018";
		this.propietario = new Cliente();
	}
	
	@Override
	/**
	 * Permite imprimir directamente los atributos de una instancia de la clase Auto.
	 * Método sobreescrito, con origen en la clase Object.
	 */
	public String toString() {
		String salida = "RUT Propietario: " + this.getPropietario().getRut() +
				" || Patente: " + this.patente +
				" || Marca: " + this.marca +
				" || Modelo: " + this.modelo +
				" || Año Fabricación: " + this.ann;
		return salida;
	}
	
	/**
	 * Permite imprimir los atributos de una instancia de la clase Auto.
	 * @return Cadena de texto con los valores de los parámetros: String
	 */
	public String impresion() {
		String salida = "RUT Propietario: " + this.getPropietario().getRut() +
				" || Patente: " + this.patente +
				" || Marca: " + this.marca +
				" || Modelo: " + this.modelo +
				" || Año Fabricación: " + this.ann;
		return salida;
	}
	
	//Getters -- Setters
	/**
	 * Método accesador del atributo patente.
	 * @return patente : String.
	 */
	public String getPatente() {
		return patente;
	}

	/**
	 * Método mutador del atributo patente.
	 * @param patente : String.
	 */
	public void setPatente(String patente) {
		this.patente = patente;
	}

	/**
	 * Método accesador del atributo marca.
	 * @return marca : String.
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * Método mutador del atributo marca.
	 * @param marca : String.
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * Método accesador del atributo modelo.
	 * @return modelo : String.
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Método mutador del atributo modelo.
	 * @param modelo : String.
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * Método accesador del atributo ann.
	 * @return ann : String.
	 */
	public String getAnn() {
		return ann;
	}

	/**
	 * Método mutador del atributo ann.
	 * @param ann : String.
	 */
	public void setAnn(String ann) {
		this.ann = ann;
	}

	/**
	 * Método accesador del atributo propietario.
	 * @return propietario : Cliente.
	 */
	public Cliente getPropietario() {
		return propietario;
	}

	/**
	 * Método mutador del atributo propietario.
	 * @param propietario : Cliente.
	 */
	public void setPropietario(Cliente propietario) {
		this.propietario = propietario;
	}
}