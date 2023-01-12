package Arrays;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int[] numero = new int[20];

		// Llenamos array con numeros aleatorios
		for (int i = 0; i < numero.length; i++) {
			numero[i] = (int) Math.round(Math.random() * 401);
		}

		Scanner sc = new Scanner(System.in);

		// Mostramos array numero[]
		for (int i = 0; i < numero.length; i++) {
			if (i == numero.length - 1) {
				System.out.print(numero[i]);
			} else {
				System.out.print(numero[i] + ", ");
			}
		}

		// Preguntamos si quiere multiplos de 5 o de 7
		System.out.println("\n\n5.- Ver múltiplos de 5");
		System.out.println("7.- Ver múltiplos de 7");
		int multiplos = sc.nextInt();
		sc.close();

		switch (multiplos) {
		case 5:
			// Si numero[i] MOD 5 = 0 entonces lo ponemos entre corchetes, si no NO.
			for (int i = 0; i < numero.length; i++) {
				if (numero[i] % 5 == 0) {
					if (i == numero.length - 1) {
						System.out.print("[" + numero[i] + "]");
					} else {
						System.out.print("[" + numero[i] + "], ");
					}
				} else {
					if (i == numero.length - 1) {
						System.out.print(numero[i]);
					} else {
						System.out.print(numero[i] + ", ");
					}
				}
			}
			break;
		case 7:
			// Si numero[i] MOD 7 = 0 entonces lo ponemos entre corchetes, si no NO.
			for (int i = 0; i < numero.length; i++) {
				if (numero[i] % 7 == 0) {
					if (i == numero.length - 1) {
						System.out.print("[" + numero[i] + "]");
					} else {
						System.out.print("[" + numero[i] + "], ");
					}
				} else {
					if (i == numero.length - 1) {
						System.out.print(numero[i]);
					} else {
						System.out.print(numero[i] + ", ");
					}
				}
			}
			break;

		default:
			System.err.println("Introduzca 5 o 7");
		}

	}

}
