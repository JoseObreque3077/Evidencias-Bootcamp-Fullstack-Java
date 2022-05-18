import java.util.Scanner;

public class CicloFor7 {

	public static void main(String[] args) {
		int acum;
		int num;
		
		acum = 1;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese un número entero:");
		num = leer.nextInt();
		
		if (num==0 || num==1) {
			System.out.println(num + "! = " + 1);
		}
		else {
			for (int i=2; i<=num; i++) {
				acum *= i;
			}
			System.out.println(num + "! = " + acum);
			
		}

	}

}
