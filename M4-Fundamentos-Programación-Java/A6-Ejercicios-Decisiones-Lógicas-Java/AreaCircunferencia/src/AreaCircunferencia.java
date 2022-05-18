import java.util.Scanner;

public class AreaCircunferencia {

	public static void main(String[] args) {
		float pi;
		float r;
		float area;
		pi = 3.1415f;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese el radio de la circunferencia:");
		r = leer.nextFloat();
		area = pi*r*r;
		System.out.println("El área es: " + area);
	}
}
