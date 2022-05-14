function agregar(texto){
    let texto_pantalla = document.getElementById("input_res"); //texto
    texto_pantalla.value = texto_pantalla.value + texto;
}

function boton_borrar() {
    let texto_pantalla = document.getElementById("input_res");
    texto_pantalla.value = '';
}

function boton_calculo() {
    let texto_pantalla = document.getElementById("input_res");
    texto_pantalla.value = eval(texto_pantalla.value);
}

function boton_borrar2() {
    let texto_pantalla = document.getElementById("input_res");
    texto_pantalla.value = texto_pantalla.value.slice(0, -1);
}