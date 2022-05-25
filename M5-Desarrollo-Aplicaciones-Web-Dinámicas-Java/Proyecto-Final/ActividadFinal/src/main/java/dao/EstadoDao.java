package dao;

import java.util.List;

import modelo.Estado;

public interface EstadoDao {
	
	public List<Estado> listar();
	
	public Estado buscar(int id);
}
