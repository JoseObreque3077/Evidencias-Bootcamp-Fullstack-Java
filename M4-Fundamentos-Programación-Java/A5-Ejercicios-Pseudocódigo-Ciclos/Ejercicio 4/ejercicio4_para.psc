Proceso ejercicio4_para
	Definir cont Como Entero;
	Definir acum Como Entero;
	Definir num1 Como Entero;
	Definir num2 Como Entero;
	Definir resto Como Entero;
	Escribir 'Ingrese valor inicial de la suma de pares:';
	Leer num1;
	Escribir 'Ingrese valor final de la suma de pares:';
	Leer num2;
	acum <- 0;
	Para cont<-num1 Hasta num2 Hacer
		resto <- cont MOD 2;
		Si resto==0 Entonces
			acum <- acum+cont;
		FinSi
	FinPara
	Escribir 'La suma de pares desde ',num1,' hasta ',num2,' es: ',acum;
FinProceso
