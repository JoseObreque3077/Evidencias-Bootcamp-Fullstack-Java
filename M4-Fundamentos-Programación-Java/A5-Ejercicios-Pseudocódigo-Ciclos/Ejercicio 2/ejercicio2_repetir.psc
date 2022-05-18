Proceso ejercicio2_repetir
	Definir cont Como Entero;
	Definir acum Como Entero;
	Definir num Como Entero;
	Escribir 'Ingrese el valor inicial:';
	Leer num;
	cont <- num;
	acum <- 0;
	Repetir
		acum <- acum+cont;
		cont <- cont+1;
	Hasta Que cont>100
	Escribir 'La suma de ',num,' hasta 100 es: ',acum;
FinProceso
