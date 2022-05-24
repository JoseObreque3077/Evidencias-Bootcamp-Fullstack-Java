package hijas;

import padre.ElementoGrafico;

/**
 * Clase que representa un item de poder en el juego Arkanoid.
 * @author José Obreque F.
 *
 */
public class ElementoPoder extends ElementoGrafico{
	private String tipoPoder; //String que describe el tipo de poder que contiene
	private boolean consumido; //Booleano que indica si este poder fue consumido o no
	private boolean visible; //Booleano que indica si el poder es visible o no
	
	/**
	 * @param color - Color del elemento de poder: String
	 * @param estilo - Estilo/skin del elemento de poder: String
	 * @param posX - Posición en eje X: int
	 * @param posY - Posición en eje Y: int
	 * @param ancho - Ancho del elemento de poder: int
	 * @param largo - Largo del elemento de poder: int
	 * @param tipoPoder - Tipo de poder contenido: String
	 * @param visible - Estado de visibilidad del elemento: boolean
	 */
	public ElementoPoder(String color, String estilo, int posX, int posY, int ancho, int largo, String tipoPoder, boolean visible) {
		super(color, estilo, posX, posY, ancho, largo);
		this.tipoPoder = tipoPoder;
		this.visible = visible;
		this.consumido = false;
	}
	
	/**
	 * Método que permite que el objeto de poder descienda.
	 */
	public void caer() {
		/*
		 * Para que el poder pueda ir cayendo, deben darse dos situaciones:
		 * 1) El poder no debe haber sido consumido
		 * 2) El poder debe estar visible (haber salido de un bloque destruido)
		 */
		if (!this.consumido && this.visible) {
			this.setPosY(getPosY() - 10); //baja 10 pixeles en el eje Y
		}
	}
	
	/**
	 * Método que permite obtener el valor del atributo tipoPoder.
	 * @return (String) Tipo de poder que contiene el elemento de poder.
	 */
	public String getTipoPoder() {
		return tipoPoder;
	}

	/**
	 * Método que permite modificar el valor del atributo tipoPoder.
	 * @param tipoPoder - (String): Tipo de poder que contiene el elemento de poder.
	 */
	public void setTipoPoder(String tipoPoder) {
		this.tipoPoder = tipoPoder;
	}

	/**
	 * Método que permite obtener el valor del atributo "consumido".
	 * @return Verdadero, si el objeto fue consumido. Falso en caso contrario.
	 */
	public boolean isConsumido() {
		return consumido;
	}

	/**
	 * Método que permite modificar el valor del atributo "consumido".
	 * @param consumido - (boolean): Verdadero para poder consumido, falso en caso contrario.
	 */
	public void setConsumido(boolean consumido) {
		this.consumido = consumido;
	}

	/**
	 * Método accesador del atributo visible.
	 * @return visible : boolean.
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * Método mutador del atributo visible.
	 * @param visible : boolean.
	 */
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
}
