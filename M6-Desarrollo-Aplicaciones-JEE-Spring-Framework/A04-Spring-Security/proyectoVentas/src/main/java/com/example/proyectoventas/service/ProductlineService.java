package com.example.proyectoventas.service;

import com.example.proyectoventas.dao.ProductlineDao;
import com.example.proyectoventas.entities.Productline;
import com.example.proyectoventas.repositories.ProductlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductlineService implements ProductlineDao {

    @Autowired
    private ProductlineRepository repo;

    @Override
    public List<Productline> listar() {
        return repo.findAll();
    }

    @Override
    public Productline buscar(String productLine) {
        return repo.getById(productLine);
    }
}
