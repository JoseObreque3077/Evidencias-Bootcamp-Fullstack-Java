Proceso ejercicio6_para
	Definir cont Como Entero;
	Definir acum Como Real;
	Definir num Como Real;
	acum <- 1;
	Para cont<-1 Hasta 10 Hacer
		Escribir 'Ingrese un número:';
		Leer num;
		acum <- acum*num;
	FinPara
	Escribir 'La múltiplicación de los 10 números ingresados es: ',acum;
FinProceso
