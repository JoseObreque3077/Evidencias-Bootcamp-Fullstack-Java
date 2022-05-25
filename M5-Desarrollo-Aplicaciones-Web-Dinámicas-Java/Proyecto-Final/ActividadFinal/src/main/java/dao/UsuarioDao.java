package dao;

import modelo.Usuario;

public interface UsuarioDao {
	
	public Usuario buscar(String user, String pass);
	
}
