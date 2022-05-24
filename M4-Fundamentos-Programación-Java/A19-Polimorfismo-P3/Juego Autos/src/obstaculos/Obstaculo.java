package obstaculos;

import otros.ElementoGrafico;

/**
 * Clase que representa a un obstaculo del juego "Carrera Coches".
 * @author José Obreque F.
 *
 */
public class Obstaculo extends ElementoGrafico{
	/**
	 * Constructor de la clase Obstaculo.
	 * @param estilo - (String): estilo gráfico del obstáculo
	 * @param posX - (int): posición en el eje X.
	 * @param posY - (int): posición en el eje Y.
	 * @param ancho - (int): ancho de la gráfica, en pixeles.
	 * @param largo - (int): largo de la gráfica, en pixeles.
	 */
	public Obstaculo(String estilo, int ancho, int largo, int posX, int posY) {
		super(estilo, ancho, largo, posX, posY);
	}
	
	/**
	 * Método que permite que un obstaculo descienda.
	 */
	public void bajar() {
		this.setPosY(this.getPosY()-75); //Desciende 75px
		System.out.println("El obstaculo desciende");
	}
	
}
