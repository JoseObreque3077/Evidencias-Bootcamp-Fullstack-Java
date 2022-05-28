package com.example.actividadfinalm6.dao;

import com.example.actividadfinalm6.entities.Libro;

import java.util.List;

public interface LibroDao {
    Libro buscar(String isbn);
    List<Libro> listar();
}
