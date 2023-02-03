package ej22;

public class Persona {
	private String nombre;
	private String apellidos;
	private int edad;
	private boolean estaCasado;
	
	public Persona(String nombre, String apellidos, int edad, boolean estaCasado) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.estaCasado = estaCasado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isEstaCasado() {
		return estaCasado;
	}

	public void setEstaCasado(boolean estaCasado) {
		this.estaCasado = estaCasado;
	}
	
}
