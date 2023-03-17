package colecciones.ejercicios;

import java.util.*;

public class ej7 {

	public static double obtenerPuntuacionTrampolin(List<Double> notas) {
	    // Si la lista tiene menos de siete elementos, devolvemos cero
	    if (notas.size() < 7) {
	        return 0.0;
	    }

	    // Convertimos la lista a un array de Double
	    Double[] array = notas.toArray(new Double[0]);

	    // Ordenamos el array de notas de menor a mayor
	    Arrays.sort(array);

	    // Eliminamos los dos valores más altos y los dos más bajos
	    notas.remove(0);
	    notas.remove(0);
	    notas.remove(notas.size() - 1);
	    notas.remove(notas.size() - 1);

	    // Creamos un nuevo array a partir de la lista modificada
	    Double[] arrayModificado = notas.toArray(new Double[0]);

	    // Sumamos las tres notas restantes y devolvemos el resultado
	    double suma = 0.0;
	    for (double nota : arrayModificado) {
	        suma += nota;
	    }
	    return suma;
	}

    public static void main(String[] args) {
        System.out.println(obtenerPuntuacionTrampolin(Arrays.asList(7.5, 6.5, 7.0, 8.0, 7.5, 8.0, 7.0)));
    }
}
