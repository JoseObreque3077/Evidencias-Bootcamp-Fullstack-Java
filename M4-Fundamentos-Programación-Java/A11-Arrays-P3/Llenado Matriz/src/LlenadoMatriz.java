
public class LlenadoMatriz {

	public static void main(String[] args) {
		//Definici�n de variables
		int matriz[][] = new int[6][6];
		int largo;
		largo = matriz.length;
		
		//Llenado de matriz
		for (int i=0; i<largo; i++) {
			for (int j=0; j<largo; j++) {
				if (i==j) {
					matriz[i][j] = 1;
				}
				else if (i+j == largo-1) {
					matriz[i][j] = 1;
				}
			}
		}
		
		//Impresi�n de matriz por consola
		for (int i=0; i<largo; i++) {
			for (int j=0; j<largo;j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

	}

}
