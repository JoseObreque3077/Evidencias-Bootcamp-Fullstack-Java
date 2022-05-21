
public class EjemploString {

	public static void main(String[] args) {
		//"palabra" es un objeto creado a partir de la clase String
		String palabra = "La Matrix";
		
		//"charAt()" es un m�todo de la clase String
		char letra = palabra.charAt(8);
		int num = palabra.codePointAt(0);
		boolean contiene = palabra.contains("Matrix");
		boolean termina = palabra.endsWith("zo");
		boolean igual = palabra.equals("La Matrix");
		boolean igual2 = palabra.equalsIgnoreCase("LA MATRIX");
		int parteString = palabra.indexOf("tri");
		String reemplazo = palabra.replace("La", "La Gran");
		String fecha ="15-08-1993";
		String reemplazo2 = fecha.replace("-", "/");
		String division[] = new String[2];
		division = palabra.split(" ");
		String sub1 = palabra.substring(2);
		String sub2 = palabra.substring(3,5);
		char prueba[] = {'a','h','o','r','a'};
		String texto = String.valueOf(prueba);
		
		System.out.println("La posici�n 8 es: " + letra);
		System.out.println("El n�mero ASCII de la posici�n 0 es: " + num);
		System.out.println("�El string contiene la palabra Matrix?: " + contiene);
		System.out.println("�El string termina con zo?: " + termina);
		System.out.println("�El string es igual a La Matrix?: " + igual);
		System.out.println("�El string es igual a LA MATRIX, ignorando may�s.?: " + igual2);
		System.out.println("El substring tri se encuentra en el �ndice: " + parteString);
		System.out.println("String editado: " + reemplazo);
		System.out.println("Fecha original: " + fecha);
		System.out.println("Fecha editada: " + reemplazo2);
		System.out.println("Split pos 0: " + division[0]);
		System.out.println("Split pos 1: " + division[1]);
		System.out.println("Substring desde 2: " + sub1);
		System.out.println("Substring de 3 a 5: " + sub2);
		System.out.println(texto);
		
		
	}

}
