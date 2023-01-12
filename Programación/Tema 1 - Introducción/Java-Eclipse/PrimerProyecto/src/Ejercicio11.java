import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca 3 numeros decimales (separados por un espacio):");
		double num1 = entrada.nextDouble();
		double num2 = entrada.nextDouble();
		double num3 = entrada.nextDouble();
		
		double media = (num1+num2+num3)/3;
		System.out.println("La media es: " + media);
		entrada.close();
	}

}
