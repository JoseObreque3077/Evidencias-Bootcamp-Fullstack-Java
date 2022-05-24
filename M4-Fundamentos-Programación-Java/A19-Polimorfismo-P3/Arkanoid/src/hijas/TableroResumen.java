package hijas;

import padre.ElementoGrafico;

/**
 * Clase que representa al tablero informativo de puntaje y vidas.
 * @author José Obreque F.
 *
 */
public class TableroResumen extends ElementoGrafico{
	
	/**
	 * Constructor de la clase TableroResumen
	 * @param color - color : String
	 * @param estilo - estilo : String
	 * @param posX - coordenada eje X : int
	 * @param posY - coordenada eje Y : int
	 * @param ancho - ancho : int
	 * @param largo - largo : int
	 */
	public TableroResumen(String color, String estilo, int posX, int posY, int ancho, int largo) {
		super(color, estilo, posX, posY, ancho, largo);
	}
	
	/**
	 * Muestra el resumen de puntuación y vidas del jugador.
	 * @param esf - esfera del videojuego: Esfera
	 */
	public void mostrarResumen(Esfera esf) {
		System.out.println("Resumen:");
		System.out.println("Número de vidas: " + esf.getVidas());
		System.out.println("Número de puntos: " + esf.getPuntos());
		System.out.println();
	}
	
}
