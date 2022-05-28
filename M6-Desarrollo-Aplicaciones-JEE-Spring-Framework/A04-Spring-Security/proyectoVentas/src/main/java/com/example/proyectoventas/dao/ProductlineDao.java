package com.example.proyectoventas.dao;

import com.example.proyectoventas.entities.Productline;

import java.util.List;

public interface ProductlineDao {

    List<Productline> listar();

    Productline buscar(String productLine);
}
