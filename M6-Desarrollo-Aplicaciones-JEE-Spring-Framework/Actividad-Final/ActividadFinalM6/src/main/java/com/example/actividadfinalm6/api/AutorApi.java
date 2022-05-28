package com.example.actividadfinalm6.api;

import com.example.actividadfinalm6.dao.AutorDao;
import com.example.actividadfinalm6.dto.AutorDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/autores")
@CrossOrigin
public class AutorApi {
    @Autowired
    private AutorDao dao;

    private final ModelMapper mapper = new ModelMapper();

    @GetMapping("/todos")
    public List<AutorDto> listar() {
        List<AutorDto> lista = new ArrayList<>();
        dao.listar().forEach(autor -> lista.add(mapper.map(autor, AutorDto.class)));
        return lista;
    }
}
