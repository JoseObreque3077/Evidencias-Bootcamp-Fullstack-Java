package hijas;

import padre.Diccionario;

/**
 * Clase que representa un diccionario de sinónimos.
 * @author José Obreque F.
 *
 */
public class Sinonimos extends Diccionario{
	
	/**
	 * Constructor de la clase Sinonimos
	 */
	public Sinonimos() {
		super();
	}

	@Override
	/**
	 * Agrega un sinónimo al diccionario de sinónimos. Método sobrescrito con origen en la clase Diccionario.
	 */
	public void agregarSignificado(String palabraClave, String significado) {
		try {
			if (this.getMapaPalabras().get(palabraClave).contains(significado)) {
				System.out.println("El sinónimo a ingresar ya existe!");
			}
			else {
				super.agregarSignificado(palabraClave, significado);
				System.out.println("----Completado----");
			}
		}
		catch (NullPointerException e) {
			System.out.println("La palabra clave no existe en el diccionario.");
		}
	}

	@Override
	/**
	 * Edita un sinónimo al diccionario de sinónimos. Método sobrescrito con origen en la clase Diccionario.
	 */
	public void editarSignificado(String palabraClave, String significado, String nuevoSignificado) {
		try {
			if (!this.getMapaPalabras().get(palabraClave).contains(significado) && this.getMapaPalabras() != null) {
				System.out.println("El sinónimo a editar no existe!");
			}
			else {
				super.editarSignificado(palabraClave, significado, nuevoSignificado);
				System.out.println("----Completado----");
			}
		}
		catch (NullPointerException e) {
			System.out.println("La palabra clave no existe en el diccionario.");
		}
	}

	@Override
	/**
	 * Elimina un sinónimo al diccionario de sinónimos. Método sobrescrito con origen en la clase Diccionario.
	 */
	public void eliminarSignificado(String palabraClave, String significado) {
		try {
			if (this.getMapaPalabras().get(palabraClave).contains(significado)) {
				System.out.println("El sinónimo a eliminar no existe!");
			}
			else {
				super.eliminarSignificado(palabraClave, significado);
				System.out.println("----Completado----");
			}
		}
		catch(NullPointerException e) {
			System.out.println("La palabra clave no existe en el diccionario.");
		}
	}

	@Override
	/**
	 * Muestra los sinónimos contenidos en el diccionario, para una determinada palabra clave.
	 * Método sobrescrito con origen en la clase Diccionario.
	 */
	public void mostrarSignificados(String palabraClave) {
		try {
			System.out.println("Sinónimos de " + palabraClave + ":"); //Mensaje personalizado
			super.mostrarSignificados(palabraClave);
			System.out.println("----Completado----");
		}
		catch(NullPointerException e) {
			System.out.println("La palabra clave no existe en el diccionario.");
		}
	}

	@Override
	/**
	 * Muestra el diccionario de sinónimos completo. Método sobrescrito con origen en la clase Diccionario.
	 */
	public void mostrarDiccionario() {
		super.mostrarDiccionario();
		this.getMapaPalabras().forEach((k, v) -> System.out.println("Palabra: " + k + " --- Sinónimos: " + v));
		System.out.println("----Completado----");
	}
}