package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexion.Conexion;
import dao.RegionDao;
import modelo.Region;

public class RegionService implements RegionDao{
	
	@Override
	public List<Region> listar() {
		List<Region> lista = new ArrayList<Region>();
		String query = "SELECT id, region FROM regiones ORDER BY id";
		PreparedStatement smt;
		try {
			smt = Conexion.getInstancia().prepareStatement(query);
			ResultSet rs = smt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String region = rs.getString("region");
				Region r = new Region(id, region);
				lista.add(r);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public Region buscar(int id) {
		String query = "SELECT id, region FROM regiones WHERE id = ?";
		Region region = null;
		PreparedStatement smt;
		try {
			smt = Conexion.getInstancia().prepareStatement(query);
			smt.setInt(1, id);
			ResultSet rs = smt.executeQuery();
			while (rs.next()) {
				String descripcion = rs.getString("region");
				region = new Region(id, descripcion);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return region;
	}
	
	
}
