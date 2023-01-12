
import java.util.Scanner;

public class EjercicioD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		int num = sc.nextInt();
		sc.close();

		int divisor = 0;
		int acumulador = 0;
		// El programa con un bucle funcionaba pero no mostraba las cosas como quería,
		// entonces repetí 3 veces el bucle para poder hacerlo como sale en el examen
		
		//Calcula el acumulador para el siguiente condicional
		for (int i = 1; i < num; i++) {
			divisor = num % i;
			if (divisor % i == 0) {
				acumulador += i;
			}
		}
		
		//Comprueba si el numero es perfecto para mostrar si es o no es
		if (num == acumulador) {
			System.out.print("El número " + num + " es perfecto, ya que ");
			//Cambio de variables pero sigue siendo el mismo bucle
			int divisor1 = 0;
			int acumulador1 = 0;
			//Repite el bucle para mostrar los divisores y el acumulador
			for (int i = 1; i < num; i++) {
				divisor1 = num % i;
				if (divisor1 % i == 0) {
					System.out.print(i + "+");
					acumulador1 += i;
				}
			}
			System.out.print("=" + acumulador1);
		} else {
			System.out.print("El número " + num + " no es perfecto, ya que ");
			int divisor2 = 0;
			int acumulador2 = 0;
			for (int i = 1; i < num; i++) {
				divisor2 = num % i;
				if (divisor2 % i == 0) {
					System.out.print(i + "+");
					acumulador2 += i;
				}
			}
			System.out.print("=" + acumulador2);
		}
	}

}
