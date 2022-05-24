import java.util.Scanner;

public class CicloFor5 {

	public static void main(String[] args) {
		int num;
		int contImpares;
		int resto;
		
		Scanner leer = new Scanner(System.in);
		
		contImpares = 0;
		for (int i=1; i<=4; i++) {
			System.out.println("Ingrese el número #" + i);
			num = leer.nextInt();
			resto = num%2;
			if (resto==1) {
				contImpares++;
			}
		}
		
		System.out.println("Cantidad de impares: " + contImpares);

	}

}
