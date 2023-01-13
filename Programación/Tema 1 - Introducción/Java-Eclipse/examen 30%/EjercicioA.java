
import java.util.Scanner;

public class EjercicioA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un año: ");
		int year = sc.nextInt();
		sc.close();

		if (year % 4 == 0 && year % 100 != 0) {//Comprobar si el año es divisible por 4 y no es por 100
			System.out.println("El año " + year + " es bisiesto.");
		} else if (year % 400 == 0) { // Comprobar si el año es divisible entre 400
			System.out.println("El año " + year + " es bisiesto.");
		} else {
			System.out.println("El año " + year + " no es bisiesto.");
		}
	}

}
