import java.util.Scanner;

public class CicloWhile2 {

	public static void main(String[] args) {
		int cont;
		int suma;
		int num;
		int x;
		
		suma = 0;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese valor inicial:");
		num = leer.nextInt();
		x = num + 100;
		
		cont = num;
		
		while (cont<=x) {
			suma += cont;
			cont++;
		}
		
		System.out.println("La suma de " + num + " a " + x + " es: " + suma);

	}

}
