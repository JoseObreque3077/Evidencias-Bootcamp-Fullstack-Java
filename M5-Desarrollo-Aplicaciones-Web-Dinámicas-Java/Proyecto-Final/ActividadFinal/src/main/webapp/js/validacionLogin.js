$(document).ready(function() {

    $("#formLogin").validate({
        errorClass: "error fail-alert",
        validClass: "valid success-alert",
        rules: {
            usuario: {
                required: true,
                pattern: "^([a-zA-Z_0-9]+)$",
            },
            pass: {
                required: true,
            }
        },
        messages: {
            usuario: {
                required: "Este campo es obligatorio.",
                pattern: "Este campo solo acepta números, letras y guión bajo.",
            },
            pass: {
                required: "Este campo es obligatorio!",
            }
        }
    });
  });