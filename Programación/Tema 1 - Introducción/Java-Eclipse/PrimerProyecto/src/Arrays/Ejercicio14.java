package Arrays;

public class Ejercicio14 {

	public static void main(String[] args) {
		int[][] numeros = new int[4][5];
		int[] fila = new int[4];
		int[] columna = new int[5];
		
		int aleatorio;
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				aleatorio = (int) (Math.random() * 10 + 1);
				numeros[i][j] = aleatorio;
				fila[i] += numeros[i][j];
				System.out.print(numeros[i][j] + "\t");
			}
			System.out.print(" = " + fila[i]);
			System.out.println();
		}
		
		int contador = 0;
		do {
			System.out.print("-");
			contador++;
		}while(contador < 35);
		System.out.println();
		for (int posicion = 0; posicion <= numeros.length; posicion++) {
			for (int j = 0; j < numeros.length; j++) {
				if(numeros[j][posicion] % 2 == 0) {
				columna[posicion] += numeros[j][posicion];
				}
			}
			System.out.print(columna[posicion] +"\t");
		}
	}

}
