package otros;

/**
 * Clase que representa elementos gráficos del juego "Carrera Coches"
 * @author José Obreque F.
 *
 */
public abstract class ElementoGrafico {
	private String estilo; //Estilo gráfico
	private int ancho; //Ancho
	private int largo; //Largo
	private int posX; //Posición eje X
	private int posY; //Posición eje Y
	
	/**
	 * Constructor de la clase Elemento Grafico.
	 * @param estilo - (String): Estilo gráfico del elemento.
	 * @param ancho - (int): Ancho del elemento.
	 * @param largo - (int): Largo del elemento.
	 * @param posX - (int): Posición en el eje X. 
	 * @param posY - (int): Posición en el eje Y.
	 */
	public ElementoGrafico(String estilo, int ancho, int largo, int posX, int posY) {
		this.estilo = estilo;
		this.ancho = ancho;
		this.largo = largo;
		this.posX = posX;
		this.posY = posY;
	}
	
	
	//Getters y Setters
	/**
	 * Método que permite obtener el valor de estilo.
	 * @return (String) estilo;
	 */
	public String getEstilo() {
		return estilo;
	}
	
	/**
	 * Método que permite cambiar el valor de estilo.
	 * @param estilo - (String): descripción de estilo gráfico.
	 */
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
	/**
	 * Método que permite obtener el valor de ancho.
	 * @return (int) ancho;
	 */
	public int getAncho() {
		return ancho;
	}
	
	/**
	 * Método que permite cambiar el valor de ancho.
	 * @param ancho - (int): ancho.
	 */
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	
	/**
	 * Método que permite obtener el valor de largo.
	 * @return (int) largo;
	 */
	public int getLargo() {
		return largo;
	}
	
	/**
	 * Método que permite cambiar el valor de largo.
	 * @param largo - (int): largo.
	 */
	public void setLargo(int largo) {
		this.largo = largo;
	}
	
	/**
	 * Método que permite obtener el valor de posicion en el eje X.
	 * @return (int) posición en eje X;
	 */
	public int getPosX() {
		return posX;
	}
	
	/**
	 * Método que permite fijar el valor de posicion en el eje X.
	 * @param posX - (int) valor coordenada X
	 */
	public void setPosX(int posX) {
		this.posX = posX;
	}
	
	/**
	 * Método que permite obtener el valor de posicion en el eje Y.
	 * @return (int) posición en eje Y.
	 */
	public int getPosY() {
		return posY;
	}
	
	/**
	 * Método que permite fijar el valor de posicion en el eje Y.
	 * @param posY - (int) valor coordenada Y.
	 */
	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	
}
