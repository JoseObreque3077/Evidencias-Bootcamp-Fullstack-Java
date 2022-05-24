package hijas;

import padre.ElementoGrafico;

/**
 * Clase que representa a la esfera del videojuego Arkanoid.
 * @author José Obreque F.
 *
 */
public class Esfera extends ElementoGrafico{
	private int vidas; //Número de vidas
	private int puntos; //Número de puntos
	private boolean poder; //Indica si está activado un poder o no
	
	/**
	 * Constructor de la clase Esfera.
	 * @param color - color : String
	 * @param estilo - estilo : String
	 * @param posX - coordenada eje X : int
	 * @param posY - coordenada eje Y : int
	 * @param ancho - ancho : int
	 * @param largo - largo : int
	 * @param vidas - número de vidas restantes: int
	 * @param puntos - número de puntos acumulados: int
	 */
	public Esfera(String color, String estilo, int posX, int posY, int ancho, int largo, int vidas, int puntos) {
		super(color, estilo, posX, posY, ancho, largo);
		this.vidas = vidas;
		this.puntos = puntos;
		this.poder = false;
	}
	
	/**
	 * Consume el poder seleccionado.
	 * @param pd - poder a consumir : Poder 
	 */
	public void consumirPoder(ElementoPoder pd) {
		if (pd.isVisible()) {
			this.vidas += 1;
			System.out.println("Se ha consumido un poder especial y has ganado 1HP!");
		}
		else {
			System.out.println("Primero rompe el bloque!!!");
		}
	}
	
	/**
	 * Resta una vida en caso de caer al abismo.
	 */
	public void perderVida() {
		this.vidas -= 1;
		if (this.vidas == 0) {
			this.juegoTerminado();
		}
		else {
			System.out.println("Has perdido una vida!");
		}
	}
	
	/**
	 * Termina el juego, ya que no quedan mas vidas.
	 */
	public void juegoTerminado() {
		System.out.println("GAME OVER");
	}
	
	//Getters y Setters
	/**
	 * Método accesador del atributo vidas.
	 * @return vidas : int.
	 */
	public int getVidas() {
		return vidas;
	}

	/**
	 * Método mutador del atributo vidas.
	 * @param vidas : int.
	 */
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	/**
	 * Método accesador del atributo puntos.
	 * @return puntos : int.
	 */
	public int getPuntos() {
		return puntos;
	}

	/**
	 * Método mutador del atributo puntos.
	 * @param puntos : int.
	 */
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	/**
	 * Método accesador del atributo poder.
	 * @return poder : boolean.
	 */
	public boolean isPoder() {
		return poder;
	}

	/**
	 * Método mutador del atributo poder.
	 * @param poder : boolean.
	 */
	public void setPoder(boolean poder) {
		this.poder = poder;
	}	
}
