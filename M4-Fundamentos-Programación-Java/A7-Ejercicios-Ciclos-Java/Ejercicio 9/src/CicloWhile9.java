import java.util.Scanner;

public class CicloWhile9 {

	public static void main(String[] args) {
		int opc;
		float radio;
		float lado;
		float largo;
		float ancho;
		float area;
		
		Scanner leer = new Scanner(System.in);
		
		opc = 0;
		while (opc != 4) {
			System.out.println("Menú:");
			System.out.println("(1) Área Círculo");
			System.out.println("(2) Área Cuadrado");
			System.out.println("(3) Área Rectángulo");
			System.out.println("(4) Salir");
			System.out.println("");
			opc = leer.nextInt();
			
			switch (opc) {
			case 1:
				System.out.println("Ingrese el radio del círculo:");
				radio = leer.nextFloat();
				area = 3.1415f * radio * radio;
				System.out.println("Área: " + area);
				System.out.println("");
			break;
			case 2:
				System.out.println("Ingrese el lado del cuadrado:");
				lado = leer.nextFloat();
				area = lado * lado;
				System.out.println("Área: " + area);
				System.out.println("");
			break;
			case 3:
				System.out.println("Ingrese el largo del rectángulo:");
				largo = leer.nextFloat();
				System.out.println("Ingrese el ancho del rectángulo:");
				ancho = leer.nextFloat();
				area = largo * ancho;
				System.out.println("Área: " + area);
				System.out.println("");
			break;
			case 4:
				System.out.println("Programa finalizado.");
			break;
			default:
				System.out.println("Opción inválida. Intente nuevamente.");
				System.out.println("");
			}
		}

	}

}
