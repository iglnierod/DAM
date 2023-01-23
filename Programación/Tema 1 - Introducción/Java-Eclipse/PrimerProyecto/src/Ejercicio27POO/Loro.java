package Ejercicio27POO;

public class Loro extends Ave implements Caminante, Volador{
	
	public Loro() {
		
	}
	
	public Loro(float alturaMax) {
		super(alturaMax);
	}
	
	@Override
	public void caminar() {
		System.out.println("Los loros podemos caminar");
	}
	
	@Override
	public void volar() {
		System.out.println("Los loros podemos volar");
	}
}
