package frame;

import fondo.Fondo;
import hijas.MarioMapache;
import otros.TableroResumen;
import terreno.Piso;
import terreno.Plataforma;
import hijas.TortugaVoladora;
import java.util.ArrayList;

public class Frame {
	Fondo fondoSt;
	Piso pisoSt;
	TableroResumen tablero;
	MarioMapache mario;
	ArrayList<TortugaVoladora> tortugas;
	ArrayList<Plataforma> plataformas;
	
	public Frame(Fondo fondoSt, Piso pisoSt, TableroResumen tablero, MarioMapache mario) {
		this.fondoSt = fondoSt;
		this.pisoSt = pisoSt;
		this.tablero = tablero;
		this.mario = mario;
		this.tortugas = new ArrayList<TortugaVoladora>();
		this.plataformas = new ArrayList<Plataforma>();
	}
	
	public void addTortuga(TortugaVoladora t) {
		this.tortugas.add(t);
		System.out.println("Tortuga añadida!");
	}
	
	public void addPlataforma(Plataforma p) {
		this.plataformas.add(p);
		System.out.println("Plataforma añadida!");
	}
	
	
}
