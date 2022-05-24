package app;

import java.util.Scanner;

import autos.Auto;
import frame_juego.Frame;
import obstaculos.Obstaculo;
import otros.Calle;
import otros.Fondo;

/**
 * Clase que representa la ventana principal del juego "Carrera Coches", para poder
 * interactuar con el juego.
 * @author Jos� Obreque F.
 *
 */
public class App {
	
	/**
	 * Cuerpo principal del juego "Carrera Coches".
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in); //Scanner para leer entradas por consola
		int opc = 0; //variable que almacena opciones del men� de usuario
		boolean continuar= true; //variable que indica si se debe continuar con el men� o no
		//1) Creaci�n de objeto auto (jugador)
		Auto car = new Auto("Auto rojo", 500, 10, 150, 75);
		//2) Creaci�n de objetos Obstaculo (�rbol, auto enemigo y roca)
		Obstaculo ob1 = new Obstaculo("arbol", 150, 600, 150, 75);
		Obstaculo ob2 = new Obstaculo("auto enemigo", 550, 320, 150, 75);
		Obstaculo ob3 = new Obstaculo("roca", 600, 700, 75, 75);
		//3) Creaci�n de objeto Calle
		Calle road = new Calle("calle regular", 300, 0, 200, 720);
		//4) Creaci�n de objeto Fondo
		Fondo f = new Fondo(null, 0, 0, 0, 0);
		//5) Creaci�n de objeto Frame
		Frame fr = new Frame(car, f, road);
		//6) Agregaci�n de obst�culos
		fr.agregarObstaculos(ob1);
		fr.agregarObstaculos(ob2);
		fr.agregarObstaculos(ob3);
		
		//Creaci�n de men�
		while (opc != 9 && continuar) {
			System.out.println("Menu de Prueba del Juego:");
			System.out.println("(1) Mover auto a la izquierda");
			System.out.println("(2) Mover auto a la derecha");
			System.out.println("(3) Mover auto hacia arriba");
			System.out.println("(4) Mover auto hacia abajo");
			System.out.println("(5) Acelerar auto en carretera");
			System.out.println("(6) Chocar con vehiculo enemigo");
			System.out.println("(7) Chocar con �rbol");
			System.out.println("(8) Chocar con piedra");
			System.out.println("(9) Salir");
			System.out.println();
			opc = leer.nextInt();
			System.out.println();
			
			switch (opc) {
				case 1:
					//Se accede al elemento A de la clase Auto presente en Frame por composici�n
					fr.getA().mover("izquierda");
				break;
				case 2:
					/*
					 * Se accede al elemento A de la clase Auto presente en Frame por composici�n
					 * Se accede al m�todo mover de la clase Auto
					 */
					fr.getA().mover("derecha");
				break;
				case 3:
					/*
					 * Se accede al elemento A de la clase Auto presente en Frame por composici�n
					 * Se accede al m�todo mover de la clase Auto
					 */
					fr.getA().mover("arriba");
				break;
				case 4:
					/*
					 * Se accede al elemento A de la clase Auto presente en Frame por composici�n
					 * Se accede al m�todo mover de la clase Auto
					 */
					fr.getA().mover("abajo");
				break;
				case 5:
					/*
					 * Se accede al elemento C de la clase Calle presente en Frame por composici�n
					 * Se accede al m�todo acelerarAuto de la clase Auto
					 * Se pasa como par�metro el objeto A de clase Auto presente en Frame por composici�n
					 */
					fr.getC().acelerarAuto(fr.getA());
				break;
				case 6:
					/*
					 * Se accede al elemento A de la clase Auto presente en Frame por composici�n
					 * Se accede al m�todo chocar de la clase Auto
					 * Se pasa como par�metro el objeto Obstaculo, en la posici�n 1 del ArrayList de agregaci�n
					 */
					fr.getA().chocar(fr.getObstaculos().get(1));
					continuar = deseaContinuar(); //Se verifica si se desea continuar o no
				break;
				case 7:
					/*
					 * Se accede al elemento A de la clase Auto presente en Frame por composici�n
					 * Se accede al m�todo chocar de la clase Auto
					 * Se pasa como par�metro el objeto Obstaculo, en la posici�n 0 del ArrayList de agregaci�n
					 */
					fr.getA().chocar(fr.getObstaculos().get(0));
					continuar = deseaContinuar(); //Se verifica si se desea continuar o n
				break;
				case 8:
					/*
					 * Se accede al elemento A de la clase Auto presente en Frame por composici�n
					 * Se accede al m�todo chocar de la clase Auto
					 * Se pasa como par�metro el objeto Obstaculo, en la posici�n 2 del ArrayList de agregaci�n
					 */
					fr.getA().chocar(fr.getObstaculos().get(2));
					continuar = deseaContinuar(); //Se verifica si se desea continuar o n
				break;
				case 9:
					System.out.println("Programa finalizado.");
				break;
				default:
					System.out.println("Opci�n inv�lida. Intente nuevamente");
			}
		}
	}
	
	/**
	 * M�todo que permite, dependiendo por lo ingresado por el usuario, saber
	 * si el juego continua o no.
	 * @return (Boolean) Verdadero si se desea continuar, falso en caso contrario.
	 */
	public static boolean deseaContinuar() {
		Scanner leer = new Scanner(System.in); //Se crea un objeto Scanner
		String opcion; //String que contiene la opci�n entregada por el usuario.
		boolean continuar = false; //Booleano auxiliar que indica si el juago continua
		
		//Mensaje por pantalla para saber si se desea continuar jugando
		System.out.println("Presione X para continuar");
		opcion = leer.next(); //Se lee el valor de opcion
		
		//Si se desea continuar, se ingresa una X. Sino, el programa termina.
		if (opcion.equals("x") || opcion.equals("X")) {
			continuar = true;
		}
		else {
			System.out.println("Programa terminado");
		}
		return continuar;
	}

}
