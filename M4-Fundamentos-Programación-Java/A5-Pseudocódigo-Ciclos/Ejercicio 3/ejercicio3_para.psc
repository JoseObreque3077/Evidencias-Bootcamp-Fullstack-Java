Proceso ejercicio3_para
	Definir cont Como Entero;
	Definir acum Como Entero;
	Definir num1 Como Entero;
	Definir num2 Como Entero;
	Escribir 'Ingrese valor inicial de la suma:';
	Leer num1;
	Escribir 'Ingrese valor final de la suma:';
	Leer num2;
	acum <- 0;
	Para cont<-num1 Hasta num2 Hacer
		acum <- acum+cont;
	FinPara
	Escribir 'La suma desde ',num1,' hasta ',num2,' es: ',acum;
FinProceso
