package com.example.proyectoventas.repositories;

import com.example.proyectoventas.entities.Productline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductlineRepository extends JpaRepository<Productline, String> {
}
