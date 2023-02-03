package ej15;

public class Pruebas {

	public static void main(String[] args) {
		Punto a = new Punto(0,0);
		Punto b = new Punto(2,2);
		Punto c = new Punto(2,0);
		
		Triangulo t = new Triangulo(a, b, c);
		System.out.println(t.obtenerDistanciaEntrePuntos(a, b));
		System.out.println(a.obtenerCadenaCoordenadas());
		System.out.println(b.obtenerCadenaCoordenadas());
		System.out.println(c.obtenerCadenaCoordenadas());
	
		t.mostrarVertices();
		System.out.println(t.obtenerPerimetro());
	}

}