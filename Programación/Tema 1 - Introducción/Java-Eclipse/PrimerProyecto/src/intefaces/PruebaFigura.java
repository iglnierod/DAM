package intefaces;

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
	}
}
