Proceso ejercicio2_para
	Definir cont Como Entero;
	Definir acum Como Entero;
	Definir num Como Entero;
	Escribir 'Ingrese el valor inicial:';
	Leer num;
	acum <- 0;
	Para cont<-num Hasta 100 Hacer
		acum <- acum+cont;
	FinPara
	Escribir 'La suma de ',num,' hasta 100 es: ',acum;
FinProceso
