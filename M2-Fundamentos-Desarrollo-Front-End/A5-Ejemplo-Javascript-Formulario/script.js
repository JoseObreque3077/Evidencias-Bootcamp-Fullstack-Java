let lista = [];

function mostrar_texto() {
    //Se muestran las entradas en el cuadro de texto
    let n = lista.length; //tamaño del array
    let i=0;
    let texto = "";
    for (let i=0; i<lista.length; i++) {
        texto += `(${lista[i].nombre}, ${lista[i].edad}); `
    }
    document.getElementById("text").value = texto;
}

function capturar() {
    //Se crea un arreglo y se agrega a la lista
    let valorNombre = document.getElementById("nombre").value;
    let valorEdad = document.getElementById("edad").value;
    let arreglo = {nombre: valorNombre, edad: valorEdad};
    lista.push(arreglo);
    //Se reinician las entradas de nombre y texto
    valorNombre = "";
    valorEdad = null;
    //Mostrar texto en cuadro
    mostrar_texto()
}

// Función que realiza los cálculos/conteos solicitados
function suma(total, value) {
    return total + parseInt(value.edad);
}

function calculo() {
    document.getElementById("res_0").value = lista.length;
    document.getElementById("res_1").value = lista.filter(x => x.nombre === "Juan").length;
    document.getElementById("res_2").value = lista.reduce(suma, initialValue=0)/lista.length;      
    document.getElementById("res_3").value = lista.filter(x => x.edad >= 18).length;
}

function borrar() {
    lista.pop();
    mostrar_texto();
}