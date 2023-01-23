package Ejercicio27POO;

public class Pato extends Ave implements Caminante, Nadador, Volador{
	public Pato() {
		
	}
	public Pato(float alturaMax) {
		super(alturaMax);
	}
	
	@Override
	public void caminar() {
		System.out.println("Los patos podemos caminar");
	}
	
	@Override
	public void nadar() {
		System.out.println("Los patos podemos nadar");
	}
	
	@Override
	public void volar() {
		System.out.println("Los patos podemos volar");
	}
}
