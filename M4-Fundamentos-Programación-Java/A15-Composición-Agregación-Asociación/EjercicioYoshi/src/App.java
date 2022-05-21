
public class App {

	public static void main(String[] args) {
		Botas b = new Botas("cafe");
		Manzana m = new Manzana("roja");
		Luigi lu = new Luigi("luigi");
		
		Yoshi y = new Yoshi("verde", "yoshi", b); //Composición botas -------<> luigi
		
		lu.montarYoshi(y); //asociación  luigi ---------- yoshi
		m.ingerida(y); //asociación manzana --------- yoshi
		

	}

}
