package clases;

/**
 * Clase que representa a un auto a ser trabajado en el taller mec�nico.
 * @author Jos� Obreque F.
 *
 */
public class Auto {
	private String patente; //patente
	private String marca; //marca
	private String modelo; //modelo 
	private String ann; //a�o de fabricaci�n
	private Cliente propietario; //Composici�n: due�o del auto (instancia de la clase Cliente)
	
	/**
	 * Constructor de la clase Auto.
	 * @param patente - patente del veh�culo: String
	 * @param marca - marca del veh�culo: String
	 * @param modelo - modelo del veh�culo: String
	 * @param ann - a�o de fabricaci�n del veh�culo: int
	 * @param propietario - propietario del veh�culo: Cliente
	 */
	public Auto(String patente, String marca, String modelo, String ann, Cliente propietario) {
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
		this.ann = ann;
		this.propietario = propietario;
	}
	
	/**
	 * Constructor de la clase Auto (sin par�metros), con datos de cliente y veh�culo por defecto.
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
	 * M�todo sobreescrito, con origen en la clase Object.
	 */
	public String toString() {
		String salida = "RUT Propietario: " + this.getPropietario().getRut() +
				" || Patente: " + this.patente +
				" || Marca: " + this.marca +
				" || Modelo: " + this.modelo +
				" || A�o Fabricaci�n: " + this.ann;
		return salida;
	}
	
	/**
	 * Permite imprimir los atributos de una instancia de la clase Auto.
	 * @return Cadena de texto con los valores de los par�metros: String
	 */
	public String impresion() {
		String salida = "RUT Propietario: " + this.getPropietario().getRut() +
				" || Patente: " + this.patente +
				" || Marca: " + this.marca +
				" || Modelo: " + this.modelo +
				" || A�o Fabricaci�n: " + this.ann;
		return salida;
	}
	
	//Getters -- Setters
	/**
	 * M�todo accesador del atributo patente.
	 * @return patente : String.
	 */
	public String getPatente() {
		return patente;
	}

	/**
	 * M�todo mutador del atributo patente.
	 * @param patente : String.
	 */
	public void setPatente(String patente) {
		this.patente = patente;
	}

	/**
	 * M�todo accesador del atributo marca.
	 * @return marca : String.
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * M�todo mutador del atributo marca.
	 * @param marca : String.
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * M�todo accesador del atributo modelo.
	 * @return modelo : String.
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * M�todo mutador del atributo modelo.
	 * @param modelo : String.
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * M�todo accesador del atributo ann.
	 * @return ann : String.
	 */
	public String getAnn() {
		return ann;
	}

	/**
	 * M�todo mutador del atributo ann.
	 * @param ann : String.
	 */
	public void setAnn(String ann) {
		this.ann = ann;
	}

	/**
	 * M�todo accesador del atributo propietario.
	 * @return propietario : Cliente.
	 */
	public Cliente getPropietario() {
		return propietario;
	}

	/**
	 * M�todo mutador del atributo propietario.
	 * @param propietario : Cliente.
	 */
	public void setPropietario(Cliente propietario) {
		this.propietario = propietario;
	}
}