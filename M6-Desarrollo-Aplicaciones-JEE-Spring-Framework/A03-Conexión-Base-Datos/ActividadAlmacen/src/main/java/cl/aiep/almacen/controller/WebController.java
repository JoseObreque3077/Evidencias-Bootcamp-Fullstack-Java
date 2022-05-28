package cl.aiep.almacen.controller;

import cl.aiep.almacen.entities.Marca;
import cl.aiep.almacen.entities.Producto;
import cl.aiep.almacen.entities.Proveedor;
import cl.aiep.almacen.services.MarcaService;
import cl.aiep.almacen.services.ProductoService;
import cl.aiep.almacen.services.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class WebController {

    @ModelAttribute("miProducto")
    public Producto newProducto() {
        return new Producto();
    }

    @ModelAttribute("miMarca")
    public Marca newMarca() {
        return new Marca();
    }

    @ModelAttribute("miProveedor")
    public Proveedor newProveedor() {
        return new Proveedor();
    }
    @Autowired
    private ProductoService productoService;
    @Autowired
    private MarcaService marcaService;
    @Autowired
    private ProveedorService proveedorService;

    @GetMapping("")
    public String getResumenProd(Model model) {
        model.addAttribute("productos", productoService.listar());
        return "resumenProductos";
    }

    @GetMapping("/FormularioProductos")
    public String getFormProd(Model model) {
        model.addAttribute("marcas", marcaService.listar());
        model.addAttribute("proveedores", proveedorService.listar());
        return "formProductos";
    }

    @GetMapping("/FormularioMarcas")
    public String getFormMarcas() {
        return "formMarcas";
    }

    @GetMapping("/ResumenMarcas")
    public String getResumenMarcas(Model model) {
        model.addAttribute("marcas", marcaService.listar());
        return "resumenMarcas";
    }

    @GetMapping("/ResumenProveedores")
    public String getResumenProveedores(Model model) {
        model.addAttribute("proveedores", proveedorService.listar());
        return "resumenProveedores";
    }

    @PostMapping("/ResumenProductos")
    public String postFormProd(@Valid @ModelAttribute("miProducto") Producto producto,
                            BindingResult bindingResult,
                            Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("marcas", marcaService.listar());
            model.addAttribute("proveedores", proveedorService.listar());
            return "formProductos";
        }
        else {
            productoService.agregar(producto);
            model.addAttribute("productos", productoService.listar());
            return "resumenProductos";
        }
    }
    @PostMapping("/ResumenMarcas")
    public String postFormMarca(@Valid @ModelAttribute("miMarca") Marca marca,
                                BindingResult bindingResult,
                                Model model) {
        if (bindingResult.hasErrors()) {
            return "formMarcas";
        }
        else {
            marcaService.agregar(marca);
            model.addAttribute("marcas", marcaService.listar());
            return "resumenMarcas";
        }
    }
}
