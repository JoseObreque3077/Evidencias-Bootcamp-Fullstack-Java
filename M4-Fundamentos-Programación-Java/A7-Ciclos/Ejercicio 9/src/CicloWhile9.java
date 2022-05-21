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
			System.out.println("Men�:");
			System.out.println("(1) �rea C�rculo");
			System.out.println("(2) �rea Cuadrado");
			System.out.println("(3) �rea Rect�ngulo");
			System.out.println("(4) Salir");
			System.out.println("");
			opc = leer.nextInt();
			
			switch (opc) {
			case 1:
				System.out.println("Ingrese el radio del c�rculo:");
				radio = leer.nextFloat();
				area = 3.1415f * radio * radio;
				System.out.println("�rea: " + area);
				System.out.println("");
			break;
			case 2:
				System.out.println("Ingrese el lado del cuadrado:");
				lado = leer.nextFloat();
				area = lado * lado;
				System.out.println("�rea: " + area);
				System.out.println("");
			break;
			case 3:
				System.out.println("Ingrese el largo del rect�ngulo:");
				largo = leer.nextFloat();
				System.out.println("Ingrese el ancho del rect�ngulo:");
				ancho = leer.nextFloat();
				area = largo * ancho;
				System.out.println("�rea: " + area);
				System.out.println("");
			break;
			case 4:
				System.out.println("Programa finalizado.");
			break;
			default:
				System.out.println("Opci�n inv�lida. Intente nuevamente.");
				System.out.println("");
			}
		}

	}

}
