import java.util.Scanner;

public class CicloWhile10 {

	public static void main(String[] args) {
		int opc;
		int sueldoBruto;
		float sueldoLiquido;
		float descuento;
		int contOperaciones;
		int acumSueldos;
		int contMenores;
		int contMayores;
		
		contOperaciones = 0;
		acumSueldos = 0;
		contMayores = 0;
		contMenores = 0;
		
		Scanner leer = new Scanner(System.in);
		
		opc = 0;
		while (opc != 3) {
			sueldoBruto = 0;
			sueldoLiquido = 0;
			descuento = 0;
			
			System.out.println("Menú:");
			System.out.println("(1) Calcular nuevo sueldo");
			System.out.println("(2) Salir");
			System.out.println("");
			opc = leer.nextInt();
			
			switch (opc) {
			case 1:
				System.out.println("Ingrese sueldo bruto:");
				sueldoBruto = leer.nextInt();
				System.out.println("Ingrese el porcentaje de descuentos (1 a 100):");
				descuento = leer.nextFloat();
				
				sueldoLiquido = sueldoBruto*(1-(descuento/100));
				System.out.println("Sueldo calculado exitosamente!");
				System.out.println("Sueldo bruto: $" + sueldoBruto);
				System.out.println("Descuento: " + descuento + "%");
				System.out.println("Sueldo líquido: $" + sueldoLiquido);
				System.out.println("");
				
				contOperaciones++;
				acumSueldos += sueldoLiquido;
				
				if (sueldoLiquido<450000) {
					contMenores++;
				}
				else {
					contMayores++;
				}
			break;
			case 2:
				System.out.println("Resumen:");
				System.out.println("Operaciones realizadas: " + contOperaciones);
				System.out.println("Total sueldos líquidos calculados: $" + acumSueldos);
				System.out.println("Sueldos líq. menores a $450K: " + contMenores);
				System.out.println("Sueldos líq. mayores o iguales $450K: "+ contMayores);
				System.out.println("Programa finalizado.");
				System.out.println("");
			break;
			default:
				System.out.println("Opción inválida. Intente nuevamente.");
				System.out.println("");
			}

		}

	}

}
