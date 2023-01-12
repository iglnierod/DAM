package ClasesEnvoltorio;
import java.util.Scanner;
import java.math.BigInteger;
import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un numero para hacer el factorial: ");
		BigInteger num = BigInteger.valueOf(sc.nextInt());
		System.out.println(num);
	}

}
