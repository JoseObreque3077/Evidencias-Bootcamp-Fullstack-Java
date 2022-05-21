/**
 * Clase que representa a un vértice de objeto (bloques, puertas, etc.) en el videojuego Pacman.
 * @author José Obreque F.
 * @version 1.0 
 */
public class Vertice {
	private int posX;
	private int posY;
	
	//Constructor de la clase
	public Vertice(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}
	
	//Getters and Setters
	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	
	
	
}
