package ejerciciosV.ficheros;

import java.util.*;
import java.io.*;

public class ej5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] numeros = new double[10];
		boolean numAsignado = false;
		for (int i = 0; i < numeros.length; i++) {
			do {
				System.out.print("Introduzca un número real (posición " + i + "): ");
				try {
					numeros[i] = sc.nextDouble();
					numAsignado = true;
				} catch (InputMismatchException e) {
					sc.nextLine();
					numAsignado = false;
					System.out.println("Número introducido no válido");
				}
				if(i > 0)
				System.out.println(numeros[i-1]);
				System.out.println(i);
			} while (!numAsignado);
		}
	}

}
