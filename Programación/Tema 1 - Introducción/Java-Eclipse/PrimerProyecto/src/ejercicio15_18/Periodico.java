package ejercicio15_18;

public class Periodico extends Publicacion{
	private String nombre;
	private String fecha;
	
	//Constructores
	public Periodico() {
	}
	
	public Periodico(int numeroDePaginas, float precio) {
		super(numeroDePaginas, precio);
	}
	
	public Periodico(String nombre, String fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
	}
	
	public Periodico(int numeroDePaginas, float precio, String nombre, String fecha) {
		super(numeroDePaginas, precio);
		this.nombre = nombre;
		this.fecha = fecha;
	}

	//Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	@Override
	public void imprimir() {
		System.out.println("Nombre: " + getNombre());
		System.out.println("Fecha: " + getFecha());
		System.out.println(getNumeroDePaginas() + " páginas");
		System.out.println(getPrecio() + "€");
		
	}
}
