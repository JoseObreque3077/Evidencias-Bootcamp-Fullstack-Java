Proceso ejercicio6_mientras
	Definir cont Como Entero;
	Definir acum Como Real;
	Definir num Como Real;
	cont <- 0;
	acum <- 1;
	Mientras cont<10 Hacer
		Escribir 'Ingrese un número:';
		Leer num;
		acum <- acum*num;
		cont <- cont+1;
	FinMientras
	Escribir 'La múltiplicación de los 10 números ingresados es: ',acum;
FinProceso
