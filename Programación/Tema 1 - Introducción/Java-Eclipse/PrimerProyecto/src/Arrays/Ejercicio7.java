package Arrays;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String colores[] = { "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado" };
		System.out.println("Introduzca 8 palabras: ");

		String[] frase = new String[8];
		for (int i = 0; i < frase.length; i++) {
			frase[i] = sc.next();
		}
		sc.close();

		String[] aux = new String[8];
		//Colocamos los colores al principio de aux[]
		int posicion = 0;
		for (String palabra : frase) {
			for (String color : colores) {
				if (palabra.equals(color)) {
					aux[posicion] = palabra;
					posicion++;
				}
			}
		}
		//Colocamos el resto de palabras a continuacion de los colores
		boolean esColor;
		for (String palabra : frase) {
			esColor = false;
			for (String color : colores) {
				if (palabra.equals(color)) {
					esColor = true;
					break;
				}
			}
			if (esColor == false) {
				aux[posicion] = palabra;
				posicion++;
			}
		}
		
		//Mostramos resultado (aux[])
		for (String item : aux) {
			System.out.println(item);
		}

	}

}
