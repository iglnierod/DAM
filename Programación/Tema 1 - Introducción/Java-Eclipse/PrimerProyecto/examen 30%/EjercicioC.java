
import java.util.Scanner;

public class EjercicioC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca dos números: ");
		int num1 = sc.nextInt(); // Leemos los dos números sin saber cual es cual
		int num2 = sc.nextInt();
		sc.close();
		int multiplos = 0, max = 0;// multiplos es el numero del que se calculan los multiplos
									// y max es hasta donde se calculan los multiplos
		if (num1 <= num2) { // Comprobamos cual es menor y cual mayor para asignar otras variables.
							// si los números son iguales también se asignan asi por su orden de
							// entrada.
			multiplos = num1;
			max = num2;
		} else if (num2 < num1) {
			multiplos = num2;
			max = num1;
		}

		System.out.print("Los múltiplos de " + multiplos + " inferiores a " + max + " son: ");
		for (int i = multiplos; i < max; i += multiplos) { // Asignamos a i el paso de multiplos mientras sea menor que max
			System.out.print(i + ", ");
		}
	}

}
