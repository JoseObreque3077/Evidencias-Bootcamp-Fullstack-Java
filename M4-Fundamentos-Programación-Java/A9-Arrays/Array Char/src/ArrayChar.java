import java.util.Scanner;

public class ArrayChar {

	public static void main(String[] args) {
		//Scanner
		Scanner leer = new Scanner(System.in);
		
		//Definición de variables
		char letra;
		int num;
		
		//Solicitud de numero de letras por pantalla
		System.out.println("Ingrese el número de letras:");
		num = leer.nextInt();
		
		//Definición de arreglo (considerando longitud ingresada anteriormente)
		char arr[] = new char[num];
		
		//Ciclo for para llenado de arreglo
		for(int i=0; i<arr.length; i++) {
		System.out.println("Ingrese letra " + (i+1) + ":");
		letra = leer.next().charAt(0);
		arr[i] = letra;
		}
		
		System.out.println();
		
		//Ciclo for para imprimir cadena de caracteres
		for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]);
		}

		System.out.println();
		
		//Ciclo for para imprimir cadena de caracteres al revés
		for(int i=arr.length-1; i>=0; i--) {
		System.out.print(arr[i]);
		}

	}

}
