package app;

import auxiliar.Menu;
import hijas.Antonimos;
import hijas.Sinonimos;

/**
 * Clase que representa la ejecución de la lógica completa de la aplicación del
 * diccionario de sinónimos y antónimos.
 * @author José Obreque F.
 *
 */
public class App {
	
	/**
	 * Método main de la clase App.
	 * @param args
	 */
	public static void main(String[] args) {
		//Creación de objetos tipo Sinonimos y Antonimos
		Antonimos a = new Antonimos();
		Sinonimos s = new Sinonimos();
		//Creación de un objeto de tipo Menu
		Menu m = new Menu(a, s);
		//Llamada al menú principal
		m.menuPrincipal();
	}

}
