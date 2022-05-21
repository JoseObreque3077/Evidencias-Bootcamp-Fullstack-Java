/**
 * Clase que define al personaje Pacman en el videojuego Pacman.
 * @author José Obreque F.
 * @version 1.0
 */
public class Pacman extends Personaje{
	private boolean poderActivo; //Atributo booleano que indica si pacman adquiere o no sus poderes
	private int puntuacion; //Puntación del jugador (ganada comiendo puntos o fantasmas)
	
	//Definición del constructor de la clase (hereda de la clase personaje)
	public Pacman(String nombre, String color, int posX, int posY) {
		super(nombre, color, posX, posY); //constructor de la superclase (clase padre)
		this.poderActivo = false; //por defecto, pacman comienza sin poderes
		this.puntuacion = 0; //Por defecto, la puntuación es cero
	}
	
	/**
	 * Método que permite que Pacman consuma un punto de cualquier tamaño (pequeño o grande)
	 * en el videojuego Pacman.
	 * @param pto - Instancia de la clase punto
	 */
	public void consumirPunto(Punto pto) {
		//Mensaje por pantalla si Pacman come un punto
		System.out.println("Pacman ha comido un punto " + pto.getTamaño() + "!");
		//Si pacman come punto pequeño, solo sube la puntaución. Sino, tambien adquiere poderes.
		if (pto.getTamaño() == "pequeño") {
			this.puntuacion += pto.getPuntosAsociados();
		}
		else {
			System.out.println("Pacman adquiere poderes!");
			this.puntuacion += pto.getPuntosAsociados();
			poderActivo = true;
		}
	}
	
	/**
	 * Método que permite que Pacman consuma a un fantasma, cuando tiene su poder activo.
	 * @param f - Instancia de clase Fantasma
	 */
	public void comerFantasma(Fantasma f) {
		if (this.poderActivo) { //Solo se puede comer a un fantasma si el poder está activo
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
