Proceso ejercicio5_repetir
	Definir num Como Entero;
	Definir cont Como Entero;
	Definir acum Como Entero;
	Definir resto Como Entero;
	cont <- 1;
	acum <- 0;
	Repetir
		Escribir 'Ingrese un n�mero entero:';
		Leer num;
		resto <- num MOD 2;
		Si resto==1 Entonces
			acum <- acum+1;
		FinSi
		cont <- cont+1;
	Hasta Que cont>100
	Escribir 'Entre los 100 n�meros ingresados hay ',acum,' n�mero(s) impar(es)';
FinProceso
