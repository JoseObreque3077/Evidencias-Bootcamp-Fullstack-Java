package app;

import java.util.Scanner;

import frame.Frame;
import hijas.Bloque;
import hijas.Borde;
import hijas.ElementoPoder;
import hijas.Esfera;
import hijas.Fondo;
import hijas.Paleta;
import hijas.TableroResumen;

/**
 * Clase que representa el menú de juego y la lógica de operación del videojuego Arkanoid.
 * @author José Obreque F.
 *
 */
public class App {
	
	/**
	 * Método principal de la clase App.
	 * @param args
	 */
	public static void main(String[] args) {
		//Fondo del videojuego
		Fondo f = new Fondo("negro", "espacial", 0, 0, 500, 700);
		//Borde izquierdo del escenario
		Borde b1 = new Borde("gris", "regular", 0, 0, 50, 700);
		//Borde derecho del escenario
		Borde b2 = new Borde("gris", "regular", 500, 0, 50, 700);
		//Borde superior del escenario
		Borde b3 = new Borde("gris", "regular", 0, 700, 700, 50);
		//Paleta
		Paleta p = new Paleta("gris oscuro", "espacial", 200, 50, 100, 20);
		//Esfera
		Esfera esf = new Esfera("gris brillante", "regular", 250, 70, 15, 15, 3, 0);
		//Tablero resumen
		TableroResumen tr = new TableroResumen("gris", "regular", 0, 700, 500, 100);
		//Bloques
		Bloque blo1 = new Bloque("rojo", "brillante", 50, 400, 40, 20, true, 3);
		Bloque blo2 = new Bloque("rojo", "brillante", 90, 400, 40, 20, true, 3);
		Bloque blo3 = new Bloque("verde", "brillante", 410, 420, 40, 20, true, 3);
		//Objeto de poder (power-up)
		ElementoPoder pod = new ElementoPoder("gris/blanco", "contenedor espacial", 90, 400, 10, 10, "1hp", false);
		//Adición de elemento power up al bloque 2
		blo2.agregarPoder(pod);
		//Creación del frame
		Frame fr = new Frame(f, tr, esf, p, b1, b2, b3);
		fr.agregarBloque(blo1);
		fr.agregarBloque(blo2);
		fr.agregarBloque(blo3);
		
		Scanner leer = new Scanner(System.in);
		int opc = 0; //Variable que almacena las opciones del menú del juego
		//Menú de opciones del juego
		while (opc != 9) {
			System.out.println("Menú Arkanoid:");
			System.out.println("(1) Rebotar esfera con la paleta");
			System.out.println("(2) Mover paleta a la izquierda");
			System.out.println("(3) Mover paleta a la derecha");
			System.out.println("(4) Esfera golpea a bloque normal");
			System.out.println("(5) Esfera golpea a bloque con poder dentro");
			System.out.println("(6) Dejar caer esfera al abismo");
			System.out.println("(7) Consumir poder");
			System.out.println("(8) Mostrar datos del tablero de juego");
			System.out.println("(9) Salir");
			opc = leer.nextInt();
			switch (opc) {
			case 1:
				fr.getPal().rebote(esf);
				System.out.println();
			break;
			case 2:
				fr.getPal().mover("izquierda", b1, b2);
				System.out.println();
			break;
			case 3:
				fr.getPal().mover("derecha", b1, b2);
				System.out.println();
			break;
			case 4:
				fr.getBloques().get(2).rebote(esf);
				System.out.println();
			break;
			case 5:
				fr.getBloques().get(1).rebote(esf);
				System.out.println();
			break;
			case 6:
				fr.getEsf().perderVida();
				if (fr.getEsf().getVidas() == 0) {
					opc = 9;
				}
				System.out.println();
			break;
			case 7:
				fr.getEsf().consumirPoder(pod);
				System.out.println();
			break;
			case 8:
				fr.getTab().mostrarResumen(esf);
				System.out.println();
			break;
			case 9:
				System.out.println("Te has retirado del juego.");
			break;
			default:
				System.out.println("Opción inválida");
			}
		}
	}
}
