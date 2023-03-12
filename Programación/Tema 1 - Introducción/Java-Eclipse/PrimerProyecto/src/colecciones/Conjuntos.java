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

		Set<String> colores = new TreeSet<>();
		colores.add("rojo");
		colores.add("azul");
		colores.add("verde");
		colores.add("azul");

		System.out.println("colores: " + colores);

		ComparadorPrecioAscendente cmp = new ComparadorPrecioAscendente();
		Set<Producto> prods = new TreeSet<>();
		prods = new TreeSet<>(new Comparator<Producto>() {
			@Override
			public int compare(Producto o1, Producto o2) {
				return Double.compare(o1.getPrecio(), o2.getPrecio());
			}
		});

		prods = new TreeSet<>(Collections.reverseOrder());
		prods = new TreeSet<>(Collections.reverseOrder(new ComparadorPrecioAscendente()));

		// OPERACIONES LANDA
		prods = new TreeSet<>((a, b) -> Double.compare(a.getPrecio(), b.getPrecio())); // ORDENA POR PRECIO MENOR A
																						// MAYOR
		prods = new TreeSet<>((a, b) -> a.getNombre().compareTo(b.getNombre())); // ORDENA POR NOMBRE ORDEN ALFAB.
		prods = new TreeSet<>((a, b) -> a.getCantidad() - b.getCantidad()); // ORDENA POR CANTIDAD ASC
//		prods = new TreeSet<>((a, b) -> a.getNombre().length() - b.getNombre().length()); // ORDENA POR LONGITUD DE NOMBRE [NO FUNCIONA, SE COME LOS QUE TIENEN LA MISMA LONGITUD]

		prods = new TreeSet<>(Comparator.comparing(Producto::getCantidad));

		// ORDENA POR CANTIDAD LUEGO POR PRECIO
		prods = new TreeSet<>(Comparator.comparing(Producto::getCantidad).thenComparing(Producto::getPrecio));

		prods.addAll(productos);

		for (Producto producto : prods) {
			System.out.println(producto);
		}

		System.out.println("\n----- RESUMEN ------");
		Set<Integer> conjunto1 = new HashSet<>();
		conjunto1.add(20);
		conjunto1.add(10);
		conjunto1.add(1);
		conjunto1.add(5);
		conjunto1.add(20);

		System.out.println("HashSet: " + conjunto1);

		for (Integer integer : conjunto1)
			System.out.print(integer + " ");

		Set<Integer> conjunto2 = new TreeSet<>();
		conjunto2.add(20);
		conjunto2.add(10);
		conjunto2.add(1);
		conjunto2.add(5);
		conjunto2.add(20);

		System.out.println("\nTreeSet: " + conjunto2);

		for (Integer integer : conjunto2)
			System.out.print(integer + " ");

		Set<Integer> conjunto3 = new LinkedHashSet<>();
		conjunto3.add(20);
		conjunto3.add(10);
		conjunto3.add(1);
		conjunto3.add(5);
		conjunto3.add(20);

		System.out.println("\nLinkedHashSet: " + conjunto3);
		// ORDEN EN EL QUE AÑADIMOS
		for (Integer integer : conjunto3)
			System.out.print(integer + " ");

	}

}
