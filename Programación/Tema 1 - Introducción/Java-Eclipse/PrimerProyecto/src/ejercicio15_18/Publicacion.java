package ejercicio15_18;

public class Publicacion {
	private int numeroDePaginas;
	private float precio;
	
	// Constructores
	public Publicacion() {
		numeroDePaginas = 0;
		precio = 0;
	}
	
	public Publicacion(int numeroDePaginas, float precio) {
		this.numeroDePaginas = numeroDePaginas;
		this.precio = precio;
	}

	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}

	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public void imprimir() {
		System.out.println("Numero de paginas: " + this.numeroDePaginas);
		System.out.println("Precio: " + this.precio + "€");
	}
}
