package intefaces;

public class Triangulo extends Figura implements OperacionesBasicas{
	private int base;
	private int altura;

	public Triangulo(int base, int altura, String color) {
		super(color);
		this.base = base;
		this.altura = altura;
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

	@Override
	public double area() {
		return (base * altura) / 2f;
	}
	
	@Override
	public void rotar(int grados) {
		if(grados > OperacionesBasicas.rotacionMinima) // Podemos acceder porque es static
			System.out.println("El triángulo ha rotado " + grados + "°");
		else
			System.out.println("El ángulo mínimo de rotación es " + OperacionesBasicas.rotacionMinima + "°");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
