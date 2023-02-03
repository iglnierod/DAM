package ej22;

public abstract class Legislador extends Persona {
	private String provinciaQueRepresenta;
	private String partidoPolitico;
	private int numeroDespacho;

	public Legislador(String nombre, String apellidos, int edad, boolean estaCasado, String provinciaQueRepresenta,
			String partidoPolitico, int numeroDespacho) {
		super(nombre, apellidos, edad, estaCasado);
		this.provinciaQueRepresenta = provinciaQueRepresenta;
		this.partidoPolitico = partidoPolitico;
		this.numeroDespacho = numeroDespacho;
	}
	
	public abstract void mostrarCamaraEnQueTrabaja();

	public String getProvinciaQueRepresenta() {
		return provinciaQueRepresenta;
	}

	public void setProvinciaQueRepresenta(String provinciaQueRepresenta) {
		this.provinciaQueRepresenta = provinciaQueRepresenta;
	}

	public String getPartidoPolitico() {
		return partidoPolitico;
	}

	public void setPartidoPolitico(String partidoPolitico) {
		this.partidoPolitico = partidoPolitico;
	}

	public int getNumeroDespacho() {
		return numeroDespacho;
	}

	public void setNumeroDespacho(int numeroDespacho) {
		this.numeroDespacho = numeroDespacho;
	}
}
