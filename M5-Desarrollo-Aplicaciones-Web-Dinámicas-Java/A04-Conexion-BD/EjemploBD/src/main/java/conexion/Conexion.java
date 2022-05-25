package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	//Constructor privado: no se puede instanciar
	private Conexion() {
		
	}
	
	private static Connection instancia;
	
	public synchronized static Connection getInstancia() {
		if (instancia == null) {
			String user = "user";
			String pass = "12345";
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/automotora";
			
			try {
				Class.forName(driver);
				instancia = DriverManager.getConnection(url, user, pass);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		return instancia;
	}

}
