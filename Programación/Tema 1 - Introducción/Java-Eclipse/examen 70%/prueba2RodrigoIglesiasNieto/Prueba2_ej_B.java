package prueba2RodrigoIglesiasNieto;

import java.util.Scanner;

public class Prueba2_ej_B {

	public static void main(String[] args) {
		// Leemos la frase y la paso a mayusculas
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca una cadena de texto: ");
		String frase = sc.nextLine();
		frase = frase.toUpperCase();
		sc.close();
		// Creamos array vocales y otro que cuente cuantas vocales hay de cada
		char[] vocales = { 'A', 'E', 'I', 'O', 'U' };
		int[] numVocales = new int[5];

		// Si frase.charAt(i) es vocal suma 1 en numVocales
		for (int i = 0; i < frase.length(); i++) {
			for (int j = 0; j < vocales.length; j++) {
				if (frase.charAt(i) == vocales[j]) {
					numVocales[j]++;
					break;
				}
			}
		}

		// Mostramos la vocal y su numero de repeticiones si es diferente de 0
		for (int i = 0; i < vocales.length; i++) {
			if (numVocales[i] != 0) {
				System.out.println(vocales[i] + ":" + numVocales[i]);
			}
		}
	}

}