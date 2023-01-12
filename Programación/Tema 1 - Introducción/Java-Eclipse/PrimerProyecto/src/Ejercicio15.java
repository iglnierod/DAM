import java.util.Scanner;
public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduzca un número: ");
		int num = entrada.nextInt();
		
		if (num % 2 != 0) {
			if (num % 3 != 0) {
				System.out.println(num + " es impar y no es divisible entre 3");
			} else {
				System.out.println(num + " es impar y es divisible entre 3");
			}
		} else if (num % 3 == 0) {
			System.out.println(num + " es par y es divisible entre 3");
		}
	}

}
