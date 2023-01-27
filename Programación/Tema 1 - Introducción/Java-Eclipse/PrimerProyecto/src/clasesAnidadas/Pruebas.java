package clasesAnidadas;

import clasesAnidadas.ClaseExterna.*;

public class Pruebas {

	public static void main(String[] args) {
		ClaseAnidadaEstatica cae = new ClaseAnidadaEstatica();
		cae.imprimir();
		
		ClaseExterna ce = new ClaseExterna();
		ClaseAnidadaInterna cai = ce.new ClaseAnidadaInterna();
		cai.imprimir();
		
		ce.metodoExterno();
	}

}
