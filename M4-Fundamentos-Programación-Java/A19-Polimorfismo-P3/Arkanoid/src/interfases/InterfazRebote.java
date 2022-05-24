
package interfases;

import hijas.Esfera;

/**
 * Interfaz para compartir el m�todo rebote de una esfera del juego Arkanoid.
 * @author Jos� Obreque F.
 *
 */
public interface InterfazRebote {
	/**
	 * Se efect�a el rebote de la esfera contra un elemento (borde, bloque o paleta).
	 * @param esf - esfera del juego: Esfera
	 */
	public void rebote(Esfera esf);
}
