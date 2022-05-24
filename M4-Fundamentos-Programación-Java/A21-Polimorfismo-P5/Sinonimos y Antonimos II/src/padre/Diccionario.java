package padre;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Clase abstracta que representa a un diccinario.
 * @author José Obreque F.
 *
 */
public abstract class Diccionario {
	private HashMap<String, HashSet<String>> mapaPalabras;
	
	/**
	 * Constructor de la clase DiccionarioSinonimos
	 */
	public Diccionario() {
		this.mapaPalabras = new HashMap<String, HashSet<String>>();
	}
	
	/**
	 * Agrega una palabra clave con un set vacío de significados
	 * @param palabra -palabra clave a ingresar: String
	 */
	public void agregarPalabraClave(String palabra) {
		if (this.mapaPalabras.keySet().contains(palabra)) {
			System.out.println("La palabra clave ingresada ya existe!");
		}
		else {
			this.mapaPalabras.put(palabra, new HashSet<String>());
			System.out.println("----Completado----");
		}	
	}
	
	/**
	 * Agrega un significado a una palabra clave.
	 * @param palabraClave - palabra clave del dicionario de sinónimos: String
	 * @param significado - sinónimo a almacenar: String
	 */
	public void agregarSignificado(String palabraClave, String significado) {
		//Se agrega el significado siempre y cuando este no exista en el set respectivo
		if (!this.mapaPalabras.get(palabraClave).contains(significado)) {
			this.mapaPalabras.get(palabraClave).add(significado);
		}
	}

	/**
	 * Edita una palabra clave en el diccionario
	 * @param palabraClaveAnt - palabra clave a reemplazar: String
	 * @param palabraClaveNew - palabra clave nueva: String
	 */
	public void editarPalabraClave(String palabraClaveAnt, String palabraClaveNew) {
		/*
		 * Validación 1: La palabra clave actual y la nueva no deben ser iguales
		 * Validación 2: La palabra clave debe existir en el diccionario de sinónimos
		 * 
		 * Si esto se cumple, entonces:
		 * 1) Se respaldan los sinónimos
		 * 2) Se elimina el par clave-valor
		 * 3) Se vuelve a crear el par valor, pero con la clave nueva
		 */
		if (palabraClaveAnt.toLowerCase().equals(palabraClaveNew.toLowerCase())) {
			System.out.println("La palabra clave anterior y la nueva son iguales!");
		}
		else {
			if (this.mapaPalabras.keySet().contains(palabraClaveAnt)) {
				HashSet<String> temp = new HashSet<String>(); //Sinonimos almacenados
				temp = this.mapaPalabras.get(palabraClaveAnt);
				this.mapaPalabras.remove(palabraClaveAnt); //Eliminar palabra clave + set
				this.mapaPalabras.put(palabraClaveNew, temp); //Se crea el par clave-valor nuevo (clave editada)
				System.out.println("----Completado----");
			}
			else {
				System.out.println("La palabra clave no está en el diccionario");
			}
		}
	}
	
	/**
	 * Edita un significado para una determinada palabra clave en el diccionario.
	 * @param palabraClave - palabra clave del dicionario: String
	 * @param significado - sinónimo a reemplazar: String
	 * @param nuevoSignificado - sinónimo corregido: String
	 */
	public void editarSignificado(String palabraClave, String significado, String nuevoSignificado) {
		/*
		 * Validación 1: El significado actual y el nuevo no deben ser iguales
		 * Validación 2: El significado a reemplazar debe existir
		 * 
		 * Si esto se cumple, entonces se elimina el sinónimo anterior y se añade el nuevo
		 */
		if (significado.toLowerCase().equals(nuevoSignificado.toLowerCase())) {
			if (this.mapaPalabras.get(palabraClave).contains(significado)) {
				this.mapaPalabras.get(palabraClave).remove(significado); //Se elimina el sinónimo objetico
				this.mapaPalabras.get(palabraClave).add(nuevoSignificado); //Se agrega el nuevo sinónimo
			}
		}
	}

	/**
	 * Elimina un significado para una determinada palabra clave en el diccionario.
	 * @param palabraClave - palabra clave del dicionario: String
	 * @param significado - sinónimo a eliminar: String
	 */
	public void eliminarSignificado(String palabraClave, String significado) {
		/*
		 * Validación: El sinónimo a eliminar debe existir previamente
		 */
		if (this.mapaPalabras.get(palabraClave).contains(significado)) {
			this.mapaPalabras.get(palabraClave).remove(significado);
		}
	}
	
	/**
	 * Elimina una palabra clave del diccionario.
	 * @param palabraClave - palabra clave a eliminar: String
	 */
	public void eliminarPalabra(String palabraClave) {
		//La palabra clave se elimina solo si ya estaba presente en el diccionario
		try {
			this.mapaPalabras.remove(palabraClave);
			System.out.println("----Completado----");
		}
		catch (NullPointerException e) {
			System.out.println("La palabra clave no está en el diccionario");
		}
	}
	
	/**
	 * Muestra los significados almacenados para una cierta palabra clave
	 * @param palabraClave - palabra clave: String
	 */
	public void mostrarSignificados(String palabraClave) {
		//Muestra los sinónimos asociados
		this.mapaPalabras.get(palabraClave).forEach((x) -> System.out.println(x));
	}
	
	/**
	 * Muestra el contenido del diccionario de sinónimos.
	 */
	public void mostrarDiccionario() {
		//Muestra todo el diccionario, siempre y cuando no esté vacío o sea nulo
		if (this.mapaPalabras.isEmpty() || this.mapaPalabras == null) {
			System.out.println("El diccionario está vacío!");
		}
		else {
			System.out.println("Contenido del diccionario:");
		}
	}

	/**
	 * Método accesador del atributo mapaPalabras.
	 * @return mapaPalabras : HashMap.
	 */
	public HashMap<String, HashSet<String>> getMapaPalabras() {
		return mapaPalabras;
	}

	/**
	 * Método mutador del atributo mapaPalabras.
	 * @param mapaPalabras : HashMap
	 */
	public void setMapaPalabras(HashMap<String, HashSet<String>> mapaPalabras) {
		this.mapaPalabras = mapaPalabras;
	}
}
