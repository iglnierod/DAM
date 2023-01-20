package ejercicio22POO;

public final class Senador extends Legislador {
	private int numeroAsiento;

	public Senador(String nombre, String apellidos, int edad, boolean estaCasado, String proviciaQueRepresenta,
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
		System.out.println("Senado");
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nSu número de asiento en la cámara alta es el " + this.numeroAsiento;
	}
}
