
public class Automovil {
	private String marca;
	private String serie;
	private int modelo;
	private String placa;
	
	//Constructor
	Automovil(String marca, String serie, int modelo, String placa) {
		this.marca = marca;
		this.serie = serie;
		this.modelo = modelo;
		this.placa = placa;
	}
	
	//Accesadores
	public String getMarca() {
		return this.marca;
	}
	
	public String getSerie() {
		return this.serie;
	}
	
	public int getModelo() {
		return this.modelo;
	}
	
	public String getPlaca() {
		return this.placa;
	}
	
	//Mutadores
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setSerie(String serie) {
		this.serie = serie;
	}
	
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
}
