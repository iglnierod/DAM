package Repaso;

public class e2 {

	public static void main(String[] args) {
		// Rellena un array con 100 números enteros aleatorios que representan notas de
		// exámenes (valores entre 0 y 10 incluídos). Muestralos por pantalla y muestra
		// también la media y la moda de dichos valores. Haz también una representación
		// gráfica mostrando un asterisco por cada repetición del mismo valor.

		int[] notas = new int[100];

		double media = 0;

		for (int i = 0; i < notas.length; i++) {
			notas[i] = (int) (Math.random() * 11);
			media += notas[i];
			if (i % 10 == 0) {
				System.out.println();
			}
			System.out.printf("%4d", notas[i]);
		}

		System.out.printf("\n\nLa media es: " + (media / 100));

		int[] moda = new int[11];
		int posicion = 0;

		for (int i = 0; i < notas.length; i++) {
			posicion = notas[i];
			moda[posicion]++;
		}

		int max = moda[0];
		posicion = 0;
		for (int i = 0; i < moda.length; i++) {
			if (max < moda[i]) {
				max = moda[i];
				posicion = i;
			}
		}
		System.out.println("\nLa moda es: " + posicion);
		System.out.println();

		for (int i = 0; i < moda.length; i++) {
			System.out.printf(i + ":");
			if (i != 10) {
				System.out.print(" ");
			}
			for (int j = 0; j <= moda[i]; j++) {

				System.out.printf("%2s", "*");
			}
			System.out.println();
		}

	}

}
