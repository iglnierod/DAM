package Arrays;

public class EjercicioArrayBidimensional {
	public static void main(String[] args) {

		int[][] matriz = new int[4][3];
		// Matriz de enteros
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * 101);
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		// Matriz de decimales
		double[][] tabla = new double[4][3];
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = (Math.random() * 101);
				System.out.printf("%.2f\t", tabla[i][j]);
			}
			System.out.println();
		}

		System.out.println();

		// for each
		for (double[] fila : tabla) {
			for (double item : fila) {
				System.out.printf("%.2f\t", item);
			}
			System.out.println();
		}

		System.out.println();

		int[][] arrayBi = new int[3][];
		int[] arrayUni = { 7, 2, 5, 8 };

		arrayBi[0] = new int[2];
		arrayBi[0][0] = 3;
		arrayBi[0][1] = 9;
		arrayBi[1] = arrayUni;
		arrayBi[2] = new int[3];

		for (int i = 0; i < arrayBi.length; i++) {
			for (int j = 0; j < arrayBi[i].length; j++) {
				System.out.printf("%d ", arrayBi[i][j]);
			}
			System.out.println();
		}

		System.out.println();

		for (int[] fila : arrayBi) {
			for (int item : fila) {
				System.out.print(item + " ");
			}
			System.out.println();
		}
		System.out.println("Nº elementos 1ª dimension: " + arrayBi.length);
		System.out.println("Nº items primer elemento: " + arrayBi[0].length);
		System.out.println("Nº items ");

	}
}
