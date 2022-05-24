package logicaMenu;

import java.util.InputMismatchException;
import java.util.Scanner;

import cajero.CajeroAutomatico;
import cuenta.CuentaBancaria;

/**
 * Clase que contiene la l�gica del men� de usuario de un cajero autom�tico.
 * @author Jos� Obreque F.
 *
 */
public class Menu {
	private String numTarjeta; //N�mero de tarjeta, asociada a una cuenta
	private int indiceCuenta; //�ndice de la cuenta a trabajar
	private CajeroAutomatico atm;
	private boolean ejecucionValida;
	
	/**
	 * Constructor de la clase Menu.
	 * @param atm - cajero autom�tico asociado al men�: CajeroAutomatico
	 */
	public Menu(CajeroAutomatico atm) {
		this.atm = atm;
	}
	
	/**
	 * Lee un n�mero de tarjeta (con validaciones), busca su cuenta bancaria asociada y
	 * la almacena.
	 */
	public void lecturaTarjeta() {
		Scanner leer = new Scanner(System.in);
		int indice = 0;
		String numIng;
		
		//Se solicita el n�mero de tarjeta por teclado, con un formato v�lido
		while (true) {
			System.out.println("Ingrese n�mero de tarjeta:");
			numIng = leer.nextLine();
			if (numIng.matches("^[0-9]{6}$")) {
				break;
			}
			else {
				System.out.println("El c�digo de tarjeta solo debe contener 6 d�gitos, sin letras y/o s�mbolos");
				System.out.println();
			}
		}
		
		//Busca la cuenta y retorna su �ndice en el ArrayList
		indice = this.atm.busquedaCuenta(numIng);
		
		//Si el �ndice es -1, entonces la cuenta no se encuentra en la base de datos y la lectura no es v�lida
		if (indice == -1) {
			System.out.println("La cuenta no existe. Contacte a su banco.");
			this.ejecucionValida = false;
		}
		else {
			//Si la cuenta existe, pero su tarjeta est� bloqueada, la lectura no es v�lida
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
		
		//Se solicita el n�mero de tarjeta por teclado, con un formato v�lido
		while (true && contErrores<3) {
			System.out.println("Ingrese clave secreta:");
			claveIng = leer.nextLine();
			//Se verifica si lo ingresado coincide con la expresi�n regular (solo 4 d�gitos)
			if (claveIng.matches("^[0-9]{4}$")) {
				//Se verifica si las claves coinciden
				if (this.atm.getTarjetaIng().get(this.indiceCuenta).getClave().equals(claveIng)) {
					this.ejecucionValida = true; //Si hay coincidencia, la ejecuci�n del men� es v�lida
					break; //Se rompe el ciclo while
				}
				else {
					//Si la clave no coincide, se aumenta en 1 el contador de errores y la ejecuci�n del men� se considera inv�lida
					contErrores += 1;
					this.ejecucionValida = false;
					if (contErrores == 3) {
						System.out.println("Su tarjeta ha sido bloqueada.");
						System.out.println("Por favor, contacte a su banco. Gracias por su preferencia.");
					}
					else {
						System.out.println("Clave err�nea.");
						System.out.println();
					}
				}
			}
			else {
				System.out.println("La clave solo debe contener 4 d�gitos, sin letras y/o s�mbolos.");
				System.out.println();
			}
		}
	}
	
	/**
	 * Muestra todas las filas del historial de transacciones de un cajero autom�tico.
	 */
	public void cicloHistorial() {
		if (atm.getHistorial().size() == 0) {
			System.out.println("Historial vac�o!");
			System.out.println();
		}
		else {
			for (int i=0; i<this.atm.getHistorial().size(); i++) {
				this.atm.getHistorial().get(i).mostrarHistorial();
			}
		}
	}
	
	/**
	 * Muestra el men� de opciones principales del cajero autom�tico.
	 */
	public void menuPrincipal() {
		Scanner leer = new Scanner(System.in);
		int opc = 0;
		String nuevaClave;
		CuentaBancaria cuenta = atm.getTarjetaIng().get(this.indiceCuenta);
		
		while (opc != 5 && this.ejecucionValida) {
			//Se muestra el men�
			System.out.println("Men�:");
			System.out.println("(1) Consultar Saldo");
			System.out.println("(2) Giro");
			System.out.println("(3) Cambiar Clave");
			System.out.println("(4) Mostrar Historial");
			System.out.println("(5) Salir");
			//Se lee la opci�n ingresada y se maneja la excepcion
			try {
				opc = leer.nextInt();
				leer.nextLine(); //Corrige conflicto con el uso de nextLine luego de haber usado un nextInt
			}catch(InputMismatchException e) {
				opc = 0;
				leer.next();
			}
			//Se ejecuta la opci�n seleccionada
			switch (opc) {
				case 1:
					//Se consulta el saldo y se guarda la transacci�n
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
					//Se solicita el ingreso de la nueva clave, la cual debe contener 4 d�gitos exclusivamente.
					while (true) {
						System.out.println("Ingrese nueva clave:");
						nuevaClave = leer.nextLine(); //Se lee la nueva clave
						//Se verifica que la nueva clave solo acepte 4 digitos mediante una expresi�n regular
						if (nuevaClave.matches("^[0-9]{4}$")) {
							this.ejecucionValida = true; //Si cumple estos criterios, la ejecuci�n del menu del programa es v�lida
							//Se almacena la transacci�n/movimiento
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
					//Mensaje por defecto para las opciones inv�lidas
					System.out.println("Opci�n inv�lida");
					System.out.println();
			}
		}
	}
	
	/**
	 * Muestra el men� secundario, para la realizaci�n de giros de dinero.
	 */
	public void menuSecundario() {
		Scanner leer = new Scanner(System.in);
		int opc = 0;
		String montoGiro;
		CuentaBancaria cuenta = atm.getTarjetaIng().get(this.indiceCuenta); //Se almacena la cuenta trabajada en una variable
		
		//Se muestra el men� de giros, en un ciclo
		while (opc != 7) {
			System.out.println("Opciones de giro:");
			System.out.println("(1) $5000");
			System.out.println("(2) $10000");
			System.out.println("(3) $20000");
			System.out.println("(4) $100000");
			System.out.println("(5) $200000");
			System.out.println("(6) Otro monto");
			System.out.println("(7) Atr�s");
			//Se lee la opci�n ingresada y se maneja la opcion
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
				 * Se realiza la petici�n del monto personalizado de giro, que debe cumplir con:
				 * 1) Ser solo d�gitos (no letras, espacios o s�mbolos)
				 * 2) Ser m�ltiplos de $1000 (no se entregan monedas)
				 */
				while (true) {
					System.out.println("Ingrese el monto a girar:");
					montoGiro = leer.nextLine();
					//Validaci�n de solo d�gitos
					if (montoGiro.matches("^[0-9]*")) {
						//Validaci�n de m�ltiplos de $1000
						if (Integer.parseInt(montoGiro)%1000 == 0) {
							atm.entregarDinero(Integer.parseInt(montoGiro), cuenta);
							break;
						}
						else {
							System.out.println("Este cajero solo puede entregar m�ltiplos de $1.000");
						}
					}
					else {
						System.out.println("El monto ingresado solo debe contener d�gitos.");
					}
				}
			break;
			case 7:
				System.out.println();
			break;
			default:
				System.out.println("Opci�n inv�lida.");
			}
		}
	}
	
	/**
	 * M�todo accesador del atributo numTarjeta.
	 * @return numTarjeta : String.
	 */
	public String getNumTarjeta() {
		return numTarjeta;
	}

	/**
	 * M�todo mutador del atributo numTarjeta.
	 * @param numTarjeta : String.
	 */
	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	/**
	 * M�todo accesador del atributo indiceCuenta.
	 * @return indiceCuenta : int.
	 */
	public int getIndiceCuenta() {
		return indiceCuenta;
	}

	/**
	 * M�todo mutador del atributo indiceCuenta.
	 * @param indiceCuenta : int.
	 */
	public void setIndiceCuenta(int indiceCuenta) {
		this.indiceCuenta = indiceCuenta;
	}

	/**
	 * M�todo accesador del atributo atm.
	 * @return atm : CajeroAutomatico.
	 */
	public CajeroAutomatico getAtm() {
		return atm;
	}

	/**
	 * M�todo mutador del atributo atm.
	 * @param atm : CajeroAutomatico.
	 */
	public void setAtm(CajeroAutomatico atm) {
		this.atm = atm;
	}

	/**
	 * M�todo accesador del atributo ejecucionValida.
	 * @return ejecucionValida : boolean.
	 */
	public boolean isEjecucionValida() {
		return ejecucionValida;
	}

	/**
	 * M�todo mutador del atributo ejecucionValida.
	 * @param ejecucionValida : boolean.
	 */
	public void setEjecucionValida(boolean ejecucionValida) {
		this.ejecucionValida = ejecucionValida;
	}
	
	
	
}
