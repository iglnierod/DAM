package flujos;

import java.io.*;

public class Flujos {
	public static void leerFicheroTextoPreJava7() {
		String rutaFichero = "C:\\Users\\DAM1_Alu07\\Desktop\\DAM_git\\Programación\\Tema 1 - Introducción\\Java-Eclipse\\PrimerProyecto\\src\\flujos\\datos.txt";
		FileReader lector = null;
		try {
			lector = new FileReader(rutaFichero);
			int valor = lector.read();
			while (valor != -1) {
				System.out.print((char) valor);
				valor = lector.read();
			}
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el fichero");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (lector != null)
				try {
					lector.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

	// Con try-with-resources
	public static void leerFicheroTexto() {
		String rutaFichero = "C:\\Users\\DAM1_Alu07\\Desktop\\DAM_git\\Programación\\Tema 1 - Introducción\\Java-Eclipse\\PrimerProyecto\\src\\flujos\\datos.txt";
		try (FileReader lector = new FileReader(rutaFichero)) {
			int valor;
			while ((valor = lector.read()) != -1) {
				System.out.print((char) valor);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void escribirFicheroTexto() {
		String rutaFichero = "C:\\Users\\DAM1_Alu07\\Desktop\\DAM_git\\Programación\\Tema 1 - Introducción\\Java-Eclipse\\PrimerProyecto\\src\\flujos\\escribiendo.txt";
		String cadena = "Escribiendo una cadena desde Java";
		try (FileWriter escritor = new FileWriter(rutaFichero)) {
			for (int i = 0; i < cadena.length(); i++) {
				escritor.write(cadena.charAt(i));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void leerConBuffer() {
		String rutaFichero = "C:\\Users\\DAM1_Alu07\\Desktop\\DAM_git\\Programación\\Tema 1 - Introducción\\Java-Eclipse\\PrimerProyecto\\src\\flujos\\codigo.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(rutaFichero))) {
			String linea;
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void escribirConBuffer() {
		String cadena1 = "escribiendo una cadena desde Java";
		String cadena2 = "Segunda frase";
		String cadena3 = "Tercera línea";

		StringBuilder sb = new StringBuilder();
		sb.append("\nTexto procedente de ");
		sb.append("un StringBuilder");
		sb.append("\n");
		sb.append("Ya incluye los salto de línea");

		String rutaFichero = "C:\\Users\\DAM1_Alu07\\Desktop\\DAM_git\\Programación\\Tema 1 - Introducción\\Java-Eclipse\\PrimerProyecto\\src\\flujos\\escribiendoConBuffer.txt";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaFichero, true))) {
			bw.append(cadena1);
			bw.newLine();
			bw.append(cadena2);
			bw.newLine();
			bw.append(cadena3);

			bw.append(sb);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// <========= FICHEROS BINARIOS =========>
	public static byte[] leerFicheroBinario() {
		String rutaFichero = "C:\\Users\\DAM1_Alu07\\Desktop\\DAM_git\\Programación\\Tema 1 - Introducción\\Java-Eclipse\\PrimerProyecto\\src\\ejerciciosV\\java-logo.png";
		byte[] datos = {};
		try (FileInputStream fis = new FileInputStream(rutaFichero)) {
			datos = new byte[fis.available()];
			int contador = 0;
			while (fis.available() > 0)
				datos[contador++] = (byte) fis.read();

		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return datos;
	}

	public static void escribirFicheroBinario(byte[] datos) {
		String rutaFichero = "C:\\Users\\DAM1_Alu07\\Desktop\\DAM_git\\Programación\\Tema 1 - Introducción\\Java-Eclipse\\PrimerProyecto\\src\\ejerciciosV\\nuevoBinario.png";
		try(FileOutputStream fos = new FileOutputStream(rutaFichero)){
			for(int i = 0; i < datos.length; i++) {
				fos.write(datos[i]);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
//		leerFicheroTexto();
//		escribirFicheroTexto();
//		leerConBuffer();
//		escribirConBuffer();
//		leerFicheroBinario();
//		escribirFicheroBinario(leerFicheroBinario());		
	}
}
