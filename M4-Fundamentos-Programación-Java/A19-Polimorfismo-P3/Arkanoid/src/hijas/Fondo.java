package hijas;

import padre.ElementoGrafico;

/**
 * Clase que representa al tablero resumen del juego Arkanoid.
 * @author José Obreque F.
 *
 */
public class Fondo extends ElementoGrafico{
	
	/**
	 * Constructor de la clase Fondo.
	 * @param color - color : String
	 * @param estilo - estilo : String
	 * @param posX - coordenada eje X : int
	 * @param posY - coordenada eje Y : int
	 * @param ancho - ancho : int
	 * @param largo - largo : int
	 */
	public Fondo(String color, String estilo, int posX, int posY, int ancho, int largo) {
		super(color, estilo, posX, posY, ancho, largo);
	}
	
}
