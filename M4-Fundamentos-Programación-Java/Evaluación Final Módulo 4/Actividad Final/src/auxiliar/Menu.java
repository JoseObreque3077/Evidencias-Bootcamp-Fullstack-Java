package auxiliar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

import clases.Auto;
import clases.Cliente;
import clases.Fecha;
import clases.Mantencion;

/**
 * Clase de apoyo, que muestra los menús de usuario y contiene los métodos necesarios para realizar sus acciones.
 * @author José Obreque F.
 *
 */
public class Menu {
	//Colecciones
	private HashMap<String, Cliente> mapaClientes; //Base de datos de clientes
	private HashMap<String, Auto> mapaAutos; //Base de datos de autos
	private ArrayList<Mantencion> historial; //Historial de mantenciones
	//Expresiones regulares
	private String regexFecha;
	private String regexNombreApellido;
	private String regexPatente;
	private String regexRut;
	private String regexEmail;
	private String regexTelefono;
	private String regexMarca;
	private String regexModelo;
	private String regexAnnFabricacion;
	private String regexObs;
	
	// INFORMACION SOBRE LAS EXPRESIONES REGULARES UTILIZADAS
	/*
	 * Expresión regular para fechas:
	 * 1) Acepta fechas en formato DD/MM/AAAA
	 * 2) No se puede ingresar un día 31 si el mes correspondiente no tiene 31 días.
	 * 3) No se puede ingresar días sobre el 29, en Febrero.
	 * 4) Solo se puede ingresar un 29 de Febrero, si el año es bisiesto.
	 * 
	 * Expresión regular para nombres o apellidos:
	 * 1) Permite el ingreso de dos nombres o apellidos separados por un único espacio.
	 * 2) Cada nombre o apellido, admite un máximo de 30 caracteres.
	 * 3) Los caracteres aceptados son letras minúsculas y mayúsculas (las vocales pueden llevar tilde).
	 * 
	 * Expresión regular para patentes:
	 * 1) Permite el ingreso de patentes vehiculares en el formato chileno.
	 * 2) Admite la entrada de patentes en formato 4 letras + 2 números (Ej: ABCD12)
	 * 3) Admite la entrada de patentes en formato 2 letras + 4 números (Ej: AB1234)
	 * 
	 * Expresión regular para rut:
	 * 1) Permite el ingreso de rut chilenos.
	 * 2) Admite rut de 7 dígitos + dígito verificador (K inclusive), sin puntos y con guión (Ej: 9603444-K).
	 * 3) Admite rut de 8 dígitos + dígito verificador (K inclusive), sin puntos y con guión (Ej: 19693544-7).
	 * 
	 * Expresión regular para email:
	 * 1) Permite el ingreso de email en formato correo.1234@gmail.com
	 * 2) Antes del @ permite el ingreso de letras, números y puntos (máximo 25 caracteres).
	 * 3) Después del @ permite el ingreso de letras (máximo 15 caracteres).
	 * 4) El término del email (ej: .com o .cl) admite un punto seguido de 2 a 3 letras.
	 * 
	 * Expresión regular para teléfonos:
	 * Permite el ingreso de números de teléfono de 9 dígitos o más (según lo indicado por pauta de trabajo).
	 * 
	 * Expresión regular para marca de auto y modelo de auto:
	 * Permite el ingreso de marcas/modelos, admitiendo letras (vocales con tilde inclusive) y espacios,
	 * entre 3 y 30 caracteres.
	 * 
	 * Expresión regular para año de fabricación:
	 * 1) Permite el ingreso de 4 dígitos.
	 * 2) Permite el ingreso de años de fabricación desde 1960 (inclusive) en adelante.
	 * 
	 * Expresión regular para observaciones:
	 * Permite de 1 a 30 caracteres alfanuméticos (mas espacios), inlcuyendo vocales con tilde.
	 */
	
	/**
	 * Constructor de la clase Menu.
	 */
	public Menu() {
		//Colecciones
		this.mapaClientes = new HashMap<String, Cliente>();
		this.mapaAutos = new HashMap<String, Auto>();
		this.historial = new ArrayList<Mantencion>();
		//Expresiones regulares
		this.regexFecha = "^(((0[1-9]|[12][0-9]|3[01])[/](0[13578]|1[02])|(0[1-9]|[12][0-9]|30)[/](0[469]|11)|(0[1-9]|1\\d|2[0-8])[/]02)[/]20\\d{2}|29[/]02[/](20(0[48]|[2468][048]|[13579][26])|([02468][048]|[1359][26])00))$";
		this.regexNombreApellido = "^([a-zA-ZáÁéÉíÍóÓúÚ]{3,30} [a-zA-ZáÁéÉíÍóÓúÚ]{3,30})$";
		this.regexPatente = "^(([a-zA-Z]{2}\\d{4})|([a-zA-Z]{4}\\d{2}))$";
		this.regexRut = "^((\\d{8}-\\d)|(\\d{7}-\\d)|((\\d{8}-(k|K)))|((\\d{7}-(k|K))))$";
		this.regexEmail = "^([a-zA-Z0-9.]{1,25}@[a-zA-Z]{1,15}\\.[a-zA-Z]{2,3})$";
		this.regexTelefono = "^(\\d{9,})$";
		this.regexMarca = "^([a-zA-Z0-9áÁéÉíÍóÓúÚ -]{3,30})$";
		this.regexModelo = "^([a-zA-Z0-9áÁéÉíÍóÓúÚ -]{3,30})$";
		this.regexAnnFabricacion = "^((19[6-9]\\d)|(2\\d{3}))$";
		this.regexObs = "^([\\w ÁáÉéÍíÓóÚú]{1,30})$";
	}
	
	/**
	 * Muestra el menú principal y ejecuta la lógica asociada a las distintas opciones disponibles.
	 */
	public void menuPrincipal() {
		Scanner leer = new Scanner(System.in);
		int opc = 0;
		while (opc != 5) {
			System.out.println("Menú Principal:");
			System.out.println("(1) Agregar Cliente, Auto y/o Mantención");
			System.out.println("(2) Eliminar Cliente");
			System.out.println("(3) Listado Mantenciones Vehículo");
			System.out.println("(4) Reporte Recaudación Diaria");
			System.out.println("(5) Salir");
			
			//Lectura de opción con manejo de excepciones (en caso de que la entrada no pueda convertirse en int)
			try {
				opc = leer.nextInt();
				leer.nextLine(); 
			}
			catch (InputMismatchException e) {
				leer.next();
			}
			
			switch (opc) {
				case 1:
					this.menuRegistro();
				break;
				case 2:
					String rut = this.leerInfo(this.regexRut, "RUT").toUpperCase();
					this.eliminarCliente(rut);
				break;
				case 3:
					String patente = this.leerInfo(this.regexPatente, "patente").toUpperCase();
					this.listadoMantenciones(patente);
				break;
				case 4:
					String fecha = this.leerInfo(this.regexFecha, "fecha");
					this.ingresoDiario(fecha);
				break;
				case 5:
					System.out.println("Programa finalizado. Hasta luego.");
				break;
				default:
					System.out.println("Opción inválida.");
					System.out.println();
			}
		}	
	}
	
	/**
	 * Muestra los ingresos diarios del taller mecánico.
	 * @param fecha - fecha a buscar: String
	 */
	private void ingresoDiario(String fecha) {
		/*
		 * Paso 1: Se define un acumulador para los ingresos diarios
		 * Paso 2: Se define un iterador para los elementos del ArrayList historial.
		 * Paso 3: Se recorre el arraylist usando un ciclo while y el iterador
		 * Paso 4: Se almacena cada objeto mantención del historial en una variable auxiliar
		 * Paso 5: Si la fecha de la mantencion coincide con la fecha dada como parámetro,
		 * se extrae el monto de la mantención y se suma al acumulador.
		 */
		int acumIngresos = 0;
		Iterator<Mantencion> iterador = this.historial.iterator();
		while (iterador.hasNext()) {
			Mantencion m = iterador.next();
			if (m.getFecha().toString().equals(fecha)) {
				acumIngresos += m.getMonto();
			}
		}
		System.out.println("Fecha: " + fecha + " --- Ingresos diarios: $" + acumIngresos);
		System.out.println();
	}
	
	/**
	 * Muestra el listado de mantenciones de un vehículo.
	 * @param patente - placa patente de un vehículo: String
	 */
	private void listadoMantenciones(String patente) {
		/*
		 * Paso 1: Se define un iterador para los elementos del historial de mantenciones.
		 * Paso 2: Mientras el iterador tenga mas elementos, se ejecuta el ciclo.
		 * Paso 3: Si la patente dada como parámetro coincide con la patente de un auto dentro
		 * de un elemento de tipo Mantencion, entonces, se imprime la información de la
		 * mantención por medio del método toString(). 
		 * NOTA: Si no hay coincidencias, se despliega un mensaje diciendo que no se han
		 * encontrado registros asociados a esa patente.
		 */
		int contadorOcurrencias = 0;
		Iterator<Mantencion> iterador = this.historial.iterator();
		while (iterador.hasNext()) {
			Mantencion m = iterador.next();
			if (m.getAuto().getPatente().equals(patente)) {
				System.out.println(m.toString());
				contadorOcurrencias += 1;
			}
		}
		if (contadorOcurrencias==0) {
			System.out.println("No se han encontrado registros.");
			System.out.println();
		}
		else {
			System.out.println();
		}
	}
	
	/**
	 * Elimina a un cliente de la base de datos de clientes, así como también a sus autos asociados.
	 * @param rut - rut del cliente: String
	 */
	private void eliminarCliente(String rut) {
		/*
		 * Eliminar Cliente:
		 * Paso 1: Si el rut entregado como parámetro existe en la colección de clientes,
		 * se continúa con el proceso.
		 * Paso 2: Se elimina el cliente de la colección de clientes.
		 * Paso 3: Se crea un objeto iterador para recorrer la colección de autos.
		 * Paso 4: Si el objeto de tipo Auto, de una iteración, tiene el rut pasado como parámetro
		 * como atributo, entonces se elimina (se eliminan los autos asociados al rut).
		 */
		if (this.mapaClientes.keySet().contains(rut)) {
			this.mapaClientes.remove(rut);
			Iterator<String> iterador = this.mapaAutos.keySet().iterator();
			while (iterador.hasNext()) {
				String key = iterador.next();
				if (this.mapaAutos.get(key).getPropietario().getRut().equals(rut)) {
					iterador.remove();
				}
			}
			System.out.println("Cliente eliminado.");
		}
		else {
			System.out.println("El cliente no existe.");
		}
		System.out.println();
	}
	
	/**
	 * Muestra el menú de registro y ejecuta los métodos asociados a las distintas opciones.
	 */
	private void menuRegistro() {
		Scanner leer = new Scanner(System.in);
		int opc = 0;
		while (opc != 4) {
			System.out.println("Menú de Registro:");
			System.out.println("(1) Agregar Cliente");
			System.out.println("(2) Agregar Auto");
			System.out.println("(3) Realizar Mantención");
			System.out.println("(4) Atrás");

			//Lectura de opción con manejo de excepciones (en caso de que la entrada no pueda convertirse en int)
			try {
				opc = leer.nextInt();
				leer.nextLine(); //Evita problema de "saltos" en lectura usando scanner posteriormente.
			}
			catch (InputMismatchException e) {
				leer.next();
			}

			switch (opc) {
				case 1:
					String rut = this.leerInfo(this.regexRut, "RUT");
					this.agregarCliente(rut);
				break;
				case 2:
					String rut2 = this.leerInfo(this.regexRut, "RUT Cliente");
					agregarAuto(rut2);
				break;
				case 3:
					this.menuMantencion();
				break;
				case 4:
					System.out.println();
				break;
				default:
					System.out.println("Opción inválida.");
					System.out.println();
			}
		}	
	}
	
	/**
	 * Agrega autos a la colección que actúa como base de datos de autos.
	 * @param rut - rut del cliente: String
	 */
	private void agregarAuto(String rut) {
		/*
		 * Paso 1: Si el cliente no existe, se interrumpe el proceso.
		 * Paso 2: Se lee la patente del vehículo a ingresar.
		 * Paso 3: Si la patente ya existe, se interrumpe el proceso.
		 * Paso 4: Se procede a leer la información necesaria (validaciones incluidas).
		 * Paso 5: Se agrega el auto a su colección respectiva.
		 */
		if (this.mapaClientes.keySet().contains(rut)) {
			String patente = this.leerInfo(this.regexPatente, "patente").toUpperCase();
			if (!this.mapaAutos.keySet().contains(patente)) {
				String marca = this.leerInfo(this.regexMarca, "marca");
				String modelo = this.leerInfo(this.regexModelo, "modelo");
				String ann = this.leerInfo(this.regexAnnFabricacion, "año de fabricación");
				this.mapaAutos.put(patente, new Auto(patente, marca, modelo, ann, this.mapaClientes.get(rut)));
				System.out.println("Auto ingresado exitosamente.");
				System.out.println();
			}
			else {
				System.out.println("La patente ya está registrada.");
				System.out.println();
			}
		}
		else {
			System.out.println("El cliente no existe.");
			System.out.println();
		}
	}
	
	/**
	 * Agrega clientes a la colección que actúa como base de datos de clientes.
	 * @param rut - rut del cliente: String
	 */
	private void agregarCliente(String rut) {
		/*
		 * Paso 1: Si el cliente existe, se interrumpe el proceso.
		 * Paso 2: Se lee la información del cliente (validaciones incluidas)
		 * Paso 3: Se agrega el cliente a su colección respectiva.
		 */
		if (!this.mapaClientes.keySet().contains(rut)) {
			String nombres = this.leerInfo(this.regexNombreApellido, "nombres");
			String apellidos = this.leerInfo(this.regexNombreApellido, "apellidos");
			String email = this.leerInfo(this.regexEmail, "email");
			String telefono = this.leerInfo(this.regexTelefono, "telefono");
			this.mapaClientes.put(rut, new Cliente(nombres, apellidos, rut, email, telefono));
			System.out.println("Cliente añadido satisfactoriamente!");
			System.out.println();
		}
		else {
			System.out.println("El cliente ya existe.");
			System.out.println();
		}
	}
	
	/**
	 * Muestra el menú de mantención y ejecuta los métodos asociados a las distintas opciones.
	 */
	private void menuMantencion() {
		Scanner leer = new Scanner(System.in);
		int opc = 0;
		while (opc != 7) {
			System.out.println("Menú de Mantenimiento:");
			System.out.println("(1) Cambio de Aceite");
			System.out.println("(2) Ajuste de Frenos");
			System.out.println("(3) Afinamiento");
			System.out.println("(4) Amortiguadores");
			System.out.println("(5) Cambio Neumáticos");
			System.out.println("(6) Lavado Motor");
			System.out.println("(7) Atrás");

			//Lectura de opción con manejo de excepciones (en caso de que la entrada no pueda convertirse en int)
			try {
				opc = leer.nextInt();
				leer.nextLine();
			}
			catch (InputMismatchException e) {
				leer.next();
			}

			switch (opc) {
				case 1:
					this.agregarMantencion("Cambio de Aceite", 70000);
				break;
				case 2:
					this.agregarMantencion("Ajuste de Frenos", 120000);
				break;
				case 3:
					this.agregarMantencion("Afinamiento", 200000);
				break;
				case 4:
					this.agregarMantencion("Amortiguadores", 125000);
				break;
				case 5:
					this.agregarMantencion("Cambio Neumáticos", 100000);
				break;
				case 6:
					this.agregarMantencion("Lavado Motor", 25000);
				break;
				case 7:
					System.out.println();
				break;
				default:
					System.out.println("Opción inválida.");
					System.out.println();
			}
		}
	}
	
	/**
	 * Lee información por consola, que posteriormente será tratada como String.
	 * @param regex - expresión regular: String
	 * @param m1 - mensaje de valor a ingresar: String
	 * @param m2 - mensaje de valor inválido.
	 * @return dato: String
	 */
	private String leerInfo(String regex, String m) {
		/*
		 * Paso 1: Se define un objeto Scanner para leer valores.
		 * Paso 2: Se define un string para almacenar el dato.
		 * Paso 3: Se define una expresión regular.
		 * Paso 4: Mientras el dato ingresado no tenga el formato dado por la expresión
		 * regular, se vuelve a exigir su ingreso.
		 * Paso 5: Se retorna el dato (String).
		 */
		Scanner leer = new Scanner(System.in);
		String dato = "";
		while (!dato.matches(regex)) {
			System.out.println("Ingrese " + m + ":");
			dato = leer.nextLine();
			if (!dato.matches(regex)) {
				System.out.println("Formato de " + m + " inválido.");
			}
		}
		return dato;
	}
	
	/**
	 * Agrega una mantención a un vehículo.
	 * @param tipo - Tipo de mantención: String
	 * @param monto - Monto a pagar: int
	 */
	private void agregarMantencion(String tipo, int monto) {
		/*
		 * Paso 1: Se lee la patente del vehículo al cual se desea realizar una mantención.
		 * Paso 2: Si la patente existe en la colección de autos, se continúa con el proceso.
		 * Paso 3: Se lee la fecha.
		 * Paso 4: Se separa el string de fecha en diia, mes y año (enteros).
		 * Paso 5: Se agrega una mantención, usando toda la información disponible.
		 */
		String patente = this.leerInfo(this.regexPatente, "patente").toUpperCase();
		if (this.mapaAutos.keySet().contains(patente)) {
			String fecha = this.leerInfo(this.regexFecha, "fecha");
			String obs = this.leerInfo(this.regexObs, "observaciones");
			int dia = Integer.parseInt(fecha.substring(0, 2));
			int mes = Integer.parseInt(fecha.substring(3, 5));
			int ann = Integer.parseInt(fecha.substring(6));
			this.historial.add(new Mantencion(tipo, obs, monto, new Fecha(dia, mes, ann), this.mapaAutos.get(patente)));
			System.out.println("Mantención registrada!");
			System.out.println();
		}
		else {
			System.out.println("La patente no existe.");
			System.out.println();
		}
	}
	
	//Getters -- Setters
	/**
	 * Método accesador del atributo mapaClientes.
	 * @return mapaClientes : HashMap{@literal <}String, Cliente{@literal >}.
	 */
	public HashMap<String, Cliente> getMapaClientes() {
		return mapaClientes;
	}

	/**
	 * Método mutador del atributo mapaClientes.
	 * @param mapaClientes : HashMap{@literal <}String, Cliente{@literal >}.
	 */
	public void setMapaClientes(HashMap<String, Cliente> mapaClientes) {
		this.mapaClientes = mapaClientes;
	}

	/**
	 * Método accesador del atributo mapaAutos.
	 * @return mapaAutos : HashMap{@literal <}String, Auto{@literal >}.
	 */
	public HashMap<String, Auto> getMapaAutos() {
		return mapaAutos;
	}

	/**
	 * Método mutador del atributo mapaAutos.
	 * @param mapaAutos : HashMap{@literal <}String, Auto{@literal >}.
	 */
	public void setMapaAutos(HashMap<String, Auto> mapaAutos) {
		this.mapaAutos = mapaAutos;
	}

	/**
	 * Método accesador del parámetro historial.
	 * @return historial : ArrayList{@literal <}Mantencion{@literal >}.
	 */
	public ArrayList<Mantencion> getHistorial() {
		return historial;
	}

	/**
	 * Método mutador del atributo historial.
	 * @param historial : ArrayList{@literal <}Mantencion{@literal >}.
	 */
	public void setHistorial(ArrayList<Mantencion> historial) {
		this.historial = historial;
	}

	/**
	 * Método accesador del parámetro regexFecha.
	 * @return regexFecha : String
	 */
	public String getRegexFecha() {
		return regexFecha;
	}

	/**
	 * Método mutador del atributo regexFecha.
	 * @param regexFecha : String.
	 */
	public void setRegexFecha(String regexFecha) {
		this.regexFecha = regexFecha;
	}

	/**
	 * Método accesador del parámetro regexNombreApellido.
	 * @return regexNombreApellido : String
	 */
	public String getRegexNombreApellido() {
		return regexNombreApellido;
	}

	/**
	 * Método mutador del atributo regexNombreApellido.
	 * @param regexNombreApellido : String.
	 */
	public void setRegexNombreApellido(String regexNombreApellido) {
		this.regexNombreApellido = regexNombreApellido;
	}

	/**
	 * Método accesador del parámetro regexPatente.
	 * @return regexPatente : String
	 */
	public String getRegexPatente() {
		return regexPatente;
	}

	/**
	 * Método mutador del atributo regexPatente.
	 * @param regexPatente : String.
	 */
	public void setRegexPatente(String regexPatente) {
		this.regexPatente = regexPatente;
	}

	/**
	 * Método accesador del parámetro regexRut.
	 * @return regexRut : String
	 */
	public String getRegexRut() {
		return regexRut;
	}

	/**
	 * Método mutador del atributo regexRut.
	 * @param regexRut : String.
	 */
	public void setRegexRut(String regexRut) {
		this.regexRut = regexRut;
	}

	/**
	 * Método accesador del parámetro regexEmail.
	 * @return regexEmail : String
	 */
	public String getRegexEmail() {
		return regexEmail;
	}

	/**
	 * Método mutador del atributo regexEmail.
	 * @param regexEmail : String.
	 */
	public void setRegexEmail(String regexEmail) {
		this.regexEmail = regexEmail;
	}

	/**
	 * Método accesador del parámetro regexTelefono.
	 * @return regexTelefono : String
	 */
	public String getRegexTelefono() {
		return regexTelefono;
	}

	/**
	 * Método mutador del atributo regexTelefono.
	 * @param regexTelefono : String.
	 */
	public void setRegexTelefono(String regexTelefono) {
		this.regexTelefono = regexTelefono;
	}

	/**
	 * Método accesador del parámetro regexMarca.
	 * @return regexMarca : String
	 */
	public String getRegexMarca() {
		return regexMarca;
	}

	/**
	 * Método mutador del atributo regexMarca.
	 * @param regexMarca : String.
	 */
	public void setRegexMarca(String regexMarca) {
		this.regexMarca = regexMarca;
	}

	/**
	 * Método accesador del parámetro regexModelo.
	 * @return regexModelo : String
	 */
	public String getRegexModelo() {
		return regexModelo;
	}

	/**
	 * Método mutador del atributo regexModelo.
	 * @param regexModelo : String.
	 */
	public void setRegexModelo(String regexModelo) {
		this.regexModelo = regexModelo;
	}

	/**
	 * Método accesador del parámetro regexAnnFabricacion.
	 * @return regexAnnFabricacion : String
	 */
	public String getRegexAnnFabricacion() {
		return regexAnnFabricacion;
	}

	/**
	 * Método mutador del atributo regexAnnFabricacion.
	 * @param regexAnnFabricacion : String.
	 */
	public void setRegexAnnFabricacion(String regexAnnFabricacion) {
		this.regexAnnFabricacion = regexAnnFabricacion;
	}

	/**
	 * Método accesador del parámetro regexObs.
	 * @return regexObs : String
	 */
	public String getRegexObs() {
		return regexObs;
	}

	/**
	 * Método mutador del atributo regexObs.
	 * @param regexObs : String.
	 */
	public void setRegexObs(String regexObs) {
		this.regexObs = regexObs;
	}
}
