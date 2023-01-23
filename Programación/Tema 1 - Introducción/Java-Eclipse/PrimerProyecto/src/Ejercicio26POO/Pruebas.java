package Ejercicio26POO;

public class Pruebas {

	public static void main(String[] args) {
		Persona pavarotti = new Persona();
		Canario piolin = new Canario();
		Gallo claudio = new Gallo();
		Escenario.hacerCantar(piolin);
	    Escenario.hacerCantar(claudio);
	    Escenario.hacerCantar(pavarotti);
	}

}
