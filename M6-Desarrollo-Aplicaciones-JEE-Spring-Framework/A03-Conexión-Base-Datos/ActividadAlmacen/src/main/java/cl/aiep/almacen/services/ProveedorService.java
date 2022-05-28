package cl.aiep.almacen.services;

import cl.aiep.almacen.dao.ProveedorDao;
import cl.aiep.almacen.entities.Proveedor;
import cl.aiep.almacen.repositories.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorService implements ProveedorDao {
    @Autowired
    private ProveedorRepository repo;

    @Override
    public Proveedor buscar(String id) {
        return repo.getById(id);
    }

    @Override
    public List<Proveedor> listar() {
        return repo.findAll();
    }

    @Override
    public void agregar(Proveedor proveedor) {
        repo.save(proveedor);
    }

    @Override
    public void eliminar(String id) {
        repo.deleteById(id);
    }
}
