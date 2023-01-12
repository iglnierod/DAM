import java.util.Scanner;

public class Ejercicio47 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número para invertirlo:");
		int num = sc.nextInt();
		sc.close();

		int numOriginal = num;
		char ultimoDigito = 0;
		int numInvertido = 0;

		for (int i = 0; num > 0; i++) {
			ultimoDigito = (char) (num % 10);
			numInvertido = numInvertido * 10 + ultimoDigito;
			num = num / 10;
		}
		System.out.println("El número original es: " + numOriginal);
		System.out.println("El número invertido es: " + numInvertido);
	}

}
