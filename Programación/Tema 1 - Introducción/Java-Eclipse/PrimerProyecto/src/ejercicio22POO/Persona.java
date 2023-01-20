package ejercicio22POO;

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

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("La persona " + this.nombre + " " + this.apellidos + " tiene " + this.edad + " años y ");
		if (!this.estaCasado)
			stringBuilder.append("no");
		stringBuilder.append(" está casada");
		return stringBuilder.toString();
	}

}
