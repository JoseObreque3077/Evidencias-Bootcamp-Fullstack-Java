import java.util.Scanner;

public class ArraySueldos3 {

	public static void main(String[] args) {
		float sueldos[] = new float[3];
		float liquido, promedio;
		int bruto, descuento, sumaBruto, cont;
		
		Scanner leer = new Scanner(System.in);
		
		sumaBruto = 0;
		descuento = 20;
		cont = 0;
		
		do {
			System.out.println("Ingrese el sueldo bruto #" + (cont+1) + ":");
			bruto = leer.nextInt();
			sumaBruto += bruto; //Suma de sueldos brutos
			liquido = bruto * (100-descuento) / 100;
			sueldos[cont] = liquido;
			cont++;
		}
		while (cont<sueldos.length);
		
		cont = 0;
		do {
			System.out.println("Sueldo Líquido #" + (cont+1) + ": $" + sueldos[cont]);
			cont++;
		}
		while (cont<sueldos.length);
		
		//Expresión válida debido a que el descuento es igual para cada sueldo!!!!
		//Sino: agregar acumulador de sueldos liquidos en el ciclo y luego calcular promedio.
		promedio = sumaBruto * (100-descuento) / (100 * sueldos.length);
		
		System.out.println("Suma de sueldos brutos: $" + sumaBruto);
		System.out.println("Promedio de sueldos líquidos: $" + promedio);

	}

}
