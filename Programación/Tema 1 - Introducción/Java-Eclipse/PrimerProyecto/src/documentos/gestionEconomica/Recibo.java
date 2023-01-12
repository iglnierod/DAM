package documentos.gestionEconomica;

public class Recibo {

	public int dia;
	public int mes;
	public int año;
	public String concepto;

	// Constructor
	public Recibo(String nuevoConcepto, int nuevoDia, int nuevoMes, int nuevoAño) {
		this.concepto = nuevoConcepto;
		this.dia = nuevoDia;
		this.mes = nuevoMes;
		this.año = nuevoAño;
	}

	public void imprimirInfo() {
		System.out.println("Fecha: " + dia + "/" + mes + "/" + año);
		System.out.println("Concepto: " + concepto);
	}
}
