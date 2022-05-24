package otros;

/**
 * Clase que representa el fondo del juego "Carrera Coches".
 * @author Jos� Obreque F.
 *
 */
public class Fondo extends ElementoGrafico{

	/**
	 * Constructor de la clase Fondo
	 * @param estilo - (String): Estilo gr�fico del fondo
	 * @param ancho - (int): Ancho del fondo
	 * @param largo - (int): Largo del fondo
	 * @param posX - (int): Posici�n en el eje X
	 * @param posY - (int): Posici�n en el eje Y
	 */
	public Fondo(String estilo, int ancho, int largo, int posX, int posY) {
		super(estilo, ancho, largo, posX, posY);
	}
}
