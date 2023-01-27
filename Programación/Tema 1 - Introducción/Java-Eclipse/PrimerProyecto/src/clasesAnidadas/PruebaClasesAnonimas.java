package clasesAnidadas;

public class PruebaClasesAnonimas {
	public static void main(String[] args) {
		
		double lado = 7.5;
		//CLASE ANONIMA
		Figura cuadrado = new Figura("") {
//			private double lado;
			@Override
			public double area() {
				return lado * lado;
			}
		};
		
		System.out.println("El área de un cuadrado de lado: " + lado + " es: " + cuadrado.area());
	}
}
