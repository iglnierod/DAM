import java.util.Scanner;

public class CapicuaNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un número para comprobar si es capicúa: ");
		int num = sc.nextInt();
		sc.close();

		int numOriginal = num;
		int cifra = num % 10;
		int numInvertido = 0;

		while (num > 0) {
			cifra = num % 10;
			num = num / 10;
			numInvertido = numInvertido * 10 + cifra;
		}

		if (numOriginal == numInvertido) {
			System.out.println(numInvertido + " es capicúa");
		} else {
			System.out.println(numInvertido + " no es capicúa");
		}
	}

}
