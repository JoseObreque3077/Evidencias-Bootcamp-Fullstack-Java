import java.util.Scanner;
public class DecisionAnidada {

	public static void main(String[] args) {
		int dia;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese día en número:");
		dia = leer.nextInt();
		
		if (dia==1) {
			System.out.println("Lunes");
		}
		else {
			if (dia==2) {
				System.out.println("Martes");
			}
			else {
				if (dia==3) {
					System.out.println("Miércoles");
				}
				else {
					if (dia==4) {
						System.out.println("Jueves");
					}
					else {
						if (dia==5) {
							System.out.println("Viernes");
						}
						else {
							if (dia==6) {
								System.out.println("Sábado");
							}
							else {
								if (dia==7) {
									System.out.println("Domingo");
								}
								else {
									System.out.println("Día inválido");
								}
							}
						}
					}
				}
			}
		}
	}
}
