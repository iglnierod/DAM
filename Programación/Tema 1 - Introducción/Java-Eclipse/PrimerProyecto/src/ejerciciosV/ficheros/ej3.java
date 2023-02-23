package ejerciciosV.ficheros;

import java.io.*;

public class ej3 {

	public static void main(String[] args) {
		String rutaFichero = "C:\\Users\\DAM1_Alu07\\Desktop\\DAM_git\\Programación\\Tema 1 - Introducción\\Java-Eclipse\\PrimerProyecto\\src\\ejerciciosV\\ficheros\\ej3.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(rutaFichero))) {
			String linea;
			String test = "";
			while((linea = br.readLine()) != null) {
				test += linea + " ";
			}
			System.out.println(test);
		} catch (IOException e) {
			System.out.println("No se ha encontrado el archivo: " + rutaFichero);
		}
	}

}
