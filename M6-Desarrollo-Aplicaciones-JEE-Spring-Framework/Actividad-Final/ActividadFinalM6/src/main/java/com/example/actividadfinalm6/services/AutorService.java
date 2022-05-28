package com.example.actividadfinalm6.services;

import com.example.actividadfinalm6.dao.AutorDao;
import com.example.actividadfinalm6.entities.Autor;
import com.example.actividadfinalm6.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService implements AutorDao {
    @Autowired
    private AutorRepository repo;

    @Override
    public Autor buscar(Integer id) {
        return repo.getById(id);
    }

    @Override
    public List<Autor> listar() {
        return repo.findAll();
    }
}
