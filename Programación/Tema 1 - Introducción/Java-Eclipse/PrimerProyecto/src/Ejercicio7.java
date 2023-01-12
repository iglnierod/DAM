import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca su nombre");
		
		String nombre = entrada.next();
		
		System.out.println("Su nombre es " + nombre);
		System.out.println("Su nombre tiene " + nombre.length() + " caracteres");
		System.out.println("La primera letra de su nombr es " + nombre.charAt(0));
		System.out.println("La última letra de su nombre es " + nombre.charAt(nombre.length()-1));
		
		entrada.close();
	}

}
