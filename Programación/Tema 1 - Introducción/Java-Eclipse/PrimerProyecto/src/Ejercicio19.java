import java.util.Scanner;
public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Introduzca 3 números:");
		int n1 = entrada.nextInt();
		int n2 = entrada.nextInt();
		int n3 = entrada.nextInt();
		entrada.close();
		System.out.println("Números introducidos: " + n1 + " , " + n2 + " , " + n3);
		
		if (n1+n2==n3) {
			System.out.println("Se cumple que: " + n1 + " + " + n2 + " = " + n3);
		}
		if (n2+n3==n1) {
			System.out.println("Se cumple que: " + n2 + " + " + n3 + " = " + n1);
		}
		if (n1+n3==n2) {
			System.out.println("Se cumple que: " + n1 + " + " + n3 + " = " + n2);
		}
		
		if (n1+n2!=n3 && n2+n3==n1 && n1+n3==n2) {
			System.out.println("Los números no cumplen la condición");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
