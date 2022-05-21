package padres;

/**
 * Clase abstracta que representa a un personaje (jugable o NPC) del videojuego League of Legends
 * @author José Obreque F
 *
 */
public abstract class Personaje {
	private String nombre;
	private String bando;
	private float posX;
	private float posY;
	private int vida;
	private int damBase;
	private int vidaBase;
	private int expBase;
	private int oroBase;
	private boolean vive;
	
	
	
	public Personaje(String nombre, String bando, float posX, float posY, int damBase, int vidaBase,
			int expBase, int oroBase) {
		this.nombre = nombre;
		this.bando = bando;
		this.posX = posX;
		this.posY = posY;
		this.vida = vidaBase;
		this.damBase = damBase;
		this.vidaBase = vidaBase;
		this.expBase = expBase;
		this.oroBase = oroBase;
		this.vive = true;
	}

	/**
	 * Método que permite el desplazamiento del personaje a las coordenadas entregadas como parámetros.
	 * @param x - float: coordenada de destino en el eje X.
	 * @param y - float: coordenada de destino en el eje Y.
	 */
	public void mover(float x, float y) {
		this.posX = x; //La nueva posición del personaje (eje X) es x.
		this.posY = y; //La nueva posición del personaje (eje Y) es y.
		System.out.println(this.nombre + " se mueve a las coordenadas (" + x + ", " + y + ")");
	}
	
	/**
	 * Método que representa la muerte de un personaje, siempre y cuando su vida haya llegado a cero.
	 */
	public void morir() {
		if (this.vida == 0) {
			this.vive = false; //La variable auxiliar booleana pasa a ser falsa == personaje muerto
			System.out.println(this.nombre + " ha muerto!");
		}
	}
	
	/**
	 * Método que representa la resurrección de un personaje, siempre y cuando esté muerto.
	 */
	public void revivir() {
		if (!this.vive) {
			this.vive = true; //La variable auxiliar booleana pasa a ser verdadera == personaje vivo
			this.vida = this.vidaBase; //La vida se recupera por completo a su valor base
			System.out.println(this.nombre + " ha vuelto a la vida!");
		}
	}
	
	/**
	 * Método que representa un ataque básico de un personaje, inflingido a otro personaje.
	 * @param pj - (Personaje): Instancia de la clase Personaje.
	 */
	public void ataqueBasico(Personaje pj) {
		//Resumen: Si el ataque es válido, hazlo inflingiendo daño base (ataque básico)
		if (validarAtaque(pj)) {
			atacar(pj, this.damBase);
		}
	}
	
	/**
	 * Método privado que permite comprobar si un intento de ataque es válido o no
	 * @param pj - (Personaje): Instancia de la clase Personaje
	 * @return (Boolean): Verdadero si el ataque es válido, falso en caso contrario.
	 */
	protected boolean validarAtaque(Personaje pj) {
		/*
		 * Condiciones para un ataque válido:
		 * 1) No atacar a un aliado
		 * 2) No intentar atacar a un personaje muerto
		 */
		boolean valido = true;
		if (pj.getBando() == this.bando) {
			System.out.println("No se puede atacar al aliado!");
			valido = false;
		}
		else if (!pj.isVive()) {
			System.out.println("No se puede atacar a un objetivo muerto!");
			valido = false;
		}
		return valido;
	}
	
	/**
	 * Método privado que permite inflingir daño de ataque a un personaje.
	 * @param pj - (Personaje): Instancia de la clase Personaje.
	 * @param dam - (int): Daño a inflingir.
	 */
	protected void atacar(Personaje pj, int dam) {
		if (pj.getVida() <= this.damBase) {
			pj.setVida(0);
			System.out.println(pj.getNombre() + " recibe daño mortal!" + " HP: " + pj.getVida());
			pj.morir();
		}
		else {
			pj.setVida(pj.getVida() - this.damBase);
			System.out.println(pj.getNombre() + " recibe " + this.damBase + " puntos de daño!" + " HP: " + pj.getVida());
		}
	}
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPosX() {
		return posX;
	}

	public void setPosX(float posX) {
		this.posX = posX;
	}

	public float getPosY() {
		return posY;
	}

	public void setPosY(float posY) {
		this.posY = posY;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getDamBase() {
		return damBase;
	}

	public void setDamBase(int damBase) {
		this.damBase = damBase;
	}

	public int getVidaBase() {
		return vidaBase;
	}

	public void setVidaBase(int vidaBase) {
		this.vidaBase = vidaBase;
	}

	public boolean isVive() {
		return vive;
	}

	public void setVive(boolean vive) {
		this.vive = vive;
	}

	public String getBando() {
		return bando;
	}

	public void setBando(String bando) {
		this.bando = bando;
	}

	public int getExpBase() {
		return expBase;
	}

	public void setExpBase(int expBase) {
		this.expBase = expBase;
	}

	public int getOroBase() {
		return oroBase;
	}

	public void setOroBase(int oroBase) {
		this.oroBase = oroBase;
	}
	
}
