Proceso ejercicio5_para
	Definir num Como Entero;
	Definir cont Como Entero;
	Definir acum Como Entero;
	Definir resto Como Entero;
	acum <- 0;
	Para cont<-1 Hasta 100 Hacer
		Escribir 'Ingrese un n�mero entero:';
		Leer num;
		resto <- num MOD 2;
		Si resto==1 Entonces
			acum <- acum+1;
		FinSi
	FinPara
	Escribir 'Entre los 100 n�meros ingresados hay ',acum,' n�mero(s) impar(es)';
FinProceso
