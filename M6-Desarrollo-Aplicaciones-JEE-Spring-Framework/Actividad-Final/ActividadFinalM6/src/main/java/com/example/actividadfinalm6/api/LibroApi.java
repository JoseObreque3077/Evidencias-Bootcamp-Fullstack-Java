package com.example.actividadfinalm6.api;

import com.example.actividadfinalm6.dao.LibroDao;
import com.example.actividadfinalm6.dto.LibroDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/libros")
@CrossOrigin
public class LibroApi {
    @Autowired
    private LibroDao dao;

    private final ModelMapper mapper = new ModelMapper();

    @GetMapping(value = "/todos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<LibroDto> listar() {
        List<LibroDto> lista = new ArrayList<>();
        dao.listar().forEach(libro -> lista.add(mapper.map(libro, LibroDto.class)));
        return lista;
    }

}
