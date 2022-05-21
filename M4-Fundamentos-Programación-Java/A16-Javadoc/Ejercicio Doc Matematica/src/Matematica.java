/**
 * Esta clase contiene métodos para realizar operaciones matemáticas básicas.
 * <ul>
 * <li> suma(a, b) </li>
 * <li> suma() </li>
 * <li> resta(a, b) </li>
 * <li> multiplicacion(a, b) </li>
 * <li> multiplicacion() </li>
 * <li> division(a, b) </li>
 * </ul>
 * @author José Obreque F.
 *
 */
public class Matematica {
	
	/**
	 * Método que calcula la suma de dos números enteros ingresados como parámetros.
	 * @param a - Valor int ingresado como primer parámetro.
	 * @param b - Valor int ingresado como segundo parámetro.
	 * @return - Valor int que corresponde al resultado de la suma.
	 */
	public int suma(int a, int b) {
		int r=0; //Se inicializa la variable que almacena resultado en cero
		r=a+b; //Se calcula la suma
		return r; //Se devuelve el valor de la suma
	}
	
	/**
	 * Método que calcula la suma de dos números enteros definidos por defecto (10 y 15).
	 * El resultado se muestra por consola.
	 * Su salida es void.
	 */
	public void suma() {
		/*
		 * Se inicializa la variable que almacena resultado en cero.
		 * Se inicializa el primer valor a sumar en 10
		 * Se inicializa el segundo valor a sumar en 15
		 */
		int r=0, a=10, b=15;
		r=a+b;
		System.out.println(a + "+" + b + "=" + r);
	}
	
	/**
	 * Método que calcula la resta de dos números enteros ingresados como parámetros.
	 * @param a - Valor int ingresado como primer parámetro.
	 * @param b - Valor int ingresado como segundo parámetro.
	 * @return - Valor long que corresponde al resultado de la resta.
	 */
	public long resta(int a, int b) {
		long r=0; //Se inicializa la variable que almacena resultado en cero
		r=a-b; //Se calcula la resta
		return r; //Se devuelve el valor de la resta
	}
	
	/**
	 * Método que calcula la multiplicación de dos números enteros ingresados como parámetros.
	 * @param a - Valor int ingresado como primer parámetro.
	 * @param b - Valor int ingresado como segundo parámetro.
	 * @return - Valor int que corresponde al resultado de la multiplicación.
	 */
	public int multiplicacion(int a, int b) {
		int r=0; //Se inicializa la variable que almacena resultado en cero
		r=a*b; //Se calcula la multiplicación
		return r; //Se devuelve el valor de la multiplicación
	}
	
	/**
	 * Método que calcula la multiplicación de dos números float definidos por defecto (3.1 y 6.5567).
	 * El resultado se muestra por consola.
	 * Su salida es void.
	 */
	public float multiplicacion() {
		float r=0, a=(float)3.1, b=(float)6.5567;
		r=a*b;
		return r;
	}
	
	/**
	 * Método que calcula la multiplicación de dos números enteros ingresados como parámetros.
	 * @param a - Valor int ingresado como primer parámetro.
	 * @param b - Valor int ingresado como segundo parámetro.
	 * @return - Valor int que corresponde al resultado de la multiplicación.
	 */
	public double division(int a, int b) {
		double r=0;
		r=a/b;
		return r;
	}
	
}
