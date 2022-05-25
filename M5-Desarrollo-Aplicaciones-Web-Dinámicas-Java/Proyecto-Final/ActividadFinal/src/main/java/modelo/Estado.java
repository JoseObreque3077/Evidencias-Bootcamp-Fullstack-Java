package modelo;

public class Estado {
	private int id;
	private String descripcion;
	
	public Estado(int id, String descripción) {
		this.id = id;
		this.descripcion = descripción;
	}
	
	public Estado(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripción) {
		this.descripcion = descripción;
	}
}
