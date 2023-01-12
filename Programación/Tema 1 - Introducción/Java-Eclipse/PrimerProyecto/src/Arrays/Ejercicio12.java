package Arrays;

public class Ejercicio12 {

	public static void main(String[] args) {
		int[][] numeros = new int[10][10];
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				if (i == j) {
					System.out.print("1");
				} else {
					System.out.print(numeros[i][j]);
				}
			}
			System.out.println();
		}
	}

}
