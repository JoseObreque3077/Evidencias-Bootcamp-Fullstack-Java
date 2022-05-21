
public class App {

	public static void main(String[] args) {
		//Instancia de clase
		Automovil auto = new Automovil("Ford", "Mustang GT Fastback", 2021, "SD-9191");
		
		System.out.println("Atributos Originales:");
		System.out.println("Marca: " + auto.getMarca());
		System.out.println("Serie: " + auto.getSerie());
		System.out.println("Modelo: " + auto.getModelo());
		System.out.println("Placa: " + auto.getPlaca());
		System.out.println();
		
		System.out.println("Atributos Modificados:");
		auto.setMarca("Chevrolet");
		auto.setSerie("Suburban");
		auto.setModelo(2011);
		auto.setPlaca("AF-0101");
		System.out.println("Marca: " + auto.getMarca());
		System.out.println("Serie: " + auto.getSerie());
		System.out.println("Modelo: " + auto.getModelo());
		System.out.println("Placa: " + auto.getPlaca());
		
	}

}
