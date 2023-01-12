import java.util.Scanner;
public class FactorialFor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca un número para hacer el factorial: ");
		int factorial = entrada.nextInt();
		entrada.close();
		
		int resultado = 1;
		for(int i=1;i<=factorial;i++) {
		resultado = resultado * i;
		}
		System.out.println(factorial+"! = " + resultado);
	}
}
