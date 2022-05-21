import java.util.Scanner;

public class FrasePalindroma {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int largoFrase, cont;
		boolean igual;
		String frase, fraseReves;
		
		System.out.println("Ingrese una frase o palabra:");
		frase = leer.nextLine(); //Lee un string
		
		frase = frase.toLowerCase(); //Cambia todas las may�sculas a min�sculas
		frase = frase.replace(" ", ""); //Elimina los espacios
		largoFrase = frase.length(); //Se obtiene el largo resultante de la frase
		char arrayFraseReves[] = new char[largoFrase]; //Arreglo de caracteres para la frase al rev�s
		
		for (int i=0; i<largoFrase; i++) { //Llenado del arreglo con la frase al rev�s
			cont = largoFrase - 1 -i;
			arrayFraseReves[i] = frase.charAt(cont);
		}
		
		fraseReves = String.valueOf(arrayFraseReves); //Se transforma el arrayFraseReves a un string
		
		igual = frase.equals(fraseReves); //verifica si los string son iguales o no 
		
		if (igual) {
			System.out.println("La frase o palabra es pal�ndroma!");
		}
		else {
			System.out.println("La frase o palabra no es pal�ndroma.");
		}

	}

}
