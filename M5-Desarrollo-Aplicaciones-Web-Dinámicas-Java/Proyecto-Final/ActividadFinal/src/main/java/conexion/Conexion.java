package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	//Constructor privado
	private Conexion() {
		
	}
	
	//Variable estática privada
	private static Connection instancia;
	
	public synchronized static Connection getInstancia() {
		if (instancia == null) {
			String user = "user";
			String pass = "12345";
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/servicio_tecnico";
			
			try {
				Class.forName(driver);
				instancia = DriverManager.getConnection(url, user, pass);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return instancia;
	}
}
