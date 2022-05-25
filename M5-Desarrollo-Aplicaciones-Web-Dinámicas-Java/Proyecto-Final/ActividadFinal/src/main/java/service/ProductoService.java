package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexion.Conexion;
import dao.ProductoDao;
import modelo.Producto;

public class ProductoService implements ProductoDao{
	
	@Override
	public List<Producto> listar() {
		List<Producto> lista = new ArrayList<Producto>();
		String query = "SELECT id, descripcion FROM productos ORDER BY descripcion";
		PreparedStatement smt;
		try {
			smt = Conexion.getInstancia().prepareStatement(query);
			ResultSet rs = smt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String descripcion = rs.getString("descripcion");
				Producto p = new Producto(id, descripcion);
				lista.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	@Override
	public Producto buscar(int id) {
		String query = "SELECT id, descripcion FROM productos WHERE id = ?";
		Producto producto = null;
		PreparedStatement smt;
		try {
			smt = Conexion.getInstancia().prepareStatement(query);
			smt.setInt(1, id);
			ResultSet rs = smt.executeQuery();
			while (rs.next()) {
				String descripcion = rs.getString("descripcion");
				producto = new Producto(id, descripcion);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return producto;
	}
}
