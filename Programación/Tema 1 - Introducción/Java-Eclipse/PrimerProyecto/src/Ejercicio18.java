import java.util.Scanner;
public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca una hora:");
		int hora = entrada.nextInt();
		System.out.println("Introduzca los minutos:");
		int minutos = entrada.nextInt();
		entrada.close();
		int suma = 24*3600;
		suma = suma -(hora*3600+minutos*60);
		
		System.out.println("Quedan " + suma + " segundos para medianoche");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
