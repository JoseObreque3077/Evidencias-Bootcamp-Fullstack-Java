$(document).ready(function() {
    
    $("#formulario").validate({
        //errorClass: "error fail-alert",
        //validClass: "valid success-alert",
        submitHandler: function(form) {
            if (confirm('Registro exitoso!')) {
                form.submit();
            }
        },
        rules: {
            nombres: {
                required: true,
                pattern: "[a-zA-ZàáâäãåąčćęèéêëėįìíîïłńòóôöõøùúûüųūÿýżźñçčšžÀÁÂÄÃÅĄĆČĖĘÈÉÊËÌÍÎÏĮŁŃÒÓÔÖÕØÙÚÛÜŲŪŸÝŻŹÑßÇŒÆČŠŽ∂ð ,.'-]{1,48}",
                minlength: 3,
                maxlength: 35,
            },
            apellido1: {
                required: true,
                pattern: "[a-zA-ZàáâäãåąčćęèéêëėįìíîïłńòóôöõøùúûüųūÿýżźñçčšžÀÁÂÄÃÅĄĆČĖĘÈÉÊËÌÍÎÏĮŁŃÒÓÔÖÕØÙÚÛÜŲŪŸÝŻŹÑßÇŒÆČŠŽ∂ð ,.'-]{1,48}",
                minlength: 3,
                maxlength: 35,
            },
            apellido2: {
                required: true,
                pattern: "[a-zA-ZàáâäãåąčćęèéêëėįìíîïłńòóôöõøùúûüųūÿýżźñçčšžÀÁÂÄÃÅĄĆČĖĘÈÉÊËÌÍÎÏĮŁŃÒÓÔÖÕØÙÚÛÜŲŪŸÝŻŹÑßÇŒÆČŠŽ∂ð ,.'-]{1,48}",
                minlength: 3,
                maxlength: 35,
            },
            edad: {
                required: true,
                number: true,
                min: 18,
                max: 75
            },
            region: {
                required: true
            },
            comuna: {
                required: true,
                pattern: "[a-zA-ZàáâäãåąčćęèéêëėįìíîïłńòóôöõøùúûüųūÿýżźñçčšžÀÁÂÄÃÅĄĆČĖĘÈÉÊËÌÍÎÏĮŁŃÒÓÔÖÕØÙÚÛÜŲŪŸÝŻŹÑßÇŒÆČŠŽ∂ð ,.'-]{1,48}",
                minlength: 3,
                maxlength: 30,
            },
            direccion: {
                required: true,
                pattern: "^[\.a-zA-Z0-9 ]*$",
                minlength: 3,
                maxlength: 30,
            },
            texto1: {
                required: {
                    depends: function() {
                        return $("input[name=alergias]:checked").val() == 1;
                    }
                }
            }
        },
        messages: {
            nombres: {
                required: "Este campo es obligatorio!",
                pattern: "El texto ingresado no debe contener símbolos o números",
                minlength: "El texto ingresado debe tener mínimo 3 caracteres",
                maxlength: "El texto ingresado debe tener máximo 35 caracteres",
                
            },
            apellido1: {
                required: "Este campo es obligatorio!",
                pattern: "El texto ingresado no debe contener símbolos o números",
                minlength: "El texto ingresado debe tener mínimo 3 caracteres",
                maxlength: "El texto ingresado debe tener máximo 35 caracteres",
            },
            apellido2: {
                required: "Este campo es obligatorio!",
                pattern: "El texto ingresado no debe contener símbolos o números",
                minlength: "El texto ingresado debe tener mínimo 3 caracteres",
                maxlength: "El texto ingresado debe tener máximo 35 caracteres",
            },
            edad: {
                required: "Este campo es obligatorio!",
                number: "Este campo solo admite valores numéricos!",
                min: "Debes ser mayor de edad!",
                max: "Tu edad debe ser de 75 años máximo!"
            },
            region: {
                required: "Este campo es obligatorio!"
            },
            comuna: {
                required: "Este campo es obligatorio!",
                pattern: "El texto ingresado no debe contener símbolos o números",
                minlength: "El texto ingresado debe tener mínimo 3 caracteres",
                maxlength: "El texto ingresado debe tener máximo 30 caracteres",
            },
            direccion: {
                required: "Este campo es obligatorio!",
                pattern: "El texto ingresado no debe contener símbolos",
                minlength: "El texto ingresado debe tener mínimo 3 caracteres",
                maxlength: "El texto ingresado debe tener máximo 30 caracteres",
            },
            texto1: {
                required: "Campo obligatorio en caso de tener alergias!"
            }
        }
    });
  });