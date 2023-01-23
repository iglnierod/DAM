package Ejercicio27POO;

public class Perro extends Mamifero implements Caminante, Nadador{
	public Perro() {
		
	}
	
	public Perro(String especie, String color) {
		super(especie, color);
	}
	
	@Override
	public void caminar() {
		System.out.println("Los perros podemos caminar");
	}
	
	@Override
	public void nadar() {
		System.out.println("Los perros podemos nadar");
	}
}
