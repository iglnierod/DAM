package Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {
		int[] numero = new int[20];
		// Llenamos array con numeros aleatorios
		for (int i = 0; i < numero.length; i++) {
			numero[i] = (int) Math.round(Math.random() * 100);
		}

		// Definimos array auxiliar
		int[] aux = new int[20];

		// Si numero[i] es par pasa a aux[]
		// j almacena posicion de aux
		int j = 0;
		for (int i = 0; i < numero.length; i++) {
			if (numero[i] % 2 == 0) {
				aux[j] = numero[i];
				j++;
			}
		}

		// Si numero[] no es par pasa a aux[] desde j, que es la ultima posicion del par
		for (int i = 0; i < numero.length; i++) {
			if (numero[i] % 2 != 0) {
				aux[j] = numero[i];
				j++;
			}
		}

		// Mostramos primer array (numero[])
		System.out.println("numero[]");
		for (int i = 0; i < numero.length; i++) {
			System.out.print(numero[i]);
			if (i != numero.length - 1) {
				System.out.print(", ");
			}
		}

		// Mostramos segundo array (aux[])
		System.out.println("\n\naux[]");
		for (int i = 0; i < aux.length; i++) {
			System.out.print(aux[i]);
			if (i != aux.length - 1) {
				System.out.print(", ");
			}
		}
	}

}
