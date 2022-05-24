package padre;

/**
 * Clase que representa a todos los elementos gráficos del videojuego "Arkanoid".
 * @author José Obreque F.
 *
 */
public abstract class ElementoGrafico {
	private String color; //Color del elemento
	private String estilo; //Estilo/skin del elemento
	private int posX; //Posición del elemento en el eje X
	private int posY; //Posición del elemento en el eje Y
	private int ancho; //Ancho del elemento
	private int largo; //Largo del elemento
	
	/**
	 * Constructor de la clase ElementoGrafico.
	 * @param color - color : String
	 * @param estilo - estilo : String
	 * @param posX - coordenada eje X : int
	 * @param posY - coordenada eje Y : int
	 * @param ancho - ancho : int
	 * @param largo - largo : int
	 */
	public ElementoGrafico(String color, String estilo, int posX, int posY, int ancho, int largo) {
		this.color = color;
		this.estilo = estilo;
		this.posX = posX;
		this.posY = posY;
		this.ancho = ancho;
		this.largo = largo;
	}

	/**
	 * Método accesador del atributo color.
	 * @return color : String.
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Método mutador del atributo color.
	 * @param color : String.
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Método accesador del atributo estilo.
	 * @return estilo : String.
	 */
	public String getEstilo() {
		return estilo;
	}

	/**
	 * Método mutador del atributo estilo.
	 * @param estilo : String.
	 */
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	/**
	 * Método accesador del atributo posX.
	 * @return posX : int.
	 */
	public int getPosX() {
		return posX;
	}

	/**
	 * Método mutador del atributo posX.
	 * @param posX : int.
	 */
	public void setPosX(int posX) {
		this.posX = posX;
	}

	/**
	 * Método accesador del atributo posY.
	 * @return posY : int.
	 */
	public int getPosY() {
		return posY;
	}

	/**
	 * Método mutador del atributo posY.
	 * @param posY : int.
	 */
	public void setPosY(int posY) {
		this.posY = posY;
	}

	/**
	 * Método accesador del atributo ancho.
	 * @return ancho : int.
	 */
	public int getAncho() {
		return ancho;
	}

	/**
	 * Método mutador del atributo ancho.
	 * @param ancho : int.
	 */
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	/**
	 * Método accesador del atributo largo.
	 * @return largo : int.
	 */
	public int getLargo() {
		return largo;
	}

	/**
	 * Método mutador del atributo largo.
	 * @param largo : int.
	 */
	public void setLargo(int largo) {
		this.largo = largo;
	}

	

	
}
