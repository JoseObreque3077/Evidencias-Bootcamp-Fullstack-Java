package com.example.proyectoventas.repositories;

import com.example.proyectoventas.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    //Busca empleados por email (query personalizada)
    Optional<Employee> findByEmailIs(String email);
}
