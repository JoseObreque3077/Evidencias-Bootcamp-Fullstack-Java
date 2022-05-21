/**
 * Clase que define a un personaje del videojuego Pacman.
 * @author José Obreque F.
 * @version 1.0
 */
public abstract class Personaje {
	private String nombre; //ID del personaje
	private String color; //Color del personaje
	private int posX; //Posición del personaje en el eje X
	private int posY; //Posición del personaje en el eje Y
	private boolean vida;
	
	//Definición del constructor de la clase
	public Personaje(String nombre, String color, int posX, int posY) {
		this.nombre = nombre;
		this.color = color;
		this.posX = posX;
		this.posY = posY;
		this.vida = true;
	}
	
	/**
	 * Método que permite el desplazamiento del personaje en una dirección a la vez.
	 * @param direccion - String (arriba, abajo, izquierda, derecha) que indica dirección del movimiento.
	 */
	public void mover(String direccion) {
		switch (direccion) {
		case "izquierda":
			this.posX -= 1; //Se mueve 1 unidad a la izquierda
			System.out.println(nombre + " se mueve a la izquierda"); //Mensaje de la acción
		break;
		case "derecha":
			this.posX += 1; //Se mueve 1 unidad a la derecha
			System.out.println(nombre + " se mueve a la derecha"); //Mensaje de la acción
		break;
		case "arriba":
			this.posY += 1; //Se mueve 1 unidad a hacia arriba
			System.out.println(nombre + " se mueve hacia arriba"); //Mensaje de la acción
		break;
		case "abajo":
			this.posY -= 1; //Se mueve 1 unidad hacia abajo
			System.out.println(nombre + " se mueve hacia abajo"); //Mensaje de la acción
		break;
		default:
			System.out.println("Posición inválida.");
		}
	}
	
	/**
	 * Método para comer a otro personaje, en el videojuego Pacman.
	 * @param pj -- Instancia de la clase personaje
	 */
	public void comer(Personaje pj) {
		/*
		 * Como hay relación entre personajes (pacman ---- fantasma), esta queda
		 * representada en este método
		 */
		System.out.println(this.nombre + " se ha comido a " + pj.getNombre());
	}
	
	/**
	 * Esté método se activa al momento que un personaje muere.
	 * @param personaje - String con el nombre del personaje
	 */
	public void morir(String personaje) {
		this.vida = false; //El personaje pasa de vivo a muerto
		System.out.println(personaje + " ha muerto!");
	}
	
	//Definición de getters an setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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

	public boolean isVida() {
		return vida;
	}

	public void setVida(boolean vida) {
		this.vida = vida;
	}
	
	
}
