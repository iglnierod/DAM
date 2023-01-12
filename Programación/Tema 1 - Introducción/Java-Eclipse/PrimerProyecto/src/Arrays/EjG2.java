package Arrays;

import java.util.Scanner;

public class EjG2 {

	public static void main(String[] args) {
		// Crea un array de números donde le indicamos por teclado el tamaño del array,
		// rellenaremos el array con números aleatorios entre 0 y 9, al final muestra
		// por pantalla el valor de cada posición y la suma de todos los valores. Haz un
		// método para rellenar el array (que tenga como parámetros los números entre
		// los que tenga que generar), para mostrar el contenido y la suma del array y
		// un método privado para generar número aleatorio (lo puedes usar para otros
		// ejercicios).
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca la longitud del array: ");
		int longitud = sc.nextInt();
		sc.close();

		int[] numeros = new int[longitud];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.round(Math.random() * 10));
			System.out.println("numeros[" + i + "] = " + numeros[i]);
		}
		
		int suma = 0;
		for(int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}
		System.out.println("La suma de todos los numeros es: " + suma);
	}

}
