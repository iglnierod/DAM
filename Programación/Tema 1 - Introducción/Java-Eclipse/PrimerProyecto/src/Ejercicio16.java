import java.util.Scanner;
public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca el primer número:");
		int num1 = entrada.nextInt();
		System.out.println("Introduzca el segundo número:");
		int num2 = entrada.nextInt();
		System.out.println("Introduzca el tercer número:");
		int num3 = entrada.nextInt();
		int max = num1;
		
		if (max<num2) {
			max = num2;
			if (num1<num3) {
				System.out.println(num1 + " <a " + max + " < " + num3);
			}
			else {
				System.out.println(num3 + " <b " + num1 + " < " + max);
			}
		}
		else if (max<num3){
			max = num3;
			if (num1<num2) {
				System.out.println(num1 + " <c " + num2 + " < " + max);
			}
			else {
				System.out.println(num2 + " <d " + num1 + " < " + max);
			}
		}
		else if (num2<num3){
			System.out.println(num2 + " <e " + num3 + " < " + max);
		}
		else {
			System.out.println(num3 + " <f " + num2 + " < " + max);
		}
		
		
		
		
		
	}

}
