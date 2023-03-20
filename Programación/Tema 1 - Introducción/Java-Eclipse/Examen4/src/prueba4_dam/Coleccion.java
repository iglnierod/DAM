package prueba4_dam;

import java.util.*;

public class Coleccion {
	public static void generarColeccion() {
		Random r = new Random();
		Set<Integer> coleccion = new LinkedHashSet<>();
		List<Integer> lista = new ArrayList<>();
		int contador = 10;
		while(coleccion.size() < 10) {
			int random = r.nextInt(1,16);
			if(coleccion.contains(random)) {
				lista.add(random);
				contador++;
			} else {
				coleccion.add(random);
			}
		}
		System.out.println(coleccion);
		System.out.println("Cantidad de numeros generados: " + contador);
		
		List<Integer> noGenerados = new ArrayList<>();
		for(int i = 1; i <= 15; i++) {
			if(!coleccion.contains(i)) {
				noGenerados.add(i);
			}
		}
		
		System.out.println("Numeros no generados: " + noGenerados);
		Collections.sort(lista);
		System.out.println("Numeros generados varias veces: " + lista);
	}
	
	public static void main(String[] args) {
		generarColeccion();
	}
}
