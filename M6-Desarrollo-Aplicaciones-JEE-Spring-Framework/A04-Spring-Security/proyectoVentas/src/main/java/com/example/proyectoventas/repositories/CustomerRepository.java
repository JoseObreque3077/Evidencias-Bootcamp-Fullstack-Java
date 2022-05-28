package com.example.proyectoventas.repositories;

import com.example.proyectoventas.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Optional<Customer> findByUserIs(String user);
}
