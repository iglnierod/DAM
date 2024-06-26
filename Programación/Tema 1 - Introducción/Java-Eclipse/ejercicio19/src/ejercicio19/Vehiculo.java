package ejercicio19;

public abstract class Vehiculo {
	private String color;
	private byte numRuedas;
	private short cilindrada;
	private short potencia;
	
	//Constructores
	public Vehiculo() {
		
	}
	
	public Vehiculo(String color, byte numRuedas, short cilindrada, short potencia) {
		this.color = color;
		this.numRuedas = numRuedas;
		this.cilindrada = cilindrada;
		this.potencia = potencia;
	}

	public Vehiculo(String color, short cilindrada, short potencia) {
		this.color = color;
		this.cilindrada = cilindrada;
		this.potencia = potencia;
	}
	
	//Getters & Setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public byte getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(byte numRuedas) {
		this.numRuedas = numRuedas;
	}

	public short getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(short cilindrada) {
		this.cilindrada = cilindrada;
	}

	public short getPotencia() {
		return potencia;
	}

	public void setPotencia(short potencia) {
		this.potencia = potencia;
	}	
	
	//Metodos
	public abstract double impuesto();
}
