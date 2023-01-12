package Strings;

import java.util.Scanner;

public class Dual2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el numero de piezas: ");
		int numeroPiezas = sc.nextInt();

		int[] puzle = new int[numeroPiezas];
		int[] bolsa = new int[numeroPiezas - 1];

		for (int i = 0; i < puzle.length; i++) {
			puzle[i] = i + 1;
		}
		int piezasBolsa = 0;
		System.out.print("Introduzca el numero de la pieza: ");
		for (int i = 0; i < bolsa.length; i++) {
			piezasBolsa = sc.nextInt();
			bolsa[i] = piezasBolsa;
		}
		sc.close();

		boolean piezaEncontrada = false;
		for (int i = 0; i < puzle.length; i++) {
			piezaEncontrada = false;
			for (int j = 0; j < bolsa.length; j++) {
				if (bolsa[j] == puzle[i]) {
					piezaEncontrada = true;
					break;
				}
			}
			if (!piezaEncontrada) {
				System.out.println("La pieza que falta es: " + puzle[i]);
				break;
			}
		}
	}
}
