/**
 * Esta clase contiene m�todos para realizar operaciones matem�ticas b�sicas.
 * <ul>
 * <li> suma(a, b) </li>
 * <li> suma() </li>
 * <li> resta(a, b) </li>
 * <li> multiplicacion(a, b) </li>
 * <li> multiplicacion() </li>
 * <li> division(a, b) </li>
 * </ul>
 * @author Jos� Obreque F.
 *
 */
public class Matematica {
	
	/**
	 * M�todo que calcula la suma de dos n�meros enteros ingresados como par�metros.
	 * @param a - Valor int ingresado como primer par�metro.
	 * @param b - Valor int ingresado como segundo par�metro.
	 * @return - Valor int que corresponde al resultado de la suma.
	 */
	public int suma(int a, int b) {
		int r=0; //Se inicializa la variable que almacena resultado en cero
		r=a+b; //Se calcula la suma
		return r; //Se devuelve el valor de la suma
	}
	
	/**
	 * M�todo que calcula la suma de dos n�meros enteros definidos por defecto (10 y 15).
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
	 * M�todo que calcula la resta de dos n�meros enteros ingresados como par�metros.
	 * @param a - Valor int ingresado como primer par�metro.
	 * @param b - Valor int ingresado como segundo par�metro.
	 * @return - Valor long que corresponde al resultado de la resta.
	 */
	public long resta(int a, int b) {
		long r=0; //Se inicializa la variable que almacena resultado en cero
		r=a-b; //Se calcula la resta
		return r; //Se devuelve el valor de la resta
	}
	
	/**
	 * M�todo que calcula la multiplicaci�n de dos n�meros enteros ingresados como par�metros.
	 * @param a - Valor int ingresado como primer par�metro.
	 * @param b - Valor int ingresado como segundo par�metro.
	 * @return - Valor int que corresponde al resultado de la multiplicaci�n.
	 */
	public int multiplicacion(int a, int b) {
		int r=0; //Se inicializa la variable que almacena resultado en cero
		r=a*b; //Se calcula la multiplicaci�n
		return r; //Se devuelve el valor de la multiplicaci�n
	}
	
	/**
	 * M�todo que calcula la multiplicaci�n de dos n�meros float definidos por defecto (3.1 y 6.5567).
	 * El resultado se muestra por consola.
	 * Su salida es void.
	 */
	public float multiplicacion() {
		float r=0, a=(float)3.1, b=(float)6.5567;
		r=a*b;
		return r;
	}
	
	/**
	 * M�todo que calcula la multiplicaci�n de dos n�meros enteros ingresados como par�metros.
	 * @param a - Valor int ingresado como primer par�metro.
	 * @param b - Valor int ingresado como segundo par�metro.
	 * @return - Valor int que corresponde al resultado de la multiplicaci�n.
	 */
	public double division(int a, int b) {
		double r=0;
		r=a/b;
		return r;
	}
	
}
