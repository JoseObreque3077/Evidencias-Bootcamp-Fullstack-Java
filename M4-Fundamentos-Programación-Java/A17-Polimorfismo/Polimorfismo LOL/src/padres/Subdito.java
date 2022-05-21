package padres;

/**
 * Clase que representa a un súbdito en el videojuego League of Legends.
 * @author José Obreque F.
 *
 */
public abstract class Subdito extends Personaje{
	private String color;
	private String estilo;
	
	public Subdito(String nombre, String bando, float posX, float posY, int damBase, int vidaBase, int expBase,
			int oroBase, String color, String estilo) {
		super(nombre, bando, posX, posY, damBase, vidaBase, expBase, oroBase);
		this.color = color;
		this.estilo = estilo;
	}

	//Getters y Setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
	
	
}
