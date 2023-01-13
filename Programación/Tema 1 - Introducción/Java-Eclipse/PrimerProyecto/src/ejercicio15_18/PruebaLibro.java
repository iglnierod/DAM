package ejercicio15_18;

public class PruebaLibro extends Libro{

	public static void main(String[] args) {
		Libro libro = new Libro(150, 15, "El manifesto negro", "dura", "0", 
								"Frederick Forsyth", "Círculo de lectores");
		System.out.println("Nombre: " + libro.getNombreAutor());
		System.out.println("Título: " + libro.getTitulo());
		System.out.println("Editorial: " + libro.getEditorial());
		System.out.println("Portada: " + libro.getTipoPortada());
		System.out.println(libro.getNumeroDePaginas() + " páginas");
	}

}
