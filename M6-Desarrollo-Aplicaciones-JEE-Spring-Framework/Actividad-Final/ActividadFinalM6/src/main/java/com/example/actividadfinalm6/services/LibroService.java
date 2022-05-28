package com.example.actividadfinalm6.services;

import com.example.actividadfinalm6.dao.LibroDao;
import com.example.actividadfinalm6.entities.Libro;
import com.example.actividadfinalm6.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LibroService implements LibroDao {
    @Autowired
    private LibroRepository repo;

    @Override
    public Libro buscar(String isbn) {
        return repo.getById(isbn);
    }

    @Override
    public List<Libro> listar() {
        return repo.findAll();
    }
}
