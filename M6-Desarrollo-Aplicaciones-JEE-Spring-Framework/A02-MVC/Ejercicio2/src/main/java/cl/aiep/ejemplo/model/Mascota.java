package cl.aiep.ejemplo.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Mascota {
	
	@NotNull(message="Este campo es obligatorio")
	@Min(value=1, message="El valor mínimo aceptado es 1")
	private Integer id;
	@NotEmpty(message="Este campo es obligatorio")
	@Size(min=3, max=30, message="Este campo acepta entre 3 y 30 caracteres")
	@Pattern(regexp="^[a-zA-ZñáÁéÉíÍóÓúÚ]+$", message="Este campo solo acepta letras")
	private String nombre;
	@NotNull(message="Este campo es obligatorio")
	@Size(min=2, message="Este campo es obligatorio")
	private String especie;
	@NotNull(message="Este campo es obligatorio")
	@Min(value=1, message="El valor mínimo aceptado es 1")
	@Max(value=2, message="El valor máximo aceptado es 20")
	private Integer edad;
	private boolean vacunado;
	
	public Mascota(Integer id, String nombre, String especie, Integer edad, boolean vacunado) {
		this.id = id;
		this.nombre = nombre;
		this.especie = especie;
		this.edad = edad;
		this.vacunado = vacunado;
	}

	public Mascota() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public boolean isVacunado() {
		return vacunado;
	}

	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}
}
