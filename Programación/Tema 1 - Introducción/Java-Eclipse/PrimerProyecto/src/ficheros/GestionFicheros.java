package ficheros;

import java.io.*;

public class GestionFicheros {
	public static void main(String[] args) {
		File fichero = new File("ejemplo.txt");
		System.out.println("¿Existe ejemplo.txt?: " + fichero.exists());
		System.out.println("Ruta absoluta de ejemplo.txt:" + fichero.getAbsolutePath());

		File directorioProyecto = new File("").getAbsoluteFile();
		System.out.println("Ruta absoluta directorioProyecto: " + directorioProyecto.getAbsolutePath());

		String[] listado = directorioProyecto.list();
		System.out.println("Nº de elementos en " + directorioProyecto.getAbsolutePath() + ":" + listado.length);

//		for (String s : listado) {
//			System.out.print(s);
//			File elemento = new File(directorioProyecto, s);
//			if (elemento.isDirectory()) {
//				System.out.print("/");
//				System.out.println();
//				String[] listadoSubDir = elemento.list();
//				for(String s2 : listadoSubDir)
//					System.out.println("\t"+s2);
//			}
//			System.out.println();
//		}

		File d = new File(directorioProyecto, "pruebas");
//		System.out.println(d.exists());
		d.mkdir(); // Si ya está creado da false
//		System.out.println(d.exists());
		File f = new File(d, "ejemplo.txt");

		try {
			if (f.createNewFile())
				System.out.println("Fichero creado correctamente.");
			else
				System.out.println("No se ha podido crear el fichero.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			System.out.println("No hay permisos suficientes para crear el archivo");
			e.printStackTrace();
		}

		try (FileWriter escritor = new FileWriter(f)) {
			escritor.write("Texto de ejemplo después de crear el fichero.");
		} catch (Exception e) {
			e.printStackTrace();
		}

		File f2 = new File(d, "renombrado.txt");

		if (f.renameTo(f2))
			System.out.println("Fichero renombrado correctamente");
		else
			System.out.println("No se ha podido renombrar el fichero");

		if (f2.delete())
			System.out.println("Fichero eliminado correctamente");
		else
			System.out.println("No se ha podido eliminar el fichero");
	}

}
