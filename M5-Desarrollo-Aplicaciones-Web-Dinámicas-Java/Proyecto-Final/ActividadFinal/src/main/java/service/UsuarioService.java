package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexion.Conexion;
import dao.UsuarioDao;
import modelo.Usuario;

public class UsuarioService implements UsuarioDao{
	
	@Override
	public Usuario buscar(String user, String pass) {
		Usuario usuario = null;
		String query = "SELECT id, user_name, pass, rol, rut FROM usuarios WHERE user_name = ? AND pass = ?";
		PreparedStatement smt;
		try {
			smt = Conexion.getInstancia().prepareStatement(query);
			smt.setString(1, user);
			smt.setString(2, pass);
			ResultSet rs = smt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				int rol = rs.getInt("rol");
				String rut = rs.getString("rut");
				usuario = new Usuario(id, user, pass, rol, rut);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usuario;
	}
}
