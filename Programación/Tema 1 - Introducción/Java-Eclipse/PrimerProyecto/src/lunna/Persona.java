package lunna;

import java.util.Scanner;

import Ejercicio25POO.Main;

public class Persona {
	// ATRIBUTOS
	private String nombre;
	private String apellidos;
	private int edad;
	private String direccion;
	private String dni;
	// CONSTANTE
	private final String Ciudad = "Santiago de Compostela";

	// CONSTRUCTORES
	public Persona(String nombre, String apellidos, int edad, String direccion, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.direccion = direccion;
		this.dni = dni;
	}

	// METODOS
	public String getNombre() {
		return this.nombre;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCiudad() {
		return Ciudad;
	}

	public void imprimir() {
		System.out.println("Nombre: " + getNombre());
		System.out.println("Apellidos: " + getApellidos());
		System.out.println("Edad: " + getEdad());
		System.out.println("Dirección: " + getDireccion());
		System.out.println("DNI: " + getDni());
		System.out.println("Ciudad: " + getCiudad());
		System.out.println("- - - - - - - - - - - - - - - -");
	}

	// MAIN
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Persona p1 = new Persona("Rodrigo", "Iglesias Nieto", 18, "Corredoira das fraguas", "45961236Z");
//		System.out.println(p1.getNombre());
//		System.out.println(p1.Ciudad);
		p1.imprimir();
		p1.setDireccion("Carrer Barcelona");
		p1.imprimir();

		Persona p6 = new Persona("Juan", "Perez", 32, "Calle Falsa 123", "12345678A");

		Persona p2 = new Persona("Maria", "Garcia", 25, "Calle Real 456", "87654321B");

		Persona p3 = new Persona("Pedro", "Sanchez", 41, "Avenida Grande 789", "13572468C");

		Persona p4 = new Persona("Isabel", "Rodriguez", 29, "Calle Pequeña 111", "24680135D");

		Persona p5 = new Persona("Javier", "Martinez", 35, "Plaza Central 222", "35798024E");
		
		p6.imprimir();
		p2.imprimir();
		p3.imprimir();
		p4.imprimir();
		p5.imprimir();
	}
}
