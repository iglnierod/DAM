
package prueba2RodrigoIglesiasNieto;

import java.util.Scanner;

public class Prueba2_ej_C {

	public static void main(String[] args) {
		
		// Leemos todas las instrucciones
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca la cantidad de filas: ");
		int filas = sc.nextInt();
		System.out.print("Introduzca la cantidad de columnas: ");
		int columnas = sc.nextInt();
		System.out.print("Introduzca el caracter para el contorno: ");
		String contorno = sc.next();
		System.out.print("Introduzca el caracter para el relleno: ");
		String relleno = sc.next();
		sc.close();

		// Creamos array con filas y columnas introducidas
		String[][] array = new String[filas][columnas];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				// i = 0 y j = 0 son la primera columna y la primera fila
				// y i == filas - 1 y j == columnas -1 son las ultimas
				if (i == 0 || j == 0 || i == filas - 1 || j == columnas - 1) {
					array[i][j] = contorno;
					System.out.print(array[i][j]);
				} else {
					array[i][j] = relleno;
					System.out.print(array[i][j]);
				}
			}
			System.out.println();
		}
	}

}
