package com.example.proyectoventas.dao;

import com.example.proyectoventas.entities.Product;

import java.util.List;

public interface ProductDao {
    //Permite obtener una lista de los productos disponibles en la BD
    List<Product> listar();
    //Permite buscar un producto usando su código de producto
    Product buscar(String productCode);
    //Permite buscar productos con base en filtrado múltiple
    List<Product> listarFiltro(Product product);
}
