package hijas;

import interfases.InterfazRebote;
import padre.ElementoGrafico;

/**
 * Clase que representa un bloque en el videojuego Arkanoid.
 * @author José Obreque F.
 *
 */
public class Bloque extends ElementoGrafico implements InterfazRebote{
	private boolean visible;
	private boolean poderDisp;
	private int toleranciaGolpes;
	private ElementoPoder poderGuardado;
	
	/**
	 * Constructor de la clase Bloque.
	 * @param color - color : String
	 * @param estilo - estilo : String
	 * @param posX - coordenada eje X : int
	 * @param posY - coordenada eje Y : int
	 * @param ancho - ancho : int
	 * @param largo - largo : int
	 * @param visible - estado de visibilidad del bloque: boolean
	 * @param toleranciaGolpes - límite de golpes permitidos antes de destruirse el bloque: int
	 */
	public Bloque(String color, String estilo, int posX, int posY, int ancho, int largo, boolean visible, int toleranciaGolpes) {
		super(color, estilo, posX, posY, ancho, largo);
		this.visible = visible;
		this.toleranciaGolpes = toleranciaGolpes;
		this.poderDisp = false;
	}

	@Override
	/**
	 * Se efectúa el rebote de la esfera contra un elemento (borde, bloque o paleta).
	 * Método sobrescrito desde la interfaz llamada InterfazRebote.
	 */
	public void rebote(Esfera esf) {
		this.toleranciaGolpes -= 1; //Se reduce la cantidad de golpes que tolera el bloque antes de romperse
		if (this.toleranciaGolpes == 0) {
			this.visible = false; //El bloque se destruye
			this.liberarPoder(); //Se libera un poder, si está disponible
			System.out.println("El bloque es destruido!");
			esf.setPuntos(esf.getPuntos()+500); //Se suman 500 puntos
		}
		else {
			System.out.println("La esfera rebota contra el bloque");
			esf.setPuntos(esf.getPuntos()+100); //Se suman 100 puntos
		}
	}
	
	/**
	 * Libera un elemento de poder (si existe) al romper un bloque.
	 * @param poder - Elemento de poder/Power up: ElementoPoder
	 */
	private void liberarPoder() {
		/*
		 * 1) El bloque ya no debe ser visible (destruido).
		 * 2) Debe haber un poder almacenado previamente en el bloque.
		 */
		if (!this.visible && this.poderDisp) {
			this.poderGuardado.setVisible(true); //El poder se hace visible y disponible para consumir
			System.out.println("Se ha liberado un poder al destruir este bloque!");
		}
	}
	
	/**
	 * Se agrega un elemento de poder al bloque.
	 * @param poder - elemento de poder: ElementoPoder
	 */
	public void agregarPoder(ElementoPoder poder) {
		this.poderGuardado = poder;
		this.poderDisp = true;
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

	/**
	 * Método accesador del atributo toleranciaGolpes.
	 * @return toleranciaGolpes : int.
	 */
	public int getToleranciaGolpes() {
		return toleranciaGolpes;
	}

	/**
	 * Método mutador del atributo toleranciaGolpes.
	 * @param toleranciaGolpes : int.
	 */
	public void setToleranciaGolpes(int toleranciaGolpes) {
		this.toleranciaGolpes = toleranciaGolpes;
	}

	/**
	 * Método accesador del atributo poderGuardado.
	 * @return poderGuardado : ElementoPoder.
	 */
	public ElementoPoder getPoderGuardado() {
		return poderGuardado;
	}

	/**
	 * Método mutador del atributo poderGuardado.
	 * @param poderGuardado : ElementoPoder.
	 */
	public void setPoderGuardado(ElementoPoder poderGuardado) {
		this.poderGuardado = poderGuardado;
	}
	
	
}
