package colecciones;

import java.util.*;

public class Conjuntos {

	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<>();
		numeros.add(21);
		numeros.add(7);
		numeros.add(94);
		numeros.add(4);
		numeros.add(21);
		numeros.add(12);
		numeros.add(21);
		System.out.println("numeros" + numeros);
		for (Integer numero : numeros) {
			System.out.println(numero);
		}
		
		Set<String> nombres = new HashSet<>();
		nombres.add("Pedro");
		nombres.add("Ana");
		nombres.add("Evaristo");
		nombres.add("Ana");
		nombres.add("Lucía");
		System.out.println("nombres: " + nombres);

		for (String string : nombres) {
			System.out.print(string + " ");
		}
		
		Set<Producto> productos = new HashSet<>();
		productos.add(new Producto("sardinas", 44, 3.42, 9));
		productos.add(new Producto("colacao", 987, 8.95, 2));
		productos.add(new Producto("cerveza", 23, 4.59, 6));
		productos.add(new Producto("galletas", 123, 2.80, 4));
		productos.add(new Producto("mascarillas", 4000, 1.65, 10));
		productos.add(new Producto("colacao", 987, 8.95, 2));		
		System.out.println();
		for (Producto producto : productos) {
			System.out.println(producto);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
