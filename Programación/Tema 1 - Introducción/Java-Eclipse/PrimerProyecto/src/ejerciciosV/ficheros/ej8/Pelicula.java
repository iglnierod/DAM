package ejerciciosV.ficheros.ej8;

public class Pelicula {
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
