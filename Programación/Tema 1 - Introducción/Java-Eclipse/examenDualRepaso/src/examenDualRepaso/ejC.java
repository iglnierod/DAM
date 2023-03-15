package examenDualRepaso;

import java.io.*;

public class ejC {
	
	public static void engadirEstadísticas(String rutaFichero) {
		File fOriginal = new File(rutaFichero);
		File fEstadisticas = new File(fOriginal.getParent(), "estadisticas.txt");
		int numLineas = 0;
		String linea;
		int numPalabras = 0;
		try(BufferedReader br = new BufferedReader(new FileReader(fOriginal))){
			while( (linea = br.readLine()) != null) {
				numLineas++;
				numPalabras += linea.split(" ").length;
			}
		} catch (FileNotFoundException e) {
			System.err.println("No se encuentra el fichero: " + rutaFichero);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(fEstadisticas, true))){
			bw.write(rutaFichero + ": " + numPalabras + " palabras en " + numLineas + " líneas.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
	}
}
