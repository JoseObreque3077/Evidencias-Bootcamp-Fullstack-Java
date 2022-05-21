
public class Barco {
	String nombre;
	String tipo;
	int numPasajeros;
	int numTripulacion;
	
	Barco(String nombre, String tipo, int numPasajeros, int numTripulacion) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.numPasajeros = numPasajeros;
		this.numTripulacion = numTripulacion;
	}
	
	void aBabor() {
		System.out.println("Viren a babor!!!");
	}
	
	void aEstribor() {
		System.out.println("Viren a estribor!!!");
	}
	
	void zarpar() {
		System.out.println("Leven anclas, marineros!");
	}
	
	void arribar() {
		System.out.println("Hemos llegado a puerto :)");
	}
	
	void naufragio() {
		int sobrevivientes = (int)((this.numPasajeros+this.numTripulacion)*0.75);
		System.out.println("El barco naufragó. Sobrevivieron " + sobrevivientes + " personas.");
	}
}

