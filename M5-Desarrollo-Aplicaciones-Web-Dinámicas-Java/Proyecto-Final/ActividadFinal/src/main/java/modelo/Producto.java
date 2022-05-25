package modelo;

public class Producto {
	private int id;
	private String descripcion;
	
	public Producto(int id, String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
	}
	
	public Producto(int id) {
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

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
