package ExplicacionPOO;

// JAVABEANS
public class Persona {
	// ATRIBUTOS
	private String nombre;
	private int edad;
	private boolean mayorEdad;
	private boolean jubilado;

	// CONSTRUCTOR
	public Persona() {

	}

	// GETTERS & SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isMayorEdad() {
		return mayorEdad;
	}

	public void setMayorEdad(boolean mayorEdad) {
		this.mayorEdad = mayorEdad;
	}

	public boolean isJubilado() {
		return jubilado;
	}

	public void setJubilado(boolean jubilado) {
		this.jubilado = jubilado;
	}
}
