package operaciones;

import java.util.ArrayList;

public class StringOperaciones {

	public static void main(String[] args) {
		//Definici�n del String de operaciones matem�ticas
		String cadena = "30+9-8*31-98/2+15+80+60+14-9*2/14+80-10+9";
		//Divisi�n del String en n�meros y s�mbolos
		String elementos[] = cadena.split("(?=[-+*/()])|(?<=[-+*/()])");
		//Definici�n de array de Strings de s�mbolos (auxiliar)
		String simbolos[] = {"*", "/", "+", "-"};
		//String auxiliar para almacenar Strings de un ArrayList
		String item;
		//Float auxiliares
		float num1, num2, res;
		//Definici�n de un ArrayList para guardar los n�meros y s�mbolos matem�ticos (modificable)
		ArrayList<String> listaElem = new ArrayList<String>();

		//Llenado del ArrayList
		for (int i=0; i<elementos.length; i++) {
			listaElem.add(elementos[i]);
		}

		//Ciclo exterior: Prioridad de Operaciones (MULT-DIV luego SUMA-RESTA)
		for (int i=0; i<4; i+=2) {
			//Ciclo interior: Recorrido del ArrayList con los n�meros y s�mbolos matem�ticos
			for (int j=0; j<listaElem.size(); j++) {
				item = listaElem.get(j); //Elemento puntual del ArrayList
				if (item.equals(simbolos[i]) || item.equals(simbolos[i+1])) {
					res = 0;
					num1 = Float.parseFloat(listaElem.get(j-1)); //N�m. a la izquierda de un s�mbolo
					num2 = Float.parseFloat(listaElem.get(j+1)); //N�m. a la derecha de un s�mbolo
					switch (item) {
						//C�lculo de operaci�n respectiva
						case "+":
							res = suma(num1, num2);
							break;
						case "-":
							res = resta(num1, num2);
							break;
						case "*":
							res = multiplicacion(num1, num2);
							break;
						case "/":
							res = division(num1, num2);
							break;
					}
					listaElem.set(j, String.valueOf(res)); //El resultado se inserta donde estaba el s�mbolo
					listaElem.remove(j-1); //Eliminaci�n de valor a la izq. del s�mbolo
					listaElem.remove(j); //Eliminaci�n del valor a la derecha del s�mbolo
					j--; //Correcci�n del contador interno debido a la eliminaci�n de elementos
				}
			}
		}
		//Resultado por consola
		System.out.println("El resultado es : " + listaElem.get(0));
	}

	public static float suma(float num1, float num2) {
		float res;
		res = num1 + num2;
		return res;
	}

	public static float resta(float num1, float num2) {
		float res;
		res = num1 - num2;
		return res;
	}

	public static float multiplicacion(float num1, float num2) {
		float res;
		res = num1 * num2;
		return res;
	}

	public static float division(float num1, float num2) {
		float res;
		res = num1 / num2;
		return res;
	}
}
