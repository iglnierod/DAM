package colecciones.ejercicios;

import java.util.*;

public class ej8 {

	public static void estadisticasPalabras() {
		Scanner sc = new Scanner(System.in);
		Set<String> palabras = new LinkedHashSet<>();
		for (int i = 0; i < 10; i++) {
			System.out.print("Introduzca una palabra (" + (i+1) + "): ");
			palabras.add(sc.nextLine());
			Iterator<String> it = palabras.iterator();
		}
		
		List<String> listOrd = new ArrayList<>(palabras);
		Collections.sort(listOrd);

		for (String string : listOrd) {
			System.out.println(string + ": " + string.length());
		}
	}

	public static void main(String[] args) {
		estadisticasPalabras();
	}

}
