package Arrays;

public class Ejercicio11 {

	public static void main(String[] args) {
		int[] notas = new int[100];
		double suma = 0;
		for (int i = 0; i < notas.length; i++) {
			notas[i] = (int) (Math.random() * 11);
			System.out.print("[" + notas[i] + "] ");
			suma += notas[i];
		}
		System.out.printf("\nLa media es: %.2f",(suma/100));
		int aux = 0;
		int[] modas = new int[11];
		for (int i = 0; i < notas.length; i++) {
			aux = notas[i];
			modas[aux]++;
		}
		int max = notas[0];
		int moda = 0;
		for (int i = 0; i < modas.length; i++) {
			if (max < modas[i]) {
				max = modas[i];
				moda = i;
			}
		}
		System.out.println("\nLa moda es: " + moda);

		for (int i = 0; i < modas.length; i++) {
			System.out.print(i + ":");
			for (int j = 0; j <= modas[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
