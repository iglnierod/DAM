package prueba4_dam;

import java.io.*;
import java.util.*;

public class Refranes {
	public static void escribirArchivo(String ruta, boolean bool) {
		File file = new File(ruta);
		String rutaEscribir = "";
		if (bool) {
			rutaEscribir = "lineasInvPalabrasOrd.txt";
		} else {
			rutaEscribir = "linasInvertidas.txt";	
		}
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String linea;
			List<String> lineas = new ArrayList<>();
			while ((linea = br.readLine()) != null) {
				lineas.add(linea);
			}
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File(file.getParent(), rutaEscribir)))) {
				if (bool) {
					String[] lineaOrdenada;
					for (int i = lineas.size() - 1; i >= 0; i--) {
						lineaOrdenada = lineas.get(i).split(" ");
						Arrays.sort(lineaOrdenada);

						String string = "";
						for (int j = 0; j < lineaOrdenada.length; j++) {
							string += lineaOrdenada[j] + " ";
						}
						bw.write(string + "\r\n");
					}

				} else {
					for (int i = lineas.size() - 1; i >= 0; i--) {
						bw.write(lineas.get(i) + "\r\n");
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String ruta = "C:\\Users\\dam1_exam_prog\\Desktop\\Prueba4\\refranes.txt";
		escribirArchivo(ruta, false);
	}
}
