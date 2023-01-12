package Arrays;

public class Ejercicio16 {

	public static void main(String[] args) {
		int[][] simetrica = new int[4][4];

		simetrica[0][0] = 1;
		simetrica[1][0] = 5;
		simetrica[2][0] = -3;
		simetrica[3][0] = 9;

		simetrica[0][1] = 5;
		simetrica[1][1] = 0;
		simetrica[2][1] = 2;
		simetrica[3][1] = -1;

		simetrica[0][2] = -3;
		simetrica[1][2] = 2;
		simetrica[2][2] = 8;
		simetrica[3][2] = 4;

		simetrica[0][3] = 9;
		simetrica[1][3] = -1;
		simetrica[2][3] = 4;
		simetrica[3][3] = 6;

		for (int i = 0; i < simetrica.length; i++) {
			for (int j = 0; j < simetrica[i].length; j++) {
				System.out.printf("%3d",simetrica[i][j]);
			}
			System.out.println();
		}
		
		for(int i = 0; i < simetrica.length; i++) {
			for(int j = 0; j < simetrica[i].length; j++) {
				
			}
		}
	}

}
