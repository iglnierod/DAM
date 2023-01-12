import java.util.Scanner;
public class Ejercicio25 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca un número: ");
		int num = entrada.nextInt();
		entrada.close();
		int contador = 0;
		int i;
		int media = 0;
		for(i = 1;i<=num;i++){
			if (num % i == 0) {
				System.out.println(i + " es divisor de " + num);
				media += i;
				contador++;
			}
		}
		System.out.println(num + " tiene " + contador + " divisores");
		System.out.println("La media de los divisores es: " + (media/contador));
	}

}
