package Objetos;

public class Jugador {
	public static int contador = 0;
	private String nombre = null;
	
	//CONSTRUCTOR
	public Jugador(String n){
		nombre = n;
		contador++;
	}
	
	public static void main(String[] args) {
		System.out.println(Jugador.contador);
		Jugador j1 = new Jugador("Pedro");
		System.out.println(Jugador.contador);
		Jugador j2 = new Jugador("Lucas");
		System.out.println(Jugador.contador);
		System.out.println(j1.nombre + ", " + j2.nombre);		
	}
}