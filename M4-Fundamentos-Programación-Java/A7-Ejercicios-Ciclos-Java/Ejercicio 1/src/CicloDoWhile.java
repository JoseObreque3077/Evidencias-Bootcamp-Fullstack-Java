
public class CicloDoWhile {

	public static void main(String[] args) {
		int cont;
		int suma;
		cont = 0;
		suma = 0;
		
		do {
			cont++;
			suma += cont;
		}
		while(cont<100);
		
		System.out.println("La suma de 1 a 100 es: " + suma);
	}

}
