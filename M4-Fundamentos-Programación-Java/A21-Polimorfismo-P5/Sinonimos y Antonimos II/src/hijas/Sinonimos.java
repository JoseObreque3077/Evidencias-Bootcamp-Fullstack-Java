package hijas;

import padre.Diccionario;

/**
 * Clase que representa un diccionario de sin�nimos.
 * @author Jos� Obreque F.
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
	 * Agrega un sin�nimo al diccionario de sin�nimos. M�todo sobrescrito con origen en la clase Diccionario.
	 */
	public void agregarSignificado(String palabraClave, String significado) {
		try {
			if (this.getMapaPalabras().get(palabraClave).contains(significado)) {
				System.out.println("El sin�nimo a ingresar ya existe!");
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
	 * Edita un sin�nimo al diccionario de sin�nimos. M�todo sobrescrito con origen en la clase Diccionario.
	 */
	public void editarSignificado(String palabraClave, String significado, String nuevoSignificado) {
		try {
			if (!this.getMapaPalabras().get(palabraClave).contains(significado) && this.getMapaPalabras() != null) {
				System.out.println("El sin�nimo a editar no existe!");
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
	 * Elimina un sin�nimo al diccionario de sin�nimos. M�todo sobrescrito con origen en la clase Diccionario.
	 */
	public void eliminarSignificado(String palabraClave, String significado) {
		try {
			if (this.getMapaPalabras().get(palabraClave).contains(significado)) {
				System.out.println("El sin�nimo a eliminar no existe!");
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
	 * Muestra los sin�nimos contenidos en el diccionario, para una determinada palabra clave.
	 * M�todo sobrescrito con origen en la clase Diccionario.
	 */
	public void mostrarSignificados(String palabraClave) {
		try {
			System.out.println("Sin�nimos de " + palabraClave + ":"); //Mensaje personalizado
			super.mostrarSignificados(palabraClave);
			System.out.println("----Completado----");
		}
		catch(NullPointerException e) {
			System.out.println("La palabra clave no existe en el diccionario.");
		}
	}

	@Override
	/**
	 * Muestra el diccionario de sin�nimos completo. M�todo sobrescrito con origen en la clase Diccionario.
	 */
	public void mostrarDiccionario() {
		super.mostrarDiccionario();
		this.getMapaPalabras().forEach((k, v) -> System.out.println("Palabra: " + k + " --- Sin�nimos: " + v));
		System.out.println("----Completado----");
	}
}