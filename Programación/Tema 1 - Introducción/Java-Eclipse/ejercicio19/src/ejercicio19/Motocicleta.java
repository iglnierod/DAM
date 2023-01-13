package ejercicio19;

public class Motocicleta extends Vehiculo {
	private byte numeroDePlazas;

	// Constructores
	public Motocicleta() {

	}

	public Motocicleta(byte numeroDePlazas) {
		this.numeroDePlazas = numeroDePlazas;
	}

	public Motocicleta(String color, byte numRuedas, short cilindrada, short potencia, byte numeroDePlazas) {
		super(color, numRuedas, cilindrada, potencia);
		this.numeroDePlazas = numeroDePlazas;
	}

	public Motocicleta(String color, short cilindrada, short potencia) {
		super(color, cilindrada, potencia);
	}

	// Getters & Setters
	public byte obtenerNumeroDePlazas() {
		return numeroDePlazas;
	}

	public void establecerNumeroDePlazas(byte numeroDePlazas) {
		this.numeroDePlazas = numeroDePlazas;
	}
	
	//Metodos
		@Override
		public double impuesto() {
			return getCilindrada() / 30 + getPotencia() * 30;
		}

}
