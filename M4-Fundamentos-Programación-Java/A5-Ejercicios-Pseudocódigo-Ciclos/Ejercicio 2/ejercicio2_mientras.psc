Proceso ejercicio2_mientras
	Definir cont Como Entero;
	Definir acum Como Entero;
	Definir num Como Entero;
	acum <- 0;
	Escribir 'Ingrese el valor inicial:';
	Leer num;
	cont <- num;
	Mientras cont<=100 Hacer
		acum <- acum+cont;
		cont <- cont+1;
	FinMientras
	Escribir 'La suma de ',num,' hasta 100 es: ',acum;
FinProceso
