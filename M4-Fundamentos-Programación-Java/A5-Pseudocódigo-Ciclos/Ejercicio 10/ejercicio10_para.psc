Proceso ejercicio10_para
	Definir sueldoBruto Como Entero;
	Definir descuento Como Real;
	Definir sueldoLiq Como Real;
	Definir opc Como Entero;
	Definir acum Como Real;
	Definir cont Como Entero;
	Definir cont2 Como Entero;
	Definir cont3 Como Entero;
	Definir contEsp Como Entero;
	acum <- 0; // Acumulador de sueldos líquidos
	cont <- 0; // Contador numero de cálculos de sueldo líquido
	cont2 <- 0; // Contador número sueldos liq. menores a $450K
	cont3 <- 0; // Contador número sueldos mayores o iguales a $450K
	opc <- 0;
	Para contEsp<-0 Hasta 1 Hacer
		contEsp <- 0;
		Escribir 'Menú de Opciones';
		Escribir '(1) Ingresar nuevo sueldo de trabajador';
		Escribir '(2) Salir';
		Escribir '';
		Escribir 'Ingrese una opción:';
		Leer opc;
		Segun opc  Hacer
			1:
				Escribir 'Ingrese el sueldo bruto del trabajador';
				Leer sueldoBruto;
				Escribir 'Ingrese el porcentaje de descuento (Ej:17)';
				Leer descuento;
				sueldoLiq <- sueldoBruto*(100-descuento)/100;
				Escribir 'Datos ingresados correctamente. Sueldo Líquido: $',sueldoLiq;
				Escribir '';
				acum <- acum+sueldoLiq;
				cont <- cont+1;
				Si sueldoLiq<450000 Entonces
					cont2 <- cont2+1;
				SiNo
					cont3 <- cont3+1;
				FinSi
			2:
				Escribir 'Resumen:';
				Escribir 'Cantidad de sueldos líquidos calculados: ',cont;
				Escribir 'Suma total de sueldos líquidos calculados: $',acum;
				Escribir 'Cantidad de sueldos líquidos menores a $450.000: ',cont2;
				Escribir 'Cantidad de sueldos líquidos mayores o iguales a $450.000: ',cont3;
				contEsp <- 1;
			De Otro Modo:
				Escribir 'Opción inválida. Intente nuevamente.';
				Escribir '';
		FinSegun
	FinPara
FinProceso
