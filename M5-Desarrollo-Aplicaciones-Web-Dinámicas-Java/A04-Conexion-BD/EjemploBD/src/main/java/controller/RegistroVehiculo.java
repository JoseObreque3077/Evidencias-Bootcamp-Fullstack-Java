package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexion.Conexion;
import modelo.Vehiculo;

public class RegistroVehiculo {
	public int agregar(Vehiculo vehiculo) {
		String query = "insert into vehiculo (patente,marca,anio,estado,tipo) values(?,?,?,?,?)";
		try {
			PreparedStatement smt = Conexion.getInstancia().prepareStatement(query);
			smt.setString(1, vehiculo.getPatente());
			smt.setString(2, vehiculo.getMarca());
			smt.setInt(3, vehiculo.getAnio());
			smt.setBoolean(4, vehiculo.isEstado());
			smt.setString(5, vehiculo.getTipo());
			
			int r = smt.executeUpdate();
			return r;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public List<Vehiculo> listar() {
		List<Vehiculo> lista = new ArrayList();
		String query = "select patente,marca,anio,estado,tipo from vehiculo order by patente";
		try {
			PreparedStatement smt = Conexion.getInstancia().prepareStatement(query);
			ResultSet rs = smt.executeQuery();
			while (rs.next()) {
				String patente = rs.getString("patente");
				String marca = rs.getString("marca");
				int anio = rs.getInt("anio");
				boolean estado = rs.getBoolean("estado");
				String tipo = rs.getString("tipo");
				
				Vehiculo v = new Vehiculo(patente, marca, anio, estado, tipo);
				lista.add(v);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}
}
