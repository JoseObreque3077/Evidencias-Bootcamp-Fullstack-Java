package controller;

import java.util.ArrayList;
import java.util.List;

import modelo.Vehiculo;

/**
 * Clase que representa a un registro de veh�culos.
 * @author Jos� Obreque F.
 *
 */
public class Registro {
	/*
	 * Se define una colecci�n, que puede ser cualquiera que implemente a la
	 * interfaz List (Ej: ArrayList).
	 */
	List<Vehiculo> lista;
	
	//Constructor de la clase (con par�metros)
	public Registro(List<Vehiculo> lista) {
		super();
		this.lista = lista;
	}
	
	//Constructor sin par�metros
	public Registro() {
		this.lista = new ArrayList<Vehiculo>();
	}
	
	public List<Vehiculo> getLista() {
		return lista;
	}

	public void setLista(List<Vehiculo> lista) {
		this.lista = lista;
	}
	
	//Busca un veh�culo por su patente. Retorna un objeto de tipo Vehiculo.
	public Vehiculo buscarVehiculo(String patente ) {
		//Se recorre la lista de veh�culos
		for (Vehiculo v: getLista()) {
			//Si se encuentra una coincidencia de patente...
			if (v.getPatente().equals(patente)) {
				//...Se devuelve el objeto Vehiculo y se termina la ejecuci�n del m�todo
				return v;
			}
		}
		//Si no se encuentra ninguna coincidencia, se devuelve un null
		return null;
	}
	
	//Agrega un veh�culo a la lista
	public boolean agregarVehiculo(Vehiculo vehiculo) {
		//Si el veh�culo no existe (por patente �nica) en la lista, entonces se agrega
		if (buscarVehiculo(vehiculo.getPatente()) == null) {
			//...y se interrumpe la ejecuci�n del m�todo
			return getLista().add(vehiculo);
		}
		else {
			return false;
		}
	}
}
