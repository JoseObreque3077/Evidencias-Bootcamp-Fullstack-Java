package clases;

/**
 * Clase que representa a una fecha.
 * @author Jos� Obreque F.
 *
 */
public class Fecha {
	private int dia;
	private int mes;
	private int ann;
	
	/**
	 * Constructor de la clase Fecha (sin par�metros), con valores por defecto.
	 */
	public Fecha() {
		this.dia = 31;
		this.mes = 03;
		this.ann = 2022;
	}
	
	/**
	 * Constructor de la clase Fecha
	 * @param dia - dia del mes: int
	 * @param mes - mes del a�o: int
	 * @param ann - a�o: int
	 */
	public Fecha(int dia, int mes, int ann) {
		this.dia = dia;
		this.mes = mes;
		this.ann = ann;
	}
	
	@Override
	/**
	 * Permite imprimir directamente los atributos de una instancia de la clase Fecha.
	 * M�todo sobreescrito, con origen en la clase Object.
	 */
	public String toString() {
		return String.format("%02d", this.dia) + "/" + String.format("%02d", this.mes) + "/" + this.ann;
	}
	
	/**
	 * Permite imprimir los atributos de una instancia de la clase Fecha.
	 * @return Cadena de texto con los valores de los par�metros: String
	 */
	public String impresion() {
		return String.format("%02d", this.dia) + "/" + String.format("%02d", this.mes) + "/" + this.ann;
	}
	
	//Getters -- Setters
	/**
	 * M�todo accesador del atributo dia.
	 * @return dia : int.
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * M�todo mutador del atributo dia.
	 * @param dia : int.
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}

	/**
	 * M�todo accesador del atributo mes.
	 * @return mes : int.
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * M�todo mutador del atributo mes.
	 * @param mes : int.
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}

	/**
	 * M�todo accesador del atributo ann.
	 * @return ann : int.
	 */
	public int getAnn() {
		return ann;
	}

	/**
	 * M�todo mutador del atributo ann.
	 * @param ann : int.
	 */
	public void setAnn(int ann) {
		this.ann = ann;
	}
}
