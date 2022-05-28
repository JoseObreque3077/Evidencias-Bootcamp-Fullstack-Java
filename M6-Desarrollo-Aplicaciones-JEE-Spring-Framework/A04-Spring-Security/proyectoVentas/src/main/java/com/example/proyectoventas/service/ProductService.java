package com.example.proyectoventas.service;

import com.example.proyectoventas.dao.ProductDao;
import com.example.proyectoventas.entities.Product;
import com.example.proyectoventas.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements ProductDao {
    //Conexión con el repo (así se puede acceder a sus métodos)
    @Autowired
    private ProductRepository repo;

    @Override
    public List<Product> listar() {
        return repo.findAll();
    }

    @Override
    public Product buscar(String productCode) {
        return repo.findById(productCode).orElseThrow();
    }

    @Override
    public List<Product> listarFiltro(Product product) {
        /*
        Busca todos los registros desde la tabla Products que tengan coincidencias con los atributos
        de la entidad Product pasada como "ejemplo" (parámetros no nulos).
         */
        return repo.findAll(Example.of(product));
    }
}
