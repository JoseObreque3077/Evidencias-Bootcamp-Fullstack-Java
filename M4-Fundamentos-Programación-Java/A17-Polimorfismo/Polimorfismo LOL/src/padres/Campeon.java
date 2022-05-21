package padres;

/**
 * Clase abstracta que representa a un campeón en el videojuego League of Legends.
 * @author José Obreque F.
 *
 */
public abstract class Campeon extends Personaje{
	private String estilo; //Estilo (skin)
	private int nivel; //Nivel del campeon, inicia en LV1
	private int exp; //Experiencia acumulada del campeón, inicia en 0
	private int manaBase; //Maná base del campeón
	private int aumMana; //Aumento de maná base por nivel del campeón
	private int aumVida; //Aumento de vida base por nivel del campeon
	private int aumDam; //Aumento de daño base por nivel del campeón
	private int mana; //Maná disponible del campeón, comienza en su valor base
	private int oro; //Oro acumulado por el campeón, inicia en 0
	private boolean visible; //Variable booleana que indica si el campeón es visible o no
	private int damBaseQ; //Daño base del ataque Q
	private int damBaseW; //Daño base del ataque W
	private int damBaseE; //Daño base del ataque E
	private int damBaseR; //Daño base del ataque R
	private int manaQ;
	private int manaW;
	private int manaE;
	private int manaR;

	public Campeon(String nombre, String bando, float posX, float posY, int damBase, int vidaBase, int expBase,
			int oroBase, String estilo, int manaBase, int aumMana, int aumVida, int aumDam,
			boolean visible, int damBaseQ, int damBaseW, int damBaseE, int damBaseR,
			int manaQ, int manaW, int manaE, int manaR) {
		super(nombre, bando, posX, posY, damBase, vidaBase, expBase, oroBase);
		this.estilo = estilo;
		this.nivel = 1;
		this.exp = 0;
		this.manaBase = manaBase;
		this.aumMana = aumMana;
		this.aumVida = aumVida;
		this.aumDam = aumDam;
		this.mana = manaBase;
		this.oro = 0;
		this.visible = visible;
		this.damBaseQ = damBaseQ;
		this.damBaseW = damBaseW;
		this.damBaseE = damBaseE;
		this.damBaseR = damBaseR;
		this.manaQ = manaQ;
		this.manaW = manaW;
		this.manaE = manaE;
		this.manaR = manaR;
	}

	@Override
	public void ataqueBasico(Personaje pj) {
		/*
		 * 1) No se puede atacar a un personaje del mismo bando
		 * 2) No se puede atacar a un personaje muerto
		 * 3) Si la vida del objetivo es menor o igual al daño de ataque del atacante,
		 * el objetivo muere. El campeon gana oro y experiencia.
		 * 4) Si la vida del objetivo es mayor al daño de ataque del atacante,
		 * el objetivo entonces recibe el daño y baja su vida.
		 */
		super.ataqueBasico(pj);
		if (!pj.isVive()) {
			this.oro += pj.getOroBase(); //Se agrega oro
			this.exp += pj.getExpBase(); //Se agrega experiencia
			subirNivel(); //Se sube de nivel, si corresponde
		}
	}

	/**
	 * Método que permite que un Campeón realice un ataque con una habilidad especial.
	 * @param pj - (Personaje): Instancia de la clase Personaje.
	 * @param tecla - (String): Tecla de la habilidad especial seleccionada.
	 */
	public void ataqueEspecial(Personaje pj, String tecla) {
		int dam;
		dam = 0;
		//PASO 1: VER SI EL ATAQUE ES VÁLIDO
		if (super.validarAtaque(pj)) {
			//PASO 1: VER SI HAY SUFICIENTE MANÁ
			if (validarMana(tecla)) {
				//PASO 3: SI EL ATAQUE ES VÁLIDO, DEFINIMOS EL DAÑO DEPENDIENDO DE LA HABILIDAD USADA
				switch (tecla) {
					case "q":
						dam = this.damBaseQ;
						this.mana -= this.manaQ;
					break;
					case "w":
						dam = this.damBaseW;
						this.mana -= this.manaW;
					break;
					case "e":
						dam = this.damBaseE;
						this.mana -= this.manaE;
					break;
					case "r":
						dam = this.damBaseR;
						this.mana -= this.manaR;
					break;
				}
				//PASO 4: SE REALIZA EL ATAQUE CON EL DAÑO APROPIADO
				super.atacar(pj, dam);	
			}
		}
	}
	
	/**
	 * Método que permite que un personaje vuelva a su base respectiva.
	 */
	public void retirada() {
		float baseX, baseY;
		/*
		 * Si es del equipo azul, vuelve a las coordenadas por defecto de su base.
		 * Lo mismo ocurre si es del bando contrario (equipo rojo)
		 */
		if (this.getBando() == "Equipo Azul") {
			baseX = 10.55f;
			baseY = 20.01f;
		}
		else {
			baseX = 652.33f;
			baseY = 755.6f;
		}
		//Se posiciona al campeón en las coordenadas de su base
		this.setPosX(baseX);
		this.setPosY(baseY);
		this.setVida(this.getVidaBase()); //Restaura la vida
		this.mana = this.manaBase; //Restaura el maná
		System.out.println(this.getNombre() + " ha vuelto a la base!");
	}
	
	/**
	 * Método que determina si un campeón sube o no de nivel, junto con el ajuste del valor de
	 * experiencia actual.
	 */
	public void subirNivel() {
		int limite = this.nivel*100 +80; //Formula de experiencia necesaria para subir de nivel
		if (this.exp >= limite) {
			this.nivel += 1; //El nivel aumenta en 1
			this.exp -= limite; //La experiencia acumulada se corrige por lo gastado para subir de nivel
			this.manaBase += aumMana; //Aumenta la capacidad de maná del campeón
			this.setVidaBase(this.getVidaBase() + this.aumVida); //Aumenta la vida del campeón
			this.setDamBase(this.getDamBase() + this.aumDam); //Aumenta el daño base del campeón
			this.setVida(this.getVidaBase()); //Restaura la vida
			this.mana = this.manaBase; //Restaura el maná
			System.out.println(this.getNombre() + " sube de nivel! Nivel Actual: " + this.nivel);
		}
	}
	
	/**
	 * Método protegido que valida si el maná actual de un campeón es suficiente para realizar
	 * un ataque especial.
	 * @param tecla - (String): tecla del ataque especial.
	 * @return - (boolean): booleano que indica si es el maná es suficiente o no.
	 */
	protected boolean validarMana(String tecla) {
		boolean valido = true;
		int manaGastar = 0;
		switch (tecla) {
			case "q":
				manaGastar = this.manaQ;
			break;
			case "w":
				manaGastar = this.manaW;
			break;
			case "e":
				manaGastar = this.manaE;
			break;
			case "r":
				manaGastar = this.manaR;
			break;
		}
		if (manaGastar>this.mana) {
			System.out.println("Maná insuficiente!");
			valido = false;
		}
		return valido;
	}
	
	//Getters y Setters
	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getOro() {
		return oro;
	}

	public void setOro(int oro) {
		this.oro = oro;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public int getDamBaseQ() {
		return damBaseQ;
	}

	public void setDamBaseQ(int damBaseQ) {
		this.damBaseQ = damBaseQ;
	}

	public int getDamBaseW() {
		return damBaseW;
	}

	public void setDamBaseW(int damBaseW) {
		this.damBaseW = damBaseW;
	}

	public int getDamBaseE() {
		return damBaseE;
	}

	public void setDamBaseE(int damBaseE) {
		this.damBaseE = damBaseE;
	}

	public int getDamBaseR() {
		return damBaseR;
	}

	public void setDamBaseR(int damBaseR) {
		this.damBaseR = damBaseR;
	}
	
	
}
