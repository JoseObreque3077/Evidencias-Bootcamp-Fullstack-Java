Proceso ejercicio5_mientras
	Definir num Como Entero;
	Definir cont Como Entero;
	Definir acum Como Entero;
	Definir resto Como Entero;
	cont <- 0;
	acum <- 0;
	Mientras cont<100 Hacer
		Escribir 'Ingrese un n�mero entero:';
		Leer num;
		resto <- num MOD 2;
		Si resto==1 Entonces
			acum <- acum+1;
		FinSi
		cont <- cont+1;
	FinMientras
	Escribir 'Entre los 100 n�meros ingresados hay ',acum,' n�mero(s) impar(es)';
FinProceso
