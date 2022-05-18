Proceso ejercicio7_mientras
	Definir num Como Entero;
	Definir cont Como Entero;
	Definir acum Como Entero;
	cont <- 2;
	acum <- 1;
	Escribir 'Ingrese un número entero:';
	Leer num;
	Mientras cont<=num Hacer
		acum <- acum*cont;
		cont <- cont+1;
	FinMientras
	Escribir num,'! = ',acum;
FinProceso
