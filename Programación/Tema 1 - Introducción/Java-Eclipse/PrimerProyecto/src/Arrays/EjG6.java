package Arrays;

import java.util.Scanner;

public class EjG6 {
	public static void main(String[] args) {

		// Pide al usuario por teclado una frase y pasa sus caracteres a un array de
		// caracteres. Puedes hacer con o sin métodos de String.

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca una frase:");
		String frase = sc.nextLine();
		sc.close();
		int longitud = frase.length();

		char[] frases = new char[longitud];

		for (int i = 0; i < frases.length; i++) {
			frases[i] = frase.charAt(i);
			System.out.print(frases[i]);
		}
	}
}
