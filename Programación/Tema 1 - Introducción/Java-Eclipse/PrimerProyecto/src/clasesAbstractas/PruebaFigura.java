package clasesAbstractas;

public class PruebaFigura {

	public static void main(String[] args) {
//		Figura f = new Figura("Rojo");
		Circulo c = new Circulo(7, "azul");
		System.out.println(c.area());
	
		Triangulo t = new Triangulo(3,7,"Amarillo");
		System.out.println(t.area());
	}

}
