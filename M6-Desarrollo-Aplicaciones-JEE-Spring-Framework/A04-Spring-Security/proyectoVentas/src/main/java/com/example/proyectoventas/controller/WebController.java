package com.example.proyectoventas.controller;

import com.example.proyectoventas.entities.Product;
import com.example.proyectoventas.service.ProductService;
import com.example.proyectoventas.service.ProductlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {

    @Autowired
    private ProductService productService;
    @Autowired
    private ProductlineService productlineService;

    @GetMapping("/")
    public String getIndex(Model model) {
        //Lista todos los productos
        model.addAttribute("productos", productService.listar());
        //Lista todos los productLine disponibles (para poblar el select respectivo)
        model.addAttribute("lineas", productlineService.listar());
        //Al principio, no hay elementos seleccionados en los filtros de la tabla resumen
        model.addAttribute("escalaSelec", "");
        model.addAttribute("lineaSelec", "");
        //Redirige a index.html
        return "index";
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

    @PostMapping("/filtro")
    public ModelAndView postFiltro(@RequestParam("productScale") String productScale,
                                   @RequestParam("productLine") String productLine,
                                   ModelAndView model) {
        Product p = new Product(); //Se crea un objeto de tipo Producto "vacío"
        /*
        Si se selecciona algo distinto a la opción "todos", entonces se asigna el valor de la opción seleccionada
        al producto creado anteriormente. Esto aplica para ambos filtros disponibles.
         */
        if (!productScale.isEmpty()) {
            p.setProductScale(productScale);
        }
        if (!productLine.isEmpty()) {
            p.setProductline(productlineService.buscar(productLine));
        }
        model.setViewName("index"); //Redirige hacia index.html
        model.addObject("escalaSelec", productScale);
        model.addObject("lineaSelec", productLine);
        model.addObject("productos", productService.listarFiltro(p)); //Se listan los productos filtrados
        model.addObject("lineas", productlineService.listar()); //Se listan las productLine disponibles (para poblar el select)
        return model;
    }
}
