package com.example.actividadfinalm6.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name = "nombres", nullable = false, length = 50)
    private String nombres;
    @Column(name="apellido1", nullable = false, length = 50)
    private String apellido1;
    @Column(name = "apellido2", nullable = false, length = 50)
    private String apellido2;
    @Column(name="nacionalidad", nullable = false, length = 50)
    private String nacionalidad;
    @Column(name = "biografia", length = 250, unique = true)
    private String biografia;
    @OneToMany(mappedBy = "autor")
    private List<Libro> libros;
}
