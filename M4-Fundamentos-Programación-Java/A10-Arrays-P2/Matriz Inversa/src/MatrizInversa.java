
public class MatrizInversa {

	public static void main(String[] args) {
		int m1[][] = new int[3][3];
		int m2[][] = new int[3][3];
		m1[0][0] = 0;
		m1[0][1] = 0;
		m1[0][2] = 1;
		
		m1[1][0] = 0;
		m1[1][1] = 1;
		m1[1][2] = 0;
		
		m1[2][0] = 1;
		m1[2][1] = 0;
		m1[2][2] = 0;
		
		m2[0][0] = 1;
		m2[0][1] = 0;
		m2[0][2] = 0;
		
		m2[1][0] = 0;
		m2[1][1] = 1;
		m2[1][2] = 0;
		
		m2[2][0] = 0;
		m2[2][1] = 0;
		m2[2][2] = 1;
		
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
