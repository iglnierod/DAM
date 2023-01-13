package ejercicio19;

public class Camion extends Vehiculo{
	private byte numeroDeEjes;
	
	//Constructores
	public Camion() {
		
	}
	
	public Camion(byte numeroDeEjes) {
		this.numeroDeEjes = numeroDeEjes;
	}

	public Camion(String color, byte numRuedas, byte numeroDeEjes, short cilindrada, short potencia) {
		super(color, numRuedas, cilindrada, potencia);
		this.numeroDeEjes = numeroDeEjes;
	}
	
	//Getters & Setters
	public byte obtenerNumeroDeEjes() {
		return numeroDeEjes;
	}

	public void setNumeroDeEjes(byte numeroDeEjes) {
		this.numeroDeEjes = numeroDeEjes;
	}
}
