import java.util.Scanner;

public class CicloFor8 {

	public static void main(String[] args) {
		int num;
		int resto;
		
		Scanner leer = new Scanner(System.in);
		
		for (int i=1; i<=10; i++) {
			System.out.println("Ingrese un número impar:");
			num = leer.nextInt();
			resto = num%2;
			if (resto==1) {
				System.out.println("Valor #" + i + " ingresado correctamente");
			}
			else {
				System.out.println("Número par. Intente nuevamente");
				i--;
			}
		}

	}

}
