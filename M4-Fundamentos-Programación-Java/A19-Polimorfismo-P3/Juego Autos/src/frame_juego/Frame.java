package frame_juego;

import autos.Auto;
import otros.Calle;
import otros.Fondo;
import obstaculos.Obstaculo;
import java.util.ArrayList;

/**
 * Frame que contiene todos los elementos gráficos del juego "Carrera Coches".
 * @author José Obreque F.
 *
 */
public class Frame {
	private Auto a; //Composición: instancia clase Auto
	private Fondo f; //Composición: instancia clase Fondo
	private Calle c; //Composición: instancia clase Calle
	private ArrayList<Obstaculo> obstaculos; //Agregación: instancias clase Obstaculo
	
	/**
	 * Constructor de la clase Frame.
	 * @param a - (Auto) : Auto del jugador.
	 * @param f - (Fondo) : Fondo del juego.
	 * @param c - (Calle) : Elemento gráfico calle.
	 */
	public Frame(Auto a, Fondo f, Calle c) {
		this.a = a;
		this.f = f;
		this.c = c;
		this.obstaculos = new ArrayList<Obstaculo>(); //Asignación memoria del ArrayList
	}
	
	/**
	 * Método para agregar elementos por composición, de tipo Obstaculo.
	 * @param obs - (Obstaculo): instancia de la clase obstaculo a agregar por agregación.
	 */
	public void agregarObstaculos(Obstaculo obs) {
		obstaculos.add(obs);
	}
	
	/**
	 * Método que permite obtener el elemento de tipo Auto, agregado por composición.
	 * @return (Auto): Objeto de tipo Auto.
	 */
	public Auto getA() {
		return a;
	}
	
	/**
	 * Método que permite modificar el elemento de tipo Auto, agregado por composición.
	 * @param a - (Auto) Objeto de tipo Auto a ingresar.
	 */
	public void setA(Auto a) {
		this.a = a;
	}
	
	/**
	 * Método que permite obtener el elemento de tipo Fondo, agregado por composición.
	 * @return (Fondo): Objeto de tipo Fondo.
	 */
	public Fondo getF() {
		return f;
	}
	
	/**
	 * Método que permite modificar el elemento de tipo Fondo, agregado por composición.
	 * @param f - (Fondo) Objeto de tipo Fondo a ingresar.
	 */
	public void setF(Fondo f) {
		this.f = f;
	}
	
	/**
	 * Método que permite obtener el elemento de tipo Calle, agregado por composición.
	 * @return (Calle): Objeto de tipo Calle.
	 */
	public Calle getC() {
		return c;
	}
	
	/**
	 * Método que permite modificar el elemento de tipo Calle, agregado por composición.
	 * @param c - (Calle) Objeto de tipo Calle a ingresar.
	 */
	public void setC(Calle c) {
		this.c = c;
	}
	
	/**
	 * Método que permite obtener la colección de tipo Obstaculo (agregación).
	 * @return (ArrayList): Colección tipo ArrayList con objetos de tipo Obstaculo.
	 */
	public ArrayList<Obstaculo> getObstaculos() {
		return obstaculos;
	}
	
	/**
	 * Método que permite modificar la colección de tipo ArrayList con
	 * objetos de tipo Obstaculo, agregados usando agregación.
	 * @param obstaculos - (ArrayList) Colección de objetos de tipo Obstaculo..
	 */
	public void setObstaculos(ArrayList<Obstaculo> obstaculos) {
		this.obstaculos = obstaculos;
	}
	
	
}
