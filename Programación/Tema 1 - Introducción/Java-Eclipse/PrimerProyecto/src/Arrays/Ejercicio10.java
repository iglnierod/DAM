package Arrays;

public class Ejercicio10 {

	public static void main(String[] args) {

		int[] bingo = new int[15];

		int aleatorio;
		boolean yaExiste;
		for(int i = 0; i < bingo.length; i++) {
			do {
				yaExiste = false;
				aleatorio = (int)( 1 + Math.random() * 90);
				for(int j = 0; j < i; j++) {
					if(aleatorio == bingo[j]) {
					yaExiste = true;
					break;
					}
				}
			}while(yaExiste);
			bingo[i] = aleatorio;
		}
		
		for(int item : bingo) {
			System.out.print(item + " ");
		}
	}

}
