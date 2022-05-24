package cajero;

import java.util.ArrayList;

import cuenta.CuentaBancaria;
import operacion.Operacion;

/**
 * Clase que representa a un cajero automático.
 * 
 * @author José Obreque F.
 *
 */
public class CajeroAutomatico {
	private int saldoCajero;
	private ArrayList<CuentaBancaria> tarjetaIng;
	private ArrayList<Operacion> historial;
	
	/**
	 * Constructor de la clase CajeroAutomatico
	 * @param saldoCajero - Saldo disponible en el cajero: int
	 * @param tarjetaIng -  "Base de datos" de cuentas bancarias: Arraylist.
	 */
	public CajeroAutomatico(int saldoCajero, ArrayList<CuentaBancaria> tarjetaIng) {
		this.saldoCajero = saldoCajero;
		this.tarjetaIng = tarjetaIng;
		this.historial = new ArrayList<Operacion>();
	}

	/**
	 * Realiza un giro de dinero.
	 * @param giro - monto a girar: int
	 * @param cuenta - cuenta bancaria de origen: CuentaBancaria
	 */
	public void entregarDinero(int giro, CuentaBancaria cuenta) {
		//Se consulta si el cajero tiene plata
		if (saldoCajero >= giro) {
			//Luego, verificamos que la tarjeta de la cuenta no esté bloqueada
			if (cuenta.getTarjeta().isHabilitada()) {
				//Si cumple, se hace el giro, siempre y cuando el usuario tenga saldo suficiente
				if (cuenta.getSaldo() >= giro) {
					System.out.println("Retiro exitoso.");
					cuenta.actualizarSaldoCliente(giro); //Se resta plata al cliente
					System.out.println();
					this.saldoCajero -= giro; //Se resta plata al cajero
					this.guardarTransaccion("Giro", "24/03/2022", cuenta.getTipoCuenta() , cuenta.getTitular(), null);
				}
				else {
					System.out.println("El saldo en su cuenta es insuficiente.");
				}
			}
			else {
				//Si está bloqueada, no se hace ninguna operación
				System.out.println("Tarjeta bloqueada. Contacte a su banco.");
			}
		}
		else {
			//Si el saldo del cajero es insuficiente, no se realiza el giro
			System.out.println("El cajero no tiene saldo suficiente.");
			System.out.println();
		}
	}
	
	/**
	 * Bloquea la tarjeta del usuario.
	 * @param numTarjetaExt - número de tarjeta ingresado : String
	 */
	public void bloqueoTarjeta(String numTarjetaExt) {
		int indice = 0; //Variable que almacena el índice de la cuenta
		indice = busquedaCuenta(numTarjetaExt); //Se busca el índice de la cuenta
		//Si la cuenta existe, se bloquea la tarjeta asociada
		if (indice != -1) {
			//Se accede a la cuenta, se accede a la tarjeta y se bloquea
			this.tarjetaIng.get(indice).getTarjeta().setHabilitada(false);
			//Se guarda la transacción
			this.guardarTransaccion("Bloqueo Tarjeta", "24/03/2022",
					this.tarjetaIng.get(indice).getTipoCuenta() ,
					this.tarjetaIng.get(indice).getTitular(),
					null);
		}
	}
	
	/**
	 * Busca una cuenta, usando un número de cuenta, en la base de datos.
	 * @param numTarjetaExt - número de tarjeta ingresado : String
	 * @return índice de BD de cuentas: int
	 */
	public int busquedaCuenta(String numTarjetaExt) {
		CuentaBancaria cuenta;
		int salida = 0;
		for (int i=0; i<this.tarjetaIng.size(); i++) {
			cuenta = this.tarjetaIng.get(i);
			if (cuenta.getTarjeta().validarTarjeta(numTarjetaExt)) {
				salida = i;
				break;
			}
			else {
				salida = -1;
			}
		}
		return salida;
	}
	
	//Tipo de operaciones: giro, consulta saldo, bloqueo tarjeta, cambio clave
	/**
	 * Guarda una transacción en el historial.
	 * @param operacion - operación realizada: String
	 * @param fecha - fecha de la operación: String
	 * @param tipoCuenta - tipo de cuenta: String
	 * @param cliente - nombre del cliente: String
	 * @param observaciones - observaciones de la operación: String
	 */
	public void guardarTransaccion(String operacion, String fecha, String tipoCuenta, String cliente, String observaciones) {
		//Se crea una instancia de la clase Operacion, con los datos de la transacción
		Operacion evento = new Operacion(operacion, fecha, tipoCuenta, cliente, observaciones);
		//Se agrega la operación al historial
		this.historial.add(evento);
	}
	
	//Getters-Setters
	/**
	 * Método accesador del atributo saldoCajero.
	 * @return saldoCajero : int.
	 */
	public int getSaldoCajero() {
		return saldoCajero;
	}

	/**
	 * Método mutador del atributo saldoCajero.
	 * @param saldoCajero : int.
	 */
	public void setSaldoCajero(int saldoCajero) {
		this.saldoCajero = saldoCajero;
	}

	/**
	 * Método accesador del atributo tarjetaIng.
	 * @return tarjetaIng : ArrayList.
	 */
	public ArrayList<CuentaBancaria> getTarjetaIng() {
		return tarjetaIng;
	}

	/**
	 * Método mutador del atributo tarjetaIng.
	 * @param tarjetaIng : ArrayList.
	 */
	public void setTarjetaIng(ArrayList<CuentaBancaria> tarjetaIng) {
		this.tarjetaIng = tarjetaIng;
	}

	/**
	 * Método accesador del atributo historial.
	 * @return historial : ArrayList.
	 */
	public ArrayList<Operacion> getHistorial() {
		return historial;
	}

	/**
	 * Método mutador del atributo historial.
	 * @param historial : ArrayList.
	 */
	public void setHistorial(ArrayList<Operacion> historial) {
		this.historial = historial;
	}
}
