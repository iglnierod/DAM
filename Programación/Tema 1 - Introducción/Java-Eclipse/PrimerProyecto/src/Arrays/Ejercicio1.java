package Arrays;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] numeros = new int[10];
		int i = 0;
		System.out.print("Introduzca 10 números: ");
		while (i < 10) {
			numeros[i] = sc.nextInt();
			i++;
		}
		sc.close();

		for (int j = 9; j >= 0; j--) {
			System.out.print(numeros[j]);
			if (j != 0) {
				System.out.print(", ");
			}
		}

	}
}
