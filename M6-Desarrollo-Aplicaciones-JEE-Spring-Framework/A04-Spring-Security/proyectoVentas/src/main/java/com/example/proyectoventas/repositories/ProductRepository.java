package com.example.proyectoventas.repositories;

import com.example.proyectoventas.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
