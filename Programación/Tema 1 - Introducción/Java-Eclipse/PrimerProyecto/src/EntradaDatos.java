import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca su nombre: ");
		String nombre = entrada.next();

		System.out.println("Introduzca su edad: ");
		int edad = entrada.nextInt();
		System.out.println("Hola "+nombre+", tienes "+edad+" años");
		
		entrada.close();
		}

}
