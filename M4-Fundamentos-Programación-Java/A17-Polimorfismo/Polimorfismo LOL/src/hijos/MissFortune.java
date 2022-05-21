package hijos;

import padres.Campeon;
import padres.Personaje;

/**
 * Clase que representa al campeón jugable Miss Fortune, en el videojuego League of Legends.
 * @author José Obreque F.
 *
 */
public class MissFortune extends Campeon{
	/*
	 * Vida base: 632 (nivel 1)
	 * Aumento de vida por nivel: 91
	 * Maná base: 361 (nivel 1)
	 * Aumento de maná por nivel: 35
	 * Daño base: 53 (nivel 1)
	 * Aumento de daño base por nivel: 3
	 * Daño base de ataque Q: 20 (Redoble)
	 * Daño base de ataque W: 0 (Alarde)
	 * Daño base de ataque E: 10 (Que llueva)
	 * Daño base de ataque R: 300 (Lluvia de balas)
	 */
	
	public MissFortune(String nombre, String bando, float posX, float posY, String estilo) {
		super(nombre, bando, posX, posY, 53, 632, 100, 1000, estilo, 361, 35, 91, 3, true, 20, 0, 10, 300, 43, 45, 80, 100);
	}

	@Override
	public void ataqueEspecial(Personaje pj, String tecla) {
		if (super.validarAtaque(pj) && super.validarMana(tecla)) {
			switch (tecla) {
			case "q":
				System.out.println(this.getNombre() + " usa Redoble.");
			break;
			case "w":
				System.out.println(this.getNombre() + " usa Alarde.");
			break;
			case "e":
				System.out.println(this.getNombre() + " usa Que Llueva.");
			break;
			case "r":
				System.out.println(this.getNombre() + " usa Lluvia de Balas.");
			break;
			}
		}
		super.ataqueEspecial(pj, tecla);
	}
	
	
}
