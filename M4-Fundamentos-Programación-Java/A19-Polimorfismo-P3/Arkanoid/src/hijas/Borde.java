package hijas;

import interfases.InterfazRebote;
import padre.ElementoGrafico;

/**
 * Clase que representa a los bordes izquierdo, derecho y superior del escenario.
 * @author José Obreque F.
 *
 */
public class Borde extends ElementoGrafico implements InterfazRebote{
	
	/**
	 * Constructor de la clase Borde.
	 * @param color - color : String
	 * @param estilo - estilo : String
	 * @param posX - coordenada eje X : int
	 * @param posY - coordenada eje Y : int
	 * @param ancho - ancho : int
	 * @param largo - largo : int
	 */
	public Borde(String color, String estilo, int posX, int posY, int ancho, int largo) {
		super(color, estilo, posX, posY, ancho, largo);
	}
	
	/**
	 * Impide el desplazamiento de la paleta en la misma dirección, 
	 * si esta choca contra un borde.
	 * @param pal - paleta del juego : Paleta.
	 */
	public void choque(Paleta pal) {
		System.out.println("La paleta choca contra el borde");
	}

	@Override
	/**
	 * Se efectúa el rebote de la esfera contra un elemento (borde, bloque o paleta).
	 * Método sobrescrito desde la interfaz llamada InterfazRebote.
	 */
	public void rebote(Esfera esf) {
		System.out.println("La esfera rebota contra el borde!");
	}
	
	
}
