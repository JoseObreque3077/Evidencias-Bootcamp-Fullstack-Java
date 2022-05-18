import java.util.Scanner;

public class CicloFor6 {

	public static void main(String[] args) {
		int acum;
		int num;
		acum = 1;
		
		Scanner leer = new Scanner(System.in);
		
		for (int i=1; i<=10; i++) {
			System.out.println("Ingrese el valor #" + i);
			num = leer.nextInt();
			acum *= num;
		}
		
		System.out.println("La multiplicación es: " + acum);

	}

}
