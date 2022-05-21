package app;

import hijos.Asedio;
import hijos.Darius;
import hijos.Guerrero;
import hijos.Mago;
import hijos.MissFortune;
import hijos.SuperSubdito;
import hijos.Teemo;
import otros.Maleza;

/**
 * Clase que representa a la aplicación del videojuego League of Legends.
 * @author José Obreque F.
 *
 */
public class App {
	
	/**
	 * Método que representa al cuerpo principal del código de ejecución del videojuego.
	 * @param args
	 */
	public static void main(String[] args) {
		//Creación de subditos del equipo azul
		Guerrero min1 = new Guerrero("Subdito Guerrero #1 (Azul)", "Equipo Azul", 10, 10, "azul", "guerrero");
		Mago min2 = new Mago("Subdito Mago #1 (azul)", "Equipo Azul", 20, 10, "azul", "mago");
		Asedio min3 = new Asedio("Subdito Asedio #1 (azul)", "Equipo Azul", 30, 15, "azul", "asedio");
		SuperSubdito s1 = new SuperSubdito("Supersubdito #1 (azul)", "Equipo Azul", 30, 45, "azul", "ss");
		//Creación de subditos del equipo rojo
		Guerrero min4 = new Guerrero("Subdito Guerrero #2 (rojo)", "Equipo Rojo", 40, 40, "rojo", "guerrero");
		Mago min5 = new Mago("Subdito Mago #2 (rojo)", "Equipo Rojo", 50, 55, "rojo", "mago");
		Asedio min6 = new Asedio("Subdito Asedio #2 (rojo)", "Equipo Rojo", 65, 77, "rojo", "asedio");
		SuperSubdito s2 = new SuperSubdito("Supersubdito #2 (rojo)", "Equipo Rojo", 30, 45, "rojo", "ss");
		//Creación campeones del equipo azul (x2)
		Teemo camp1 = new Teemo("Teemo (azul)", "Equipo Azul", 15, 15, "teemo clasico");
		Darius camp2 = new Darius("Darius (azul)", "Equipo Azul", 22, 22, "darius clasico");
		//Creación campeones del equipo rojo (x2)
		Teemo camp3 = new Teemo("Teemo (rojo)", "Equipo Rojo", 44, 44, "teemo skin especial");
		MissFortune camp4 = new MissFortune("Miss Fortune (rojo)", "Equipo Rojo", 77, 45, "miss fortune clasica");
		//Creación de un área de maleza
		Maleza m = new Maleza(new int[]{78, 80, 82, 84, 87, 90}, new int[]{90, 95, 111, 114, 120, 133}, "tradicional");
		
		//Prueba 1: Subdito ataca a otros subditos (equipo azul a rojo).
		System.out.println("PRUEBA 1:");
		min1.ataqueBasico(min4);
		min2.ataqueBasico(min5);
		min3.ataqueBasico(min6);
		s1.ataqueBasico(s2);
		System.out.println();
		
		//Prueba 2: Subdito intenta atacar a subditos del mismo equipo.
		System.out.println("PRUEBA 2:");
		min1.ataqueBasico(min2);
		min5.ataqueBasico(s2);
		System.out.println();
		
		//Prueba 3: Campeón ataca (ataque básico) a subditos enemigos.
		System.out.println("PRUEBA 3:");
		camp1.ataqueBasico(min4);
		camp3.ataqueBasico(min2);
		System.out.println();
		
		//Prueba 4: Campeón ataca (ataque básico) a campeones enemigos.
		System.out.println("PRUEBA 4:");
		camp2.ataqueBasico(camp3);
		camp4.ataqueBasico(camp1);
		System.out.println();
		
		//Prueba 5: Campeón ataca a campeones enemigos usando ataques especiales.
		System.out.println("PRUEBA 5:");
		camp1.ataqueEspecial(camp4, "q");
		camp3.ataqueEspecial(camp2, "r");
		System.out.println();
		
		//Prueba 6: Campeón 1 elimina unidades hasta subir de nivel.
		System.out.println("PRUEBA 6:");
		//Campeón 1 elimina a Campeón 4
		camp1.ataqueEspecial(camp4, "r");
		camp1.ataqueBasico(camp4);
		camp1.ataqueBasico(camp4);
		camp1.ataqueBasico(camp4);
		camp1.ataqueBasico(camp4);
		camp1.ataqueEspecial(camp4, "q");
		camp1.ataqueEspecial(camp4, "q");
		camp1.ataqueBasico(camp4);
		camp1.ataqueBasico(camp4);
		camp1.ataqueBasico(camp4);
		camp1.ataqueBasico(camp4);
		//Campeon 1 elimina a subdito guerrero
		camp1.ataqueEspecial(min4, "q");
		camp1.ataqueBasico(min4);
		camp1.ataqueBasico(min4);
		camp1.ataqueBasico(min4);
		camp1.ataqueBasico(min4);
		camp1.ataqueBasico(min4);
		camp1.ataqueBasico(min4);
		camp1.ataqueBasico(min4);
		//Campeon 1 a subdito mago
		camp1.ataqueBasico(min5);
		camp1.ataqueBasico(min5);
		camp1.ataqueBasico(min5);
		camp1.ataqueBasico(min5);
		camp1.ataqueBasico(min5);
		System.out.println("Resumen: ");
		System.out.println("Experiencia: " + camp1.getExp());
		System.out.println("Oro: " + camp1.getOro());
		System.out.println("Maná: " + camp1.getMana());
		System.out.println();
		
		//Prueba 7: Campeon 3 se oculta en la maleza y luego sale de ella
		System.out.println("PRUEBA 7:");
		m.ocultarCampeon(camp3);
		m.mostrarCampeon(camp3);
		System.out.println();
		
		//Prueba 8: supersubdito 1 se mueve a (50, 75)
		System.out.println("PRUEBA 8:");
		s1.mover(50, 75);

		
	}

}
