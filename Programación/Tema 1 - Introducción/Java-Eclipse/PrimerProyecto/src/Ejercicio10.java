import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca el sueldo bruto del empleado:");
		int sueldo = entrada.nextInt();
		
		System.out.println("El sueldo neto del empleado es: " + (sueldo-(sueldo*0.2)));
		entrada.close();
		
	}

}
