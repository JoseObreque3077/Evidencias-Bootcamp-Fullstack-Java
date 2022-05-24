package app;

import java.util.ArrayList;

import cajero.CajeroAutomatico;
import cuenta.CuentaBancaria;
import logicaMenu.Menu;
import tarjeta.Tarjeta;

/**
 * Clase que representa la ejecuci�n de la l�gica completa de la operaci�n de un cajero autom�tico:
 * procesos internos y menu de usuario.
 * @author Jos� Obreque F.
 *
 */
public class App {
	
	/**
	 * M�todo principal de la clase
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<CuentaBancaria> bd = new ArrayList<CuentaBancaria>();
		bd.add(new CuentaBancaria("Santander", "corriente", "Lorena L�pez", 567838, 500000, 3, "2345", new Tarjeta("552266", "debito")));
		bd.add(new CuentaBancaria("Estado", "vista", "Julio Ramirez", 567356, 380000, 10, "2312", new Tarjeta("678987", "mixta")));
		bd.add(new CuentaBancaria("Itau", "Ahorro", "Carla Ruiz", 654123, 780000, 5, "2435", new Tarjeta("674589", "cr�dito")));
		bd.add(new CuentaBancaria("Falabella", "Corriente", "Roberto Aranguiz", 432124, 1900230, 10, "4321", new Tarjeta("6342", "debito")));


		CajeroAutomatico atm = new CajeroAutomatico(5000000, bd);
		Menu menu = new Menu(atm);
		
		//Ciclo de 1 ejecuci�n
		for (int i=0; i<1; i++) {
			//Se pide el ingreso de n�mero de tarjeta
			menu.lecturaTarjeta();
			//Si la tarjeta no existe, se detiene la ejecuci�n del men�
			if (!menu.isEjecucionValida()) {
				break;
			}
			//Se pide el ingreso de clave
			menu.lecturaClave();
			//Si la tarjeta se bloquea luego de 3 intentos fallidos, se detiene la ejecuci�n del case
			if (!menu.isEjecucionValida()) {
				break;
			}
			//Se llama al men� principal
			menu.menuPrincipal();
			//Si por alg�n motivo la ejecuci�n ya no es v�lida, se detiene la ejecuci�n del men�
			if (!menu.isEjecucionValida()) {
				break;
			}
		}
	}

}
