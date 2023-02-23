package ejerciciosV.ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ej1 {
	public static void main(String[] args) {
		String rutaFichero = "C:\\Users\\DAM1_Alu07\\Desktop\\DAM_git\\Programación\\Tema 1 - Introducción\\Java-Eclipse\\PrimerProyecto\\src\\ejerciciosV\\ficheros\\ej1.txt";
		int valor;
		char caracter;
		String cadena = "";
		double numero;
		double suma = 0;
		try (FileReader lector = new FileReader(rutaFichero)) {
			while ((valor = lector.read()) != -1) {
				caracter = (char) valor;
				if (caracter != ' ')
					cadena += caracter;
				else {
					System.out.print(cadena);
					numero = Double.parseDouble(cadena);
					suma += numero;
					System.out.print(" + ");
					cadena = "";
				}
			}
			System.out.print(cadena);
			suma += Double.parseDouble(cadena);
		System.out.print(String.format(" = %1.2f", suma).replace(",", "."));
		} catch (FileNotFoundException e) {
			System.err.println("No se encuentra el fichero: " + rutaFichero);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.err.println("No se reconoce la cadena '" + cadena + "' como número real.");
		}
	}
}
