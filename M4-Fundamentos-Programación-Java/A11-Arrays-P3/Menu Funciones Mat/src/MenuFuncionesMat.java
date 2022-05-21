import java.util.Scanner;

public class MenuFuncionesMat {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int opc;
		float num1, num2;
		
		num1 = 0;
		num2 = 0;
		
		do {
			System.out.println("Escoja una operaci�n matem�tica:");
			System.out.println("(1) Suma");
			System.out.println("(2) Resta");
			System.out.println("(3) Multiplicaci�n");
			System.out.println("(4) Divisi�n");
			System.out.println("(5) Salir");
			opc = leer.nextInt();
			
			if (opc>0 && opc<5) {
				System.out.println("Ingrese primer n�mero:");
				num1 = leer.nextFloat();
				System.out.println("Ingrese segundo n�mero:");
				num2 = leer.nextFloat();
				System.out.println();
			}
			
			switch (opc) {
				case 1:
					suma(num1,num2);
				break;
				case 2:
					resta(num1,num2);
				break;
				case 3:
					multiplicacion(num1,num2);
				break;
				case 4:
					division(num1,num2);
				break;
				case 5:
					System.out.println("Programa terminado");
				break;
				default:
					System.out.println("Opci�n inv�lida. Intente nuevamente.");
			}
			System.out.println();
		}while (opc!=5);
	}
	
	public static void suma(float num1, float num2) {
		float res;
		res = num1 + num2;
		System.out.println("Resultado: " + res);
	}
	
	public static void resta(float num1, float num2) {
		float res;
		res = num1 - num2;
		System.out.println("Resultado: " + res);
	}
	
	public static void multiplicacion(float num1, float num2) {
		float res;
		res = num1 * num2;
		System.out.println("Resultado: " + res);
	}
	
	public static void division(float num1, float num2) {
		float res;
		if (num2 == 0) {
			System.out.println("Indeterminado: Divisi�n por cero!");
		}
		else {
			res = num1 / num2;
			System.out.println("Resultado: " + res);
		}
	}
}
