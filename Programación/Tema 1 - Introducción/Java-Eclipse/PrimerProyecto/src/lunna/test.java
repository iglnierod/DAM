package lunna;

import java.io.*;

public class test {
	
	static String ruta = "E:\\DAM 1\\FOL\\Tema 7 - La jornada de trabajo\\Plan de Igualdad.pdf";
	static String ruta2 = "E:\\\\DAM 1\\\\FOL\\\\Tema 7 - La jornada de trabajo\\\\copia - Plan de Igualdad.pdf";
	public static byte[] leerFichero() {
		byte[] datos = {};
		int contador = 0;
		try(FileInputStream fis = new FileInputStream(ruta)){
			datos = new byte[fis.available()];
			while(fis.available() > 0)
				datos[contador++] = (byte) fis.read();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return datos;
	}
	
	public static void escribirFichero(byte[] datos) {
		try(FileOutputStream fos = new FileOutputStream(ruta2)){
			for(int i = 0; i < datos.length; i++) {
				fos.write(datos[i]);
			}
			System.out.println("Se ha ejecutado correctamente");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		escribirFichero(leerFichero());
	}
}
