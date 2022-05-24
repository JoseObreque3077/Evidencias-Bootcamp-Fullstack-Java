package logicaMenu;

import java.util.InputMismatchException;
import java.util.Scanner;

import cajero.CajeroAutomatico;
import cuenta.CuentaBancaria;

/**
 * Clase que contiene la lógica del menú de usuario de un cajero automático.
 * @author José Obreque F.
 *
 */
public class Menu {
	private String numTarjeta; //Número de tarjeta, asociada a una cuenta
	private int indiceCuenta; //Índice de la cuenta a trabajar
	private CajeroAutomatico atm;
	private boolean ejecucionValida;
	
	/**
	 * Constructor de la clase Menu.
	 * @param atm - cajero automático asociado al menú: CajeroAutomatico
	 */
	public Menu(CajeroAutomatico atm) {
		this.atm = atm;
	}
	
	/**
	 * Lee un número de tarjeta (con validaciones), busca su cuenta bancaria asociada y
	 * la almacena.
	 */
	public void lecturaTarjeta() {
		Scanner leer = new Scanner(System.in);
		int indice = 0;
		String numIng;
		
		//Se solicita el número de tarjeta por teclado, con un formato válido
		while (true) {
			System.out.println("Ingrese número de tarjeta:");
			numIng = leer.nextLine();
			if (numIng.matches("^[0-9]{6}$")) {
				break;
			}
			else {
				System.out.println("El código de tarjeta solo debe contener 6 dígitos, sin letras y/o símbolos");
				System.out.println();
			}
		}
		
		//Busca la cuenta y retorna su índice en el ArrayList
		indice = this.atm.busquedaCuenta(numIng);
		
		//Si el índice es -1, entonces la cuenta no se encuentra en la base de datos y la lectura no es válida
		if (indice == -1) {
			System.out.println("La cuenta no existe. Contacte a su banco.");
			this.ejecucionValida = false;
		}
		else {
			//Si la cuenta existe, pero su tarjeta está bloqueada, la lectura no es válida
			if (this.atm.getTarjetaIng().get(indice).getTarjeta().isHabilitada()) {
				this.numTarjeta = numIng;
				this.ejecucionValida = true;
			}
			else {
				System.out.println("Tarjeta bloqueada. Contacte a su banco");
				this.ejecucionValida = false;
			}
		}
	}
	
	/**
	 * Lee una clave secreta (con validaciones) y bloquea la tarjeta en caso de 3 intentos fallidos de ingreso
	 * de la misma.
	 */
	public void lecturaClave() {
		Scanner leer = new Scanner(System.in);
		int contErrores = 0;
		String claveIng;
		
		//Se solicita el número de tarjeta por teclado, con un formato válido
		while (true && contErrores<3) {
			System.out.println("Ingrese clave secreta:");
			claveIng = leer.nextLine();
			//Se verifica si lo ingresado coincide con la expresión regular (solo 4 dígitos)
			if (claveIng.matches("^[0-9]{4}$")) {
				//Se verifica si las claves coinciden
				if (this.atm.getTarjetaIng().get(this.indiceCuenta).getClave().equals(claveIng)) {
					this.ejecucionValida = true; //Si hay coincidencia, la ejecución del menú es válida
					break; //Se rompe el ciclo while
				}
				else {
					//Si la clave no coincide, se aumenta en 1 el contador de errores y la ejecución del menú se considera inválida
					contErrores += 1;
					this.ejecucionValida = false;
					if (contErrores == 3) {
						System.out.println("Su tarjeta ha sido bloqueada.");
						System.out.println("Por favor, contacte a su banco. Gracias por su preferencia.");
					}
					else {
						System.out.println("Clave errónea.");
						System.out.println();
					}
				}
			}
			else {
				System.out.println("La clave solo debe contener 4 dígitos, sin letras y/o símbolos.");
				System.out.println();
			}
		}
	}
	
	/**
	 * Muestra todas las filas del historial de transacciones de un cajero automático.
	 */
	public void cicloHistorial() {
		if (atm.getHistorial().size() == 0) {
			System.out.println("Historial vacío!");
			System.out.println();
		}
		else {
			for (int i=0; i<this.atm.getHistorial().size(); i++) {
				this.atm.getHistorial().get(i).mostrarHistorial();
			}
		}
	}
	
	/**
	 * Muestra el menú de opciones principales del cajero automático.
	 */
	public void menuPrincipal() {
		Scanner leer = new Scanner(System.in);
		int opc = 0;
		String nuevaClave;
		CuentaBancaria cuenta = atm.getTarjetaIng().get(this.indiceCuenta);
		
		while (opc != 5 && this.ejecucionValida) {
			//Se muestra el menú
			System.out.println("Menú:");
			System.out.println("(1) Consultar Saldo");
			System.out.println("(2) Giro");
			System.out.println("(3) Cambiar Clave");
			System.out.println("(4) Mostrar Historial");
			System.out.println("(5) Salir");
			//Se lee la opción ingresada y se maneja la excepcion
			try {
				opc = leer.nextInt();
				leer.nextLine(); //Corrige conflicto con el uso de nextLine luego de haber usado un nextInt
			}catch(InputMismatchException e) {
				opc = 0;
				leer.next();
			}
			//Se ejecuta la opción seleccionada
			switch (opc) {
				case 1:
					//Se consulta el saldo y se guarda la transacción
					cuenta.consultarSaldo();
					atm.guardarTransaccion("Consulta Saldo","24/03/2022", cuenta.getTipoCuenta(), cuenta.getTitular(), null);
				break;
				case 2:
					this.menuSecundario();
				break;
				case 3:
					//Se pide el ingreso de clave
					this.lecturaClave();
					//Si la tarjeta se bloquea, entonces se detiene la ejecucion del case 3
					if (!this.ejecucionValida) {
						break;
					}
					//Se solicita el ingreso de la nueva clave, la cual debe contener 4 dígitos exclusivamente.
					while (true) {
						System.out.println("Ingrese nueva clave:");
						nuevaClave = leer.nextLine(); //Se lee la nueva clave
						//Se verifica que la nueva clave solo acepte 4 digitos mediante una expresión regular
						if (nuevaClave.matches("^[0-9]{4}$")) {
							this.ejecucionValida = true; //Si cumple estos criterios, la ejecución del menu del programa es válida
							//Se almacena la transacción/movimiento
							atm.guardarTransaccion("Cambio de Clave", "24/03/2022", cuenta.getTipoCuenta(), cuenta.getTitular(), null);
							break; //Se interrumpe el ciclo
						}
						else {
							this.ejecucionValida = false; 
						}
					}
					cuenta.cambioClave(nuevaClave); //Se realiza el cambio de clave
				break;
				case 4:
					//Se muestra el historial completo (linea a linea)
					this.cicloHistorial();
				break;
				case 5:
					//Mensaje por defecto al seleccionar la opcion de salir
					System.out.println("Gracias por su preferencia. Adios!");
				break;
				default:
					//Mensaje por defecto para las opciones inválidas
					System.out.println("Opción inválida");
					System.out.println();
			}
		}
	}
	
	/**
	 * Muestra el menú secundario, para la realización de giros de dinero.
	 */
	public void menuSecundario() {
		Scanner leer = new Scanner(System.in);
		int opc = 0;
		String montoGiro;
		CuentaBancaria cuenta = atm.getTarjetaIng().get(this.indiceCuenta); //Se almacena la cuenta trabajada en una variable
		
		//Se muestra el menú de giros, en un ciclo
		while (opc != 7) {
			System.out.println("Opciones de giro:");
			System.out.println("(1) $5000");
			System.out.println("(2) $10000");
			System.out.println("(3) $20000");
			System.out.println("(4) $100000");
			System.out.println("(5) $200000");
			System.out.println("(6) Otro monto");
			System.out.println("(7) Atrás");
			//Se lee la opción ingresada y se maneja la opcion
			try {
				opc = leer.nextInt();
				leer.nextLine(); //Corrige conflicto con el uso de nextLine luego de haber usado un nextInt
			}catch(InputMismatchException e) {
				opc = 0;
				leer.next();
			}
			
			switch(opc) {
			case 1:
				atm.entregarDinero(5000, cuenta);
			break;
			case 2:
				atm.entregarDinero(10000, cuenta);
			break;
			case 3:
				atm.entregarDinero(20000, cuenta);
			break;
			case 4:
				atm.entregarDinero(100000, cuenta);
			break;
			case 5:
				atm.entregarDinero(200000, cuenta);
			break;
			case 6:
				/*
				 * Se realiza la petición del monto personalizado de giro, que debe cumplir con:
				 * 1) Ser solo dígitos (no letras, espacios o símbolos)
				 * 2) Ser múltiplos de $1000 (no se entregan monedas)
				 */
				while (true) {
					System.out.println("Ingrese el monto a girar:");
					montoGiro = leer.nextLine();
					//Validación de solo dígitos
					if (montoGiro.matches("^[0-9]*")) {
						//Validación de múltiplos de $1000
						if (Integer.parseInt(montoGiro)%1000 == 0) {
							atm.entregarDinero(Integer.parseInt(montoGiro), cuenta);
							break;
						}
						else {
							System.out.println("Este cajero solo puede entregar múltiplos de $1.000");
						}
					}
					else {
						System.out.println("El monto ingresado solo debe contener dígitos.");
					}
				}
			break;
			case 7:
				System.out.println();
			break;
			default:
				System.out.println("Opción inválida.");
			}
		}
	}
	
	/**
	 * Método accesador del atributo numTarjeta.
	 * @return numTarjeta : String.
	 */
	public String getNumTarjeta() {
		return numTarjeta;
	}

	/**
	 * Método mutador del atributo numTarjeta.
	 * @param numTarjeta : String.
	 */
	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	/**
	 * Método accesador del atributo indiceCuenta.
	 * @return indiceCuenta : int.
	 */
	public int getIndiceCuenta() {
		return indiceCuenta;
	}

	/**
	 * Método mutador del atributo indiceCuenta.
	 * @param indiceCuenta : int.
	 */
	public void setIndiceCuenta(int indiceCuenta) {
		this.indiceCuenta = indiceCuenta;
	}

	/**
	 * Método accesador del atributo atm.
	 * @return atm : CajeroAutomatico.
	 */
	public CajeroAutomatico getAtm() {
		return atm;
	}

	/**
	 * Método mutador del atributo atm.
	 * @param atm : CajeroAutomatico.
	 */
	public void setAtm(CajeroAutomatico atm) {
		this.atm = atm;
	}

	/**
	 * Método accesador del atributo ejecucionValida.
	 * @return ejecucionValida : boolean.
	 */
	public boolean isEjecucionValida() {
		return ejecucionValida;
	}

	/**
	 * Método mutador del atributo ejecucionValida.
	 * @param ejecucionValida : boolean.
	 */
	public void setEjecucionValida(boolean ejecucionValida) {
		this.ejecucionValida = ejecucionValida;
	}
	
	
	
}
