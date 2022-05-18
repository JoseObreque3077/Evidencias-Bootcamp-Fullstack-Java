import java.util.Scanner;

public class LecturaDatos {

	public static void main(String[] args) {
		int num1;
		int num2;
		int suma;
		Scanner leer = new Scanner(System.in); //Para leer por teclado
		System.out.println("Ingrese primer número:");
		num1 = leer.nextInt();
		System.out.println("Ingrese segundo número:");
		num2 = leer.nextInt();
		suma = num1 + num2;
		System.out.println("La suma es: " + suma);
	}

}