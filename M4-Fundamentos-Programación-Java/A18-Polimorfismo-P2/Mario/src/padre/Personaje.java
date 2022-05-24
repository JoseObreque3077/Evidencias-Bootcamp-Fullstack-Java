package padre;
/**
 * Clase que representa un personaje de Super Mario 3
 * @author Jos� Obreque F.
 *
 */
public abstract class Personaje {
	private String nombre;
	private int posX;
	private int posY;
	private int ancho;
	private int alto;
	private int vidas;
	private String estilo;
	
	public Personaje(String nombre, int posX, int posY, int ancho, int alto, int vidas, String estilo) {
		this.nombre = nombre;
		this.posX = posX;
		this.posY = posY;
		this.ancho = ancho;
		this.alto = alto;
		this.vidas = vidas;
		this.estilo = estilo;
	}
	
	/**
	 * M�todo que representa un salto simple del personaje.
	 */
	public void saltar() {
		System.out.println(this.nombre + " salt�!");
	}
	
	/**
	 * M�todo que representa un salto sobre otro personaje.
	 * @param pj - Personaje objetivo.
	 */
	public void saltar(Personaje pj) {
		System.out.println(this.nombre + " salt� sobre " + pj.getNombre());
	}
	
	/**
	 * M�todo que representa la colisi�n entre dos personajes.
	 * @param pj - Personaje objetivo.
	 */
	public void chocar(Personaje pj) {
		System.out.println(this.nombre + " choc� con " + pj.getNombre());
	}
	
	/**
	 * M�todo que permite que el personaje se mueva.
	 * @param direccion - direcci�n del movimiento (izquierda o derecha).
	 */
	public void mover(String direccion) {
		if (direccion.equals("izquierda")) {
			System.out.println(this.nombre + " se mueve a la izquierda");
		}
		else if (direccion.equals("derecha")) {
			System.out.println(this.nombre + " se mueve a la derecha");
		}
		else {
			System.out.println("No se puede mover en esa direcci�n");
		}
	}
	
	/**
	 * M�todo que hace que un personaje de Super Mario 3 SE MUERA.
	 */
	public void morir() {
		if (this.vidas == 0) {
			System.out.println(this.nombre + " muri�!");
		}
	}
	
	/**
	 * M�todo que le resta una vida a un personaje.
	 */
	public void perderVida() {
		System.out.println(this.nombre + " perdi� una vida");
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

}
