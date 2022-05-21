import java.util.Scanner;

public class DecisionSimple {

	public static void main(String[] args) {
		int edad;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese su edad:");
		edad = leer.nextInt();
		
		if (edad>=18) {
			System.out.println("Usted es mayor de edad");
		}
		else {
			System.out.println("Usted es menor de edad");
		}
	}

}
