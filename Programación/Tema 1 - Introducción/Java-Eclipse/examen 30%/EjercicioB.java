import java.util.Scanner;

public class EjercicioB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca una temperatura: ");
		double temperatura = sc.nextDouble();
		String sistema = sc.next();
		sc.close();

		switch (sistema) {
		case "C":
			System.out.print(temperatura + "ºC equivale a ");
			System.out.printf("%.2f", (temperatura * 9 / 5) + 32);
			System.out.print("ºF");
			break;
		case "F":
			System.out.printf("%sºF equivalen a %.2fºC", temperatura, (temperatura - 32) * 5 / 9);
			break;
		default:
			System.out.println("El sistema '" + sistema + "' no se reconoce.");
		}

	}

}
