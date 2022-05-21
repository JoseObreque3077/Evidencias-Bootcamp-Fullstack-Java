package hijos;

import padres.Campeon;
import padres.Personaje;

/**
 * Clase que representa al campe�n jugable Teemo, en el videojuego League of Legends.
 * @author Jos� Obreque F.
 *
 */
public class Teemo extends Campeon{
	/*
	 * Vida base: 618 (nivel 1)
	 * Aumento de vida por nivel: 90
	 * Man� base: 354 (nivel 1)
	 * Aumento de man� por nivel: 20
	 * Da�o base: 57 (nivel 1)
	 * Aumento de da�o base por nivel: 3
	 * Da�o base de ataque Q: 80 (Dardo cegador)
	 * Da�o base de ataque W: 0 (Movimiento r�pido)
	 * Da�o base de ataque E: 14 (Tiro t�xico)
	 * Da�o base de ataque R: 50 (Trampa Ponso�oza)
	 */
	public Teemo(String nombre, String bando, float posX, float posY, String estilo) {
		super(nombre, bando, posX, posY, 57, 618, 100, 1000, estilo, 354, 20, 90, 3, true, 80, 0, 14, 50, 70, 40, 20, 75);
	}

	@Override
	public void ataqueEspecial(Personaje pj, String tecla) {
		if (super.validarAtaque(pj)) {
			switch (tecla) {
			case "q":
				System.out.println(this.getNombre() + " usa Dardo Cegador.");
			break;
			case "w":
				System.out.println(this.getNombre() + " usa Movimiento T�xico.");
			break;
			case "e":
				System.out.println(this.getNombre() + " usa Tiro T�xico.");
			break;
			case "r":
				System.out.println(this.getNombre() + " usa Trampa Ponso�oza.");
			break;
			}
		}
		super.ataqueEspecial(pj, tecla);
	}
	
	
}
