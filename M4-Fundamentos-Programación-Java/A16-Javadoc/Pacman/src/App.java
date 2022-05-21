/**
 * Clase que representa algunos aspectos de prueba de la ejecución del videojuego Pacman.
 * @author José Obreque F.
 * @version 1.0
 */
public class App {
	
	/**
	 * Método que ejecuta funcionalidades de prueba del videojuego Pacman.
	 * @param args
	 */
	public static void main(String[] args) {
		//Pacman
		Pacman pacman = new Pacman("Pacman", "amarillo", 0, 0);
		//Fantasmas
		Fantasma fantasma = new Fantasma("Fantasma", "azul", 10, 10);
		Fantasma fantasma2 = new Fantasma("Fantasma", "amarillo", 45, 73);
		Fantasma fantasma3 = new Fantasma("Fantasma", "verde", 18, 120);
		//Punto regular
		Punto puntoReg = new Punto(15, 15, 50, "pequeño");
		//Punto especial (grande)
		Punto puntoGra = new Punto(50, 50, 150, "grande");
		//Vértices para bloque regular
		Vertice v1 = new Vertice(0,0);
		Vertice v2 = new Vertice(4,0);
		Vertice v3 = new Vertice(0,4);
		Vertice v4 = new Vertice(4,4);
		//Vértices para bloque en L
		Vertice v5 = new Vertice(10,10);
		Vertice v6 = new Vertice(30,10);
		Vertice v7 = new Vertice(30,20);
		Vertice v8 = new Vertice(30,30);
		Vertice v9 = new Vertice(20,30);
		Vertice v10 = new Vertice(20,20);
		Vertice v11 = new Vertice(10,20);
		//Bloque regular
		Bloque bloqueErr1 = new Bloque();
		//Bloque en L
		Bloque bloqueL = new Bloque();
		//Escenario
		Escenario escenario = new Escenario("clásico", pacman);
		
		//Ejemplo de perder automáticamente (intentar comer fantasma sin tener poderes activados)
		pacman.comerFantasma(fantasma);
		System.out.println();
		
		//Fantasma come a Pacman
		fantasma.comerPacman(pacman);
		System.out.println();
		
		//Intento de llamar al método huir sin que Pacman tenga poderes activos
		fantasma.huir(pacman);
		System.out.println();
		
		//Movimientos de Pacman
		pacman.mover("izquierda");
		pacman.mover("arriba");
		System.out.println();
		
		//Movimientos de Fantasma
		fantasma.mover("derecha");
		fantasma.mover("abajo");
		System.out.println();
		
		//Pacman come un punto regular
		pacman.consumirPunto(puntoReg);
		System.out.println();
		
		//Pacman consume un punto grande
		pacman.consumirPunto(puntoGra);
		System.out.println();
		
		//Pacman come fantasma!
		pacman.comerFantasma(fantasma);
		System.out.println();
		
		//Intentamos crear un bloque con pocos vértices (2)
		bloqueErr1.agregarVertices(v1);
		bloqueErr1.agregarVertices(v2);
		bloqueErr1.crearBloque();
		System.out.println();
		
		//Intentamos crear un bloque con pocos vértices (3)
		bloqueErr1.agregarVertices(v3);
		bloqueErr1.crearBloque();
		System.out.println();
		
		//Creamos el bloque añadiendo un cuarto vértice
		bloqueErr1.agregarVertices(v4);
		bloqueErr1.crearBloque();
		System.out.println();
		
		//Crear bloque en L
		bloqueL.agregarVertices(v5);
		bloqueL.agregarVertices(v6);
		bloqueL.agregarVertices(v7);
		bloqueL.agregarVertices(v8);
		bloqueL.agregarVertices(v9);
		bloqueL.agregarVertices(v10);
		bloqueL.agregarVertices(v11);
		bloqueL.crearBloque();
		System.out.println();
		
		//Agregación de elementos al escenario
		escenario.agregarFantasma(fantasma);
		escenario.agregarFantasma(fantasma2);
		escenario.agregarFantasma(fantasma3);
		escenario.agregarPunto(puntoReg);
		escenario.agregarPunto(puntoGra);
		escenario.agregarBloque(bloqueErr1);
		escenario.agregarBloque(bloqueL);
		System.out.println();
		
		//Creación del escenario
		escenario.generarEscenario();
	}

}
