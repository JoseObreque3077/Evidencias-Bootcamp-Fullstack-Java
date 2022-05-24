package app;

import auxiliar.Menu;
import clases.Fecha;

/**
 * Clase que permite la ejecuci�n de la aplicaci�n para el taller mec�nico.
 * @author Jos� Obreque F.
 *
 */
public class App {

	public static void main(String[] args) {
		
		//Se crea un objeto de tipo Menu
		Menu m = new Menu();
		//Se llama al m�todo que presenta y maneja la l�gica del men� principal de la app
		m.menuPrincipal();
	}

}
