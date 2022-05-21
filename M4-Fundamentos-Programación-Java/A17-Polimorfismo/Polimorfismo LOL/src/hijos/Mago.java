package hijos;

import padres.Subdito;

/**
 * Clase que representa a un Subdito de tipo Mago, en el videojuego League of Legends.
 * @author Jos� Obreque F.
 *
 */
public class Mago extends Subdito{
	/*
	 * Caracter�sticas de un mago (hereda de clase Subdito):
	 * Da�o: 23
	 * Vida: 290
	 * Experiencia entregada al morir: 29
	 * Oro entregado al morir: 15
	 */
	public Mago(String nombre, String bando, float posX, float posY, String color, String estilo) {
		super(nombre, bando, posX, posY, 23, 290, 29, 15, color, "estilo mago");
	}
	
}
