import java.util.Scanner;
public class DecisionSegun {

	public static void main(String[] args) {
		int dia;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese d�a en n�mero:");
		dia = leer.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("Lunes");
		break;
		case 2:
			System.out.println("Martes");
		break;
		case 3:
			System.out.println("Mi�rcoles");
		break;
		case 4:
			System.out.println("Jueves");
		break;
		case 5:
			System.out.println("Viernes");
		break;
		case 6:
			System.out.println("S�bado");
		break;
		case 7:
			System.out.println("Domingo");
		break;
		default:
			System.out.println("D�a inv�lido");
		}
	}

}
