/**
 * Clase que define a un personaje del videojuego Pacman.
 * @author Jos� Obreque F.
 * @version 1.0
 */
public abstract class Personaje {
	private String nombre; //ID del personaje
	private String color; //Color del personaje
	private int posX; //Posici�n del personaje en el eje X
	private int posY; //Posici�n del personaje en el eje Y
	private boolean vida;
	
	//Definici�n del constructor de la clase
	public Personaje(String nombre, String color, int posX, int posY) {
		this.nombre = nombre;
		this.color = color;
		this.posX = posX;
		this.posY = posY;
		this.vida = true;
	}
	
	/**
	 * M�todo que permite el desplazamiento del personaje en una direcci�n a la vez.
	 * @param direccion - String (arriba, abajo, izquierda, derecha) que indica direcci�n del movimiento.
	 */
	public void mover(String direccion) {
		switch (direccion) {
		case "izquierda":
			this.posX -= 1; //Se mueve 1 unidad a la izquierda
			System.out.println(nombre + " se mueve a la izquierda"); //Mensaje de la acci�n
		break;
		case "derecha":
			this.posX += 1; //Se mueve 1 unidad a la derecha
			System.out.println(nombre + " se mueve a la derecha"); //Mensaje de la acci�n
		break;
		case "arriba":
			this.posY += 1; //Se mueve 1 unidad a hacia arriba
			System.out.println(nombre + " se mueve hacia arriba"); //Mensaje de la acci�n
		break;
		case "abajo":
			this.posY -= 1; //Se mueve 1 unidad hacia abajo
			System.out.println(nombre + " se mueve hacia abajo"); //Mensaje de la acci�n
		break;
		default:
			System.out.println("Posici�n inv�lida.");
		}
	}
	
	/**
	 * M�todo para comer a otro personaje, en el videojuego Pacman.
	 * @param pj -- Instancia de la clase personaje
	 */
	public void comer(Personaje pj) {
		/*
		 * Como hay relaci�n entre personajes (pacman ---- fantasma), esta queda
		 * representada en este m�todo
		 */
		System.out.println(this.nombre + " se ha comido a " + pj.getNombre());
	}
	
	/**
	 * Est� m�todo se activa al momento que un personaje muere.
	 * @param personaje - String con el nombre del personaje
	 */
	public void morir(String personaje) {
		this.vida = false; //El personaje pasa de vivo a muerto
		System.out.println(personaje + " ha muerto!");
	}
	
	//Definici�n de getters an setters
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
