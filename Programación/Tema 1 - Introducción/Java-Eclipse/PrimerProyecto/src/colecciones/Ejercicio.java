package colecciones;

import java.util.*;

public class Ejercicio {

	public static void main(String[] args) {
		Random r = new Random();
		int numero = 0;
		int contador = 10;
		Set<Integer> coleccion = new TreeSet<>();
		Set<Integer> numerosRestantes = new TreeSet<>();
		List<Integer> numerosDuplicados = new ArrayList<>();
		
		System.out.print("Numeros duplicados: ");
		for (int i = 0; i < 10; i++)
			while (!coleccion.add(numero = r.nextInt(1, 16))) {
				numerosDuplicados.add(numero);
				contador++;
			}
		
		for(int i = 1; i < 16; i++) 
			if(!coleccion.contains(i)) 
				numerosRestantes.add(i);
			
		
		System.out.println();
		System.out.print(coleccion);
		System.out.println(" Contador: " + contador);
		System.out.println("Numeros duplicados: " + numerosDuplicados);
		System.out.println("Numeros que faltan:" + numerosRestantes);
	}

}
