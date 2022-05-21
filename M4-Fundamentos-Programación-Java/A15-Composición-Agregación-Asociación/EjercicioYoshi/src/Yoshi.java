
public class Yoshi {
	private String color;
	private String nombre;
	private Botas b;
	
	public Yoshi(String color, String nombre, Botas b) {
		this.color = color;
		this.nombre = nombre;
		this.b = b;
	}

	public String getColor() {
		return color;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setNombre(String nombre) {
		this.color = nombre;
	}
}
