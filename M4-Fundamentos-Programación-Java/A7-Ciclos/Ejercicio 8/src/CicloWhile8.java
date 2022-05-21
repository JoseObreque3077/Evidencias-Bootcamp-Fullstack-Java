import java.util.Scanner;

public class CicloWhile8 {

	public static void main(String[] args) {
		int cont;
		int num;
		int resto;
		cont = 1;
		
		Scanner leer = new Scanner(System.in);
		
		while (cont<=10) {
			System.out.println("Ingrese un número impar:");
			num = leer.nextInt();
			resto = num%2;
			if (resto==1) {
				System.out.println("Valor #" + cont + " ingresado correctamente");
				cont++;
			}
			else {
				System.out.println("Número par. Intente nuevamente");
			}
		}

	}

}
