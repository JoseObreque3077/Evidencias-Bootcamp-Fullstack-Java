package otros;

import hijas.MarioMapache;

/**
 * Clase que representa al tablero resumen del juego.
 * @author José Obreque F.
 *
 */
public class TableroResumen {
	private int posX;
	private int posY;
	private int ancho;
	private int alto;
	private String mundo;
	
	public TableroResumen(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
		this.mundo = "World 1";
		this.ancho = 750;
		this.alto = 150;
	}
	
	/**
	 * Método que permite mostrar el resumen de información de Mario en cualquier momento.
	 * @param mario - Instancia de la clase MarioMapache.
	 */
	public void mostrarResumen(MarioMapache mario) {
		System.out.println("VIDAS: " + mario.getVidas());
		System.out.println("MONEDAS: " + mario.getMonedas());
		System.out.println("PUNTUACIÓN: " + mario.getPuntos());
		System.out.println("TIEMPO DE JUEGO: " + mario.getTiempo());
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

	public String getMundo() {
		return mundo;
	}

	public void setMundo(String mundo) {
		this.mundo = mundo;
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
