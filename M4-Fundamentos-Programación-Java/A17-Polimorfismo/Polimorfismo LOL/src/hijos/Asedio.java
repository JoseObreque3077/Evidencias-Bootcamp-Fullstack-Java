package hijos;

import padres.Subdito;

/**
 * Clase que representa a un Subdito de tipo Asedio, en el videojuego League of Legends.
 * @author Jos� Obreque F.
 *
 */
public class Asedio extends Subdito{
	/*
	 * Caracter�sticas de un Asedio (hereda de clase Subdito):
	 * Da�o: 40
	 * Vida: 805
	 * Experiencia entregada al morir: 92
	 * Oro entregado al morir: 40
	 */
	public Asedio(String nombre, String bando, float posX, float posY, String color, String estilo) {
		super(nombre, bando, posX, posY, 40, 805, 92, 40, color, estilo);
	}
}
