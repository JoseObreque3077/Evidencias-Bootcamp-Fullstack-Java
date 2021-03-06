$(document).ready(function(){
    //Al cargar la página, la tabla de registros se mantiene oculta por defecto
    $("#tablaregistros").hide();
    //Validación del formulario
    $("#formulario").validate({
        //Asignación de formatos de entrada válida y errónea
        errorClass: "error fail-alert",
        validClass: "valid success-alert",
        submitHandler: function(form) {
            // Almacenamiento de los valores del formulario
            let valorNombre = $("#nombre").val();
            let valorApellido = $("#apellido").val();
            let valorRut = $("#rut").val();
            let valorDireccion = $("#direccion").val();
            let valorComuna = $("#comuna").val();
            let valorTipoVehiculo = $("#tipoVehiculo").val();
            let valorMarca = $("#marca").val();
            let valorModelo = $("#modelo").val();
            let valorAño = $("#año").val();
            let valorRT = $("#revTec").val();
            let valorTrabajador = $("#personal").val();
            let valorFecha = $("#fecha").val();
            let valorHora = $("#hora").val();
            // Asignación de valor de variable para el lavado exterior (SI o NO)
            let valorNeto = 0;
            let valorLavadoExt = "NO";
            if ($("#lavadoExterior").is(":checked")) {
                valorLavadoExt = "SI";
                valorNeto += 7000;
            } else {
                valorLavadoExt = "NO";
            }
            // Asignación de valor de variable para el lavado de motor (SI o NO)
            let valorLavadoMot = "NO";
            if ($("#lavadoMotor").is(":checked")) {
                valorLavadoMot = "SI";
                valorNeto += 5000;
            } else {
                valorLavadoMot = "NO";
            }
            // Calculo de impuestos y total a pagar
            let impuesto = valorNeto * 0.19;
            let totalPagar = valorNeto + impuesto;
            // Mensaje por pantalla
            let mensaje = `Resumen:\nCliente: ${valorNombre} ${valorApellido}\nValor Neto Servicio: $${valorNeto}\nIVA: $${impuesto}\nTotal a Pagar: $${totalPagar}`;
            if (confirm(mensaje)) {
                // Guardado de string que representa la fila de una tabla
                let filaTabla = "<tr><td>" +
                valorNombre + "</td><td>" +
                valorApellido + "</td><td>" +
                valorRut + "</td><td>" +
                valorDireccion + "</td><td>" +
                valorComuna + "</td><td>" +
                valorTipoVehiculo + "</td><td>" +
                valorMarca + "</td><td>" +
                valorModelo + "</td><td>" +
                valorAño + "</td><td>" +
                valorRT + "</td><td>" +
                valorLavadoExt + "</td><td>" +
                valorLavadoMot + "</td><td>" +
                valorTrabajador + "</td><td>" +
                valorFecha + "</td><td>" +
                valorHora + "</td><td>" +
                valorNeto + "</td><td>" +
                impuesto + "</td><td>" +
                totalPagar + "</td></tr>";
                //Adición de la fila a la tabla
                $("#cuerpoTabla").append(filaTabla); 
                //Reseteo de los campos del formulario
                form.reset();
            }
        },
        rules: {
            nombre: {
                //Obligatorio, solo letras, mínimo 3 caracteres, máximo 30 caracteres
                required: true,
                pattern: "[a-zA-ZàáâäãåąčćęèéêëėįìíîïłńòóôöõøùúûüųūÿýżźñçčšžÀÁÂÄÃÅĄĆČĖĘÈÉÊËÌÍÎÏĮŁŃÒÓÔÖÕØÙÚÛÜŲŪŸÝŻŹÑßÇŒÆČŠŽ∂ð]{1,48}",
                minlength: 3,
                maxlength: 30
            },
            apellido: {
                //Obligatorio, solo letras, mínimo 3 caracteres, máximo 30 caracteres
                required: true,
                pattern: "[a-zA-ZàáâäãåąčćęèéêëėįìíîïłńòóôöõøùúûüųūÿýżźñçčšžÀÁÂÄÃÅĄĆČĖĘÈÉÊËÌÍÎÏĮŁŃÒÓÔÖÕØÙÚÛÜŲŪŸÝŻŹÑßÇŒÆČŠŽ∂ð]{1,48}",
                minlength: 3,
                maxlength: 30
            },
            rut: {
                //Obligatorio, 8 dígitos antes del guión, 1 dígito después del guión (incluido k o K)
                required: true,
                pattern: "[0-9]{8}-[0-9kK]{1}",
            },
            direccion: {
                //Obligatiorio, solo letras, números o espacios, mínimo 3 caracteres, máximo 80 caracteres
                required: true,
                pattern: "^[\.a-zA-Z0-9 ]*$",
                minlength: 3,
                maxlength: 80,
            },
            comuna: {
                //Obligatorio
                required: true
            },
            tipoVehiculo: {
                //Obligatorio
                required: true,
            },
            marca: {
                //Obligatorio, solo letras, mínimo 3 caracteres, máximo 20 caracteres
                required: true,
                pattern: "[a-zA-Z]{1,48}",
                minlength: 3,
                maxlength: 20
            },
            modelo: {
                //Obligatorio, solo letras, mínimo 3 caracteres, máximo 20 caracteres
                required: true,
                pattern: "[a-zA-Z]{1,48}",
                minlength: 3,
                maxlength: 20
            },
            año: {
                //Obligatorio, solo números, restringido a 4 caracteres
                required: true,
                number: true,
                minlength: 4,
                maxlength: 4
            },
            revTec: {
                //Obligatorio
                required: true
            },
            'lavado[]': {
                //Obligatorio, mínimo 1 opción seleccionada (checkboxes para elegir tipo de lavado)
                required: true,
                minlength: 1
            },
            personal: {
                //Obligatorio
                required: true
            },
            fecha: {
                //Obligatorio
                required: true
            },
            hora: {
                //Obligatorio
                required: true
            }
        },
        messages: {
            //Definición de mensajes de error personalizados, dependiendo de los requisitos anteriroes
            nombre: {
                required: "Este campo es obligatorio",
                pattern: "El campo solo puede contener letras",
                minlength: "Este campo debe tener al menos 3 caracteres",
                maxlength: "Este campo admite máximo 30 caracteres"
            },
            apellido: {
                required: "Este campo es obligatorio",
                pattern: "Este campo solo puede contener letras",
                minlength: "Este campo debe tener al menos 3 caracteres",
                maxlength: "Este campo admite máximo 30 caracteres"
            },
            rut: {
                required: "Este campo es obligatorio",
                pattern: "Formato de RUT incorrecto"
            },
            direccion: {
                required: "Este campo es obligatorio",
                pattern: "Este campo solo puede contener letras, espacios y números",
                minlength: "Este campo debe tener al menos 3 caracteres",
                maxlength: "Este campo admite máximo 80 caracteres"
            },
            comuna: {
                required: "Este campo es obligatorio"
            },
            tipoVehiculo: {
                required: "Este campo es obligatorio"
            },
            marca: {
                required: "Este campo es obligatorio",
                pattern: "Este campo solo puede contener letras",
                minlength: "Este campo debe tener al menos 3 caracteres",
                maxlength: "Este campo admite máximo 20 caracteres"
            },
            modelo: {
                required: "Este campo es obligatorio",
                pattern: "Este campo solo puede contener letras",
                minlength: "Este campo debe tener al menos 3 caracteres",
                maxlength: "Este campo admite máximo 20 caracteres"
            },
            año: {
                required: "Este campo es obligatorio",
                number: "Solo se admiten valores numéricos",
                minlength: "Este campo debe tener 4 caracteres",
                maxlength: "Este campo debe tener 4 caracteres"
            },
            revTec: {
                required: "Este campo es obligatorio"
            },
            'lavado[]': {
                required: "Este campo es obligatorio",
                minlength: "Debe seleccionar al menos una opción"
            },
            personal: {
                required: "Este campo es obligatorio"
            },
            fecha: {
                required: "Este campo es obligatorio"
            },
            hora: {
                required: "Este campo es obligatorio"
            }
        },
        //Si el error ocurre en un campo de tipo checkbox, el mensaje se despliega en una ubicación especial
        errorPlacement: function(error, element) {
            if (element.attr("name") == "lavado[]") {
                error.appendTo("#errorEspecial");
            } else {
                error.insertAfter(element);
            }
        }
    });
    $("#borrar").click(function(){
        //Al hacer click en el botón con ID "borrar", se elimina el último elemento <tr> (table row)
        //Del cuerpo de la tabla, que tiene ID "cuerpoTabla"
        $('#cuerpoTabla tr:last').remove();
    });

    $("#limpiar").click(function(){
        //Ejecuta el comportamiento usual del formulario para su evento "reset": limpiar todos los campos
        $("#formulario").trigger("reset");
    });

    $("#tog").click(function(){
        //Oculta o muestra la tabla de registros
        $("#tablaregistros").toggle();
    });
});