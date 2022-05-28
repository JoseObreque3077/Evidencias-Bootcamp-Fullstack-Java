package com.example.actividadfinalm6.dao;

import com.example.actividadfinalm6.entities.Autor;

import java.util.List;

public interface AutorDao {
    Autor buscar(Integer id);
    List<Autor> listar();
}
