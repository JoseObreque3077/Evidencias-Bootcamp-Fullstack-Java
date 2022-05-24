package terreno;

/**
 * Clase que representa las plataforma del juego.
 * @author José Obreque F.
 *
 */
public class Plataforma {
	private int posX;
	private int posY;
	private int ancho;
	private int alto;
	private String estilo;
	
	public Plataforma(int posX, int posY, int ancho, int alto, String estilo) {
		this.posX = posX;
		this.posY = posY;
		this.ancho = ancho;
		this.alto = alto;
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

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
	
	
}
