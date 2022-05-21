import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in); //Definición de scanner para leer entradas por consola
		int opc=0; //Definición de variable que almacena opcion ingresada por el usuario
		int val1, val2;
		Matematica m = new Matematica(); //Instancia de la clase matemática
		
		while (opc != 7) {
			System.out.println("Escoja una opción:");
			System.out.println("(1) Suma(a,b)");
			System.out.println("(2) Suma()");
			System.out.println("(3) Resta(a,b)");
			System.out.println("(4) Multiplicacion(a,b)");
			System.out.println("(5) Multiplicacion()");
			System.out.println("(6) Division(a,b)");
			opc = leer.nextInt();
			
			switch (opc) {
				case 1:
					System.out.println("Ingrese primer valor int:");
					val1 = leer.nextInt();
					System.out.println("Ingrese segundo valor int:");
					val2 = leer.nextInt();
					System.out.println(val1 + "+" + val2 + "=" + m.suma(val1, val2));
					System.out.println();
				break;
				case 2:
					System.out.println("Suma por defecto:");
					m.suma();
					System.out.println();
				break;
				case 3:
					System.out.println("Ingrese primer valor int:");
					val1 = leer.nextInt();
					System.out.println("Ingrese segundo valor int:");
					val2 = leer.nextInt();
					System.out.println(val1 + "-" + val2 + "=" + m.resta(val1, val2));
					System.out.println();
				break;
				case 4:
					System.out.println("Ingrese primer valor int:");
					val1 = leer.nextInt();
					System.out.println("Ingrese segundo valor int:");
					val2 = leer.nextInt();
					System.out.println(val1 + "*" + val2 + "=" + m.multiplicacion(val1, val2));
					System.out.println();
				break;
				case 5:
					System.out.println("Multiplicación por defecto:");
					System.out.println(3.1 + "*" + 6.5567 + "=" + m.multiplicacion());
					System.out.println();
				break;
				case 6:
					System.out.println("Ingrese primer valor int:");
					val1 = leer.nextInt();
					System.out.println("Ingrese segundo valor int:");
					val2 = leer.nextInt();
					System.out.println(val1 + "/" + val2 + "=" + m.division(val1, val2));
					System.out.println();
				break;
				default:
					System.out.println("Opción inválida. Intente nuevamente.");
					System.out.println();
			}
		}
		
	}

}
