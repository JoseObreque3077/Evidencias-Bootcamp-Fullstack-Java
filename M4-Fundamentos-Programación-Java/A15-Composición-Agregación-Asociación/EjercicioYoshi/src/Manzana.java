
public class Manzana {
	private String color;

	public Manzana(String color) {
		this.color = color;
	}
	
	public void ingerida(Yoshi y) {
		System.out.println("Esta manzana ha sido comida por " + y.getNombre());
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
