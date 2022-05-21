package otros;

import padres.Campeon;

/**
 * Clase que representa a las malezas que aparecen en la Grieta del Invocador
 * del videojuego League of Legends.
 * @author José Obreque F.
 *
 */
public class Maleza {
	private int verticesX[] = new int[6]; //Atributo: array de vértices (coordenada X) de 6 elementos
	private int verticesY[] = new int[6]; //Atributo: array de vértices (coordenada X) de 6 elementos
	private String estilo;
	
	public Maleza(int[] verticesX, int[] verticesY, String estilo) {
		this.verticesX = verticesX;
		this.verticesY = verticesY;
		this.estilo = estilo;
	}
	
	/**
	 * Método que permite ocultar a un campeón que haya ingresado a un área de maleza.
	 * @param camp - (Campeon): Instancia de la clase Campeon.
	 */
	public void ocultarCampeon(Campeon camp) {
		camp.setVisible(false);
		System.out.println(camp.getNombre() + " se ha ocultado en la maleza!");
	}
	
	/**
	 * Método que permite mostrar a un campeón que haya salido de un área de maleza.
	 * @param camp - (Campeon): Instancia de la clase Campeon.
	 */
	public void mostrarCampeon(Campeon camp) {
		camp.setVisible(true);
		System.out.println(camp.getNombre() + " ha salido de la maleza. Es visible!");
	}
	
	//Getters y Setters
	public int[] getVerticesX() {
		return verticesX;
	}

	public void setVerticesX(int[] verticesX) {
		this.verticesX = verticesX;
	}

	public int[] getVerticesY() {
		return verticesY;
	}

	public void setVerticesY(int[] verticesY) {
		this.verticesY = verticesY;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

}
