// Se define una variable de alcance global para almacenar los datos de altitud
//var datosAltitud = [0,0,1,-1,-1,1,1,1,-1,0,1,0,-1,0,0,0,0,0,0,-1,0,1,1,0,0,0,0,-1,1,0];
//var datosAltitud = [-1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, -1, 0, 1, 1, 1, -1, 0, -1, 0, 0, -1, -1, 1, 0, 1, -1, -1, 1];
var datosAltitud = [];

// Función que genera un array de datos aleatorios
function generar() {
    // Array de 30 datos aleatorios entre (-1, 0 y 1)
    datosAltitud = Array.from(Array(30)).map(() => parseInt((Math.round(Math.random() * 2 - 1))));
    // Se llama a la función graficar() para mostrar los datos generados en una gráfica en pantalla
    graficar(datosAltitud);
    console.log(datosAltitud);
}

//--------------------------------------SECCIÓN OPTATIVA: GRAFICA DE LOS CERROS-----------------------------------
function mapeoUno(dato, indice) {
    let dato_salida = indice;
    return dato_salida;
}

function mapeoDos(dato, indice, array) {
    dato_salida = array.slice(0, indice).reduce((a,b) => {return a+100*b}, initialValue=array[indice]*100);
    return dato_salida;
}

function graficar(datos) {
    const dataX = datos.map(mapeoUno);
    const dataY = datos.map(mapeoDos);

    // Define Data
    var data = [{
        x: dataX,
        y: dataY,
        mode:"lines"
    }];
  
    // Define Layout
    var layout = {
        title: "Gráfica de los cerros",
        xaxis: {
            autotick: false,
            ticks: 'outside',
            tick0: 0,
            dtick: 1,
          },
        yaxis: {
            autotick: false,
            ticks: 'outside',
            tick0: 0,
            dtick: 100,
        },
    };
  
  // Gráfica usando Plotly
  Plotly.newPlot("myPlot", data, layout);
}
//-------------------------------------------------------------------------------------------------------

// Función que calcula el número de cerros presentes en el conjunto de datos generados
function calculoCerros() {
    let a = 0;
    let b = 0;
    let cerros = 0;
    let bloqueo = false;

    // Debido a que se desconocen datos antes de i=0, se descarta contar elevaciones en i=0
    for (let i=1; i<datosAltitud.length; i++) {
        switch (datosAltitud[i]) {
            case 0:
                a += 0;
                b += 0;
                break;
            case 1:
                if (bloqueo) {
                    bloqueo = false;
                }
                b += 100;
                if (b>a) {
                    a += 100;
                } else if (b<=0) {
                    a = 100;
                    b = 100;
                }
                break;
            case -1:
                if (bloqueo) {
                    a = 0;
                    b = 0;
                } else {
                    b -= 100;
                    if (a-b >= 200 && a>=200) {
                        cerros++;
                        a = 0;
                        b = 0;
                        bloqueo = true;
                    }
                }
                break;
        }
        let pruebas = [a,b,cerros,i]
        console.log(pruebas)
    }
    document.getElementById("displayCerros").value = cerros;
}
