package hijas;

import padre.Diccionario;

/**
 * Clase que representa a un diccionario de sinónimos.
 * @author José Obreque F.
 *
 */
public class Antonimos extends Diccionario{
	/**
	 * Constructor de la clase Sinonimos
	 */
	public Antonimos() {
		super();
	}

	@Override
	/**
	 * Agrega un antónimo al diccionario de antónimos. Método sobrescrito con origen en la clase Diccionario.
	 */
	public void agregarSignificado(String palabraClave, String significado) {
		try {
			//A lo anterior, heredado del padre, le agregamos un mensaje de error personalizado
			if (this.getMapaPalabras().get(palabraClave).contains(significado)) {
				System.out.println("El antónimo a ingresar ya existe!");
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
	 * Edita un antónimo al diccionario de antónimos. Método sobrescrito con origen en la clase Diccionario.
	 */
	public void editarSignificado(String palabraClave, String significado, String nuevoSignificado) {
		try {
			if (!this.getMapaPalabras().get(palabraClave).contains(significado) && this.getMapaPalabras() != null) {
				System.out.println("El antónimo a editar no existe!");
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
	 * Elimina un antónimo al diccionario de antónimos. Método sobrescrito con origen en la clase Diccionario.
	 */
	public void eliminarSignificado(String palabraClave, String significado) {
		try {
			if (this.getMapaPalabras().get(palabraClave).contains(significado)) {
				System.out.println("El antónimo a eliminar no existe!");
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
	 * Muestra los antónimos contenidos en el diccionario, para una determinada palabra clave.
	 * Método sobrescrito con origen en la clase Diccionario.
	 */
	public void mostrarSignificados(String palabraClave) {
		try {
			System.out.println("antónimos de " + palabraClave + ":"); //Mensaje personalizado
			super.mostrarSignificados(palabraClave);
			System.out.println("----Completado----");
		}
		catch(NullPointerException e) {
			System.out.println("La palabra clave no existe en el diccionario.");
		}
	}

	@Override
	/**
	 * Muestra el diccionario de antónimos completo. Método sobrescrito con origen en la clase Diccionario.
	 */
	public void mostrarDiccionario() {
		super.mostrarDiccionario();
		this.getMapaPalabras().forEach((k, v) -> System.out.println("Palabra: " + k + " --- antónimos: " + v));
		System.out.println("----Completado----");
	}
}
