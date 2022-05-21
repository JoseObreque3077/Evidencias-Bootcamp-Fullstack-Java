package operaciones;

import java.util.ArrayList;

public class StringOperaciones {

	public static void main(String[] args) {
		//Definición del String de operaciones matemáticas
		String cadena = "30+9-8*31-98/2+15+80+60+14-9*2/14+80-10+9";
		//División del String en números y símbolos
		String elementos[] = cadena.split("(?=[-+*/()])|(?<=[-+*/()])");
		//Definición de array de Strings de símbolos (auxiliar)
		String simbolos[] = {"*", "/", "+", "-"};
		//String auxiliar para almacenar Strings de un ArrayList
		String item;
		//Float auxiliares
		float num1, num2, res;
		//Definición de un ArrayList para guardar los números y símbolos matemáticos (modificable)
		ArrayList<String> listaElem = new ArrayList<String>();

		//Llenado del ArrayList
		for (int i=0; i<elementos.length; i++) {
			listaElem.add(elementos[i]);
		}

		//Ciclo exterior: Prioridad de Operaciones (MULT-DIV luego SUMA-RESTA)
		for (int i=0; i<4; i+=2) {
			//Ciclo interior: Recorrido del ArrayList con los números y símbolos matemáticos
			for (int j=0; j<listaElem.size(); j++) {
				item = listaElem.get(j); //Elemento puntual del ArrayList
				if (item.equals(simbolos[i]) || item.equals(simbolos[i+1])) {
					res = 0;
					num1 = Float.parseFloat(listaElem.get(j-1)); //Núm. a la izquierda de un símbolo
					num2 = Float.parseFloat(listaElem.get(j+1)); //Núm. a la derecha de un símbolo
					switch (item) {
						//Cálculo de operación respectiva
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
					listaElem.set(j, String.valueOf(res)); //El resultado se inserta donde estaba el símbolo
					listaElem.remove(j-1); //Eliminación de valor a la izq. del símbolo
					listaElem.remove(j); //Eliminación del valor a la derecha del símbolo
					j--; //Corrección del contador interno debido a la eliminación de elementos
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
