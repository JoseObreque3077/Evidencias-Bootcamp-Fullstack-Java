
public class MatrizInversa2 {

	public static void main(String[] args) {
		int m1[][] = {{0,0,1}, {0,1,0}, {1,0,0}};
		int m2[][] = {{1,0,0}, {0,1,0}, {0,0,1}};

		System.out.println("Matriz 1:");
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(m1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Matriz 2:");
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(m2[i][j] + " ");
			}
			System.out.println();
		} 

	}

}
