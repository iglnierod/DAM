package ejercicio15_18;

public class PruebaPeriodico extends Periodico{

	public static void main(String[] args) {
		Periodico p1 = new Periodico();
		Periodico p2 = new Periodico(58,1.5f);
		Periodico p3 = new Periodico("La voz de Galicia","12/01/2023");
		Periodico p4 = new Periodico(58,1.5f,"La voz de Galicia","12/01/2023");
		
		System.out.println("p2:");
		p2.imprimir();
		
		System.out.println("p3:");
		p3.imprimir();
		
		System.out.println("p4:");
		p4.imprimir();
	}

}
