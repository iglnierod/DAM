package polimorfismo.ejercicio;

public class ProfesorInterino extends Profesor {

	public ProfesorInterino(String nombre, String apellidos, int edad) {
		super(nombre, apellidos, edad);
	}

	private String nombre;
	private String apellidos;
	private int edad;

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
}
