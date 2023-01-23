package Ejercicio27POO;

public class Murcielago extends Mamifero implements Caminante, Volador, Nadador{
	public Murcielago() {
		
	}
	
	public Murcielago(String especie, String color) {
		super(especie, color);
	}
	
	@Override
	public void caminar() {
		System.out.println("Los murcielagos podemos caminar");
	}
	
	@Override
	public void nadar() {
		System.out.println("Los murcielagos podemos nadar");
	}
	
	@Override
	public void volar() {
		System.out.println("Los murcielagos podemos volar");
	}
}
