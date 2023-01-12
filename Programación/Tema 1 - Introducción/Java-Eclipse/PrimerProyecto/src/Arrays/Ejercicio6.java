package Arrays;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca 10 numeros: ");
		int[] numeros = new int[10];
		for (int i = 0; i < 10; i++) {
			numeros[i] = sc.nextInt();
		}
		sc.close();
		int maximo = numeros[0];
		int minimo = numeros[1];

		// Comprobamos cual es el mayor y el menor
		for (int i = 0; i < numeros.length; i++) {
			if (maximo < numeros[i]) {
				maximo = numeros[i];
			}
			if (minimo > numeros[i]) {
				minimo = numeros[i];
			}
		}

		for (int i = 0; i < numeros.length; i++) {
			// Mostramos si es maximo
			if (maximo == numeros[i]) {
				if (i == numeros.length - 1) {
					System.out.print("[MAXIMO: " + numeros[i] + "]");
				} else {
					System.out.print("[MAXIMO: " + numeros[i] + "], ");
				}
				// Mostramos si es minimo
			} else if (minimo == numeros[i]) {
				if (i == numeros.length - 1) {
					System.out.print("[MINIMO: " + numeros[i] + "]");
				} else {
					System.out.print("[MINIMO: " + numeros[i] + "], ");
				}
				// Mostramos si no es maximo ni es minimo
			} else {
				if (i == numeros.length - 1) {
					System.out.print(numeros[i]);
				} else {
					System.out.print(numeros[i] + ", ");
				}
			}
		}
	}

}
