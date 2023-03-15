package examenDualRepaso;

import java.util.*;
import java.io.*;

public class ejA {
	public static void main(String[] args) {
		final int CANTIDAD = 5;
		int[] enteros = new int[CANTIDAD];
		int indice = 0;
		int divisor = 0;
		int contador = 0;
		Scanner entrada = new Scanner(System.in);
		while (contador < CANTIDAD) {
			try {
				System.out.print("Introduzca un índice del array: ");
				indice = Integer.parseInt(entrada.nextLine());
				System.out.print("Introduzca un divisor: ");
				divisor = Integer.parseInt(entrada.nextLine());
				enteros[indice] = 5 / divisor;
				contador++;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.println("Indice fuera de los limites del array: " + e.getMessage());
			} catch (NumberFormatException e) {
				System.err.println("Formato numérico incorrecto: " + e.getMessage());
			} catch (ArithmeticException e) {
				System.err.println("El valor de divisor no puede ser 0: " + e.getMessage());
			}
		}
		System.out.print("enteros: ");
		for (int entero : enteros)
			System.out.print(entero + " ");
	}

}
