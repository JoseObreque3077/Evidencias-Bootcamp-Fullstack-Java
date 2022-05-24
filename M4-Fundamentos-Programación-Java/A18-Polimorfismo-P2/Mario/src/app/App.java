package app;

import fondo.Fondo;
import frame.Frame;
import hijas.MarioMapache;
import hijas.TortugaVoladora;
import otros.TableroResumen;
import terreno.Piso;
import terreno.Plataforma;

/**
 * Pruebas al código del juego.
 * @author José Obreque F.
 *
 */
public class App {

	public static void main(String[] args) {
		MarioMapache mario = new MarioMapache("mario", 4, 400, 300);
		TortugaVoladora t1 = new TortugaVoladora("tortuga 1", 450, 350, false);
		TortugaVoladora t2 = new TortugaVoladora("tortuga 2", 650, 370, false);
		TortugaVoladora t3 = new TortugaVoladora("tortuga 3", 400, 400, true);
		Plataforma p1 = new Plataforma(400, 300, 600, 100, "verde");
		Plataforma p2 = new Plataforma(450, 300, 600, 100, "naranja");
		Plataforma p3 = new Plataforma(500, 300, 600, 100, "azul");
		Piso p = new Piso(0);
		Fondo f = new Fondo(0);
		TableroResumen t = new TableroResumen(127, 0);
		Frame fr = new Frame(f, p, t, mario);
		
		System.out.println("Agregación: Plataformas");
		fr.addPlataforma(p1);
		fr.addPlataforma(p2);
		fr.addPlataforma(p3);
		System.out.println();
		
		System.out.println("Agregación: Tortuga");
		fr.addTortuga(t1);
		fr.addTortuga(t2);
		fr.addTortuga(t3);
		System.out.println();
		
		System.out.println("Mario salta sobre una tortuga:");
		mario.saltar(t1);
		System.out.println("EXCELEEEEEEENTE!!!!");
		System.out.println();
		
		System.out.println("Mario salta sobre caparazon:");
		mario.saltar(t1);
		System.out.println("IMPECAAAABLE!!!!");
		System.out.println();
		
		System.out.println("Mario toca caparazón:");
		mario.chocar(t1);
		System.out.println();
		
		System.out.println("Mario toca caparazón (de nuevo, vaya pelmazo):");
		mario.chocar(t1);
		System.out.println();
		
		System.out.println("Tortuga salta sobre mario (oh dios, oh no!)");
		t1.saltar(mario);
		System.out.println();
		
		System.out.println("Ahora a Mario le toca morir (Que Lamentable):");
		mario.setVidas(1);
		mario.chocar(t2);
		mario.chocar(t2);
		System.out.println();
		
		System.out.println("Tablero resumen:");
		t.mostrarResumen(mario);
		
		
	}
}
