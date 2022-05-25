package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexion.Conexion;
import dao.EstadoDao;
import modelo.Estado;

public class EstadoService implements EstadoDao{
	
	@Override
	public List<Estado> listar() {
		List<Estado> lista = new ArrayList<Estado>();
		String query = "SELECT id, descripcion FROM estados ORDER BY id";
		PreparedStatement smt;
		try {
			smt = Conexion.getInstancia().prepareStatement(query);
			ResultSet rs = smt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String descripcion = rs.getString("descripcion");
				Estado est = new Estado(id, descripcion);
				lista.add(est);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	@Override
	public Estado buscar(int id) {
		String query = "SELECT id, descripcion FROM estados WHERE id = ?";
		Estado estado = null;
		PreparedStatement smt;
		try {
			smt = Conexion.getInstancia().prepareStatement(query);
			smt.setInt(1, id);
			ResultSet rs = smt.executeQuery();
			while (rs.next()) {
				String descripcion = rs.getString("descripcion");
				estado = new Estado(id, descripcion);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return estado;
	}
}
