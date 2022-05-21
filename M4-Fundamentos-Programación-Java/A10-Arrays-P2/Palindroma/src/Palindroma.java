import java.util.Scanner;

public class Palindroma {

	public static void main(String[] args) {
		//Scanner
		Scanner leer = new Scanner(System.in);
		
		//Definici�n de variables
		int num, j;
		char letra;
		boolean palindroma;
		
		palindroma = true;
		
		//Solicitud de numero de letras por pantalla
		System.out.println("Ingrese el n�mero de letras de su palabra:");
		num = leer.nextInt();
		
		//Definici�n de arreglo
		char palabra[] = new char[num];
		
		//Ciclo for para llenado de arreglos
		for(int i=0; i<num; i++) {
			System.out.println("Ingrese letra #" + (i+1) + ":");
			letra = leer.next().charAt(0);
			palabra[i] = letra;
		}
		
		//Verificaci�n palabra pal�ndroma
		for (int i=0; i<num; i++) {
			j = num - 1 - i;
			if (palabra[i] != palabra[j]) {
				palindroma = false;
			}
		}
		
		//Mensaje por pantalla
		if (palindroma) {
			System.out.println("La palabra es pal�ndroma!");
		}
		else {
			System.out.println("La palabra no es pal�ndroma.");
		}

	}

}
