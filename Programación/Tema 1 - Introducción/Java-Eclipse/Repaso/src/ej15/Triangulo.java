package ej15;

public class Triangulo extends Punto {
	private Punto v1;
	private Punto v2;
	private Punto v3;

	public Triangulo(Punto v1, Punto v2, Punto v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}

	public static int obtenerDistanciaEntrePuntos(Punto A, Punto B) {
		int x = (B.getX() - A.getX());
		int y = (B.getY() - A.getY());
		return (int) Math.sqrt(x * x + y * y);
	}

	public void mostrarVertices() {
		System.out.println(v1.obtenerCadenaCoordenadas() + ", " + v2.obtenerCadenaCoordenadas() + ", "
				+ v3.obtenerCadenaCoordenadas());
	}
	
	public int obtenerPerimetro() {
		return this.obtenerDistanciaEntrePuntos(v1, v2) +
			   this.obtenerDistanciaEntrePuntos(v2, v3) +
			   this.obtenerDistanciaEntrePuntos(v3, v1);
	}
}
