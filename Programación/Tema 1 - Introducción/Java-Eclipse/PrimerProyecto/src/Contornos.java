import java.util.Scanner;

public class Contornos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Leemos longitud array
		System.out.println("Cuantos números quieres generar?");
		int longitud = sc.nextInt();

		// Llenamos array con numeros aleatorios [0,100]
		int[] numeros = new int[longitud];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * 101);
		}

		// Mostramos array original
		System.out.println("El array original es:");
		for (int i = 0; i < numeros.length; i++) {
			if (i == numeros.length - 1) {
				System.out.print(numeros[i]);
			} else {
				System.out.print(numeros[i] + ", ");
			}
		}

		System.out.println("\n\nSeleccione(1/2):");
		System.out.println("1.- Pares primero");
		System.out.println("2.- Impares primero");
		int decision = sc.nextInt();
		sc.close();

		// Creamos array auxiliar
		int[] aux = new int[longitud];

		switch (decision) {
		case 1:

			int contador = 0;
			int j = 0;

			// Colocamos pares en aux[]
			for (int i = 0; i < aux.length; i++) {
				if (numeros[i] % 2 == 0) {
					aux[contador] = numeros[i];
					contador++;
				}
			}

			// Colocamos impares en aux[]
			for (int i = 0; i < aux.length; i++) {
				if (numeros[i] % 2 != 0) {
					aux[contador] = numeros[i];
					contador++;
				}
			}

			for (int i = 0; i < aux.length; i++) {
				if (i == aux.length - 1) {
					System.out.print(aux[i]);
				} else {
					System.out.print(aux[i] + ", ");
				}
			}
			break;
		case 2:
			contador = 0;
			// Colocamos impares en aux[]
			for(int i = 0; i < aux.length; i++) {
				if(numeros[i] % 2 != 0) {
					aux[contador] = numeros[i];
					contador++;
				}
			}
			
			// Colocamos pares en aux[]
			for (int i = 0; i < aux.length; i++) {
				if (numeros[i] % 2 == 0) {
					aux[contador] = numeros[i];
					contador++;
				}
			}

			for (int i = 0; i < aux.length; i++) {
				if (i == aux.length - 1) {
					System.out.print(aux[i]);
				} else {
					System.out.print(aux[i] + ", ");
				}
			}
			break;
		}

	}

}
