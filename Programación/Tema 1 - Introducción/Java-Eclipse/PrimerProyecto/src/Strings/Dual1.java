package Strings;

import java.util.Scanner;

public class Dual1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca una frase: ");
		String frase = sc.nextLine();
		sc.close();

		String acronimo = frase.substring(0, 1);

		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ') {
				acronimo += frase.charAt(i + 1);
			}
		}
		System.out.println(acronimo);
	}

}
