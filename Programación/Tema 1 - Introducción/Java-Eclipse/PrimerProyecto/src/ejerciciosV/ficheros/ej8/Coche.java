package ejerciciosV.ficheros.ej8;

import java.io.Serializable;

public class Coche implements Serializable {
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
		return "Coche favorito: " + marca + " " + modelo + " de color " + color;
	}
}
