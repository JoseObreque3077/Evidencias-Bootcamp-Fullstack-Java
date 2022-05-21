Proceso ejercicio7_para
	Definir num Como Entero;
	Definir cont Como Entero;
	Definir acum Como Entero;
	acum <- 1;
	Escribir 'Ingrese un número entero:';
	Leer num;
	Si num==0 O num==1 Entonces
		Escribir num,'! = 1';
	SiNo
		Para cont<-2 Hasta num Hacer
			acum <- acum*cont;
		FinPara
		Escribir num,'! = ',acum;
	FinSi
FinProceso
