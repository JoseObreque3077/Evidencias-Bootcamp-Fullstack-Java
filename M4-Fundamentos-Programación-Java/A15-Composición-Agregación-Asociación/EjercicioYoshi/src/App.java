
public class App {

	public static void main(String[] args) {
		Botas b = new Botas("cafe");
		Manzana m = new Manzana("roja");
		Luigi lu = new Luigi("luigi");
		
		Yoshi y = new Yoshi("verde", "yoshi", b); //Composici�n botas -------<> luigi
		
		lu.montarYoshi(y); //asociaci�n  luigi ---------- yoshi
		m.ingerida(y); //asociaci�n manzana --------- yoshi
		

	}

}
