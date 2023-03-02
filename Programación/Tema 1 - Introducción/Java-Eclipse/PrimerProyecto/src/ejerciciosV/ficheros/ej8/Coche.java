package ejerciciosV.ficheros.ej8;

public class Coche {
	private String marca;
	private String modelo;
	private String color;
	
	public Coche(String marca, String modelo, String color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Coche favorito: " + marca + modelo + " de color " + color;
	}
}
