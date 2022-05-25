$(document).ready(function() {
    $('#tablaResumen').DataTable( {
        "scrollX": true,
        "language": {
            "lengthMenu": "Mostrar _MENU_ registros",
            "zeroRecords": "No se han encontrado registros.",
            "info": "Mostrando página _PAGE_ de _PAGES_",
            "infoEmpty": "No hay registros disponibles",
            "infoFiltered": "(filtrado de un total de _MAX_ registros)",
            "search": "Buscar:",
            "paginate": {
                "first":      "Principio",
                "last":       "Final",
                "next":       "Siguiente",
                "previous":   "Anterior"
            },
        }
    } );
} );