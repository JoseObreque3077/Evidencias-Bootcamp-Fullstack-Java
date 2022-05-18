Proceso ejercicio8_mientras
	Definir num Como Entero;
	Definir cont Como Entero;
	Definir resto Como Entero;
	cont <- 0;
	Mientras cont<10 Hacer
		Escribir 'Ingrese un número impar:';
		Leer num;
		resto <- num MOD 2;
		Si resto==1 Entonces
			Escribir 'Número ',num,' ingresado correctamente';
			Escribir '';
			cont <- cont+1;
		SiNo
			Escribir 'Número par o formato erróneo, intente nuevamente';
			Escribir '';
		FinSi
	FinMientras
FinProceso
