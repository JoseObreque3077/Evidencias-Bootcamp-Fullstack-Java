package otros;

/**
 * Clase que representa elementos gr�ficos del juego "Carrera Coches"
 * @author Jos� Obreque F.
 *
 */
public abstract class ElementoGrafico {
	private String estilo; //Estilo gr�fico
	private int ancho; //Ancho
	private int largo; //Largo
	private int posX; //Posici�n eje X
	private int posY; //Posici�n eje Y
	
	/**
	 * Constructor de la clase Elemento Grafico.
	 * @param estilo - (String): Estilo gr�fico del elemento.
	 * @param ancho - (int): Ancho del elemento.
	 * @param largo - (int): Largo del elemento.
	 * @param posX - (int): Posici�n en el eje X. 
	 * @param posY - (int): Posici�n en el eje Y.
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
	 * M�todo que permite obtener el valor de estilo.
	 * @return (String) estilo;
	 */
	public String getEstilo() {
		return estilo;
	}
	
	/**
	 * M�todo que permite cambiar el valor de estilo.
	 * @param estilo - (String): descripci�n de estilo gr�fico.
	 */
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
	/**
	 * M�todo que permite obtener el valor de ancho.
	 * @return (int) ancho;
	 */
	public int getAncho() {
		return ancho;
	}
	
	/**
	 * M�todo que permite cambiar el valor de ancho.
	 * @param ancho - (int): ancho.
	 */
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	
	/**
	 * M�todo que permite obtener el valor de largo.
	 * @return (int) largo;
	 */
	public int getLargo() {
		return largo;
	}
	
	/**
	 * M�todo que permite cambiar el valor de largo.
	 * @param largo - (int): largo.
	 */
	public void setLargo(int largo) {
		this.largo = largo;
	}
	
	/**
	 * M�todo que permite obtener el valor de posicion en el eje X.
	 * @return (int) posici�n en eje X;
	 */
	public int getPosX() {
		return posX;
	}
	
	/**
	 * M�todo que permite fijar el valor de posicion en el eje X.
	 * @param posX - (int) valor coordenada X
	 */
	public void setPosX(int posX) {
		this.posX = posX;
	}
	
	/**
	 * M�todo que permite obtener el valor de posicion en el eje Y.
	 * @return (int) posici�n en eje Y.
	 */
	public int getPosY() {
		return posY;
	}
	
	/**
	 * M�todo que permite fijar el valor de posicion en el eje Y.
	 * @param posY - (int) valor coordenada Y.
	 */
	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	
}
