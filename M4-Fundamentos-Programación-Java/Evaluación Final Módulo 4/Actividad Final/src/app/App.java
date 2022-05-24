package app;

import auxiliar.Menu;
import clases.Fecha;

/**
 * Clase que permite la ejecución de la aplicación para el taller mecánico.
 * @author José Obreque F.
 *
 */
public class App {

	public static void main(String[] args) {
		
		//Se crea un objeto de tipo Menu
		Menu m = new Menu();
		//Se llama al método que presenta y maneja la lógica del menú principal de la app
		m.menuPrincipal();
	}

}
