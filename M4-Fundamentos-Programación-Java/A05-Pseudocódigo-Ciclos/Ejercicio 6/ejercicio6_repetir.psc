Proceso ejercicio6_repetir
	Definir cont Como Entero;
	Definir acum Como Real;
	Definir num Como Real;
	cont <- 1;
	acum <- 1;
	Repetir
		Escribir 'Ingrese un número:';
		Leer num;
		acum <- acum*num;
		cont <- cont+1;
	Hasta Que cont>10
	Escribir 'La múltiplicación de los 10 números ingresados es: ',acum;
FinProceso
