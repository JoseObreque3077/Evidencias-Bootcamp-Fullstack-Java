import java.util.Scanner;

public class CicloWhile6 {

	public static void main(String[] args) {
		int cont;
		int acum;
		int num;
		cont = 1;
		acum = 1;
		
		Scanner leer = new Scanner(System.in);
		
		while (cont<=10) {
			System.out.println("Ingrese el valor #" + cont);
			num = leer.nextInt();
			acum *= num;
			cont++;
		}
		
		System.out.println("La multiplicación es: " + acum);

	}

}
