import java.util.Scanner;
public class ZodiacoDecisionAnidada {

	public static void main(String[] args) {
		//Definicion de variables
		int dia;
		int mes;
		int ann;
		int modulo;
		boolean val;
		
		//Definicion de scanner
		Scanner leer = new Scanner(System.in);
		
		//Solicitud de ingreso de fecha de nacimiento por consola
		System.out.println("Ingrese su dia de nacimiento:");
		dia = leer.nextInt();
		
		System.out.println("Ingrese su mes de nacimiento:");
		mes = leer.nextInt();
		
		System.out.println("Ingrese su año de nacimiento:");
		ann = leer.nextInt();
		
		//Cálculo del módulo del año (para determinar año bisiesto)
		modulo = ann%4;
		
		//Cálculo del valor booleano de la variable auxiliar val (validación)
		if ((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) && (dia>=1 && dia<=31)) {
			val = true;
		}
		else if ((mes==4 || mes==6 || mes==9 || mes==11) && (dia>=1 && dia<=30)) {
			val = true;
		}
		else if ((mes==2 && dia>=1 && dia<=28 && modulo==1) || (mes==2 && dia>=1 && dia<=29 && modulo==0)) {
			val = true;
		}
		else {
			val = false;
		}
		
		//Inicio de los IF para definir signo segun mes y dia de nacimiento
		//NOTA: depende de si la validación de dia es verdadera o falsa
		if (val==true) {
			if (mes==1) {
				if (dia<=19) {
					System.out.println("Tu signo es Capricornio");
				}
				else {
					System.out.println("Tu signo es Acuario");
				}
			}
			else {
				if (mes==2) {
					if (dia<=18) {
						System.out.println("Tu signo es Acuario");
					}
					else {
						System.out.println("Tu signo es Piscis");
					}
				}
				else {
					if (mes==3) {
						if (dia<=20) {
							System.out.println("Tu signo es Piscis");
						}
						else {
							System.out.println("Tu signo es Aries");
						}
					}
					else {
						if (mes==4) {
							if (dia<=20) {
								System.out.println("Tu signo es Aries");
							}
							else {
								System.out.println("Tu signo es Tauro");
							}
						}
						else {
							if (mes==5) {
								if (dia<=20) {
									System.out.println("Tu signo es Tauro");
								}
								else {
									System.out.println("Tu signo es Géminis");
								}
							}
							else {
								if (mes==6) {
									if (dia<=20) {
										System.out.println("Tu signo es Géminis");
									}
									else {
										System.out.println("Tu signo es Cáncer");
									}
								}
								else {
									if (mes==7) {
										if (dia<=20) {
											System.out.println("Tu signo es Cáncer");
										}
										else {
											System.out.println("Tu signo es Leo");
										}
									}
									else {
										if (mes==8) {
											if (dia<=21) {
												System.out.println("Tu signo es Leo");
											}
											else {
												System.out.println("Tu signo es Virgo");
											}
										}
										else {
											if (mes==9) {
												if (dia<=22) {
													System.out.println("Tu signo es Virgo");
												}
												else {
													System.out.println("Tu signo es Libra");
												}
											}
											else {
												if (mes==10) {
													if (dia<=22) {
														System.out.println("Tu signo es Libra");
													}
													else {
														System.out.println("Tu signo es Escorpio");
													}
												}
												else {
													if (mes==11) {
														if (dia<=22) {
															System.out.println("Tu signo es Escorpio");
														}
														else {
															System.out.println("Tu signo es Sagitario");
														}
													}
													else {
														if (mes==12) {
															if (dia<=20) {
																System.out.println("Tu signo es Sagitario");
															}
															else {
																System.out.println("Tu signo es Capricornio");
															}
														}
														else {
															System.out.println("Mes inválido");
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		else {
			System.out.println("Día Inválido");
		}
	}
}
