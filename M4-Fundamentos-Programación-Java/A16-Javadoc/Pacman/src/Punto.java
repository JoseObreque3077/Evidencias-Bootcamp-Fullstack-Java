/**
 * Clase que representa a los puntos o "comida" en el videojuego Pacman
 * @author José Obreque F.
 * @version 1.0
 *
 */
public class Punto {
	private int posX;
	private int posY;
	private int puntosAsociados;
	private String tamaño;
	
	// Constructor de la clase
	public Punto(int posX, int posY, int puntosAsociados, String tamaño) {
		this.posX = posX;
		this.posY = posY;
		this.puntosAsociados = puntosAsociados;
		this.tamaño = tamaño;
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

	public int getPuntosAsociados() {
		return puntosAsociados;
	}

	public void setPuntosAsociados(int puntosAsociados) {
		this.puntosAsociados = puntosAsociados;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	
	
}
