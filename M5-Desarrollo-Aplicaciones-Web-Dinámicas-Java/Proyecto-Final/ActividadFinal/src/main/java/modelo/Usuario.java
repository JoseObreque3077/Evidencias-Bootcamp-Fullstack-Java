package modelo;

public class Usuario {
	private int id;
	private String username;
	private String pass;
	private int rol;
	private String rut;
	
	public Usuario(int id, String username, String pass, int rol, String rut) {
		this.id = id;
		this.username = username;
		this.pass = pass;
		this.rol = rol;
		this.rut = rut;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getRol() {
		return rol;
	}

	public void setRol(int rol) {
		this.rol = rol;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}
}
