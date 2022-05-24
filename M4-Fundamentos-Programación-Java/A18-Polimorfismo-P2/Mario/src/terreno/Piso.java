package terreno;

/**
 * Clase que representa al piso.
 * @author José Obreque F.
 *
 */
public class Piso {
	private int posX;
	private int posY;
	private int ancho;
	private int alto;
	private String estilo;
	
	
	public Piso(int posX, int posY, int ancho, int alto, String estilo) {
		this.posX = posX;
		this.posY = posY;
		this.ancho = ancho;
		this.alto = alto;
		this.estilo = estilo;
	}
	
	//Este se va a usar
	public Piso(int posX) {
		this.posX = posX;
		this.posY = 0;
		this.ancho = 1080;
		this.alto = 300;
		this.estilo = "patron rayas";
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
