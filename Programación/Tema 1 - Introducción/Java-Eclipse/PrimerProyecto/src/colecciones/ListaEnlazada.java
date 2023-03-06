package colecciones;

import java.util.*;

public class ListaEnlazada {

	public static void main(String[] args) {
		LinkedList<String> colores = new LinkedList<>();

		colores.add("rojo");
		colores.add("azul");
		System.out.println("colores: " + colores);

		colores.add(1, "verde");
		System.out.println("colores: " + colores);

		System.out.println("\ndescendingIterator: ");
		Iterator<String> dit = colores.descendingIterator();
		while (dit.hasNext())
			System.out.print(dit.next() + " ");

		System.out.println("\n\nListIterator: ");

		ListIterator<String> lit = colores.listIterator();
		System.out.println(lit.next());
		lit.add("negro");
		lit.add("blanco");
		System.out.println("Siguiente indice: " + lit.nextIndex());
		System.out.println("Indice anterior: " + lit.previousIndex());
		System.out.println("Color anterior: " + lit.previous());

		System.out.println("\nRecorrer hacia atras con ListIterator: ");
		while (lit.hasPrevious())
			System.out.println(lit.previousIndex() + ":" + lit.previous());

		System.out.println("\nRecorrer desde el indice 2 con ListIterator: ");
		lit = colores.listIterator(2);
		while (lit.hasNext())
			System.out.println(lit.nextIndex() + ":" + lit.next());

		lit.add("amarillo");
		lit.add("verde");
		lit.add("violeta");
		lit.add("naranja");
		lit.add("verde");
		lit.add("marron");
		lit.add("gris");

		System.out.println(colores);

		System.out.println("\nCambiar el verde más cercano y anterior al índice 8 " + "por turquesa con ListIterator:");
		lit = colores.listIterator(8);
		while (lit.hasPrevious()) {
			if (lit.previous().equals("verde")) {
				lit.set("turquesa");
				break;
			}
		}

		System.out.println(colores);

		LinkedList<String> coloresABorrar = new LinkedList<>();
		coloresABorrar.add("amarillo");
		coloresABorrar.add("violeta");

		colores.removeAll(coloresABorrar);
		System.out.println("colores: " + colores);

		LinkedList<String> coloresAEliminar = new LinkedList<>(Arrays.asList("azul", "marron", "rojo"));
		colores.removeAll(coloresAEliminar);
		System.out.println(colores);

		colores.addAll(coloresABorrar);
		System.out.println("colores: " + colores);

		colores.addAll(3, coloresAEliminar);
		System.out.println("colores: " + colores);

		colores.addFirst("beige");
		System.out.println("colores: " + colores);

		colores.removeLast();
		System.out.println("colores: " + colores);

		if (colores.removeLastOccurrence("verde"))
			System.out.println("elminado el último verde");
		else
			System.out.println("no se encontró ningún verde");
		System.out.println("colores: " + colores);

		if (colores.removeLastOccurrence("verde"))
			System.out.println("elminado el último verde");
		else
			System.out.println("no se encontró ningún verde");
		System.out.println("colores: " + colores);

		if (colores.removeLastOccurrence("verde"))
			System.out.println("elminado el último verde");
		else
			System.out.println("no se encontró ningún verde");
		System.out.println("colores: " + colores);

//		LinkedList<String> coloresAEliminar = new LinkedList<>(Arrays.asList("azul", "marron", "rojo"));
		String[] arrayVerbos = { "andar", "correr", "nadar" };
		List<String> listaVerbos = Arrays.asList(arrayVerbos);
		System.out.print("arrayVerbos: ");
		for (String s : listaVerbos)
			System.out.print(s + " ");
		System.out.println("\nlistaVerbos: " + listaVerbos);

		System.out.println();

		arrayVerbos[1] = "BUCEAR";
		System.out.print("arrayVerbos: ");
		for (String s : listaVerbos)
			System.out.print(s + " ");
		System.out.println("\nlistaVerbos: " + listaVerbos);

		
		List<String> sublista = colores.subList(3, 8);
		System.out.println("\ncolores: " + colores);
		System.out.println("sublista: " + sublista);
		
		System.out.println("\nSubstituir en sublista: " + sublista.set(1, "morado"));
		System.out.println("sublista: " + sublista);	
		System.out.println("colores: " + colores);	
		
		System.out.println("\nSubstituir en lista original: " + colores.set(5, "salmón"));
		System.out.println("sublista: " + sublista);	
		System.out.println("colores: " + colores);
	}

}
