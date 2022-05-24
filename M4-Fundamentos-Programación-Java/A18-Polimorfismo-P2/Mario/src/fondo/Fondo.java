package fondo;

/**
 * Clase que representa el fondo del juego.
 * @author José Obreque F.
 *
 */
public class Fondo {
	private String estilo;
	private int posX;
	private int posY;
	private int ancho;
	private int alto;
	
	public Fondo(String estilo, int posX, int posY, int ancho, int alto) {
		this.estilo = estilo;
		this.posX = posX;
		this.posY = posY;
		this.ancho = ancho;
		this.alto = alto;
	}

	public Fondo(int posX) {
		this.estilo = "fondo nubes + arbustos";
		this.posX = posX;
		this.posY = 300;
		this.ancho = 1080;
		this.alto = 420;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

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

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}
	
	
}
