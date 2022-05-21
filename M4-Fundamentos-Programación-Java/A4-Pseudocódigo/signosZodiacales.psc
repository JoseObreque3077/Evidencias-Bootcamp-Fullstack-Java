Proceso signosZodiacales
	Definir diaNac Como Entero;
	Definir mesNac Como Entero;
	Escribir 'Ingrese su día de nacimiento:';
	Leer diaNac;
	Escribir 'Ingrese su mes de nacimiento:';
	Leer mesNac;
	Si (diaNac>=1 Y diaNac<=31) Entonces
		Segun mesNac  Hacer
			1:
				Si diaNac<=19 Entonces
					Escribir 'Tu signo zodiacal es Capricornio';
				SiNo
					Escribir 'Tu signo zodiacal es Acuario';
				FinSi
			2:
				Si diaNac<=18 Entonces
					Escribir 'Tu signo zodiacal es Acuario';
				SiNo
					Escribir 'Tu signo zodiacal es Piscis';
				FinSi
			3:
				Si diaNac<=20 Entonces
					Escribir 'Tu signo zodiacal es Piscis';
				SiNo
					Escribir 'Tu signo zodiacal es Aries';
				FinSi
			4:
				Si diaNac<=20 Entonces
					Escribir 'Tu signo zodiacal es Aries';
				SiNo
					Escribir 'Tu signo zodiacal es Tauro';
				FinSi
			5:
				Si diaNac<=20 Entonces
					Escribir 'Tu signo zodiacal es Tauro';
				SiNo
					Escribir 'Tu signo zodiacal es Géminis';
				FinSi
			6:
				Si diaNac<=20 Entonces
					Escribir 'Tu signo zodiacal es Géminis';
				SiNo
					Escribir 'Tu signo zodiacal es Cáncer';
				FinSi
			7:
				Si diaNac<=20 Entonces
					Escribir 'Tu signo zodiacal es Cáncer';
				SiNo
					Escribir 'Tu signo zodiacal es Leo';
				FinSi
			8:
				Si diaNac<=21 Entonces
					Escribir 'Tu signo zodiacal es Leo';
				SiNo
					Escribir 'Tu signo zodiacal es Virgo';
				FinSi
			9:
				Si diaNac<=22 Entonces
					Escribir 'Tu signo zodiacal es Virgo';
				SiNo
					Escribir 'Tu signo zodiacal es Libra';
				FinSi
			10:
				Si diaNac<=22 Entonces
					Escribir 'Tu signo zodiacal es Libra';
				SiNo
					Escribir 'Tu signo zodiacal es Escorpio';
				FinSi
			11:
				Si diaNac<22 Entonces
					Escribir 'Tu signo zodiacal es Escorpio';
				SiNo
					Escribir 'Tu signo zodiacal es Sagitario';
				FinSi
			12:
				Si diaNac<=20 Entonces
					Escribir 'Tu signo zodiacal es Sagitario';
				SiNo
					Escribir 'Tu signo zodiacal es Capricornio';
				FinSi
			De Otro Modo:
				Escribir 'Mes no válido';
		FinSegun
	SiNo
		Escribir 'Día inválido';
	FinSi
FinProceso
