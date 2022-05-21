package hijos;

import padres.Campeon;
import padres.Personaje;

/**
 * Clase que representa al campeón jugable Teemo, en el videojuego League of Legends.
 * @author José Obreque F.
 *
 */
public class Teemo extends Campeon{
	/*
	 * Vida base: 618 (nivel 1)
	 * Aumento de vida por nivel: 90
	 * Maná base: 354 (nivel 1)
	 * Aumento de maná por nivel: 20
	 * Daño base: 57 (nivel 1)
	 * Aumento de daño base por nivel: 3
	 * Daño base de ataque Q: 80 (Dardo cegador)
	 * Daño base de ataque W: 0 (Movimiento rápido)
	 * Daño base de ataque E: 14 (Tiro tóxico)
	 * Daño base de ataque R: 50 (Trampa Ponsoñoza)
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
				System.out.println(this.getNombre() + " usa Movimiento Tóxico.");
			break;
			case "e":
				System.out.println(this.getNombre() + " usa Tiro Tóxico.");
			break;
			case "r":
				System.out.println(this.getNombre() + " usa Trampa Ponsoñoza.");
			break;
			}
		}
		super.ataqueEspecial(pj, tecla);
	}
	
	
}
