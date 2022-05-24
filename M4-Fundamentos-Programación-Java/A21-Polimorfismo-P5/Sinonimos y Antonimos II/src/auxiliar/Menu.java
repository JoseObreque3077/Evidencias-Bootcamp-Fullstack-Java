package auxiliar;

import java.util.InputMismatchException;
import java.util.Scanner;

import hijas.Antonimos;
import hijas.Sinonimos;
import padre.Diccionario;

/**
 * Clase de apoyo, para implementar los men�s de usuario y sus m�todos asociados.
 * @author Jos� Obreque F.
 *
 */
public class Menu {
	private Antonimos anton; //Objeto de tipo Antonimo
	private Sinonimos sinom; //Objeto de tipo Sinonimo
	private String texto;
	private String texto2;
	private String texto3;
	
	/**
	 * Constructor de la clase Menu.
	 * @param anton - diccionario de ant�nimos: Antonimos
	 * @param sinom - diccionario de sin�nimos: Sinonimos
	 */
	public Menu(Antonimos anton, Sinonimos sinom) {
		this.anton = anton;
		this.sinom = sinom;
		this.texto = "";
		this.texto2 = "";
		this.texto3 = "";
	}

	/**
	 * Muestra el men� principal y ejecuta su l�gica interna.
	 */
	public void menuPrincipal() {
		Scanner leer = new Scanner(System.in);
		int opc = 0; //Variable entera que almacena las opciones seleccionadas del men�
		while (opc != 3) {
			System.out.println("Men� Principal:");
			System.out.println("(1) - Diccionario de Sin�nimos");
			System.out.println("(2) - Diccionario de Ant�nimos");
			System.out.println("(3) - Salir");
			//Lectura de opci�n con manejo de excepciones.
			try {
				opc = leer.nextInt();
				leer.nextLine(); 
			}
			catch (InputMismatchException e) {
				leer.next();
			}
			switch (opc) {
			case 1:
				this.menuSecundario(this.sinom);
				System.out.println();
			break;
			case 2:
				this.menuSecundario(this.anton);
				System.out.println();
			break;
			case 3:
				System.out.println("Programa finalizado.");
			break;
			default:
				System.out.println("Opci�n inv�lida.");
				System.out.println();
			}
		}
	}
	
	/**
	 * Muestra el men� secundario y ejecuta su l�gica interna.
	 * @param s - diccionario de sin�nimos: Sinonimos
	 */
	private void menuSecundario(Sinonimos s) {
		Scanner leer = new Scanner(System.in);
		int opc = 0;

		while (opc != 9) {
			System.out.println("Men� sin�nimos:");
			System.out.println("(1) - Agregar palabra");
			System.out.println("(2) - Editar palabra");
			System.out.println("(3) - Eliminar palabra");
			System.out.println("(4) - Agregar sin�nimo");
			System.out.println("(5) - Editar sin�nimo");
			System.out.println("(6) - Eliminar sin�nimo");
			System.out.println("(7) - Mostrar sin�nimos");
			System.out.println("(8) - Mostrar diccionario de sin�nimos");
			System.out.println("(9) - Salir");
			//Lectura de opci�n con manejo de excepciones.
			try {
				opc = leer.nextInt();
				leer.nextLine(); 
			}
			catch (InputMismatchException e) {
				leer.next();
			}
			switch (opc) {
			case 1:
				this.texto = this.leerInfo("^([a-zA-Z����������]{1,})$", "palabra");
				s.agregarPalabraClave(this.texto);
				System.out.println();
			break;
			case 2:
				this.texto = this.leerInfo("^([a-zA-Z����������]{1,})$", "palabra a reemplazar");
				this.texto2 = this.leerInfo("^([a-zA-Z����������]{1,})$", "palabra nueva");
				s.editarPalabraClave(this.texto, this.texto2);
				System.out.println();
			break;
			case 3:
				this.texto = this.leerInfo("^([a-zA-Z����������]{1,})$", "palabra");
				s.eliminarPalabra(this.texto);
				System.out.println();
			break;
			case 4:
				this.texto = this.leerInfo("^([a-zA-Z����������]{1,})$", "palabra");
				this.texto2 = this.leerInfo("^([a-zA-Z����������]{1,})$", "sin�nimo");
				s.agregarSignificado(this.texto, this.texto2);
				System.out.println();
			break;
			case 5:
				this.texto = this.leerInfo("^([a-zA-Z����������]{1,})$", "palabra");
				this.texto2 = this.leerInfo("^([a-zA-Z����������]{1,})$", "sin�nimo a reemplazar");
				this.texto3 = this.leerInfo("^([a-zA-Z����������]{1,})$", "sin�nimo nuevo");
				s.editarSignificado(this.texto, this.texto2, this.texto3);
				System.out.println();
			break;
			case 6:
				this.texto = this.leerInfo("^([a-zA-Z����������]{1,})$", "palabra");
				this.texto2 = this.leerInfo("^([a-zA-Z����������]{1,})$", "sin�nimo a eliminar");
				s.eliminarSignificado(this.texto, this.texto2);
				System.out.println();
			break;
			case 7:
				this.texto = this.leerInfo("^([a-zA-Z����������]{1,})$", "palabra");
				s.mostrarSignificados(this.texto);
				System.out.println();
			break;
			case 8:
				s.mostrarDiccionario();
				System.out.println();
			break;
			case 9:
				//
			break;
			default:
				System.out.println("Opci�n inv�lida.");
				System.out.println();
			}
		}
	}
	
	/**
	 * Muestra el men� secundario y ejecuta su l�gica interna.
	 * @param a - diccionario de ant�nimos: Antonimos
	 */
	private void menuSecundario(Antonimos a) {
		Scanner leer = new Scanner(System.in);
		int opc = 0;

		while (opc != 9) {
			System.out.println("Men� ant�nimos:");
			System.out.println("(1) - Agregar palabra");
			System.out.println("(2) - Editar palabra");
			System.out.println("(3) - Eliminar palabra");
			System.out.println("(4) - Agregar ant�nimo");
			System.out.println("(5) - Editar ant�nimo");
			System.out.println("(6) - Eliminar ant�nimo");
			System.out.println("(7) - Mostrar ant�nimos");
			System.out.println("(8) - Mostrar diccionario de ant�nimos");
			System.out.println("(9) - Salir");
			//Lectura de opci�n con manejo de excepciones.
			try {
				opc = leer.nextInt();
			}
			catch (InputMismatchException e) {
				leer.next();
			}
			switch (opc) {
			case 1:
				this.texto = this.leerInfo("^([a-zA-Z����������]{1,})$", "palabra");
				a.agregarPalabraClave(this.texto);
				System.out.println();
			break;
			case 2:
				this.texto = this.leerInfo("^([a-zA-Z����������]{1,})$", "palabra a reemplazar");
				this.texto2 = this.leerInfo("^([a-zA-Z����������]{1,})$", "palabra nueva");
				a.editarPalabraClave(this.texto, this.texto2);
				System.out.println();
			break;
			case 3:
				this.texto = this.leerInfo("^([a-zA-Z����������]{1,})$", "palabra");
				a.eliminarPalabra(this.texto);
				System.out.println();
			break;
			case 4:
				this.texto = this.leerInfo("^([a-zA-Z����������]{1,})$", "palabra");
				this.texto2 = this.leerInfo("^([a-zA-Z����������]{1,})$", "ant�nimo");
				a.agregarSignificado(this.texto, this.texto2);
				System.out.println();
			break;
			case 5:
				this.texto = this.leerInfo("^([a-zA-Z����������]{1,})$", "palabra");
				this.texto2 = this.leerInfo("^([a-zA-Z����������]{1,})$", "ant�nimo a reemplazar");
				this.texto3 = this.leerInfo("^([a-zA-Z����������]{1,})$", "ant�nimo nuevo");
				a.editarSignificado(this.texto, this.texto2, this.texto3);
				System.out.println();
			break;
			case 6:
				this.texto = this.leerInfo("^([a-zA-Z����������]{1,})$", "palabra");
				this.texto2 = this.leerInfo("^([a-zA-Z����������]{1,})$", "ant�nimo a eliminar");
				a.eliminarSignificado(this.texto, this.texto2);
				System.out.println();
			break;
			case 7:
				this.texto = this.leerInfo("^([a-zA-Z����������]{1,})$", "palabra");
				a.mostrarSignificados(this.texto);
				System.out.println();
			break;
			case 8:
				a.mostrarDiccionario();
				System.out.println();
			break;
			case 9:
				//
			break;
			default:
				System.out.println("Opci�n inv�lida.");
				System.out.println();
			}
		}
	}
	
	/**
	 * Lee informaci�n por consola, que posteriormente ser� tratada como String.
	 * @param regex - expresi�n regular: String
	 * @param m1 - mensaje de valor a ingresar: String
	 * @param m2 - mensaje de valor inv�lido.
	 * @return dato: String
	 */
	private String leerInfo(String regex, String m) {
		/*
		 * Paso 1: Se define un objeto Scanner para leer valores.
		 * Paso 2: Se define un string para almacenar el dato.
		 * Paso 3: Se define una expresi�n regular.
		 * Paso 4: Mientras el dato ingresado no tenga el formato dado por la expresi�n
		 * regular, se vuelve a exigir su ingreso.
		 * Paso 5: Se retorna el dato (String).
		 */
		Scanner leer = new Scanner(System.in);
		String dato = "";
		while (!dato.matches(regex)) {
			System.out.println("Ingrese " + m + ":");
			dato = leer.nextLine();
			if (!dato.matches(regex)) {
				System.out.println("Solo se admiten letras!");
			}
		}
		return dato;
	}

	//Getters-Setters
	/**
	 * M�todo accesador del atributo anton.
	 * @return anton : Antonimos.
	 */
	public Antonimos getAnton() {
		return anton;
	}

	/**
	 * M�todo mutador del atributo anton.
	 * @param anton : Antonimos.
	 */
	public void setAnton(Antonimos anton) {
		this.anton = anton;
	}

	/**
	 * M�todo accesador del atributo sinom.
	 * @return sinom : Sinonimos.
	 */
	public Sinonimos getSinom() {
		return sinom;
	}

	/**
	 * M�todo mutador del atributo sinom.
	 * @param sinom : Sinonimos.
	 */
	public void setSinom(Sinonimos sinom) {
		this.sinom = sinom;
	}

	/**
	 * M�todo accesador del atributo texto.
	 * @return texto : String.
	 */
	public String getTexto() {
		return texto;
	}

	/**
	 * M�todo mutador del atributo texto.
	 * @param texto : String.
	 */
	public void setTexto(String texto) {
		this.texto = texto;
	}

	/**
	 * M�todo accesador del atributo texto2.
	 * @return texto2 : String.
	 */
	public String getTexto2() {
		return texto2;
	}

	/**
	 * M�todo mutador del atributo texto2.
	 * @param texto2 : String.
	 */
	public void setTexto2(String texto2) {
		this.texto2 = texto2;
	}

	/**
	 * M�todo accesador del atributo texto3.
	 * @return texto3 : String.
	 */
	public String getTexto3() {
		return texto3;
	}

	/**
	 * M�todo mutador del atributo texto3.
	 * @param texto3 : String.
	 */
	public void setTexto3(String texto3) {
		this.texto3 = texto3;
	}	
}
