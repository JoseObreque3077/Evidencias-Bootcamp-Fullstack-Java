package hijas;

import padre.Personaje;

/**
 * Clase que representa al personaje Tortuga Voladora en Super Mario 3.
 * @author José Obreque F.
 *
 */
public class TortugaVoladora extends Personaje{
	private boolean soloCaparazon;
	
	
	public TortugaVoladora(String nombre, int posX, int posY, boolean soloCaparazon) {
		super(nombre, posX, posY, 100, 150, 1, "tortuga vol");
		this.soloCaparazon = soloCaparazon;
	}
	
	@Override
	public void saltar(Personaje pj) {
		/*
		 * Si una tortuga salta sobre mario, se pueden dar 2 escenarios:
		 * A) Mario tiene poder activo: entonces mario pierde su poder
		 * B) Mario no tiene poder activo: entonces mario muere y pierde 1 vida
		 * Si una tortuga salta sobre otra, esta sigue su camino
		 */
		super.saltar(pj); //Muestra el mensaje del método definido en la superclase
		
		if (pj instanceof MarioMapache) {
			MarioMapache m = (MarioMapache)pj; //Cambiamos el objeto de tipo Personaje a tipo MarioMapache
			if (m.isPoderMapache()) {
				m.setPoderMapache(false); //Mario pierde sus poderes
				System.out.println(m.getNombre() + " pierde sus poderes!");
			}
			else {
				m.morir(); //Se verifica si mario llega a cero vidas
				m.perderVida(); //Resta una vida, si mario no ha muerto aún (>0 vidas)
			}
		}
		else {
			System.out.println(this.getNombre() + " sigue su camino!");
		}
	}
	
	@Override
	public void chocar(Personaje pj) {
		super.chocar(pj);
		if (pj instanceof MarioMapache) {
			MarioMapache m = (MarioMapache)pj; //objeto polimórfico
			if (m.isPoderMapache()) {
				m.setPoderMapache(false);
			}
			else {
				m.morir(); //Se verifica si mario llega a cero vidas
				m.perderVida(); //Resta una vida, si mario no ha muerto aún (>0 vidas)
			}
		}
	}

	@Override
	public void saltar() {
		//Si la tortuga solo es un caparazón, entonces no puede saltar.
		if (this.soloCaparazon) {
			System.out.println(this.getNombre() + "no puede saltar!");
		}
		else {
			super.saltar();
		}
	}
	
	
	@Override
	public void perderVida() {
		if (this.getVidas()>0) {
			this.setVidas(this.getVidas()-1);
			System.out.println("La tortuga muere");
		}
	}

	public boolean isSoloCaparazon() {
		return soloCaparazon;
	}

	public void setSoloCaparazon(boolean soloCaparazon) {
		this.soloCaparazon = soloCaparazon;
	}
	
	
}
