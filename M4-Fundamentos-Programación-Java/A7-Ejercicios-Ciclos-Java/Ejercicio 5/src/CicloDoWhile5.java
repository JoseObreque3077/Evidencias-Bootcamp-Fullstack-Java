import java.util.Scanner;

public class CicloDoWhile5 {

	public static void main(String[] args) {
		int cont;
		int num;
		int contImpares;
		int resto;
		
		Scanner leer = new Scanner(System.in);
		
		cont = 1;
		contImpares = 0;
		
		do {
			System.out.println("Ingrese el número #" + cont);
			num = leer.nextInt();
			resto = num%2;
			if (resto==1) {
				contImpares++;
			}
			cont++;
		}
		while (cont<=4);
		
		System.out.println("Cantidad de impares: " + contImpares);

	}

}
