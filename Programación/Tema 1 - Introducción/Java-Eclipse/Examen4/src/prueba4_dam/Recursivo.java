package prueba4_dam;

public class Recursivo {
	// Este método calcula la potencia de `x` elevado al exponente `y` -> x^y
	// El método debería ser calcularPotencia(int base, int exponente){}
	private static double metodo(int x, int y) {
		if (y == 0)
			return 1;
		else if (y > 0)
			return x * metodo(x, y - 1);
		else
			return x * metodo(x, y + 1);
	}

	public static void main(String[] args) {
		System.out.println(metodo(-2,-3));
	}
}
