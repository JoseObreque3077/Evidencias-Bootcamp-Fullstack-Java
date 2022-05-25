package modelo;

public class Persona {
	private String nombre1;
	private String nombre2;
	private String apellido1;
	private String apellido2;
	private String nacionalidad;
	private String sexo;
	private int edad;
	private boolean esquemaVac;
	
	public Persona(String nombre1, String nombre2, String apellido1, String apellido2, String nacionalidad, String sexo,
			int edad, boolean esquemaVac) {
		super();
		this.nombre1 = nombre1;
		this.nombre2 = nombre2;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.nacionalidad = nacionalidad;
		this.sexo = sexo;
		this.edad = edad;
		this.esquemaVac = esquemaVac;
	}

	public String getNombre1() {
		return nombre1;
	}

	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	public String getNombre2() {
		return nombre2;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isEsquemaVac() {
		return esquemaVac;
	}

	public void setEsquemaVac(boolean esquemaVac) {
		this.esquemaVac = esquemaVac;
	}
	
	
	
}
