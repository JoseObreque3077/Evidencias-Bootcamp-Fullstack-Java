import java.util.Scanner;

public class CicloDoWhile7 {

	public static void main(String[] args) {
		int cont;
		int acum;
		int num;
		
		cont = 2;
		acum = 1;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese un n�mero entero:");
		num = leer.nextInt();
		
		if (num==0 || num==1) {
			System.out.println(num + "! = " + 1);
		}
		else {
			do {
				acum *= cont;
				cont++;
			}
			while (cont<=num);
			System.out.println(num + "! = " + acum);
		}
	}

}
