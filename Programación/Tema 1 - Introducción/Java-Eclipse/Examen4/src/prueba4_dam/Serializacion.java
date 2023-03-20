package prueba4_dam;

import java.io.*;

public class Serializacion {
	public static void serializar(Producto prod, String nombre) {
		File file = new File(nombre);
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
			oos.writeObject(prod);
			System.out.println("Ruta: " + file.getAbsolutePath() + " Tamaño: " + file.length() + " bytes");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			System.err.println("No se puede acceder al archivo");
		}
	}
	
	public static void main(String[] args) {
		ProductoUnitario producto = new ProductoUnitario("tarta", true, 2, 16.98);
		serializar(producto, "venta.ser");
	}
}
