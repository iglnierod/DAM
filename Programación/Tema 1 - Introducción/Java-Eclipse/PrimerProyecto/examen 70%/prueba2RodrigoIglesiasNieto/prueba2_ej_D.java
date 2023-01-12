package prueba2RodrigoIglesiasNieto;

public class prueba2_ej_D {

	public static void main(String[] args) {
		// Creamos array, asignamos valores [40,60] y mostramos
		int[] numeros = new int[30];
		System.out.print("Array original: ");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (40 + Math.random() * 21);
			System.out.print(numeros[i] + " ");
		}

		// Creamos array auxiliar y posicion
		int[] aux = new int[numeros.length];
		int posicion = 0;

		// Pasamos los numeros mayores a 50 al principio de aux
		
		for (int i = 0; i < aux.length; i++) {
			if (numeros[i] > 50) {
				aux[posicion] = numeros[i];
				posicion++;
			}
		}
		
		// Pasamos los 50s (si hay) despues de los mayores
		for (int i = 0; i < aux.length; i++) {
			if (numeros[i] == 50) {
				aux[posicion] = numeros[i];
				posicion++;
			}
		}
		// Completamos el array con los numeros menores de 50
		for (int i = 0; i < aux.length; i++) {
			if (numeros[i] < 50) {
				aux[posicion] = numeros[i];
				posicion++;
			}
		}

		System.out.print("\nArray ordenado: ");

		for (int i = 0; i < aux.length; i++) {
			if (aux[i] == 50) {
				System.out.print("[" + aux[i] + "] ");
			} else {
				System.out.print(aux[i] + " ");
			}
		}

	}

}
