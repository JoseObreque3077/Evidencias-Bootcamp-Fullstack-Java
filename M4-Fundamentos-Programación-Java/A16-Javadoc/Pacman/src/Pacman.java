/**
 * Clase que define al personaje Pacman en el videojuego Pacman.
 * @author Jos� Obreque F.
 * @version 1.0
 */
public class Pacman extends Personaje{
	private boolean poderActivo; //Atributo booleano que indica si pacman adquiere o no sus poderes
	private int puntuacion; //Puntaci�n del jugador (ganada comiendo puntos o fantasmas)
	
	//Definici�n del constructor de la clase (hereda de la clase personaje)
	public Pacman(String nombre, String color, int posX, int posY) {
		super(nombre, color, posX, posY); //constructor de la superclase (clase padre)
		this.poderActivo = false; //por defecto, pacman comienza sin poderes
		this.puntuacion = 0; //Por defecto, la puntuaci�n es cero
	}
	
	/**
	 * M�todo que permite que Pacman consuma un punto de cualquier tama�o (peque�o o grande)
	 * en el videojuego Pacman.
	 * @param pto - Instancia de la clase punto
	 */
	public void consumirPunto(Punto pto) {
		//Mensaje por pantalla si Pacman come un punto
		System.out.println("Pacman ha comido un punto " + pto.getTama�o() + "!");
		//Si pacman come punto peque�o, solo sube la puntauci�n. Sino, tambien adquiere poderes.
		if (pto.getTama�o() == "peque�o") {
			this.puntuacion += pto.getPuntosAsociados();
		}
		else {
			System.out.println("Pacman adquiere poderes!");
			this.puntuacion += pto.getPuntosAsociados();
			poderActivo = true;
		}
	}
	
	/**
	 * M�todo que permite que Pacman consuma a un fantasma, cuando tiene su poder activo.
	 * @param f - Instancia de clase Fantasma
	 */
	public void comerFantasma(Fantasma f) {
		if (this.poderActivo) { //Solo se puede comer a un fantasma si el poder est� activo
			this.comer(f);
			this.puntuacion += 1000; //Gana 100 puntos al comer a un fantasma
		}
		else {
			this.morir(super.getNombre());
			System.out.println("GAME OVER");
			System.out.println("PUNTUACION: " + this.getPuntuacion());
		}
	}
	
	//Getters and Setters
	public boolean isPoderActivo() {
		return poderActivo;
	}

	public void setPoderActivo(boolean poderActivo) {
		this.poderActivo = poderActivo;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	
	
}
