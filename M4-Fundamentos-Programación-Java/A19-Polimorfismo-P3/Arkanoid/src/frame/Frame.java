package frame;

import java.util.ArrayList;

import hijas.Bloque;
import hijas.Borde;
import hijas.Esfera;
import hijas.Fondo;
import hijas.Paleta;
import hijas.TableroResumen;

/**
 * Clase que representa al frame del juego Arkanoid.
 * @author Jos� Obreque F.
 *
 */
public class Frame {
	private Fondo f; //Fondo del escenario
	private TableroResumen tab; //Tablero resumen de puntuaci�n y vidas
	private Esfera esf; //Esfera
	private Paleta pal; //Paleta
	private Borde b1; //Borde izquierdo
	private Borde b2; //Borde derecho
	private Borde b3; //Borde superior
	private ArrayList<Bloque> bloques; //Colecci�n de bloques
	
	/**
	 * Constructor de la clase Frame.
	 * @param f - Fondo del escenario: Fondo
	 * @param tab - Tablero de resumen del jugador: TableroResumen
	 * @param esf - Esfera del juego: Esfera
	 * @param pal - Paleta del juego: Paleta
	 * @param b1 - Borde izquierdo del escenario: Borde
	 * @param b2 - Borde derecho del escenario: Borde
	 * @param b3 - Borde superior del escenario: Borde
	 */
	public Frame(Fondo f, TableroResumen tab, Esfera esf, Paleta pal, Borde b1, Borde b2, Borde b3) {
		this.f = f; //fondo
		this.tab = tab; //tablero resumen
		this.esf = esf; //esfera
		this.pal = pal; //paleta
		this.b1 = b1; //borde izquierdo
		this.b2 = b2; //borde derecho
		this.b3 = b3; //borde superior
		this.bloques = new ArrayList<Bloque>(); //colecci�n de bloques
	}
	
	/**
	 * Agrega un bloque al arreglo de bloques del juego.
	 * @param b - Bloque a agregar: Bloque
	 */
	public void agregarBloque(Bloque b) {
		this.bloques.add(b);
	}
	
	//Getters-Setters
	/**
	 * M�todo accesador del atributo f.
	 * @return f : Fondo.
	 */
	public Fondo getF() {
		return f;
	}

	/**
	 * M�todo mutador del atributo f.
	 * @param f : Fondo.
	 */
	public void setF(Fondo f) {
		this.f = f;
	}

	/**
	 * M�todo accesador del atributo tab.
	 * @return tab : TableroResumen.
	 */
	public TableroResumen getTab() {
		return tab;
	}

	/**
	 * M�todo mutador del atributo tab.
	 * @param tab : TableroResumen.
	 */
	public void setTab(TableroResumen tab) {
		this.tab = tab;
	}

	/**
	 * M�todo accesador del atributo esf.
	 * @return esf : Esfera.
	 */
	public Esfera getEsf() {
		return esf;
	}

	/**
	 * M�todo mutador del atributo esf.
	 * @param esf : Esfera.
	 */
	public void setEsf(Esfera esf) {
		this.esf = esf;
	}

	/**
	 * M�todo accesador del atributo pal.
	 * @return pal : Paleta.
	 */
	public Paleta getPal() {
		return pal;
	}

	/**
	 * M�todo mutador del atributo pal.
	 * @param pal : Paleta.
	 */
	public void setPal(Paleta pal) {
		this.pal = pal;
	}

	/**
	 * M�todo accesador del atributo b1.
	 * @return b1 : Borde.
	 */
	public Borde getB1() {
		return b1;
	}

	/**
	 * M�todo mutador del atributo b1.
	 * @param b1 : Borde.
	 */
	public void setB1(Borde b1) {
		this.b1 = b1;
	}

	/**
	 * M�todo accesador del atributo b2.
	 * @return b2 : Borde.
	 */
	public Borde getB2() {
		return b2;
	}

	/**
	 * M�todo mutador del atributo b2.
	 * @param b2 : Borde.
	 */
	public void setB2(Borde b2) {
		this.b2 = b2;
	}

	/**
	 * M�todo accesador del atributo b3.
	 * @return b3 : Borde.
	 */
	public Borde getB3() {
		return b3;
	}

	/**
	 * M�todo mutador del atributo b3.
	 * @param b3 : Borde.
	 */
	public void setB3(Borde b3) {
		this.b3 = b3;
	}

	/**
	 * M�todo accesador del atributo bloques.
	 * @return bloques : ArrayList.
	 */
	public ArrayList<Bloque> getBloques() {
		return bloques;
	}

	/**
	 * M�todo mutador del atributo bloques.
	 * @param bloques : ArrayList.
	 */
	public void setBloques(ArrayList<Bloque> bloques) {
		this.bloques = bloques;
	}
	
}
