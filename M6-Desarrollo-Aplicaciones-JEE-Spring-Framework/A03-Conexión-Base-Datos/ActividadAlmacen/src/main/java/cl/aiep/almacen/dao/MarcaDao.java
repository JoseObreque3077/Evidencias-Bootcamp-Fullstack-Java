package cl.aiep.almacen.dao;

import cl.aiep.almacen.entities.Marca;

import java.util.List;

public interface MarcaDao {
    Marca buscar(int id);
    List<Marca> listar();
    void agregar(Marca marca);
    void eliminar(int id);
}
