Proceso ejercicio8_repetir
	Definir num Como Entero;
	Definir cont Como Entero;
	Definir resto Como Entero;
	cont <- 1;
	Repetir
		Escribir 'Ingrese un n�mero impar:';
		Leer num;
		resto <- num MOD 2;
		Si resto==1 Entonces
			Escribir 'N�mero ',num,' ingresado correctamente';
			Escribir '';
			cont <- cont+1;
		SiNo
			Escribir 'N�mero par o formato err�neo, intente nuevamente';
			Escribir '';
		FinSi
	Hasta Que cont>10
FinProceso
