import java.util.ArrayList;

/**
 * Clase que representa los bloques que aparecen en el videojuego Pacman
 * @author stark
 * @version 1.0
 */
public class Bloque {
	private ArrayList<Vertice> listaVertices = new ArrayList<Vertice>(); //ArrayList de vértices
	
	/**
	 * Método que permite agregar vértices a un bloque
	 * @param v
	 */
	public void agregarVertices(Vertice v) {
		//Este método representa asociación bloque-vertice
		this.listaVertices.add(v);
		System.out.println("Vértice (" + v.getPosX() + "," + v.getPosY() + ") añadido!");
	}
	
	/**
	 * Método que crea la figura del bloque usando la información almacenada de sus vértices.
	 */
	public void crearBloque() {
		if (listaVertices.size() != 4 && listaVertices.size()!= 7 && listaVertices.size() != 8) {
			System.out.println("No hay info para generar el bloque");
		}
		else {
			System.out.println("Figura generada usando las coordenadas dadas:");
			for (int i=0; i<listaVertices.size(); i++) {
				System.out.println("(" + listaVertices.get(i).getPosX() + ", " + listaVertices.get(i).getPosY()+ ")");
			}
		}
		
	}
	
	/**
	 * Método que representa el choque de Pacman contra un bloque en el videojuego.
	 * @param p - Instancia de la clase Pacman
	 */
	public void choquePacman(Pacman p) {
		System.out.println(p.getNombre() + " ha chocado contra el bloque!");
	}
	
	/**
	 * Método que representa el choque de un Fantasma contra un bloque en el videojuego.
	 * @param f - Instancia de la clase Fantasma.
	 */
	public void choqueFantasma(Fantasma f) {
		System.out.println(f.getNombre() + " ha chocado contra el bloque!");
	}
	
	//Getters and Setters
	public ArrayList<Vertice> getListaVertices() {
		return listaVertices;
	}

	public void setListaVertices(ArrayList<Vertice> listaVertices) {
		this.listaVertices = listaVertices;
	}
	
	
}
