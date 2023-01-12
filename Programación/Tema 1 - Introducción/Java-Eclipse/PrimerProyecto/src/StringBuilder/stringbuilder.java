package StringBuilder;

import java.util.Scanner;

public class stringbuilder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		StringBuilder numero = new StringBuilder(sc.next());
		sc.close();
		int contador = 3;
		for (int i = numero.length() - 1; i > 0; i--) {
			if(i == contador) {				
				numero.insert(contador, ".");
				contador += 3;
			}
		}
		
		System.out.println(numero);

	}

}
