import java.util.Scanner;

public class PiramideVacia {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduzca el número de filas: ");
		int numFilas = entrada.nextInt();
		System.out.print("Introduzca el caracter: ");
		String caracter = entrada.next();
		entrada.close();

		int numEspacios = numFilas - 1;
		int numCaracteres = 1;
		for (int i = 1; i <= numFilas; i++) {
			for (int j = 1; j <= numEspacios; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= numCaracteres; j++) {
				if (j == 1 || i == numFilas || j == numCaracteres) {
					System.out.print(caracter);
				} else {
					System.out.print(" ");
				}
			}
			numEspacios--;
			numCaracteres += 2;
			System.out.println();
		}
	}

}
