package dao;

import java.util.List;

import modelo.Orden;

public interface OrdenDao {
	
	public int agregar(Orden orden);
	
	public List<Orden> listar();
	
	public List<Orden> listar(String rutBusqueda);
	
	public Orden buscar(int id);
	
	public int modificar(Orden orden);
	
}
