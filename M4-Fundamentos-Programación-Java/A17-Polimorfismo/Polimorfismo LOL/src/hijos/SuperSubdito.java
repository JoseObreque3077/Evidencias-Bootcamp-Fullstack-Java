package hijos;

import padres.Subdito;

/**
 * Clase que representa a un Subdito de tipo SuperSubdito, en el videojuego League of Legends.
 * @author José Obreque F.
 *
 */
public class SuperSubdito extends Subdito{
	/*
	 * Características de un SuperSubdito (hereda de clase Subdito):
	 * Daño: 180
	 * Vida: 1500
	 * Experiencia entregada al morir: 97
	 * Oro entregado al morir: 40
	 */
	public SuperSubdito(String nombre, String bando, float posX, float posY, String color, String estilo) {
		super(nombre, bando, posX, posY, 180, 1500, 97, 40, color, estilo);
	}

}
