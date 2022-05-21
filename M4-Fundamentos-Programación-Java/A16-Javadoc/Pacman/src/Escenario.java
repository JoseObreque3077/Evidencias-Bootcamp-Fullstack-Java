import java.util.ArrayList;

/**
 * Clase que representa el escenario del videojuego Pacman. 
 * @author José Obreque F.
 * @version 1.0
 */
public class Escenario {
	private String estilo;
	private Pacman jugador;
	private ArrayList<Fantasma> listaFantasmas = new ArrayList<Fantasma>(); //ArrayList de Fantasmas
	private ArrayList<Bloque> listaBloques = new ArrayList<Bloque>(); //ArrayList de vértices
	private ArrayList<Punto> listaPuntos = new ArrayList<Punto>(); //ArrayList de vértices
	
	
	public Escenario(String estilo, Pacman jugador) {
		this.estilo = estilo;
		this.jugador = jugador; //Composición (pacman-escenario)
	}

	/**
	 * Método que permite la generación del escenario del videojuego Pacman.
	 */
	public void generarEscenario() {
		System.out.println("Se ha generado el escenario del videojuego!!!");
	}
	
	/**
	 * Método que permite agregar fantasmas al escenario (agregación).
	 * @param f - Instancia de la clase fantasma
	 */
	public void agregarFantasma(Fantasma f) {
		this.listaFantasmas.add(f);
		System.out.println("Fantasma añadido!");
	}
	
	/**
	 * Método que permite agregar bloques al escenario (agregación).
	 * @param b - Instancia de la clase bloque
	 */
	public void agregarBloque(Bloque b) {
		this.listaBloques.add(b);
		System.out.println("Bloque añadido!");
	}
	
	/**
	 * Método que permite agregar puntos al escenario (agregación).
	 * @param p - Instancia de la clase punto
	 */
	public void agregarPunto(Punto p) {
		this.listaPuntos.add(p);
		System.out.println("Punto añadido!");
	}
	
	//Getters and Setters
	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public Pacman getJugador() {
		return jugador;
	}

	public void setJugador(Pacman jugador) {
		this.jugador = jugador;
	}
	
}
