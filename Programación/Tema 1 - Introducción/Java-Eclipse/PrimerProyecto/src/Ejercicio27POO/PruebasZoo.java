package Ejercicio27POO;

public class PruebasZoo {
	public static void main(String[] args) {
		Avestruz avestruz = new Avestruz();
		Ballena ballena = new Ballena();
		Felino felino = new Felino();
		Gato gato = new Gato();
		Loro loro = new Loro();
		Murcielago murcielago = new Murcielago();
		Pato pato = new Pato();
		Perro perro = new Perro();
		
		avestruz.caminar();
		ballena.nadar();
		felino.nadar();
		gato.caminar();
		loro.volar();
		murcielago.nadar();
		pato.nadar();
		perro.caminar();
	}
}
