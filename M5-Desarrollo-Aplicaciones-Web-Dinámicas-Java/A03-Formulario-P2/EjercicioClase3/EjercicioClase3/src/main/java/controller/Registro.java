package controller;

import java.util.ArrayList;
import java.util.List;

import modelo.Vehiculo;

/**
 * Clase que representa a un registro de vehículos.
 * @author José Obreque F.
 *
 */
public class Registro {
	/*
	 * Se define una colección, que puede ser cualquiera que implemente a la
	 * interfaz List (Ej: ArrayList).
	 */
	List<Vehiculo> lista;
	
	//Constructor de la clase (con parámetros)
	public Registro(List<Vehiculo> lista) {
		super();
		this.lista = lista;
	}
	
	//Constructor sin parámetros
	public Registro() {
		this.lista = new ArrayList<Vehiculo>();
	}
	
	public List<Vehiculo> getLista() {
		return lista;
	}

	public void setLista(List<Vehiculo> lista) {
		this.lista = lista;
	}
	
	//Busca un vehículo por su patente. Retorna un objeto de tipo Vehiculo.
	public Vehiculo buscarVehiculo(String patente ) {
		//Se recorre la lista de vehículos
		for (Vehiculo v: getLista()) {
			//Si se encuentra una coincidencia de patente...
			if (v.getPatente().equals(patente)) {
				//...Se devuelve el objeto Vehiculo y se termina la ejecución del método
				return v;
			}
		}
		//Si no se encuentra ninguna coincidencia, se devuelve un null
		return null;
	}
	
	//Agrega un vehículo a la lista
	public boolean agregarVehiculo(Vehiculo vehiculo) {
		//Si el vehículo no existe (por patente única) en la lista, entonces se agrega
		if (buscarVehiculo(vehiculo.getPatente()) == null) {
			//...y se interrumpe la ejecución del método
			return getLista().add(vehiculo);
		}
		else {
			return false;
		}
	}
}
