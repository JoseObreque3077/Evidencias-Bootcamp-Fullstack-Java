import java.util.Scanner;

public class ArraySueldos {

	public static void main(String[] args) {
		float sueldos[] = new float[3];
		float liquido, promedio;
		int bruto, descuento, sumaBruto;
		
		Scanner leer = new Scanner(System.in);
		
		promedio = 0;
		sumaBruto = 0;
		descuento = 20;
		
		for (int i=0; i<sueldos.length; i++) {
			System.out.println("Ingrese el sueldo bruto #" + (i+1) + ":");
			bruto = leer.nextInt();
			sumaBruto += bruto; //Suma de sueldos brutos
			liquido = bruto * (100-descuento) / 100;
			sueldos[i] = liquido;
		}
		
		for (int j=0; j<sueldos.length; j++) {
			System.out.println("Sueldo Líquido #" + (j+1) + ": $" + sueldos[j]);
		}
		
		//Expresión válida debido a que el descuento es igual para cada sueldo!!!!
		//Sino: agregar acumulador de sueldos liquidos en el ciclo y luego calcular promedio.
		promedio = sumaBruto * (100-descuento) / (100 * sueldos.length);
				
		System.out.println("Suma de sueldos brutos: $" + sumaBruto);
		System.out.println("Promedio de sueldos líquidos: $" + promedio);
	}

}
