import java.util.Scanner;
public class MenuSimple {

	public static void main(String[] args) {
		float num1;
		float num2;
		float res;
		int opc;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Menú de Operaciones Matemáticas");
		System.out.println("Elija una opción:");
		System.out.println("(1) Suma");
		System.out.println("(2) Resta");
		System.out.println("(3) Multiplicación");
		System.out.println("(4) División");
		
		opc = leer.nextInt();
		
		switch (opc) {
			case 1:
				System.out.println("Ingrese primer número");
				num1 = leer.nextFloat();
				System.out.println("Ingrese segundo número");
				num2 = leer.nextFloat();
				res = num1 + num2;
				System.out.println("El resultado es: " + res);
			break;
			case 2:
				System.out.println("Ingrese primer número");
				num1 = leer.nextFloat();
				System.out.println("Ingrese segundo número");
				num2 = leer.nextFloat();
				res = num1 - num2;
				System.out.println("El resultado es: " + res);
			break;
			case 3:
				System.out.println("Ingrese primer número");
				num1 = leer.nextFloat();
				System.out.println("Ingrese segundo número");
				num2 = leer.nextFloat();
				res = num1 * num2;
				System.out.println("El resultado es: " + res);
			break;
			case 4:
				System.out.println("Ingrese primer número");
				num1 = leer.nextFloat();
				System.out.println("Ingrese segundo número");
				num2 = leer.nextFloat();
				if (num2!=0) {
					res = num1 / num2;
					System.out.println("El resultado es: " + res);
				}
				else {
					System.out.println("División por cero!");
				}
			break;
			default:
				System.out.println("Opción inválida!");
		}
	}

}
