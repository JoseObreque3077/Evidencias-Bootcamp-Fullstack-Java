import java.util.Scanner;

public class Consonantes {

	public static void main(String[] args) {
		//DEFINICIÓN DE SCANNER
		Scanner leer = new Scanner(System.in);

		//DEFINICIÓN DE VARIABLES
		String palabra;
		char letra;
		int contVocales, cont1, cont2, largo;

		//INICIALIZACIÓN DE VARIABLES
		contVocales = 0;
		cont1 = 0;
		cont2 = 0;

		//LECTURA DE PALABRA INGRESADA POR CONSOLA
		System.out.println("Ingrese una palabra:");
		palabra = leer.next();
		largo = palabra.length();

		//CONTEO DE VOCALES (NECESARIO PARA DEFINIR LONGITUD DE ARREGLOS)
		for (int i=0; i<largo; i++) {
			letra = palabra.charAt(i);
			if (letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u') {
				contVocales++;
			}
		}

		//DEFINICION DE ARREGLOS
		char vocales[] = new char[contVocales];
		char consonantes[] = new char[palabra.length()-contVocales];

		// ALMACENAMIENTO DE VOCALES Y CONSONANTES EN ARRAYS
		for (int i=0; i<largo; i++) {
			letra = palabra.charAt(i);
			if (letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u') {
				vocales[cont1] = letra;
				cont1++;
			}
			else {
				consonantes[cont2] = letra;
				cont2++;
			}
		}

		//IMPRESION DE ARREGLOS POR PANTALLA
		System.out.println("");
		System.out.println("Vocales:");
		for (int i=0; i<vocales.length; i++) {
			letra = vocales[i];
			System.out.print(letra + " ");

		}
		System.out.println("");
		System.out.println("Consonantes:");
		for (int i=0; i<consonantes.length; i++) {
			letra = consonantes[i];
			System.out.print(letra + " ");
		}
	}

}
