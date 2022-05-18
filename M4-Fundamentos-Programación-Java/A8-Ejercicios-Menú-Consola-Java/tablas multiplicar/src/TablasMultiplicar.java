import java.util.Scanner;
public class TablasMultiplicar {

	public static void main(String[] args) {
		int num;
		int res;
		int cont;
		
		cont = 0;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Por favor, ingrese un número entero:");
		num = leer.nextInt();
		
		while (cont<11) {
			res = num * cont;
			System.out.println(num + "*" + cont + "= " + res);
			cont = cont + 1;
		}
	}

}
