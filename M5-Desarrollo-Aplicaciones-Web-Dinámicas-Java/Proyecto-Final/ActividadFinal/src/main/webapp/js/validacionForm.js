$(document).ready(function() {

    $("#formulario").validate({
        errorClass: "error fail-alert",
        validClass: "valid success-alert",
        submitHandler: function(form) {
	 		alert("Orden ingresada exitosamente!");
	 		form.submit();
	 	},
        rules: {
            nombre1: {
                required: true,
                pattern: "^([a-zA-ZáÁéÉíÍóÓúÚñ]+)$",
                minlength: 3,
                maxlength: 20
            },
            nombre2: {
                required: true,
                pattern: "^([a-zA-ZáÁéÉíÍóÓúÚñ]+)$",
                minlength: 3,
                maxlength: 20
            },
            apellido1: {
                required: true,
                pattern: "^([a-zA-ZáÁéÉíÍóÓúÚñ ]+)$",
                minlength: 3,
                maxlength: 20
            },
            apellido2: {
                required: true,
                pattern: "^([a-zA-ZáÁéÉíÍóÓúÚñ ]+)$",
                minlength: 3,
                maxlength: 20
            },
            region: {
                required: true
            },
            comuna: {
                required: true,
                pattern: "^([a-zA-ZáÁéÉíÍóÓúÚ ñ]+)$",
                minlength: 3,
                maxlength: 25
            },
            direccion: {
                required: true,
                pattern: "^([a-zA-ZáÁéÉíÍóÓúÚñ0-9 ]+)$",
                minlength: 3,
                maxlength: 50
            },
            telefono: {
                required: true,
                pattern: "^(\\d{9})$"
            },
            producto: {
                required: true
            },
            fecha: {
                required: true
            },
            rut: {
				required: true,
				pattern: "^(\\d{7}-(\\d|[K-k])|\\d{8}-(\\d|[K-k]))$"
			},
			observaciones: {
				required: true
			}
        },
        messages: {
            nombre1: {
                required: "Este campo es obligatorio!",
                pattern: "El texto ingresado debe contener solo letras.",
                minlength: "El texto ingresado debe contener mínimo 3 caracteres",
                maxlength: "El texto ingresado debe contener máximo 20 caracteres"
            },
            nombre2: {
                required: "Este campo es obligatorio!",
                pattern: "El texto ingresado debe contener solo letras.",
                minlength: "El texto ingresado debe contener mínimo 3 caracteres",
                maxlength: "El texto ingresado debe contener máximo 20 caracteres"       
            },
            apellido1: {
                required: "Este campo es obligatorio!",
                pattern: "El texto ingresado debe contener solo letras.",
                minlength: "El texto ingresado debe contener mínimo 3 caracteres",
                maxlength: "El texto ingresado debe contener máximo 20 caracteres"
            },
            apellido2: {
                required: "Este campo es obligatorio!",
                pattern: "El texto ingresado debe contener solo letras.",
                minlength: "El texto ingresado debe contener mínimo 3 caracteres",
                maxlength: "El texto ingresado debe contener máximo 20 caracteres"
            },
            region: {
                required: "Este campo es obligatorio!"
            },
            comuna: {
                required: "Este campo es obligatorio!",
                pattern: "El texto ingresado debe contener solo letras.",
                minlength: "El texto ingresado debe tener mínimo 3 caracteres",
                maxlength: "El texto ingresado debe tener máximo 25 caracteres",
            },
            direccion: {
                required: "Este campo es obligatorio!",
                pattern: "El texto ingresado no debe contener símbolos",
                minlength: "El texto ingresado debe tener mínimo 3 caracteres",
                maxlength: "El texto ingresado debe tener máximo 50 caracteres",
            },
            telefono: {
                required: "Este campo es obligatorio!",
                pattern: "El teléfono debe contener 9 dígitos."
            },
            fecha: {
                required: "Este campo es obligatorio!"
            },
            producto: {
                required: "Este campo es obligatorio!"
            },
            rut: {
				required: "Este campo es obligatorio!",
				pattern: "Formato de RUT inválido"
			},
			observaciones: {
				required: "Este campo es obligatorio!"
			}
        }
    });
  });