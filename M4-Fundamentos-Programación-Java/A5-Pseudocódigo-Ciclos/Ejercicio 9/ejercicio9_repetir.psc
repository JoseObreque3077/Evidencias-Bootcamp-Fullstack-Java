Proceso ejercicio9_repetir
	Definir opc Como Entero;
	Definir radio Como Real;
	Definir base Como Real;
	Definir altura Como Real;
	Definir lado Como Real;
	Definir largo Como Real;
	Definir ancho Como Real;
	Definir area Como Real;
	Repetir
		Escribir 'Menú de Opciones';
		Escribir '(1) Área Círculo';
		Escribir '(2) Área Triángulo';
		Escribir '(3) Área Cuadrado';
		Escribir '(4) Área Rectángulo';
		Escribir '(5) Salir';
		Escribir '';
		Escribir 'Escoja una opción:';
		Leer opc;
		Segun opc  Hacer
			1:
				Escribir 'Ingrese el radio:';
				Leer radio;
				area <- pi*radio^2;
				Escribir 'El área del círculo es: ',area;
				Escribir '';
			2:
				Escribir 'Ingrese la base:';
				Leer base;
				Escribir 'Ingrese la altura:';
				Leer altura;
				area <- (base*altura)/2;
				Escribir 'El área del triángulo es: ',area;
				Escribir '';
			3:
				Escribir 'Ingrese el lado:';
				Leer lado;
				area <- lado^2;
				Escribir 'El área del cuadrado es: ',area;
				Escribir '';
			4:
				Escribir 'Ingrese el largo:';
				Leer largo;
				Escribir 'Ingrese el ancho:';
				Leer ancho;
				area <- largo*ancho;
				Escribir 'El área del rectángulo es: ',area;
				Escribir '';
			5:
				Escribir 'Adios!';
				Escribir '';
			De Otro Modo:
				Escribir 'Opción Inválida, escoja nuevamente.';
				Escribir '';
		FinSegun
	Hasta Que opc==5
FinProceso
