package ejerciciosV;

public class EjerciciosV {
	// EJ1
	static void manipular(int[] numeros, int cantidad) {
		if (cantidad > 1) {
			for (int i = 0; i < cantidad - 1; i++)
				if (numeros[i] > numeros[i + 1]) {
					int aux = numeros[i];
					numeros[i] = numeros[i + 1];
					numeros[i + 1] = aux;
				}
			manipular(numeros, cantidad - 1);
		}
	}

	// EJ2
	static void manipularIterativo(int[] numeros, int cantidad) {
		if (cantidad > 1) {
			for (int i = 0; i < cantidad; i++) {
				if (numeros[i] > numeros[i + 1]) {
					int aux = numeros[i];
					numeros[i] = numeros[i + 1];
					numeros[i + 1] = aux;
				}
				cantidad--;
			}
		}
	}

	// EJ3
	static double potencia(int b, int e) {
		if (e == 0)
			return 1;
		if (e < 0)
			return potencia(b, e + 1) / b;
		return potencia(b, e - 1) * b;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2203, 932, 24, 56, 69, 76, 84, 90, 100 };
		int c = array.length;

		System.out.println("SIN MODIFICAR:");
		for (int item : array) {
			System.out.print(item + " ");
		}

		System.out.println();

		manipular(array, c);
		System.out.println("MANIPULAR:");
		for (int item : array) {
			System.out.print(item + " ");
		}

		System.out.println();

		manipularIterativo(array, c);
		System.out.println("MANIPULAR ITERATIVO:");
		for (int item : array) {
			System.out.print(item + " ");
		}

		System.out.println("\nPotencia");
		System.out.println(potencia(2, 3));

		System.out.println("Potencia Negativa");
		System.out.println(potencia(2, -2));
	}
}
