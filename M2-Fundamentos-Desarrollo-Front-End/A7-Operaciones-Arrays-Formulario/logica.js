var datos = [];

function promedio() {
    let suma = 0;
    let prom = 0;
    for (let i=0; i<datos.length; i++) {
        suma += parseInt(datos[i].edad);
    }
    prom = suma/datos.length;
    return prom
};
console.log(promedio());

function mayores() {
    let contador = 0;
    for (let i=0; i<datos.length; i++) {
        if (parseInt(datos[i].edad) >= 18) {
            contador++;
        }
    }
    return contador;
};

function pesosPesados() {
    let lista = [];
    for (let i=0; i<datos.length; i++) {
        if (parseFloat(datos[i].peso)>90) {
            lista.push(datos[i]);
        }
    }
    return lista;
};

function ordenAlfabetico() {
    let lista = datos.sort(function(a, b){
        if(a.nombre < b.nombre) { return -1; }
        if(a.nombre > b.nombre) { return 1; }
        return 0;
    })
    return lista;
}

// NOTA: A PARTIR DE ESTE PUNTO, ES ALGO NO OBLIGATORIO. USÉ JQUERY COMO ENSAYO PARA PROBAR FUNCIONALIDADES.
$(document).ready(function(){
    $("#botonCalcular").click(function(){
        $("#displayPromedio").val(promedio());
        console.log(promedio());
        $("#displayMayores").val(mayores());
        console.log(mayores());
        let pesos = pesosPesados();
        console.log(pesos)
        for (let i=0; i<pesos.length; i++) {
            let markup2 = "<tr><td>" + pesos[i].nombre + "</td><td>" + pesos[i].edad + "</td><td>" + pesos[i].peso + "</td><td>" + pesos[i].salud + "</td><td>" + pesos[i].alergia + "</td></tr>";
            $("#body2").append(markup2);
        }
        let listaOrdenada = ordenAlfabetico();
        console.log(listaOrdenada);
        for (let i=0; i<listaOrdenada.length; i++) {
            let markup3 = "<tr><td>" + listaOrdenada[i].nombre + "</td><td>" + listaOrdenada[i].edad + "</td><td>" + listaOrdenada[i].peso + "</td><td>" + listaOrdenada[i].salud + "</td><td>" + listaOrdenada[i].alergia + "</td></tr>";
            $("#body3").append(markup3);
        }
    });
});

$(document).ready(function(){
    $("#botonAgregar").click(function(){
        let valor_nombre = $("#inputNombre").val();
        let valor_edad = $("#inputEdad").val();
        let valor_peso = $("#inputPeso").val();
        let valor_salud = $("#inputSalud").val();
        let valor_alergia = $("#inputAlergia").val();
        let markup = "<tr><td>" + valor_nombre + "</td><td>" + valor_edad + "</td><td>" + valor_peso + "</td><td>" + valor_salud + "</td><td>" + valor_alergia + "</td></tr>";
        // Se agrega una fila al body de la tabla
        $("#body1").append(markup);
        // Se reinician los campos del formulario
        $('#formulario').trigger("reset");
        // Se crea un objeto con los datos de la persona
        let persona = {nombre: valor_nombre, edad: valor_edad, peso: valor_peso, salud: valor_salud, alergia: valor_alergia};
        // Se agrega al array que contiene todos los datos de las distintas personas añadidas
        datos.push(persona);
        });
    });