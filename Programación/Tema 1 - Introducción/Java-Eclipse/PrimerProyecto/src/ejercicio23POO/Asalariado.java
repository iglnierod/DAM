package ejercicio23POO;

public class Asalariado {
	private String nombre;
	private long nif;
	private int diasVacaciones;
	private double salarioBase;

	public Asalariado(String nombre, long nif, int diasVacaciones, double salarioBase) {
		this.nombre = nombre;
		this.nif = nif;
		this.diasVacaciones = diasVacaciones;
		this.salarioBase = salarioBase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getNif() {
		return nif;
	}

	public void setNif(long nif) {
		this.nif = nif;
	}

	public int getDiasVacaciones() {
		return diasVacaciones;
	}

	public void setDiasVacaciones(int diasVacaciones) {
		this.diasVacaciones = diasVacaciones;
	}

	public double getSalario() {
		return salarioBase;
	}
}
