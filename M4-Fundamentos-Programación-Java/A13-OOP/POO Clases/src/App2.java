
public class App2 {

	public static void main(String[] args) {
		Barco b1 = new Barco("Titanic II", "Crucero", 100, 25);
		
		//Atributos
		System.out.println("Nombre del barco: " + b1.nombre);
		System.out.println("Tipo: " + b1.tipo);
		System.out.println("Cantidad de pasajeros: " + b1.numPasajeros);
		System.out.println("Cantidad de tripulantes: " + b1.numTripulacion);
		System.out.println();
		
		//Métodos
		b1.zarpar();
		b1.aBabor();
		b1.aEstribor();
		b1.arribar();
		b1.naufragio();
	}

}
