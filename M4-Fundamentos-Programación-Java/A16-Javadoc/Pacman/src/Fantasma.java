/**
 * Clase que define al personaje Fantasma del videojuego Pacman.
 * @author Jos� Obreque F.
 * @version 1.0
 */
public class Fantasma extends Personaje{
	
	public Fantasma(String nombre, String color, int posX, int posY) {
		super(nombre, color, posX, posY);
	}
	
	/**
	 * M�todo que hace que el fantasma huya en caso de que Pacman tenga su poder especial activo.
	 * @param p - Instancia de la clase Pacman
	 */
	public void huir(Pacman p) {
		if (p.isPoderActivo()) { //El fantasma huye solo si Pacman tiene el poder activo
			System.out.println("El fantasma " + super.getNombre() + "huye de Pacman");
		}
		else {
			System.out.println("La persecuci�n contin�a!");
		}
	}
	
	/**
	 * M�todo que permite que un fantasma "coma" a Pacman. Este hace que el juego acabe.
	 * @param p - Instancia de la clase Pacman
	 */
	public void comerPacman(Pacman p) {
		this.comer(p); //Se llama al m�todo de la clase padre
		this.morir(p.getNombre()); //Se llama al m�todo morir de la clase padre
		System.out.println("GAME OVER");
		System.out.println("PUNTUACION: " + p.getPuntuacion());
	}
}
