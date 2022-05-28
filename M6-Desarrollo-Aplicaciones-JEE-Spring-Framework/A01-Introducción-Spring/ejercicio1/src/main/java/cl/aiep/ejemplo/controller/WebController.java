package cl.aiep.ejemplo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
	
	@PostMapping("/resumen")
	public String postIndex(
			@RequestParam("idMascota") int id,
			@RequestParam("nombre") String nombre,
			@RequestParam("especie") String especie,
			@RequestParam("edad") int edad,
			@RequestParam(name="vacuna", required=false) boolean vacuna,
			Model modelo) {
		
		modelo.addAttribute("id", id);
		modelo.addAttribute("nombre", nombre);
		modelo.addAttribute("especie", especie);
		modelo.addAttribute("edad", edad);
		modelo.addAttribute("vacunado", vacuna);
		return "resumen";
	}
	
	@GetMapping("/resumen")
	public String getIndex() {
		return "resumen";
	}
}


