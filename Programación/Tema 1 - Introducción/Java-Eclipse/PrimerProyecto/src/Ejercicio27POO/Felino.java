package Ejercicio27POO;

public class Felino extends Mamifero implements Caminante, Nadador {
	public Felino() {

	}

	public Felino(String especie, String color) {
		super(especie, color);
	}
	
	@Override
	public void caminar() {
		System.out.println("Los felinos podemos caminar");
	}
	
	@Override
	public void nadar() {
		System.out.println("Los felinos podemos nadar");
	}
}
