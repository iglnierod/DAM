package Arrays.Extras;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la longitud de la contraseña: ");
		int longitud = sc.nextInt();
		sc.close();

		char[] caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqurstuvwxyz0123456789!@·#$%&¬/()=?¿¡^[*+]¨{}-:;<>çÇºª"
				.toCharArray();

		String password = "";
		
		for (int i = 0; i < longitud; i++) {
			int aleatorio = (int)(Math.random() * caracteres.length+1);
			password += caracteres[aleatorio];
	
		}
		System.out.println("La contraseña es: " + password);
	}
	

}
