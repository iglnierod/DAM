package ejerciciosV.ficheros;

import java.io.*;

public class ej2 {

	public static void main(String[] args) {
		String rutaFichero = "C:\\Users\\DAM1_Alu07\\Desktop\\DAM_git\\Programación\\Tema 1 - Introducción\\Java-Eclipse\\PrimerProyecto\\src\\ejerciciosV\\ficheros\\ej1.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(rutaFichero))) {
			String linea = br.readLine();
			String[] array = linea.split(" ");
			double numero = 0;
			double suma = 0;
			for (int i = 0; i < array.length; i++) {
				suma += Double.parseDouble(array[i]);
				if (i == array.length - 1)
					System.out.print(array[i]);
				else
					System.out.print(array[i] + " + ");
			}
			System.out.println(String.format(" = %1.2f", suma).replace(',', '.'));
		} catch (IOException e) {
			System.out.println("No se ha encontrado el archivo: " + rutaFichero);
		}
	}

}
