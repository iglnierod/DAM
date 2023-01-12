package Arrays;

public class ArraysBidimensional {

	public static void main(String[] args) {
		int[][] matriz = new int[3][4];
		matriz[0][0] = 46;
		matriz[0][1] = 13;
		matriz[0][2] = 12;
		matriz[0][3] = 27;

		matriz[1][0] = 32;
		matriz[1][1] = 12;
		matriz[1][2] = 44;
		matriz[1][3] = 11;

		matriz[2][0] = 25;
		matriz[2][1] = 61;
		matriz[2][2] = 19;
		matriz[2][3] = 42;

		System.out.println("matriz[2][1] = " + matriz[2][1] + "\n");

		// for tradicional
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		// for each
		for (int[] fila : matriz) {
			for (int item : fila) {
				System.out.print(item + " ");
			}
			System.out.println();
		}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
