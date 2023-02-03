package ej22;

public class Senador extends Legislador{
	private int numAsiento;

	public Senador(String nombre, String apellidos, int edad, boolean estaCasado, String provinciaQueRepresenta,
			String partidoPolitico, int numeroDespacho, int numAsiento) {
		super(nombre, apellidos, edad, estaCasado, provinciaQueRepresenta, partidoPolitico, numeroDespacho);
		this.numAsiento = numAsiento;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("La persona " + getNombre() + " " + getApellidos() + "tiene " + getEdad() + " y ");
		if(!this.isEstaCasado())
			sb.append("no ");
		sb.append("está casada\n");
		sb.append("Representa a la provincia de " + getProvinciaQueRepresenta() + " para el " + getPartidoPolitico());
		sb.append("\nSu número de despacho es el " + getNumeroDespacho());
		sb.append("\nSu número de asiento en la cámara baja es el " + numAsiento);
		
		return sb.toString();
	}
	
	@Override
	public void mostrarCamaraEnQueTrabaja() {
		System.out.println("Senado");
	}
}
