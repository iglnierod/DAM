import java.util.Scanner;

public class CapicuaNumANum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número para comprobar si es capicúa:");
		String num = sc.next();
		sc.close();

		int j = num.length() - 1;
		boolean esCapicua = true;
		for (int i = 0; i < j; i++) {
			if (num.charAt(i) != num.charAt(j)) {
				esCapicua = false;
				break;
			}
			j--;
		}

		if (esCapicua) {
			System.out.println("Es capicúa");
		} else {
			System.out.println("No es capicúa");
		}
	}

}
