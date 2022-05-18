import java.util.Scanner;

public class CicloFor2 {

	public static void main(String[] args) {
		int suma;
		int num;
		int x;
		
		suma = 0;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese valor inicial:");
		num = leer.nextInt();
		x = num + 100;
		
		for (int i=num; i<=x; i++) {
			suma += i;
		}

		System.out.println("La suma de " + num + " a " + x + " es: " + suma);

	}

}
