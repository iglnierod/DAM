package ejerciciosV.ficheros.ej8;

import java.io.Serializable;

public class Persona implements Serializable {
	private String nombre;
	private int numHermanos;
	private Coche[] cochesFavoritos;
	private Pelicula[] pelisFavoritas;

	public Persona(String nombre, int numHermanos) {
		super();
		this.nombre = nombre;
		this.numHermanos = numHermanos;
	}

	public Coche[] getCochesFavoritos() {
		return cochesFavoritos;
	}

	public void setCochesFavoritos(Coche[] cochesFavoritos) {
		this.cochesFavoritos = cochesFavoritos;
	}

	public Pelicula[] getPelisFavoritas() {
		return pelisFavoritas;
	}

	public void setPelisFavoritas(Pelicula[] pelisFavoritas) {
		this.pelisFavoritas = pelisFavoritas;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(nombre + " ");
		if (numHermanos == 0) {
			sb.append("(hijo único)");
		} else if (numHermanos == 1) {
			sb.append("(un hermano)");
		} else {
			sb.append("(" + numHermanos + " hermanos" + ")");
		}

		for (Coche c : cochesFavoritos)
			sb.append("   " + c.toString());

		for (Pelicula p : pelisFavoritas)
			sb.append("   " + p.toString());

		return sb.toString();
	}
}
