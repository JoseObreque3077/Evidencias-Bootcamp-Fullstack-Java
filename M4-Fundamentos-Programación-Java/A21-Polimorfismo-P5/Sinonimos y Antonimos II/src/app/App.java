package app;

import auxiliar.Menu;
import hijas.Antonimos;
import hijas.Sinonimos;

/**
 * Clase que representa la ejecuci�n de la l�gica completa de la aplicaci�n del
 * diccionario de sin�nimos y ant�nimos.
 * @author Jos� Obreque F.
 *
 */
public class App {
	
	/**
	 * M�todo main de la clase App.
	 * @param args
	 */
	public static void main(String[] args) {
		//Creaci�n de objetos tipo Sinonimos y Antonimos
		Antonimos a = new Antonimos();
		Sinonimos s = new Sinonimos();
		//Creaci�n de un objeto de tipo Menu
		Menu m = new Menu(a, s);
		//Llamada al men� principal
		m.menuPrincipal();
	}

}
