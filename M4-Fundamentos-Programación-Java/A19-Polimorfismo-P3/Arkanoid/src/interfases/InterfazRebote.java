
package interfases;

import hijas.Esfera;

/**
 * Interfaz para compartir el método rebote de una esfera del juego Arkanoid.
 * @author José Obreque F.
 *
 */
public interface InterfazRebote {
	/**
	 * Se efectúa el rebote de la esfera contra un elemento (borde, bloque o paleta).
	 * @param esf - esfera del juego: Esfera
	 */
	public void rebote(Esfera esf);
}
