import java.util.Scanner;

public class CicloDoWhile3 {

	public static void main(String[] args) {
		int cont;
		int suma;
		int num1;
		int num2;
		
		suma = 0;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese valor inicial:");
		num1 = leer.nextInt();
		System.out.println("Ingrese valor final:");
		num2 = leer.nextInt();
		
		cont = num1;
		do {
			suma += cont;
			cont++;
		}
		while (cont<=num2);
		
		System.out.println("La suma de " + num1 + " a " + num2 + " es: " + suma);

	}

}
