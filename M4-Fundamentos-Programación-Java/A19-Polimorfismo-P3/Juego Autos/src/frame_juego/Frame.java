package frame_juego;

import autos.Auto;
import otros.Calle;
import otros.Fondo;
import obstaculos.Obstaculo;
import java.util.ArrayList;

/**
 * Frame que contiene todos los elementos gr�ficos del juego "Carrera Coches".
 * @author Jos� Obreque F.
 *
 */
public class Frame {
	private Auto a; //Composici�n: instancia clase Auto
	private Fondo f; //Composici�n: instancia clase Fondo
	private Calle c; //Composici�n: instancia clase Calle
	private ArrayList<Obstaculo> obstaculos; //Agregaci�n: instancias clase Obstaculo
	
	/**
	 * Constructor de la clase Frame.
	 * @param a - (Auto) : Auto del jugador.
	 * @param f - (Fondo) : Fondo del juego.
	 * @param c - (Calle) : Elemento gr�fico calle.
	 */
	public Frame(Auto a, Fondo f, Calle c) {
		this.a = a;
		this.f = f;
		this.c = c;
		this.obstaculos = new ArrayList<Obstaculo>(); //Asignaci�n memoria del ArrayList
	}
	
	/**
	 * M�todo para agregar elementos por composici�n, de tipo Obstaculo.
	 * @param obs - (Obstaculo): instancia de la clase obstaculo a agregar por agregaci�n.
	 */
	public void agregarObstaculos(Obstaculo obs) {
		obstaculos.add(obs);
	}
	
	/**
	 * M�todo que permite obtener el elemento de tipo Auto, agregado por composici�n.
	 * @return (Auto): Objeto de tipo Auto.
	 */
	public Auto getA() {
		return a;
	}
	
	/**
	 * M�todo que permite modificar el elemento de tipo Auto, agregado por composici�n.
	 * @param a - (Auto) Objeto de tipo Auto a ingresar.
	 */
	public void setA(Auto a) {
		this.a = a;
	}
	
	/**
	 * M�todo que permite obtener el elemento de tipo Fondo, agregado por composici�n.
	 * @return (Fondo): Objeto de tipo Fondo.
	 */
	public Fondo getF() {
		return f;
	}
	
	/**
	 * M�todo que permite modificar el elemento de tipo Fondo, agregado por composici�n.
	 * @param f - (Fondo) Objeto de tipo Fondo a ingresar.
	 */
	public void setF(Fondo f) {
		this.f = f;
	}
	
	/**
	 * M�todo que permite obtener el elemento de tipo Calle, agregado por composici�n.
	 * @return (Calle): Objeto de tipo Calle.
	 */
	public Calle getC() {
		return c;
	}
	
	/**
	 * M�todo que permite modificar el elemento de tipo Calle, agregado por composici�n.
	 * @param c - (Calle) Objeto de tipo Calle a ingresar.
	 */
	public void setC(Calle c) {
		this.c = c;
	}
	
	/**
	 * M�todo que permite obtener la colecci�n de tipo Obstaculo (agregaci�n).
	 * @return (ArrayList): Colecci�n tipo ArrayList con objetos de tipo Obstaculo.
	 */
	public ArrayList<Obstaculo> getObstaculos() {
		return obstaculos;
	}
	
	/**
	 * M�todo que permite modificar la colecci�n de tipo ArrayList con
	 * objetos de tipo Obstaculo, agregados usando agregaci�n.
	 * @param obstaculos - (ArrayList) Colecci�n de objetos de tipo Obstaculo..
	 */
	public void setObstaculos(ArrayList<Obstaculo> obstaculos) {
		this.obstaculos = obstaculos;
	}
	
	
}
