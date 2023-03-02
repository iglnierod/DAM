package ejerciciosV.ficheros;

import java.util.Scanner;
import java.io.*;

public class ej6ej7 {
	private static Scanner sc = new Scanner(System.in);

	private static String getTipoFichero(String ruta) {
		String extension = ".";
		int i = ruta.lastIndexOf('.');
		if (i > 0) {
			extension = ruta.substring(i);
		}
		return extension;
	}

	// EJ6
	public static void ocultarTexto(File imagen) {

		byte[] datos = {};
		int contador = 0;

		try (BufferedInputStream fis = new BufferedInputStream(new FileInputStream(imagen))) {
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
			File imagenConTexto = new File(imagen.getParent(), sc.nextLine() + getTipoFichero(imagen.getPath()));

			try (FileOutputStream fos = new FileOutputStream(imagenConTexto)) {
				// Escribir datos de la imagen
				fos.write(datos);

//				for (int i = 0; i < texto.length(); i++) {
//					fos.write(texto.charAt(i));
//				}

				// ====== FALLO CON LA LETRA Ñ ======
//				byte[] textoEnBytes = texto.getBytes();
//				// Escribir texto al final de la imagen
//				fos.write(textoEnBytes);

			}

			System.out.println("Se ha creado la imagen correctamente.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			System.err.println("No se tienen permisos para ver la imagen.");
		}
	}

	// EJ7
	public static boolean revelarTexto(File file) {
		try (FileInputStream fis = new FileInputStream(file)) {
			char[] datos = new char[100];
			fis.skipNBytes((file.length() - 100));
			for (int i = 0; i < 100; i++)
				datos[i] = (char) fis.read();

			for (char c : datos)
				System.out.print(c);
		} catch (FileNotFoundException e) {
			System.err.println("La imagen no existe en la ruta: " + file.getPath());
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	// MAIN
	public static void main(String[] args) {
		File file = null;
		do {
			System.out.print("Introduce la ruta de la imagen: ");
			file = new File(sc.nextLine());
			if (!file.exists())
				System.err.println("La ruta introducida no es correcta");
		} while (!file.exists());
		ocultarTexto(file);

		do {
			System.out.print("Introduce la ruta de la imagen: ");
			file = new File(sc.nextLine());
			if (!file.exists())
				System.err.println("La ruta introducida no es correcta");
		} while (!file.exists());
		revelarTexto(file);
	}

}
