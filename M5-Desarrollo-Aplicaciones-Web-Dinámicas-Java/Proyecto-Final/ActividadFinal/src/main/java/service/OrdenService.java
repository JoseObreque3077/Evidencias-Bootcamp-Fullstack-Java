package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexion.Conexion;
import dao.OrdenDao;
import modelo.Estado;
import modelo.Orden;
import modelo.Producto;
import modelo.Region;

public class OrdenService implements OrdenDao{
	
	@Override
	public int agregar(Orden orden) {
		String query = "INSERT INTO ordenes (nombre1, nombre2, apellido1, apellido2, direccion, comuna, region, telefono, producto, fecha_ingreso, estado, fecha_mod, observaciones, rut) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement smt;
		try {
			smt = Conexion.getInstancia().prepareStatement(query);
			smt.setString(1, orden.getNombre1());
			smt.setString(2, orden.getNombre2());
			smt.setString(3, orden.getApellido1());
			smt.setString(4, orden.getApellido2());
			smt.setString(5, orden.getDireccion());
			smt.setString(6, orden.getComuna());
			smt.setInt(7, orden.getRegion().getId());
			smt.setString(8, orden.getTelefono());
			smt.setInt(9, orden.getProducto().getId());
			smt.setString(10, orden.getFechaIng());
			smt.setInt(11, orden.getEstado().getId());
			smt.setString(12, orden.getFechaMod());
			smt.setString(13, orden.getObservaciones());
			smt.setString(14, orden.getRut());
			
			int r = smt.executeUpdate();
			return r;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public List<Orden> listar() {
		List<Orden> lista = new ArrayList<Orden>();
		String query = "SELECT * FROM ordenes";
		PreparedStatement smt;
		try {
			smt = Conexion.getInstancia().prepareStatement(query);
			ResultSet rs = smt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String nombre1 = rs.getString("nombre1");
				String nombre2 = rs.getString("nombre2");
				String apellido1 = rs.getString("apellido1");
				String apellido2 = rs.getString("apellido2");
				String direccion = rs.getString("direccion");
				String comuna = rs.getString("comuna");
				int regionId = rs.getInt("region");
				String telefono = rs.getString("telefono");
				int productoId = rs.getInt("producto");
				String fechaIng = rs.getString("fecha_ingreso");
				int estadoId = rs.getInt("estado");
				String fechaMod = rs.getString("fecha_mod");
				String observaciones = rs.getString("observaciones");
				String rut = rs.getString("rut");
				
				RegionService registroRegion = new RegionService();
				Region region = registroRegion.buscar(regionId);
				ProductoService registroProducto = new ProductoService();
				Producto producto = registroProducto.buscar(productoId);
				EstadoService registroEstado = new EstadoService();
				Estado estado = registroEstado.buscar(estadoId);
				
				Orden ord = new Orden(id, nombre1, nombre2, apellido1, apellido2, rut, direccion, comuna, region,
						telefono, producto, fechaIng, estado, fechaMod, observaciones);
				lista.add(ord);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	@Override
	public List<Orden> listar(String rut) {
		List<Orden> lista = new ArrayList<Orden>();
		String query = "SELECT * FROM ordenes WHERE rut = ?";
		PreparedStatement smt;
		try {
			smt = Conexion.getInstancia().prepareStatement(query);
			smt.setString(1, rut);
			ResultSet rs = smt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String nombre1 = rs.getString("nombre1");
				String nombre2 = rs.getString("nombre2");
				String apellido1 = rs.getString("apellido1");
				String apellido2 = rs.getString("apellido2");
				String direccion = rs.getString("direccion");
				String comuna = rs.getString("comuna");
				int regionId = rs.getInt("region");
				String telefono = rs.getString("telefono");
				int productoId = rs.getInt("producto");
				String fechaIng = rs.getString("fecha_ingreso");
				int estadoId = rs.getInt("estado");
				String fechaMod = rs.getString("fecha_mod");
				String observaciones = rs.getString("observaciones");
				
				RegionService registroRegion = new RegionService();
				Region region = registroRegion.buscar(regionId);
				ProductoService registroProducto = new ProductoService();
				Producto producto = registroProducto.buscar(productoId);
				EstadoService registroEstado = new EstadoService();
				Estado estado = registroEstado.buscar(estadoId);
				
				Orden ord = new Orden(id, nombre1, nombre2, apellido1, apellido2, rut, direccion, comuna, region,
						telefono, producto, fechaIng, estado, fechaMod, observaciones);
				lista.add(ord);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}

	@Override
	public Orden buscar(int id) {
		Orden orden = null;
		String query = "SELECT * FROM ordenes WHERE id = ?";
		PreparedStatement smt;
		try {
			smt = Conexion.getInstancia().prepareStatement(query);
			smt.setInt(1, id);
			ResultSet rs = smt.executeQuery();
			while (rs.next()) {
				String nombre1 = rs.getString("nombre1");
				String nombre2 = rs.getString("nombre2");
				String apellido1 = rs.getString("apellido1");
				String apellido2 = rs.getString("apellido2");
				String rut = rs.getString("rut");
				String direccion = rs.getString("direccion");
				String comuna = rs.getString("comuna");
				int regionId = rs.getInt("region");
				String telefono = rs.getString("telefono");
				int productoId = rs.getInt("producto");
				String fechaIng = rs.getString("fecha_ingreso");
				int estadoId = rs.getInt("estado");
				String fechaMod = rs.getString("fecha_mod");
				String observaciones = rs.getString("observaciones");
				
				RegionService registroRegion = new RegionService();
				Region region = registroRegion.buscar(regionId);
				ProductoService registroProducto = new ProductoService();
				Producto producto = registroProducto.buscar(productoId);
				EstadoService registroEstado = new EstadoService();
				Estado estado = registroEstado.buscar(estadoId);
				
				orden = new Orden(id, nombre1, nombre2, apellido1, apellido2, rut, direccion, comuna, region,
						telefono, producto, fechaIng, estado, fechaMod, observaciones);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return orden;
	}

	@Override
	public int modificar(Orden orden) {
		String query = "UPDATE ordenes SET estado = ?, fecha_mod = ?, observaciones = ? WHERE id = ?";
		PreparedStatement smt;
		try {
			smt = Conexion.getInstancia().prepareStatement(query);
			smt.setInt(1, orden.getEstado().getId());
			smt.setString(2, orden.getFechaMod());
			smt.setString(3, orden.getObservaciones());
			smt.setInt(4, orden.getId());
			int r = smt.executeUpdate();
			return r;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	
}
