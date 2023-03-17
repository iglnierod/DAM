package colecciones.ejercicios;

import java.util.*;

public class ej6 {
	public static Set<Integer> sorteoBonoloto(){
		Set<Integer> coleccion = new LinkedHashSet<>();
		Random r = new Random();
		while(coleccion.size() < 6)
			coleccion.add(r.nextInt(1,50));
		return coleccion;
	}
	
	public static void main(String[] args) {
		System.out.println(sorteoBonoloto());
	}
}
