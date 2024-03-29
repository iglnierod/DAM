package serializacion.interfaces;

import java.util.Arrays;

public class PruebaFigura {

	public static void main(String[] args) {
		OperacionesBasicas ob;
		ob = new Triangulo(3, 5, "Azul");
		ob.rotar(3);
		ob.rotar(15);
		
		ob = new Rectangulo(2, 4, "rojo");
		
		Figura f = (Rectangulo)ob;
		Rectangulo r = (Rectangulo)f;
		ob.rotar(45);
		f.getColor();
		f.area();
		r.rotar(60);
		r.getColor();
		r.getAltura();
		
		if(ob instanceof Triangulo)
			System.out.println("Es un triángulo");
		if(ob instanceof Rectangulo)
			System.out.println("Es un rectángulo");
		if(ob instanceof Figura)
			System.out.println("Es una figura");
		if(ob instanceof Object)
			System.out.println("Es un objeto");
		if(ob instanceof OperacionesBasicas)
			System.out.println("Implementa la interfaz Operaciones básicas");
		
		System.out.println("Ángulo mínimo de rotación: " + OperacionesBasicas.rotacionMinima + "°");
		
		Figura[] figuras = new Figura[5];
		figuras[0] = new Circulo(4, "rojo");
		figuras[1] = new Triangulo(2, 7, "verde");
		figuras[2] = new Rectangulo(4, 6, "amarillo");
		figuras[3] = new Circulo(3, "azul");
		figuras[4] = new Triangulo(7, 3, "morado");				
		
		for(Figura fg : figuras) {
			System.out.println(((OperacionesAvanzadas)fg).serializar());
		}
		
		Arrays.sort(figuras);
		for(Figura figura : figuras) {
			System.out.println(figura.area());
		}
	}
}