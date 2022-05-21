import java.util.Scanner;

public class Mascota {
	private boolean vive;
	private int energia;
	private int llenado;
	private int suciedad;
	private int felicidad;

	public Mascota() {
		this.vive = true;
		this.energia = 1;
		this.llenado = 1;
		this.suciedad = 0;
		this.felicidad = 1;
	}

	public void menu() {
		Scanner leer = new Scanner(System.in);
		int opc;
		opc = 0;
		while (opc != 7 && this.vive) {
			System.out.println("Menú de Mascota Virtual:");
			System.out.println("(1) Ver resumen");
			System.out.println("(2) Alimentar");
			System.out.println("(3) Dormir");
			System.out.println("(4) Jugar");
			System.out.println("(5) Bañar");
			System.out.println("(6) Ignorar");
			System.out.println("(7) Salir");
			opc = leer.nextInt();
			System.out.println();

			switch (opc) {
			case 1:
				resumen();
				break;
			case 2:
				comer();
			break;
			case 3:
				dormir();
			break;
			case 4:
				jugar();
			break;
			case 5:
				asear();
			break;
			case 6:
				ignorar();
			break;
			}
			
			if (this.felicidad==0 && this.energia==0) {
				this.vive = false;
				System.out.println("TU MASCOTA ESTA MUERTA!!!!");
				break;
			}
		}
	}
	
	public void resumen() {
		System.out.println("Resumen:");
		System.out.println("Estado Mascota: " + this.vive);
		System.out.println("Energía: " + this.energia);
		System.out.println("Alimentación: " + this.llenado);
		System.out.println("Suciedad: " + this.suciedad);
		System.out.println("Felicidad: " + this.felicidad);
		System.out.println();
	}
	
	public void comer() {
		Scanner leer = new Scanner(System.in);
		int opc;
		opc = 1;
		while (this.energia<5 && this.llenado<5 && this.suciedad<5 && opc!=2) {
			if (opc==1) {
				this.energia += 1;
				this.llenado += 1;
				this.suciedad += 1;
				this.felicidad += 1;
				System.out.println("La mascota ha comido una ración.");
			}
			System.out.println("¿Desea darle otra ración?");
			System.out.println("(1) Si");
			System.out.println("(2) No");
			opc = leer.nextInt();
			System.out.println();
		}
		if (this.energia==5 || this.llenado==5 || this.suciedad==5) {
			System.out.println("Ya no se puede seguir alimentando a la mascota.");
		}
		mensajes();
	}
	
	public void dormir() {
		Scanner leer = new Scanner(System.in);
		int opc;
		opc = 1;
		while (this.energia<5 && this.felicidad>0 && opc!=2) {
			switch (opc) {
			case 1:
				this.energia += 1;
				this.felicidad -= 1;
				System.out.println("Tu mascota duerme");
			break;
			case 2:
				System.out.println("Has despertado a tu mascota.");
			break;
			default:
				System.out.println("Opción inválida. Intenta nuevamente.");
			}
			System.out.println("¿Seguir durmiendo?");
			System.out.println("(1) Si");
			System.out.println("(2) No");
			opc = leer.nextInt();
		}
		if (this.energia==5 || felicidad==0) {
			System.out.println("Tu mascota no puede seguir durmiendo.");
		}
		mensajes();
	}
	
	public void jugar() {
		Scanner leer = new Scanner(System.in);
		int opc;
		opc = 1;
		while (this.energia>0 && this.llenado>0 && this.suciedad<5 && opc!=2) {
			switch (opc) {
			case 1:
				this.energia -= 1;
				this.llenado -= 1;
				this.felicidad += 1;
				this.suciedad += 1;
				System.out.println("Tu mascota juega");
			break;
			case 2:
				System.out.println("Has dejado de jugar con tu mascota.");
			break;
			default:
				System.out.println("Opción inválida. Intenta nuevamente.");
			}
			System.out.println("¿Seguir jugando?");
			System.out.println("(1) Si");
			System.out.println("(2) No");
			opc = leer.nextInt();
		}
		if (this.energia==0 || this.llenado==0 || this.suciedad==5) {
			System.out.println("Ya no se puede seguir jugando con la mascota.");
		}
		mensajes();
	}
	
	public void asear() {
		Scanner leer = new Scanner(System.in);
		int opc;
		opc = 1;
		if (this.energia>0 && this.energia<5 && this.llenado>0 && this.llenado<5 && this.suciedad>0) {
			this.felicidad += 1;
			this.energia -= 1;
			this.suciedad = 0;
			System.out.println("Tu mascota se ha bañado!");
		}
		else if (this.suciedad==0) {
			System.out.println("No es necesario bañar nuevamente a tu mascota.");
		}
		mensajes();
	}
	
	public void ignorar() {
		Scanner leer = new Scanner(System.in);
		int opc;
		opc = 1;
		if (felicidad>0) {
			this.felicidad -= 1;
			System.out.println("Has ignorado a tu mascota");
		}
		if (this.felicidad==0) {
			System.out.println("Ya no se puede seguir ignorando a la mascota.");
		}
		mensajes();
	}
	
	public void mensajes() {
		int valores[] = {this.energia, this.felicidad, this.llenado, this.suciedad};
		String mensajes1[] = {"-Tu mascota tiene mucha energía", "-Tu mascota es muy feliz", "-Tu mascota está satisfecha", "-Tu mascota está muy sucia"};
		String mensajes2[] = {"-Tu mascota está debil", "-Tu mascota está triste", "-Tu mascota tiene hambre", "-Tu mascota está limpia"};
		
		for (int i=0; i<4; i++) {
			if (valores[i]==0) {
				System.out.println(mensajes2[i]);
			}
			else if (valores[i]==5) {
				System.out.println(mensajes1[i]);
			}
		}
		System.out.println();
	}
}


