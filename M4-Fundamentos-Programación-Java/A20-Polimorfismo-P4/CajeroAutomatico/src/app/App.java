package app;

import java.util.ArrayList;

import cajero.CajeroAutomatico;
import cuenta.CuentaBancaria;
import logicaMenu.Menu;
import tarjeta.Tarjeta;

/**
 * Clase que representa la ejecución de la lógica completa de la operación de un cajero automático:
 * procesos internos y menu de usuario.
 * @author José Obreque F.
 *
 */
public class App {
	
	/**
	 * Método principal de la clase
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<CuentaBancaria> bd = new ArrayList<CuentaBancaria>();
		bd.add(new CuentaBancaria("Santander", "corriente", "Lorena López", 567838, 500000, 3, "2345", new Tarjeta("552266", "debito")));
		bd.add(new CuentaBancaria("Estado", "vista", "Julio Ramirez", 567356, 380000, 10, "2312", new Tarjeta("678987", "mixta")));
		bd.add(new CuentaBancaria("Itau", "Ahorro", "Carla Ruiz", 654123, 780000, 5, "2435", new Tarjeta("674589", "crédito")));
		bd.add(new CuentaBancaria("Falabella", "Corriente", "Roberto Aranguiz", 432124, 1900230, 10, "4321", new Tarjeta("6342", "debito")));


		CajeroAutomatico atm = new CajeroAutomatico(5000000, bd);
		Menu menu = new Menu(atm);
		
		//Ciclo de 1 ejecución
		for (int i=0; i<1; i++) {
			//Se pide el ingreso de número de tarjeta
			menu.lecturaTarjeta();
			//Si la tarjeta no existe, se detiene la ejecución del menú
			if (!menu.isEjecucionValida()) {
				break;
			}
			//Se pide el ingreso de clave
			menu.lecturaClave();
			//Si la tarjeta se bloquea luego de 3 intentos fallidos, se detiene la ejecución del case
			if (!menu.isEjecucionValida()) {
				break;
			}
			//Se llama al menú principal
			menu.menuPrincipal();
			//Si por algún motivo la ejecución ya no es válida, se detiene la ejecución del menú
			if (!menu.isEjecucionValida()) {
				break;
			}
		}
	}

}
