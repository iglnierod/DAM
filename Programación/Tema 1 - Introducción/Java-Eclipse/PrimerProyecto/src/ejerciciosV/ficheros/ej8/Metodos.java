package ejerciciosV.ficheros.ej8;

import java.io.*;

public class Metodos {
	
	public static void serializar(Persona[] array, String ruta) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta))){
			oos.writeObject(array);
			System.out.println("Se ha guardado el objeto correctamente.");
		} catch (FileNotFoundException e) {
			System.err.println("No se ha encontrado el archivo en la ruta: " + ruta);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
