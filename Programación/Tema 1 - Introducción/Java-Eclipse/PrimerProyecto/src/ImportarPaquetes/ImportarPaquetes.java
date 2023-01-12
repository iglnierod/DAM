package ImportarPaquetes;

import documentos.gestion_economica.*;
import documentos.RRHH.*;

public class ImportarPaquetes {

	public static void main(String[] args) {
		System.out.println("CONTRATOS:");
		Contrato contrato1 = new Contrato("Alberto", 5);
		contrato1.imprimirInfo();
		Contrato contrato2 = new Contrato("Roberto", 24);
		contrato2.imprimirInfo();
		Contrato contrato3 = new Contrato("Alicia", 48);
		contrato3.imprimirInfo();
		
		System.out.println("FACTURAS");
		Factura factura1 = new Factura("Jesus", 2500);
		factura1.imprimirInfo();
		Factura factura2 = new Factura("Marcos", 5000);
		factura2.imprimirInfo();
		Factura factura3 = new Factura("Pedro", 2999);
		factura3.imprimirInfo();
	}

}
