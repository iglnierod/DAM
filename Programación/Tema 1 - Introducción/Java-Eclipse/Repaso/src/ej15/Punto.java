package ej15;

public class Punto {
	private int x;
	private int y;
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Punto() {
		
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public String obtenerCadenaCoordenadas() {
		return "(" + x + ", " + y + ")";
	}
	
	public void mostrarCoordenadas() {
		System.out.println("(" + x + ", " + y + ")");
	}
	
	public void cambiarCoordenadas(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
