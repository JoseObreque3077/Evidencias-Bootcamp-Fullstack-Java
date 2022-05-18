import java.util.Scanner;

public class MenuMatematico {

	public static void main(String[] args) {
		int opcion;
		float num1;
		float num2;
		float res;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese el primer n�mero:");
		num1 = leer.nextFloat();
		System.out.println("Ingrese el segundo n�mero");
		num2 = leer.nextFloat();
		
		do {
			System.out.println("(1) Suma");
			System.out.println("(2) Resta");
			System.out.println("(3) Multiplicaci�n");
			System.out.println("(4) Divisi�n");
			System.out.println("(5) Salir");
			opcion = leer.nextInt();
			
			switch(opcion) {
				case 1:
					res = num1 + num2;
					System.out.println("El resultado es: " + res);
				break;
				case 2:
					res = num1 - num2;
					System.out.println("El resultado es: " + res);
				break;
				case 3:
					res = num1 * num2;
					System.out.println("El resultado es: " + res);
				break;
				case 4:
					if (num2==0) {
						System.out.println("Divisi�n por cero!");
					}
					else {
						res = num1 / num2;
						System.out.println("El resultado es: " + res);
					}
				break;
				case 5:
					System.out.println("Programa terminado.");
				break;
				default:
					System.out.println("Opci�n inv�lida. Intente nuevamente.");
			}
		}
		while(opcion!=5);
	}

}
