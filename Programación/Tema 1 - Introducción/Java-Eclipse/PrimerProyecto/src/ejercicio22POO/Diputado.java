package ejercicio22POO;

public final class Diputado extends Legislador {
	private int numeroAsiento;

	public Diputado(String nombre, String apellidos, int edad, boolean estaCasado, String proviciaQueRepresenta,
			String partidoPolitico, int numeroDespacho, int numeroAsiento) {
		super(nombre, apellidos, edad, estaCasado, proviciaQueRepresenta, partidoPolitico, numeroDespacho);
		this.numeroAsiento = numeroAsiento;
	}

	public int getNumeroAsiento() {
		return numeroAsiento;
	}

	public void setNumeroAsiento(int numeroAsiento) {
		this.numeroAsiento = numeroAsiento;
	}

	@Override
	public void mostrarCamaraEnQueTrabaja() {
		System.out.println("Congreso");
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nSu número de asiento en la cámara baja es el " + this.numeroAsiento;
	}
}
