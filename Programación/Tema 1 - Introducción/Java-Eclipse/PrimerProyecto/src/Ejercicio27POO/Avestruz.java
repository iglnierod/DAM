package Ejercicio27POO;

public class Avestruz extends Ave implements Caminante{
	public Avestruz() {
		
	}
	
	public Avestruz(float alturaMax) {
		super(alturaMax);
	}
	
	@Override
	public void caminar() {
		System.out.println("Las aveztruces podemos caminar");
	}
	
}
