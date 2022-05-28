package com.example.actividadfinalm6.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LibroDto {
    private String isbn;
    private String titulo;
    private String edicion;
    private String editorial;
    private String categoria;
    private Integer anio;
    private String idioma;
    private Integer paginas;
    private AutorDto autor;
}
