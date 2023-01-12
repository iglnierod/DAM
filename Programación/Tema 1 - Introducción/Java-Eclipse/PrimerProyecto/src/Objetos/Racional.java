package Objetos;

public class Racional {
	private int numerador;
	private int denominador;

	public void setDatos(int num, int den) {
		numerador = num;
		if (den == 0) {
			den = 1; // EL denominador no puede ser 0
		}
		denominador = den;
	}

	public void getRacional() {
		System.out.println(numerador + " / " + denominador);
	}

	public static Racional sumar(Racional a, Racional b) {
		Racional resultado = new Racional();
		int num = a.numerador * b.denominador + a.denominador * b.numerador;
		int den = a.denominador * b.denominador;
		resultado.setDatos(num, den);
		return resultado;

	}

	public static void main(String[] args) {
		Racional r1,r2;
		r1 = new Racional();
		r2 = new Racional();
		
		r1.setDatos(2, 5);
		r2 = r1;
		
		r1.setDatos(3, 7);
		r1.getRacional();
		r2.getRacional();
		
		r2 = new Racional();
		r2.setDatos(2, 5);
		r1.getRacional();
		r2.getRacional();
		
		System.out.println("---------");
		
		Racional r3;
		r3 = Racional.sumar(r1, r2);
		r3.getRacional();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
