package cl.aiep.almacen.dao;

import cl.aiep.almacen.entities.Proveedor;

import java.util.List;

public interface ProveedorDao {
    Proveedor buscar(String id);
    List<Proveedor> listar();
    void agregar(Proveedor proveedor);
    void eliminar(String id);
}
