Proceso tablaMultiplicar
	Definir numBase Como Entero;
	Definir cont Como Entero;
	Definir res Como Entero;
	Escribir 'Ingrese el multiplicando';
	Leer numBase;
	cont <- 0;
	Mientras cont<=10 Hacer
		res <- numBase*cont;
		Escribir numBase,'*',cont,'=',res;
		cont <- cont+1;
	FinMientras
FinProceso
