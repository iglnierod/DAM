package ejerciciosV.ficheros.ej8;

import java.io.Serializable;

public class Pelicula implements Serializable{
	private String titulo;
	private int año;

	public Pelicula(String titulo, int año) {
		super();
		this.titulo = titulo;
		this.año = año;
	}

	@Override
	public String toString() {
		return "Película favorita: " + titulo + "(" + año + ")";
	}

}
