
public class App {

	public static void main(String[] args) {
		//Definición de instancias de la clase Perro
		Perro p1 = new Perro("Cachupin", "bulldog", 0.5f);
		Perro p2 = new Perro("Francis", 0.7f);
		
		//Leer atributos de la instancia de clase
		System.out.println("Llamada de atributos:");
		System.out.println("Nombre perro 1: " + p1.getNombre());
		System.out.println("Raza perro 2: " + p2.getRaza());
		System.out.println();
		
		//Cambiar raza
		System.out.println("Cambio de atributos: ");
		System.out.println("Raza perro 1 original: " + p1.getRaza());
		p1.setRaza("Pitbull");
		System.out.println("Raza perro 1 cambiada: " + p1.getRaza());
		System.out.println();
		
		System.out.println("Instancias de la clase perro");
		//Usar atributos de las instancias de clase Perro
		p1.ladrar();
		p1.dormir();
		p2.comer();
	}

}
