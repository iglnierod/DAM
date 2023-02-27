package ejerciciosV.ficheros;

import java.util.*;
import java.io.*;

public class ej5 {
	static String ruta = "C:\\Users\\DAM1_Alu07\\Desktop\\DAM_git\\Programación\\Tema 1 - Introducción\\Java-Eclipse\\PrimerProyecto\\src\\ejerciciosV\\ficheros\\ej5.txt";
//	static String ruta2 = "E:\\DAM 1\\Programación\\Tema 1 - Introducción\\Java-Eclipse\\PrimerProyecto\\src\\ejerciciosV\\ficheros\\ej5.txt";
	static Scanner sc = new Scanner(System.in);
	
	public static void metodo(){
		double[] numeros = new double[10];
		boolean numAsignado = false;
		String string = "";
		for (int i = 0; i < numeros.length; i++) {
			do {
				System.out.print("Introduzca un número real (posición " + i + "): ");
				try {
					numeros[i] = sc.nextDouble();
					numAsignado = true;
					if (i != 0)
						string += "\n";
					string += numeros[i];
				} catch (InputMismatchException e) {
					sc.nextLine();
					numAsignado = false;
					System.err.println("Número introducido no válido");
				}
			} while (!numAsignado);

		}
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
			bw.write(string);
			System.out.println("Se han guardado 10 números reales en: " + ruta);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		metodo();
	}
}
