Proceso ejercicio6_mientras
	Definir cont Como Entero;
	Definir acum Como Real;
	Definir num Como Real;
	cont <- 0;
	acum <- 1;
	Mientras cont<10 Hacer
		Escribir 'Ingrese un n�mero:';
		Leer num;
		acum <- acum*num;
		cont <- cont+1;
	FinMientras
	Escribir 'La m�ltiplicaci�n de los 10 n�meros ingresados es: ',acum;
FinProceso
