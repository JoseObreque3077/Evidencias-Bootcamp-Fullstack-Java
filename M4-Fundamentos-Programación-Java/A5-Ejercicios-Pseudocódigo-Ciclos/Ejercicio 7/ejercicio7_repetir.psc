Proceso ejercicio7_repetir
	Definir num Como Entero;
	Definir cont Como Entero;
	Definir acum Como Entero;
	cont <- 2;
	acum <- 1;
	Escribir 'Ingrese un número entero:';
	Leer num;
	Si num==0 O num==1 Entonces
		Escribir num,'! = 1';
	SiNo
		Repetir
			acum <- acum*cont;
			cont <- cont+1;
		Hasta Que cont>num
		Escribir num,'! = ',acum;
	FinSi
FinProceso
