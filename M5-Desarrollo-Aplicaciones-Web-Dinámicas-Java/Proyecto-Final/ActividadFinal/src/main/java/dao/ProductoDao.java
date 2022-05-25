package dao;

import java.util.List;

import modelo.Producto;

public interface ProductoDao {
	
	public List<Producto> listar();
	
	public Producto buscar(int id);
	
}
