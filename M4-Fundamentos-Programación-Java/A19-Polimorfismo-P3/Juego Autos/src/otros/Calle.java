package otros;

import autos.Auto;

/**
 * Clase que representa a la calle/carretera en el juego "Carrera Coches".
 * @author José Obreque F.
 *
 */
public class Calle extends ElementoGrafico{
	/**
	 * Constructor de la clase Calle.
	 * @param estilo - (String): Estilo gráfico de la calle.
	 * @param ancho - (int): Ancho de la calle
	 * @param largo - (int): Largo de la calle
	 * @param posX - (int): Posición en el eje X
	 * @param posY - (int): Posición en el eje Y
	 */
	public Calle(String estilo, int ancho, int largo, int posX, int posY) {
		super(estilo, ancho, largo, posX, posY);
	}
	
	/**
	 * Método que permite la aceleración del auto estando en la carretera.
	 * @param a - (Auto): Auto a acelerar.
	 */
	public void acelerarAuto(Auto a) {
		System.out.println("El auto se mueve de manera acelerada.");
	}
	
}
