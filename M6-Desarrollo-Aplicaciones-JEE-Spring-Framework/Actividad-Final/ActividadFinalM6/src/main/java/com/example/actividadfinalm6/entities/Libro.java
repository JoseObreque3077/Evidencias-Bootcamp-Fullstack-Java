package com.example.actividadfinalm6.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Libro {
    @Id
    @Column(name="isbn", length = 17)
    private String isbn;
    @Column(name="titulo", nullable = false, length = 75)
    private String titulo;
    @Column(name = "edicion", nullable = false)
    private String edicion;
    @Column(name = "editorial", nullable = false, length = 75)
    private String editorial;
    @Column(name = "categoria", nullable = false, length = 50)
    private String categoria;
    @Column(name = "anio", nullable = false)
    private Integer anio;
    @Column(name = "idioma", nullable = false, length = 30)
    private String idioma;
    @Column(name = "paginas", nullable = false)
    private Integer paginas;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "autor_fk", nullable = false)
    private Autor autor;
}
