package prueba4_dam;

import java.util.*;

public class Excepciones {

	// Añade al siguiente código la gestión de las excepciones que se pudieran
	// producir, mostrando los mensajes
	// correspondientes a cada error.
	// Si se produce una excepción por hacer una división entre cero, entonces el
	// programa lo indica y vuelve a
	// mostrar el menú.
	// Si se produce una excepción por introducir un número no válido, entonces el
	// programa lo indica, mostrando
	// el valor introducido que no es válido y saliendo del programa sin despedirse.
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String opcion = null;
		String input = "";
		try {
			do {
				try {
					System.out.println("  1. Calcular raíz cuadrada.");
					System.out.println("  2. Hacer división entera.");
					System.out.print("Introduzca una opción (s para salir): ");
					opcion = entrada.nextLine();
					switch (opcion) {
					case "1":
						System.out.print("Introduzca un número: ");
						double numero = Double.parseDouble(entrada.nextLine());
						System.out.println("La raíz cuadrada de " + numero + " es " + Math.sqrt(numero));
						break;
					case "2":
						System.out.print("Introduzca el dividendo: ");
						int dividendo = Integer.parseInt(entrada.nextLine());
						System.out.print("Introduzca el divisor: ");
						int divisor = 0;
						divisor = Integer.parseInt(entrada.nextLine());
						System.out.println(dividendo + " entre " + divisor + " es " + dividendo / divisor);
						break;

					case "s", "S":
						break;

					default:
						System.err.println("Opción no válida.");
					}
				} catch (ArithmeticException e) {
					System.err.println("No se permite hacer una división entre cero: " + e.getMessage());
				}
			} while (!"S".equalsIgnoreCase(opcion));
			System.out.println("Gracias por usar el programa.");
		} catch (NumberFormatException e) {
			System.err.println("El valor introducido no es válido: " + e.getMessage());
		}
	}
}
