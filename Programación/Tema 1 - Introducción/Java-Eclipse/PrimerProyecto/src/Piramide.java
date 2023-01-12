import java.util.Scanner;

public class Piramide {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número de filas:");
		int filas = sc.nextInt();
		sc.close();

		for (int i = 0; i < filas; i++) {

			for (int k = i; k <= filas; k++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= i * 2; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}
