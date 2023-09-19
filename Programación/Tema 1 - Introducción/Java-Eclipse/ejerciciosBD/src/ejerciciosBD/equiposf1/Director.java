package ejerciciosBD.equiposf1;

public class Director {
	// ATRIBUTOS
	private int idDirector;
	private String nombre;
	private String apellido;
	private String nacionalidad;
	private String fechaNacimiento;

	// CONSTRUCTOR
	public Director(int idDirector, String nombre, String apellido, String nacionalidad, String fechaNacimiento) {
		super();
		this.idDirector = idDirector;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacionalidad = nacionalidad;
		this.fechaNacimiento = fechaNacimiento;
	}

	// METODOS
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("idDirector: " + this.idDirector + "\n");
		sb.append("Nombre: " + this.nombre + " " + this.apellido + "\n");
		sb.append("Nacionalidad: " + this.nacionalidad + "\n");
		sb.append("Fecha nacimiento: " + this.fechaNacimiento);

		return sb.toString();
	}

	// GETTERS & SETTERS
	public int getIdDirector() {
		return idDirector;
	}

	public void setIdDirector(int idDirector) {
		this.idDirector = idDirector;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
}
