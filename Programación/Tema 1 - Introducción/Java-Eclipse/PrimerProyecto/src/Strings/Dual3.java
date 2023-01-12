package Strings;

import java.util.Scanner;

public class Dual3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el orden de la matriz: ");
		int orden = sc.nextInt();
		sc.close();
		
		int[][] matriz = new int[orden][orden];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i >= j) {
					matriz[i][j] = (int) (Math.random() * 10);
				}
				System.out.printf("%3d", matriz[i][j]);
			}
			System.out.println();
		}
	}
}