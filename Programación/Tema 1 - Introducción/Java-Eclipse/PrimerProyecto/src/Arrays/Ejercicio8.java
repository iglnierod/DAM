package Arrays;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca el numero de DNI: ");
		int numero = sc.nextInt();
		sc.close();

		char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
				'L', 'K', 'E' };

		int posicion = numero % 23;

		System.out.println("La letra del DNI es: " + letras[posicion]);
	}
}
