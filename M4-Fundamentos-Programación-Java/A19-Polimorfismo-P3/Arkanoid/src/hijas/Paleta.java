package hijas;

import interfases.InterfazRebote;
import padre.ElementoGrafico;

/**
 * Clase que representa a la paleta que golpea la esfera en el juego "Arkanoid".
 * @author José Obreque F.
 *
 */
public class Paleta extends ElementoGrafico implements InterfazRebote{
	
	/**
	 * Constructor de la clase Paleta.
	 * @param color - color : String
	 * @param estilo - estilo : String
	 * @param posX - coordenada eje X : int
	 * @param posY - coordenada eje Y : int
	 * @param ancho - ancho : int
	 * @param largo - largo : int
	 */
	public Paleta(String color, String estilo, int posX, int posY, int ancho, int largo) {
		super(color, estilo, posX, posY, ancho, largo);
	}
	
	/**
	 * Método que permite que la paleta se mueva a izquierda o derecha.
	 * @param direccion - dirección del movimiento: String
	 * @param limIzq - borde izquierdo del escenario (límite izquierdo): Borde
	 * @param limDer - borde derecho del escenario (límite izquierdo): Borde
	 */
	public void mover(String direccion, Borde limIzq, Borde limDer) {
		//FALTA A AGREGAR EL TEMA DE LOS LIMITES DADOS POR LOS BORDES
		switch(direccion) {
		case "izquierda":
			this.setPosX(getPosX()-10); //Se desplaza 10px a la izquierda
			//Si la paleta choca con el borde izquierdo, se impide su desplazamiento y se deja en una posición junto al borde
			if (this.getPosX() <= (limIzq.getPosX()+limIzq.getAncho())) {
				System.out.println("La paleta choca con el borde izquierdo!");
				//El lado izquierdo de la paleta queda junto al borde
				this.setPosX(limIzq.getPosX()+limIzq.getAncho());
			}
			else {
				System.out.println("La paleta se desplaza a la izquierda.");
			}	
		break;
		case "derecha":
			this.setPosX(getPosX()+10); //Se desplaza 10px a la derecha
			// Si la paleta choca con el borde derecho, entonces se impide su desplazamiento y se deja en una posición junto a este borde
			if (this.getPosX() >= limDer.getPosX()) {
				System.out.println("La paleta choca con el borde derecho!");
				//El lado derecho de la paleta queda junto al borde
				this.setPosX(limDer.getPosX()-this.getAncho());
			}
			else {
				System.out.println("La paleta se desplaza a la derecha.");
			}
			
		break;
		default:
			System.out.println("Dirección inválida.");
		}
	}

	@Override
	/**
	 * Se efectúa el rebote de la esfera contra un elemento (borde, bloque o paleta).
	 * Método sobrescrito desde la interfaz llamada InterfazRebote.
	 */
	public void rebote(Esfera esf) {
		System.out.println("La esfera rebota contra la paleta!");
	}
}
