package Ejercicio27POO;

public class Gato extends Felino{
	public Gato() {
		
	}
	
	public Gato(String especie, String color) {
		super(especie, color);
	}
	
	@Override
	public void caminar() {
		System.out.println("Los gatos podemos caminar");
	}
	
	@Override
	public void nadar() {
		System.out.println("Los gatos podemos nadar");
	}
}
