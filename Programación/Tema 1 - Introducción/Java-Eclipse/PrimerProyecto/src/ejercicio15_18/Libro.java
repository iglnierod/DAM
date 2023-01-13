package ejercicio15_18;

public class Libro extends Publicacion {
	private String titulo;
	private String tipoPortada;
	private String isbn;
	private String nombreAutor;
	private String editorial;

	// Constructores
	public Libro() {
		super();
		titulo = null;
		tipoPortada = null;
		isbn = null;
		nombreAutor = null;
		editorial = null;
	}

	public Libro(int numeroDePaginas, int precio, String titulo, String tipoPortada, String isbn, String nombreAutor,
			String editorial) {
		super(numeroDePaginas, precio);
		this.titulo = titulo;
		this.tipoPortada = tipoPortada;
		this.isbn = isbn;
		this.nombreAutor = nombreAutor;
		this.editorial = editorial;
	}

	// Getters & Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTipoPortada() {
		return tipoPortada;
	}

	public void setTipoPortada(String tipoPortada) {
		this.tipoPortada = tipoPortada;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getNombreAutor() {
		return nombreAutor;
	}

	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

}
