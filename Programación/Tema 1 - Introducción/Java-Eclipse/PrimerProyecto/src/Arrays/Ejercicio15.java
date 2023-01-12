package Arrays;

public class Ejercicio15 {

	public static void main(String[] args) {
		int[][] numeros = new int[3][7];
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				numeros[i][j] = (int) (5 + Math.random() * 16);
				System.out.printf("%4d", numeros[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		int min = 0, max = 0,columna=0,fila=0;

		for (int x = 0; x < numeros.length; x++) {
			min = numeros[x][0];
			for (int y = 0; y < numeros[x].length; y++) {
				if (min > numeros[x][y]) {
					min = numeros[x][y];
					columna = y;
				}
			}
			System.out.println("Número menor fila " + (x + 1) + ": " + min + ", está en la columna: "
					+ (1 + columna));
		}
		
		System.out.println();
		
		for (int posicion = 0; posicion <= 6; posicion++) {
			max = numeros[0][posicion];
			for (int j = 0; j < numeros.length; j++) {
				if(max < numeros[j][posicion]) {
					max = numeros[j][posicion];
					fila = j;
				}
			}
			System.out.println("Número mayor columna " + (posicion + 1) + ": " + max + ", está en la fila: "
					+ (1 + fila));
		}
	}

}
