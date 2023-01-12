package documentos.gestion_economica;

import documentos.gestionEconomica.Recibo;

public class PruebaRecibo {

	public static void main(String[] args) {
		Recibo nuevoRecibo = new Recibo("Impartición curso Java", 19, 12, 2022);
		nuevoRecibo.imprimirInfo();
	}

}
