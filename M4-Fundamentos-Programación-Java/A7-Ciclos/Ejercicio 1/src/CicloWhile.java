
public class CicloWhile {

	public static void main(String[] args) {
		int cont;
		int suma;
		cont = 0;
		suma = 0;
		
		while (cont<100) {
			cont++;
			suma += cont;
		}
		
		System.out.println("La suma de 1 a 100 es: " + suma);
	}

}
