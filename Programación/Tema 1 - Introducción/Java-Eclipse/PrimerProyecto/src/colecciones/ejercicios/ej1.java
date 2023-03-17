package colecciones.ejercicios;

import java.util.*;

public class ej1 {
	
	public static ArrayList<Integer> eliminaNegativos(ArrayList<Integer> array){
		Iterator<Integer> it = array.iterator();
		while(it.hasNext()) {
			if(it.next()<0) 
				it.remove();
		}
		return array;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		Random r = new Random();
		for(int i = 0; i < 10; i++) {
			al.add(r.nextInt(-100,101));
		}
		al.add(Integer.MAX_VALUE);
		al.add(Integer.MIN_VALUE);

		System.out.println(eliminaNegativos(al));
	}

}
