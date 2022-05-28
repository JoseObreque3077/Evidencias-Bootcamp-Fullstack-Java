package com.example.actividadfinalm6.repositories;

import com.example.actividadfinalm6.entities.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, String> {
}
