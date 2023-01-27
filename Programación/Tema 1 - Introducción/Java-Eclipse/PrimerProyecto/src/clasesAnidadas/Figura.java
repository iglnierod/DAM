package clasesAnidadas;

public abstract class Figura {
	public String color;
	
	public Figura(String color) {
		this.color = color;
	}
	
	public abstract double area();
}
