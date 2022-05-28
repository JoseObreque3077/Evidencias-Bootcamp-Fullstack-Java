package cl.aiep.almacen.services;

import cl.aiep.almacen.dao.ProductoDao;
import cl.aiep.almacen.entities.Producto;
import cl.aiep.almacen.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements ProductoDao {

    @Autowired
    private ProductoRepository repo;

    @Override
    public Producto buscar(int id) {
        return repo.getById(id);
    }

    @Override
    public List<Producto> listar() {
        return repo.findAll();
    }

    @Override
    public void agregar(Producto producto) {
        repo.save(producto);
    }

    @Override
    public void eliminar(int id) {
        repo.deleteById(id);
    }
}
