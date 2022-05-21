
public class Luigi {
	private String nombre;

	public Luigi(String nombre) {
		this.nombre = nombre;
	}

	public void montarYoshi(Yoshi y) {
		System.out.println("Luigi monta a " + y.getNombre() + " de color " + y.getColor());
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
