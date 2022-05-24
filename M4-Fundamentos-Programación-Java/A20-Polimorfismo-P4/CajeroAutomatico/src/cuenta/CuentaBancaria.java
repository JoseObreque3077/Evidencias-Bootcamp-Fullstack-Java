package cuenta;

import java.util.Scanner;

import tarjeta.Tarjeta;

/**
 * Clase que representa a la cuenta bancaria de un usuario.
 * @author José Obreque F.
 *
 */
public class CuentaBancaria {
	private String banco; //Banco de origen
	private String tipoCuenta; //Tipo cuenta: ahorro, vista, corriente
	private String titular; //Nombre del titular
	private int numCuenta; //Número de la cuenta
	private int saldo; //Saldo disponible
	private int numGiros; //Giros maximos permitidos
	private String clave; //Clave de la cuenta
	private Tarjeta tarjeta; //Tarjeta asociada a la cuenta

	/**
	 * Constructor de la clase CuentaBancaria.
	 * @param banco - Banco del titular de la cuenta: String
	 * @param tipoCuenta - Tipo de cuenta: String
	 * @param titular - Nombre del titular de la cuenta: String
	 * @param numCuenta - Número de cuenta: int
	 * @param saldo - Saldo disponible: int
	 * @param numGiros - Número de giros diarios permitidos: int
	 * @param clave - Clave secreta de la cuenta: String
	 * @param tarjeta - Tarjeta asociada a la cuenta: Tarjeta
	 */
	public CuentaBancaria(String banco, String tipoCuenta, String titular, int numCuenta, int saldo,
			int numGiros, String clave, Tarjeta tarjeta) {
		this.banco = banco;
		this.tipoCuenta = tipoCuenta;
		this.titular = titular;
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.numGiros = numGiros;
		this.clave = clave;
		this.tarjeta = tarjeta;
	}
	
	/**
	 * Actualiza el saldo de la cuenta del cliente.
	 * @param giro - monto a girar: int
	 */
	public void actualizarSaldoCliente(int giro) {
		this.saldo -= giro;
		System.out.println("Saldo actual: $" + this.saldo);
	}
	
	/**
	 * Cambia la clave de la cuenta.
	 * @param nuevaClave - nueva clave de la cuenta: int.
	 */
	public void cambioClave(String nuevaClave) {
		this.clave = nuevaClave;
		System.out.println("Su clave fué cambiada con éxito.");
	}
	
	/**
	 * Valida que el número de cuenta ingresado sea válido.
	 * @param numeroCuentaExt - número de cuenta ingresado: int
	 * @return boolean.
	 */
	public boolean validarCuenta(int numeroCuentaExt) {
		if (this.numCuenta == numeroCuentaExt) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Verifica que la clave ingresado sea válida.
	 */
	public void validarClave() {
		Scanner leer = new Scanner(System.in);
		int intentos = 0;
		String claveIng;

		while (true && intentos<3) {
			System.out.println("Ingrese su clave secreta:");
			claveIng = leer.nextLine();
			if (claveIng.matches("^[0-9]{4}$")) {
				if (this.clave.equals(claveIng)) {
					break;
				}
				else {
					System.out.println("Clave incorrecta.");
					intentos += 1;
				}
			}
			else {
				System.out.println("La clave solo debe contener 4 dígitos, sin letras y/o símbolos.");
			}
		}
		if (intentos == 3) {
			System.out.println("Por su seguridad su tarjeta ha sido bloqueada.\nContacte a su banco para más información.");
			this.getTarjeta().setHabilitada(false);
		}
	}
	
	/**
	 * Entrega por consola el saldo actual de la cuenta.
	 */
	public void consultarSaldo() {
		System.out.println("Saldo actual: $" + this.saldo);
	}
	
	//Getters-Setters
	/**
	 * Método accesador del atributo banco.
	 * @return banco : String.
	 */
	public String getBanco() {
		return banco;
	}

	/**
	 * Método mutador del atributo banco.
	 * @param banco : String.
	 */
	public void setBanco(String banco) {
		this.banco = banco;
	}

	/**
	 * Método accesador del atributo tipoCuenta.
	 * @return tipoCuenta : String.
	 */
	public String getTipoCuenta() {
		return tipoCuenta;
	}

	/**
	 * Método mutador del atributo tipoCuenta.
	 * @param tipoCuenta : String.
	 */
	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	/**
	 * Método accesador del atributo titular.
	 * @return titular : String.
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * Método mutador del atributo titular.
	 * @param titular : String.
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}

	/**
	 * Método accesador del atributo numCuenta.
	 * @return numCuenta : int.
	 */
	public int getNumCuenta() {
		return numCuenta;
	}

	/**
	 * Método mutador del atributo numCuenta.
	 * @param numCuenta : int.
	 */
	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	/**
	 * Método accesador del atributo saldo.
	 * @return saldo : int.
	 */
	public int getSaldo() {
		return saldo;
	}

	/**
	 * Método mutador del atributo saldo.
	 * @param saldo : int.
	 */
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	/**
	 * Método accesador del atributo numGiros.
	 * @return numGiros : int.
	 */
	public int getNumGiros() {
		return numGiros;
	}

	/**
	 * Método mutador del atributo numGiros.
	 * @param numGiros : int.
	 */
	public void setNumGiros(int numGiros) {
		this.numGiros = numGiros;
	}

	/**
	 * Método accesador del atributo tarjeta.
	 * @return tarjeta : Tarjeta.
	 */
	public Tarjeta getTarjeta() {
		return tarjeta;
	}

	/**
	 * Método mutador del atributo tarjeta.
	 * @param tarjeta : Tarjeta.
	 */
	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

	/**
	 * Método accesador del atributo clave.
	 * @return clave : String.
	 */
	public String getClave() {
		return clave;
	}

	/**
	 * Método mutador del atributo clave.
	 * @param clave : String.
	 */
	public void setClave(String clave) {
		this.clave = clave;
	}
	
}