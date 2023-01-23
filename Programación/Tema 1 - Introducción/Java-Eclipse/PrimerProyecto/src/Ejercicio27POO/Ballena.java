package Ejercicio27POO;

public class Ballena extends Mamifero implements Nadador{
	public Ballena() {
		
	}
	
	public Ballena(String especie, String color) {
		super(especie, color);
	}
	@Override
	public void nadar() {
		System.out.println("Las ballenas podemos nadar");
	}
}
