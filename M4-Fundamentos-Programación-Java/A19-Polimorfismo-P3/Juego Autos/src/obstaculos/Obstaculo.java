package obstaculos;

import otros.ElementoGrafico;

/**
 * Clase que representa a un obstaculo del juego "Carrera Coches".
 * @author Jos� Obreque F.
 *
 */
public class Obstaculo extends ElementoGrafico{
	/**
	 * Constructor de la clase Obstaculo.
	 * @param estilo - (String): estilo gr�fico del obst�culo
	 * @param posX - (int): posici�n en el eje X.
	 * @param posY - (int): posici�n en el eje Y.
	 * @param ancho - (int): ancho de la gr�fica, en pixeles.
	 * @param largo - (int): largo de la gr�fica, en pixeles.
	 */
	public Obstaculo(String estilo, int ancho, int largo, int posX, int posY) {
		super(estilo, ancho, largo, posX, posY);
	}
	
	/**
	 * M�todo que permite que un obstaculo descienda.
	 */
	public void bajar() {
		this.setPosY(this.getPosY()-75); //Desciende 75px
		System.out.println("El obstaculo desciende");
	}
	
}
