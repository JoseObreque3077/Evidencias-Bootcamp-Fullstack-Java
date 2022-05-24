import java.util.Scanner;

public class CicloWhile7 {

	public static void main(String[] args) {
		int cont;
		int acum;
		int num;
		
		cont = 2;
		acum = 1;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese un número entero:");
		num = leer.nextInt();
		
		if (num==0 || num==1) {
			System.out.println(num + "! = " + 1);
		}
		else {
			while (cont<=num) {
				acum *= cont;
				cont++;
			}
			System.out.println(num + "! = " + acum);
		}
	}

}
