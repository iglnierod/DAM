import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduzca un número: ");
		double num1 = entrada.nextDouble();
		System.out.print("\nIntroduzca otro número: ");
		double num2 = entrada.nextDouble();
		
		if (num1<num2) {
			System.out.println(num1 + " < " + num2);
		} else if (num1>num2){
			System.out.println(num1 + " > " + num2);
			} else {
				System.out.println(num1 + " = " + num2);
			}
		}
	}


