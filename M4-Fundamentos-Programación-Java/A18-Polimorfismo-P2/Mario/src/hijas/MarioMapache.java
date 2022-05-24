package hijas;
import padre.Personaje;

/**
 * Clase que representa al personaje Mario Mapache en Super Mario 3.
 * @author José Obreque F.
 *
 */
public class MarioMapache extends Personaje{
	private boolean poderMapache;
	private int monedas;
	private int tiempo;
	private int puntos;

	public MarioMapache(String nombre, int vidas, int posX, int posY) {
		super(nombre, 4, posX, posY, 100, 150, "mapache");
		this.poderMapache = true;
		this.monedas = 5;
		this.tiempo = 258;
		this.puntos = 3000;
	}

	/**
	 * Método que permite que Mario planee hacia un punto dado.
	 * @param finX - Coordenada final en X
	 * @param finY - Coordenada final en Y
	 */
	public void planear(int finX, int finY) {
		super.setPosX(finX);
		super.setPosY(finY);
		System.out.println(super.getNombre() + " planea hasta el punto (" + finX + "," + finY + ")");
	}
	
	
	@Override
	public void saltar(Personaje pj) {
		/*
		 * Si Mario salta sobre una tortuga, pueden darse dos escenarios:
		 * 1) La tortuga alada no está escondida en su caparazón, por lo que ahora si se esconde
		 * 2) La tortuga alada ya está escondida en su caparazón, por lo que ahora se desliza sin control
		 */
		super.saltar(pj); //Muestra el mensaje definido en el método de la superclase
		if (pj instanceof TortugaVoladora) {
			TortugaVoladora t = (TortugaVoladora)pj;
			if (t.isSoloCaparazon()) {
				System.out.println("El caparazón de " + t.getNombre() + " se desliza sin control!");
			}
			else {
				t.setSoloCaparazon(true);
				System.out.println(t.getNombre() + " se esconde en su caparazón!");
			}
		}
	}
	
	@Override
	public void chocar(Personaje pj) {
		if (pj instanceof TortugaVoladora) {
			super.chocar(pj);
			if (this.poderMapache) {
				this.poderMapache = false;
				System.out.println("Mario pierde su poder");
			}
			else {
				this.morir();
				this.perderVida();
			}
		}
	}
	
	@Override
	public void perderVida() {
		if (this.getVidas()>0) {
			this.setVidas(this.getVidas()-1); //Mario pierde vida
			System.out.println("Mario pierde una vida. Vuelve al inicio!");
			this.setPosX(10);
			this.setPosY(200);
		}
	}
	
	@Override
	public void morir() {
		if (this.getVidas() == 0) {
			super.morir();
			System.out.println("GAME OVER");
		}
	}

	public boolean isPoderMapache() {
		return poderMapache;
	}

	public void setPoderMapache(boolean poderMapache) {
		this.poderMapache = poderMapache;
	}

	public int getMonedas() {
		return monedas;
	}

	public void setMonedas(int monedas) {
		this.monedas = monedas;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	
	
}
