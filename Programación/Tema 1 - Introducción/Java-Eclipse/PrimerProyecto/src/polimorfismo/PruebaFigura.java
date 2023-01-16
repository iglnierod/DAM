package polimorfismo;

public class PruebaFigura {

	public static void main(String[] args) {
		Figura f;
		f = new Triangulo(3, 4, "marrón");
		System.out.println(f.getColor());
//		System.out.println(f.getBase());
		Triangulo t = new Triangulo(4, 3, "gris");
		System.out.println(t.getBase());

		f = new Triangulo(2, 4, "verde");
		System.out.println("Área triangulo: " + f.area());

		f = new Circulo(5, "amarillo");
		System.out.println("Area circulo: " + f.area());

		f = new Rectangulo(5, 4, "negro");
		System.out.println("Area rectángulo: " + f.area());

		Figura[] figuras = new Figura[5];
		figuras[0] = new Circulo(4, "rojo");
		figuras[1] = new Triangulo(2, 7, "verde");
		figuras[2] = new Rectangulo(4, 6, "amarillo");
		figuras[3] = new Circulo(3, "azul");
		figuras[4] = new Triangulo(7, 3, "morado");

		System.out.println("\nÁreas desde bucle for: ");
		for (int i = 0; i < figuras.length; i++) {
			System.out.println("Area: " + figuras[i].area() + " color = " + figuras[i].getColor());
		}

		// For each
		for (Figura fig : figuras) {
			System.out.println("Area: " + fig.area() + " color = " + fig.getColor());
		}

		// Instance of
		if (f instanceof Circulo) {
			System.out.println("Es un cículo.");
		}

		if (f instanceof Rectangulo) {
			System.out.println("Es un rectángulo.");
		}

		if (f instanceof Figura) {
			System.out.println("Es una figura.");
		}

		Circulo c = new Circulo(3, "rosa");

		if (c instanceof Circulo)
			System.out.println("es un circulo");

		figuras[4] = c;

		System.out.println("\nÁreas determinando el tipo de figura:");

		for (Figura fig : figuras) {
			String tipoFigura = null;

			if (fig instanceof Triangulo) {
				tipoFigura = "Triangulo";
			} else if (fig instanceof Circulo) {
				tipoFigura = "Circulo";
			} else if (fig instanceof Rectangulo) {
				tipoFigura = "Rectangulo";
			}

			System.out.printf("%10s: Área=%6.2f color=%S\n", tipoFigura, fig.area(), fig.getColor());

			f = c;

			c = (Circulo) f;

			Triangulo tr = new Triangulo(8, 2, "naranja");

			f = tr;
			c = (Circulo) f;
		}
	}

}
