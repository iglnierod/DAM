import java.util.Scanner;
public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca la nota");
		int nota = entrada.nextInt();
		entrada.close();

		switch (nota) {
		default:
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
			System.out.println("Notable");
			break;
		case 8:
			System.out.println("Notable");
			break;
		case 9:
			System.out.println("Sobresaliente");
			break;
		case 10:
			System.out.println("Sobresaliente");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
