package intefaces;

public class Rectangulo extends Figura implements OperacionesBasicas, OperacionesAvanzadas{
	private int base, altura;

	public Rectangulo(int base, int altura, String color) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double area() {
		return base * altura;
	}

	@Override
	public void rotar(int grados) {
		if(grados > OperacionesBasicas.rotacionMinima)
			System.out.println("El rectángulo ha rotado " + grados + "°");
		else
			System.out.println("El ángulo mínimo de rotacióne es " + OperacionesBasicas.rotacionMinima + "°");
	}
	
	@Override
	public String serializar() {
		StringBuilder sb = new StringBuilder();
		sb.append("Rectángulo: ");
		sb.append(" base=" + this.base);
		sb.append(" altura=" + this.altura);
		sb.append(" area=" + this.area());
		sb.append(" color=" + getColor());
		return sb.toString();
	}
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
}
