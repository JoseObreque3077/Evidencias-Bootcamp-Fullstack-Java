package cl.aiep.ejemplo.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import cl.aiep.ejemplo.model.Mascota;

// Esta anotación es IMPORTANTE: nos permite definir que esta clase es un Controller
@Controller
public class WebController {
	
	/*
	 * ModelAttribute es una anotación que permite enlazar un valor de retorno de un método
	 * a un atributo con nombre, el cual será utilizado para exponerse en una vista web
	 */
	@ModelAttribute("miMascota")
	public Mascota newMascota() {
		return new Mascota();
	}
	
	/*
	 * GetMapping es una anotación que permite manejar REQUEST de tipo GET.
	 */
	@GetMapping("")
	public String getIndex1() {
		return "index";
	}
	
	@GetMapping("/index")
	public String getIndex2() {
		return "index";
	}
	
	/*
	 * PostMapping es una anotación que permite manejar REQUEST de tipo POST.
	 * En este caso, el método recibe como parámetros:
	 * 1) El objeto de tipo Mascota, resultado del ModelAttribute y construido a partir de los datos del formulario.
	 * 2) Un objeto de tipo BindingResult, que nos indica si alguno de los campos del form tiene errores (validación de entradas).
	 * 3) Un objeto de tipo Model, que nos permite contener, como atributo, el objeto de tipo Mascota, para ser enviado
	 * a la tabla resumen.
	 */
	@PostMapping("/resumen")
	public String postIndex(
			@Valid @ModelAttribute("miMascota") Mascota mascota,
			BindingResult bindingResult,
			Model modelo) {
		
		if(bindingResult.hasErrors())
		{
			return "index";
		}
		else
		{
			modelo.addAttribute("m", mascota);
			return "resumen";
		}
	}
	
	@GetMapping("/resumen")
	public String getResumen() {
		return "resumen";
	}
}
