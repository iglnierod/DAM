package ejerciciosV.ficheros.ej8;

import java.io.*;

public class Metodos {

	public static void serializar(Persona[] array, String ruta) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta))) {
			oos.writeObject(array);
			System.out.println("Se ha guardado el objeto correctamente.");
		} catch (FileNotFoundException e) {
			System.err.println("No se ha encontrado el archivo en la ruta: " + ruta);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Persona[] deserializar(String ruta) {
		Persona[] array = {};
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta))) {
			array = (Persona[]) ois.readObject();
		} catch (FileNotFoundException e) {
			System.err.println("No se ha encontrado el archivo en la ruta: " + ruta);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.println("ERROR: clase no encontrada " + e.getMessage());
		}
		return array;
	}

	public static Persona[] añadirContacto(Persona[] array, Persona p) {
		Persona[] contactos = new Persona[array.length + 1];
		contactos = array.clone();
		contactos[contactos.length - 1] = p;

		return contactos;
	}
}
