package autos;

import obstaculos.Obstaculo;
import otros.ElementoGrafico;

/**
 * Clase que representa los autos en el juego "Carrera Coches".
 * @author José Obreque F.
 *
 */
public class Auto extends ElementoGrafico{
	/**
	 * Constructor de la clase Auto.
	 * @param estilo - (String): estilo gráfico del obstáculo
	 * @param posX - (int): posición en el eje X.
	 * @param posY - (int): posición en el eje Y.
	 * @param ancho - (int): ancho de la gráfica, en pixeles.
	 * @param largo - (int): largo de la gráfica, en pixeles.
	 */
	
	public Auto(String estilo, int ancho, int largo, int posX, int posY) {
		super(estilo, ancho, largo, posX, posY);
	}	
	
	/**
	 * Método que representa la colisión entre el auto del jugador y un obstáculo.
	 * @param ob - (Obstaculo) Obstaculo del juego.
	 */
	public void chocar(Obstaculo ob) {
		System.out.println("Has chocado contra un obstáculo!");
		System.out.println("GAME OVER");
	}
	
	/**
	 * Método que permite el movimiento en 4 direcciones de un objeto de tipo Auto.
	 * @param direccion - (String): dirección del movimiento.
	 */
	public void mover(String direccion) {
		switch (direccion) {
		case "arriba":
			this.setPosY(this.getPosY()+50);
			System.out.println("El auto se mueve hacia arriba");
		break;
		case "abajo":
			this.setPosY(this.getPosY()-50);
			System.out.println("El auto se mueve hacia abajo");
		break;
		case "izquierda":
			this.setPosX(this.getPosX()-50);
			System.out.println("El auto se mueve hacia la izquierda");
		break;
		case "derecha":
			this.setPosX(this.getPosX()+50);
			System.out.println("El auto se mueve hacia la derecha");
		break;
		default:
			System.out.println("Opción inválida");
		}
	}
	
}
