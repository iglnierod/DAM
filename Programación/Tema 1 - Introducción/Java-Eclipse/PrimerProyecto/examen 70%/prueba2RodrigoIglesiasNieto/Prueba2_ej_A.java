package prueba2RodrigoIglesiasNieto;

import java.util.Scanner;

public class Prueba2_ej_A {

	public static void main(String[] args) {
		// Leemos DNI
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número de DNI seguido de su letra, sin espacios: ");
		String dni = sc.next();
		sc.close();
		
		// numDni pasa a ser el entero de la cadena dni menos la letra
		int numDni = Integer.parseInt(dni.substring(0, dni.length() - 1));
		// letraDni es el ultimo caracter de dni, entonces es la letra
		char letraDni = dni.charAt(dni.length() - 1);
		final String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

		// posicion es el modulo del numDni y sirve para conseguir la letraCorrecta
		int posicion = (numDni % 23);
		char letraCorrecta = letras.charAt(posicion);

		// Comparamos letraCorrecta con letraDni para comprobar si es la misma y la
		// introducida por el usuario es la correcta
		if (letraCorrecta == letraDni) {
			System.out.println("El DNI introducido es correcto.");
		} else {
			// Si no es correcto concatenamos el numero de dni con la letra correcta
			System.out.println("El DNI introducido no es correcto, debería ser: " + numDni + letraCorrecta + ".");
		}
	}

}