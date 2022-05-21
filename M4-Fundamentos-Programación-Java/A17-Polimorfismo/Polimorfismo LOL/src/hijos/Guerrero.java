package hijos;

import padres.Subdito;

/**
 * Clase que representa a un Subdito de tipo Guerrero, en el videojuego League of Legends.
 * @author José Obreque F.
 *
 */
public class Guerrero extends Subdito{
	/*
	 * Características de un guerrero (hereda de clase Subdito):
	 * Daño: 12
	 * Vida: 455
	 * Experiencia entregada al morir: 59
	 * Oro entregado al morir: 20
	 */
	public Guerrero(String nombre, String bando, float posX, float posY, String color, String estilo) {
		super(nombre, bando, posX, posY, 12, 455, 59, 20, color, estilo);
	}
	
}
