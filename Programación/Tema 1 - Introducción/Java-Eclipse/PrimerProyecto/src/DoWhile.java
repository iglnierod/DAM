import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num = 0;
		int contador = 0;
		do {
			System.out.println("Introduzca un número impar");
			num = entrada.nextInt();
			contador++;
		} while (num % 2 != 0);
		entrada.close();
		System.out.println("El número introducido es par, asi que se finaliza");
		System.out.println("Introduciste " + contador + " números impares");
		
	}

}
