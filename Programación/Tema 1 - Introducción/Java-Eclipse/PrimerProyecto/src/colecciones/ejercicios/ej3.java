package colecciones.ejercicios;

import java.util.*;

public class ej3 {
	
	public static void eliminaRepetidos(List<Integer> lista) {
        // Creamos un nuevo HashSet que almacenará los valores únicos
        HashSet<Integer> set = new HashSet<>();
        
        // Iteramos sobre cada elemento de la lista
        Iterator<Integer> iter = lista.iterator();
        while(iter.hasNext()) {
            Integer num = iter.next();
            
            // Si el elemento ya está en el HashSet, lo eliminamos de la lista
            if(set.contains(num)) {
                iter.remove();
            } else {
                set.add(num);
            }
        }
    }
	
	public static void main(String[] args) {
		List<Integer> enteros = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 3, 4, 2, 5));
	    eliminaRepetidos(enteros);
	    System.out.println("enteros: " + enteros);
	}
}
