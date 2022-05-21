package hijos;

import padres.Campeon;
import padres.Personaje;

/**
 * Clase que representa al campeón jugable Darius, en el videojuego League of Legends.
 * @author José Obreque F.
 *
 */
public class Darius extends Campeon{
	/*
	 * Vida base: 682 (nivel 1)
	 * Aumento de vida por nivel: 100
	 * Maná base: 300 (nivel 1)
	 * Aumento de maná por nivel: 37
	 * Daño base: 69 (nivel 1)
	 * Aumento de daño base por nivel: 5
	 * Daño base de ataque Q: 50 (Diezmar)
	 * Daño base de ataque W: 140 (Golpe atroz)
	 * Daño base de ataque E: 0 (Atrapar)
	 * Daño base de ataque R: 50 (Guillotina Noxiana)
	 */
	public Darius(String nombre, String bando, float posX, float posY, String estilo) {
		super(nombre, bando, posX, posY, 69, 682, 100, 1000, estilo, 300, 37, 100, 5, true, 50, 140, 0, 50, 30, 40, 70, 100);
	}

	@Override
	public void ataqueEspecial(Personaje pj, String tecla) {
		if (super.validarAtaque(pj) && super.validarMana(tecla)) {
			switch (tecla) {
			case "q":
				System.out.println(this.getNombre() + " usa Diezmar.");
			break;
			case "w":
				System.out.println(this.getNombre() + " usa Golpe Atroz.");
			break;
			case "e":
				System.out.println(this.getNombre() + " usa Atrapar.");
			break;
			case "r":
				System.out.println(this.getNombre() + " usa Guillotina Noxiana.");
			break;
			}
		}
		super.ataqueEspecial(pj, tecla);
	}
	
	
}
