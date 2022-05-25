$(document).ready(function() {

    $("#formulario").validate({
        errorClass: "error fail-alert",
        validClass: "valid success-alert",
        submitHandler: function(form) {
	 		alert("Feedback ingresado exitosamente!");
	 		form.submit();
	 	},
        rules: {
            estado: {
                required: true
            },
            fechaMod: {
                required: true
            },
            observaciones: {
                required: true
            }
        },
        messages: {
            estado: {
                required: "Este campo es obligatorio!"
            },
            fechaMod: {
                required: "Este campo es obligatorio!"
            },
            observaciones: {
                required: "Este campo es obligatorio!"
            }
        }
    });
  });