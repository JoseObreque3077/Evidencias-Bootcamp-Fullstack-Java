package cl.aiep.almacen.services;

import cl.aiep.almacen.dao.MarcaDao;
import cl.aiep.almacen.entities.Marca;
import cl.aiep.almacen.repositories.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaService implements MarcaDao {
    @Autowired
    private MarcaRepository repo;

    @Override
    public Marca buscar(int id) {
        return repo.getById(id);
    }

    @Override
    public List<Marca> listar() {
        return repo.findAll();
    }

    @Override
    public void agregar(Marca marca) {
        repo.save(marca);
    }

    @Override
    public void eliminar(int id) {
        repo.deleteById(id);
    }
}
