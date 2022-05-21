
public class Perro {
	private String nombre;
	private String raza;
	private float altura;
	
	//Constructor de la clase con 3 atributos
	Perro(String nombre, String raza, float altura) {
		this.nombre = nombre;
		this.raza = raza;
		this.altura = altura;
	}
	
	//Constructor con 3 atributos (1 por defecto)
	Perro(String nombre, float altura) {
		this.nombre = nombre;
		this.raza = "quiltro";
		this.altura = altura;
	}
	
	//Métodos de la clase
	void comer() {
		System.out.println("Perro comiendo");
	}
	
	void dormir() {
		System.out.println("Perro durmiendo");
	}
	
	void ladrar() {
		System.out.println("Perro ladrando");
	}
	
	//Métodos accesadores
	public String getNombre() {
		return this.nombre;
	}
	
	public String getRaza() {
		return this.raza;
	}
	
	public float getAltura() {
		return this.altura;
	}
	
	//Métodos mutadores
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
}
