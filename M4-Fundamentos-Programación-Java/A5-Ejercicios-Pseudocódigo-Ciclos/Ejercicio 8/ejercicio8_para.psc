Proceso ejercicio8_para
	Definir num Como Entero;
	Definir cont Como Entero;
	Definir resto Como Entero;
	Para cont<-1 Hasta 10 Hacer
		Escribir 'Ingrese un número impar:';
		Leer num;
		resto <- num MOD 2;
		Si resto==1 Entonces
			Escribir 'Dato ingresado correctamente!';
		SiNo
			Escribir 'Número par. Intente nuevamente!';
			cont <- cont-1;
		FinSi
	FinPara
FinProceso
