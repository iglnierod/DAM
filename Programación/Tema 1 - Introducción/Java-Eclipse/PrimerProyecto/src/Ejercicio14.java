import java.util.Scanner;
public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduzca la hora: ");
		int hora = entrada.nextInt();
		
		if (hora>=6 && hora<=12) {
			System.out.println("Buenos días =)");
		} else if (hora>=13 && hora <=20) {
			System.out.println("Buenas tardes =)");
		} else {
			System.out.println("Buenas noches =)");
		}
	}

}
