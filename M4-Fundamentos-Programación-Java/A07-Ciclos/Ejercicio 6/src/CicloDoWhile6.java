import java.util.Scanner;

public class CicloDoWhile6 {
	
	public static void main(String[] args) {
		int cont;
		int acum;
		int num;
		cont = 1;
		acum = 1;
		
		Scanner leer = new Scanner(System.in);
		
		do {
			System.out.println("Ingrese el valor #" + cont);
			num = leer.nextInt();
			acum *= num;
			cont++;
		}
		while (cont<=10);
		
		System.out.println("La multiplicación es: " + acum);

	}

}
