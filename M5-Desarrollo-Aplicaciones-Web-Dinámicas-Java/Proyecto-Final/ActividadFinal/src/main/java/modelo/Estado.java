package modelo;

public class Estado {
	private int id;
	private String descripcion;
	
	public Estado(int id, String descripci�n) {
		this.id = id;
		this.descripcion = descripci�n;
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

	public void setDescripcion(String descripci�n) {
		this.descripcion = descripci�n;
	}
}
