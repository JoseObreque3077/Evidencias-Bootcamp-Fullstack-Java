package dao;

import java.util.List;

import modelo.Region;

public interface RegionDao {
	
	public List<Region> listar();
	
	public Region buscar(int id);
}
