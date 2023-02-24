package ejerciciosV.ficheros;

import java.io.*;
import java.util.Random;

public class ej4 {

	public static void main(String[] args) {
		String rutaFichero = "C:\\Users\\DAM1_Alu07\\Desktop\\DAM_git\\Programación\\Tema 1 - Introducción\\Java-Eclipse\\PrimerProyecto\\src\\ejerciciosV\\ficheros\\ej4.txt";
		try (FileWriter lector = new FileWriter(rutaFichero)) {
			double numero = 0;
			int numDec = 0; // Numero de decimales
			Random r = new Random();
			for (int i = 0; i <= 10; i++) {
				String string;
				numero = r.nextDouble(-100, 101); // [-100,-101]
				numDec = r.nextInt(1, 6); // [1,5]
				string = String.format("%." + numDec + "f", numero).replace(',', '.');
				for (int j = 0; j < string.length(); j++) {
					lector.write(string.charAt(j));
				}
				lector.write(" ");
			}
			System.out.println("El fichero se ha creado correctamente");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
