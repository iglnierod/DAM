package colecciones;

import java.util.*;

public class Listas {

	public static void main(String[] args) {
//		ArrayList<String> colores = new ArrayList<String>();
		ArrayList<String> colores = new ArrayList<>();

		colores.add("rojo");
		System.out.println("colores: " + colores);

		colores.add("azul");
		System.out.println("colores: " + colores);

		colores.add(1, "verde");
		System.out.println("colores: " + colores);

		System.out.println("2º color: " + colores.get(1));

		System.out.println("Eliminar 2º color: " + colores.remove(1));
		System.out.println("colores: " + colores);

		System.out.println("Buscando \"azul\": " + colores.indexOf("azul"));
		System.out.println("Buscando \"verde\": " + colores.indexOf("verde"));

		String cor = colores.set(1, "verde");
		System.out.println("cor (color remplazado): " + cor);
		System.out.println("colores: " + colores);

		System.out.println("Nº de elementos: " + colores.size());

		colores.clear();
		System.out.println("Nº de elementos: " + colores.size());

		System.out.println("-- - - - - - - - - - - - -");
		colores.add("rojo");
		colores.add("verde");
		colores.add("azul");
		colores.add("amarillo");
		colores.add("verde");
		colores.add("naranja");
		colores.add("verde");
		colores.add("violeta");

		System.out.println("colores: " + colores);

		System.out.println("Indice del primer verde: " + colores.indexOf("verde"));
		System.out.println("Indice del último verde: " + colores.lastIndexOf("verde"));

		System.out.println("Eliminar Verde: " + colores.remove("Verde"));
		System.out.println(colores);
		System.out.println("Eliminar verde: " + colores.remove("verde"));
		System.out.println(colores);

		List<String> sublistaColores = colores.subList(1, 5);
		System.out.println(sublistaColores);

		ArrayList<String> colorcillos = new ArrayList<>(sublistaColores); // new ArrayList<>(colores.subList(1,5)
		System.out.println("colorcillos: " + colorcillos);

		System.out.println("contains(\"naranja\"): " + colores.contains("naranja"));
		System.out.println("colorcillos(\"Azul\"): " + colorcillos.contains("Azul"));

		Collections.reverse(colores);
		System.out.println("colores(invertidos): " + colores);
		Collections.reverse(colores);
		System.out.println("colores(invertidos): " + colores);

		Collections.sort(colores); // Alfabeticamente
		System.out.println("colores(ordenado): " + colores);

//		colores.removeIf(n -> (n.equals("verde"))); 
//		colores.removeIf(n -> (n.charAt(0) == 'v'));
//		colores.removeIf(n -> (n.charAt(n.length() - 1) == 'a'));
		colores.removeIf(n -> (n.endsWith("jo")));
//		colores.removeIf(n -> (n.length() < 6));

//		System.out.println("colores(Predicado): " + colores);

		System.out.println("ArrayColores:");
//		String[] arrayColores = new String[colores.size()];
//		String[] arrayColores = new String[9];	
		String[] arrayColores = new String[3];
		arrayColores = colores.toArray(arrayColores);
		for (String s : arrayColores)
			System.out.print(s + " ");

		System.out.println("\n- - - - - - - - - - -");
		// ITERADORES

		Iterator<String> it = colores.iterator();
		while (it.hasNext()) {
//			String s = it.next();
//			System.out.println(s + " " + s.toUpperCase());

			if (it.next().equals("verde"))
				it.remove();
		}
		System.out.println(colores);

		// NO SE PUEDEN CREAR ARRAYLIST DE TIPOS PRIMITIVOS
		ArrayList<Integer> enteros = new ArrayList<>();
		enteros.add(7);
		enteros.add(4);
		enteros.add(6);
		enteros.add(3);
		enteros.add(9);
		System.out.println("enteros: " + enteros);

//		Iterator<Integer> it2 = enteros.iterator();
//		while (it2.hasNext())
//			if ((int) it2.next() % 2 == 0)
//				it2.remove();
//		System.out.println(enteros);

//		for (int i : enteros) {
//			if (i % 2 == 0)
//				enteros.remove(i);
//		}
//		System.out.println(enteros);

		for (int i = 0; i < enteros.size(); i++)
			if (enteros.get(i) % 2 == 0)
				enteros.remove(i);

		System.out.println(enteros);
	}

}
