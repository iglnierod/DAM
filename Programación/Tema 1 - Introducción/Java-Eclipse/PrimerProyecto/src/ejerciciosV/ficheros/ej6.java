package ejerciciosV.ficheros;

import java.util.Scanner;
import java.io.*;

public class ej6 {
	private static Scanner sc = new Scanner(System.in);

	private static String getTipoFichero(String ruta) {
		String extension = ".";
		int i = ruta.lastIndexOf('.');
		if (i > 0) {
			extension = ruta.substring(i);
		}
		return extension;
	}

	public static boolean ocultarTexto(String ruta) {
		File imagen = new File(ruta);

		// Comprobar si la imagen existe
		if (!imagen.exists()) {
			System.err.println("La imagen no existe en la ruta: " + ruta);
			return false;
		}

		byte[] datos = {};
		int contador = 0;

		try (BufferedInputStream fis = new BufferedInputStream(new FileInputStream(ruta))) {
			datos = new byte[fis.available()];

			// Copiar datos de la imagen original a un array byte[]
			while (fis.available() > 0)
				datos[contador++] = (byte) fis.read();
			fis.close();
			// Introducir texto que se ocultará + llenar hasta los 100 caracteres
			String texto = "";
			do {
				System.out.println("Introduzca el texto a ocultar en la imagen (Máximo 100 caracteres): ");
				texto = sc.nextLine();
				int longitud = texto.length();
				if (texto.length() > 100)
					System.err.println("El texto pasa los 100 caracteres");

				else if (texto.length() < 100)
					for (int i = 0; i < (100 - longitud); i++)
						texto += " ";

			} while (texto.length() > 100);

			// Pedir nombre para crear la imagen
			System.out.println("Introduzca el nombre con el que desea crear la imagen: ");
			File imagenConTexto = new File(imagen.getParent(), sc.nextLine() + getTipoFichero(ruta));

			try (FileOutputStream fos = new FileOutputStream(imagenConTexto)) {
				// Escribir datos de la imagen
				fos.write(datos);

				for (int i = 0; i < texto.length(); i++) {
					fos.write(texto.charAt(i));
				}

//				byte[] textoEnBytes = texto.getBytes();
//				// Escribir texto al final de la imagen
//				fos.write(textoEnBytes);

			}

		} catch (IOException e) {
			e.printStackTrace();
			return false;
		} catch (SecurityException e) {
			System.err.println("No se tienen permisos para ver la imagen.");
			return false;
		}
		System.out.println("Se ha creado la imagen correctamente.");
		return true;
	}

	// MAIN
	public static void main(String[] args) {
		String ruta = "";
		boolean operacionCorrecta = false;
		do {
			System.out.print("Introduce la ruta de la imagen: ");
			ruta = sc.nextLine();
			operacionCorrecta = ocultarTexto(ruta);
		} while (!operacionCorrecta);
	}
}
