package cl.aiep.almacen.dao;

import cl.aiep.almacen.entities.Producto;

import java.util.List;

public interface ProductoDao {
    Producto buscar(int id);
    List<Producto> listar();
    void agregar(Producto producto);
    void eliminar(int id);
}
