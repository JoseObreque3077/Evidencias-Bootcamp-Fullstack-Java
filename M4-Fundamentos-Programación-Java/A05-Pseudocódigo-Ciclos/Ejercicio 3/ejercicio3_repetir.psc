Proceso ejercicio3_repetir
	Definir cont Como Entero;
	Definir acum Como Entero;
	Definir num1 Como Entero;
	Definir num2 Como Entero;
	Escribir 'Ingrese valor inicial de la suma:';
	Leer num1;
	Escribir 'Ingrese valor final de la suma:';
	Leer num2;
	acum <- 0;
	cont <- num1;
	Repetir
		acum <- acum+cont;
		cont <- cont+1;
	Hasta Que cont>num2
	Escribir 'La suma desde ',num1,' hasta ',num2,' es: ',acum;
FinProceso
