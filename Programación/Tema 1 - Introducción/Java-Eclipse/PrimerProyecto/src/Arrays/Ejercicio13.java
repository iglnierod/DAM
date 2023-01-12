package Arrays;

public class Ejercicio13 {

	public static void main(String[] args) {
		int[][] numeros = new int[4][5];
		int aleatorio;
		int sumaFila = 0;
		int sumaColumna = 0;
		for (int i = 0; i < numeros.length; i++) {
			sumaFila = 0;
			sumaColumna = 0;
			for (int j = 0; j < numeros[i].length; j++) {
				aleatorio = (int) (Math.random() * 10 + 1);
				numeros[i][j] = aleatorio;
				sumaFila += numeros[i][j];
				System.out.print(numeros[i][j] + "\t");
			}
			System.out.print(" = " + sumaFila);
			System.out.println();
		}
		
		int contador = 0;
		do {
			System.out.print("-");
			contador++;
		}while(contador < 35);
		System.out.println();
		
		
		for (int posicion = 0; posicion <= numeros.length; posicion++) {
			sumaColumna = 0;
			for (int j = 0; j < numeros.length; j++) {
				if(numeros[j][posicion] % 2 == 0) {
				sumaColumna += numeros[j][posicion];
				}
			}
			System.out.print(sumaColumna +"\t");
		}
	}
}
