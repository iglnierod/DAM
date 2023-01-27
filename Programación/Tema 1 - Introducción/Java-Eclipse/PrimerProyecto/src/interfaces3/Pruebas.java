package interfaces3;

public class Pruebas {

	public static void main(String[] args) {
		Lapiz l = new Lapiz();
		l.escribirAlgo();
		l.escribirDoble("escribo con carbón");
		
		Boli b = new Boli();
		b.escribirAlgo();
		b.escribirDoble("escribo con tinta");
		
		Escribir.mostrarDescripcion();
	}

}
