package colecciones.ejercicios;

import java.util.*;

public class ej4 {
	public static List<Integer> obtenerListaSinRepetidos(List<Integer> list) {
		Set<Integer> hashSet = new HashSet<>();
		Iterator<Integer> it = list.iterator();

		while (it.hasNext()) {
			int entero = it.next();
			if (hashSet.contains(entero)) {
				it.remove();
			} else {
				hashSet.add(entero);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(4);
		System.out.println(obtenerListaSinRepetidos(list));
	}
}
