Proceso ejercicio9_para
	Definir opc Como Entero;
	Definir radio Como Real;
	Definir base Como Real;
	Definir altura Como Real;
	Definir lado Como Real;
	Definir largo Como Real;
	Definir ancho Como Real;
	Definir area Como Real;
	Definir contEsp Como Entero;
	Para contEsp<-0 Hasta 1 Hacer
		contEsp <- 0;
		Escribir 'Men� de Opciones';
		Escribir '(1) �rea C�rculo';
		Escribir '(2) �rea Tri�ngulo';
		Escribir '(3) �rea Cuadrado';
		Escribir '(4) �rea Rect�ngulo';
		Escribir '(5) Salir';
		Escribir '';
		Escribir 'Escoja una opci�n:';
		Leer opc;
		Segun opc  Hacer
			1:
				Escribir 'Ingrese el radio:';
				Leer radio;
				area <- pi*radio^2;
				Escribir 'El �rea del c�rculo es: ',area;
				Escribir '';
			2:
				Escribir 'Ingrese la base:';
				Leer base;
				Escribir 'Ingrese la altura:';
				Leer altura;
				area <- (base*altura)/2;
				Escribir 'El �rea del tri�ngulo es: ',area;
				Escribir '';
			3:
				Escribir 'Ingrese el lado:';
				Leer lado;
				area <- lado^2;
				Escribir 'El �rea del cuadrado es: ',area;
				Escribir '';
			4:
				Escribir 'Ingrese el largo:';
				Leer largo;
				Escribir 'Ingrese el ancho:';
				Leer ancho;
				area <- largo*ancho;
				Escribir 'El �rea del rect�ngulo es: ',area;
				Escribir '';
			5:
				Escribir 'Adios!';
				Escribir '';
				contEsp <- 1;
			De Otro Modo:
				Escribir 'Opci�n Inv�lida, escoja nuevamente.';
				Escribir '';
		FinSegun
	FinPara
FinProceso
