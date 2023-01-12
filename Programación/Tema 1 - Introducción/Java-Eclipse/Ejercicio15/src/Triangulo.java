
public class Triangulo {
	private Punto v1;
	private Punto v2;
	private Punto v3;

	// Constructor
	public Triangulo(Punto v1, Punto v2, Punto v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}

	// Getters & Setters
	public Punto getVertice1() {
		return v1;
	}

	public void setVertice1(Punto vertice1) {
		this.v1 = vertice1;
	}

	public Punto getVertice2() {
		return v2;
	}

	public void setVertice2(Punto vertice2) {
		this.v2 = vertice2;
	}

	public Punto getVertice3() {
		return v3;
	}

	public void setVertice3(Punto vertice3) {
		this.v3 = vertice3;
	}

	// Métodos
	public void mostrarVertices() {
		System.out.println(v1.obtenerCadenaCoordenadas() + " , " +
		v2.obtenerCadenaCoordenadas() + " , " + 
		v3.obtenerCadenaCoordenadas());
	}

	public static double obtenerDistanciaEntrePuntos(Punto A, Punto B) {
		int x = (B.getX() - A.getX());
		int y = (B.getY() - A.getY());
		return Math.sqrt(x * x + y * y); //Raiz cuadrada
	}

	public double obtenerPerimetro() {
		return Triangulo.obtenerDistanciaEntrePuntos(v1, v2) +
		Triangulo.obtenerDistanciaEntrePuntos(v2, v3) +
		Triangulo.obtenerDistanciaEntrePuntos(v3, v1);
	}
	
	// Main
	public static void main(String[] args) {
		Punto v1 = new Punto(0, 0);
		Punto v2 = new Punto(2, 0);
		Punto v3 = new Punto(1, 1);
		Triangulo triangulo = new Triangulo(v1, v2, v3);
		triangulo.mostrarVertices();
		System.out.println("La distancia entre v1 y v2 es: " + Triangulo.obtenerDistanciaEntrePuntos(v1, v2));
		System.out.println("El perímetro del triángulo es: " + triangulo.obtenerPerimetro());
	}

}
