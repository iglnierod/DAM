package Objetos;

public class Principal {
	
	public static void main(String[] args) {
		Secundaria s = new Secundaria();
		s.saludar();
	}
}

class Secundaria {
	public void saludar() {
		System.out.println("Saludando desde <Secundaria>");
	}
}
