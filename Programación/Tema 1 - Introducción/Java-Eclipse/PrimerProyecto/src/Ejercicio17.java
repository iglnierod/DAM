import java.util.Scanner;
public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca un número entero de 4 cifras:");
		int num = entrada.nextInt();
		entrada.close();
		
		int p4 = num % 10;
		num = (int)(num / 10);
		int p3 = num % 10;
		num = (int)(num / 10);
		int p2 = num % 10;
		num = (int)(num / 10);
		int p1 = num % 10;
		
		System.out.print(p4);
		System.out.print(p3);
		System.out.print(p2);
		System.out.print(p1);

		
		
		
		
		
		
		
		
	}

}
