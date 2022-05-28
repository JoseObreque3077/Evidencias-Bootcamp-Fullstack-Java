package com.example.actividadfinalm6.controller;

import com.example.actividadfinalm6.restTemplate.RestTemplateProvider;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

    @GetMapping("/")
    public String getWelcome(Model model) {
        RestTemplateProvider restTemplateProvider = new RestTemplateProvider();
        model.addAttribute("libros", restTemplateProvider.getLibrosFromApi());
        return "welcome";
    }

    @GetMapping("/autores")
    public String getAutores(Model model) {
        RestTemplateProvider restTemplateProvider = new RestTemplateProvider();
        model.addAttribute("autores", restTemplateProvider.getAutoresFromApi());
        return "listaAutores";
    }

}
