package prueba4_dam;

import java.io.Serializable;

public abstract class Producto implements Serializable{
	private String nombre;
	private boolean esPerecedero;
	
	public Producto(String nombre, boolean esPerecedero) {
		this.nombre = nombre;
		this.esPerecedero = esPerecedero;
	}
}
