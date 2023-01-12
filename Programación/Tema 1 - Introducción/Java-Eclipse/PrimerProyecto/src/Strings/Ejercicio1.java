package Strings;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		char[] vocales = { 'A', 'E', 'I', 'O', 'U' };
		int[] numVocales = new int[5];

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca una frase: ");
		String frase = sc.nextLine();
		sc.close();

		frase = frase.toUpperCase();

		char vocal;
		for (int i = 0; i < frase.length(); i++) {
			for (int j = 0; j < vocales.length; j++) {
				if (frase.charAt(i) == vocales[j]) {
					vocal = frase.charAt(i);
					switch (vocal) {
					case 'A':
						numVocales[j]++;
						break;
					case 'E':
						numVocales[j]++;
						break;
					case 'I':
						numVocales[j]++;
						break;
					case 'O':
						numVocales[j]++;
						break;
					case 'U':
						numVocales[j]++;
						break;
					}
				}
			}
		}

		for (int i = 0; i < vocales.length; i++) {
			System.out.print("La vocal " + vocales[i] + " aparece ");
			if (numVocales[i] == 1) {
				System.out.print(numVocales[i] + " vez");
			} else {
				System.out.print(numVocales[i] + " veces");
			}
			System.out.println();
		}

	}

}
