import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		
		System.out.println("Introduzca la base:");
		float base = entrada.nextFloat();
		
		System.out.println("Introduzca la altura");
		float altura = entrada.nextFloat();
		
		float area = base*altura/2;
		System.out.println("El area de su triángulo con base " + base + " y altura " + altura +" es = " + area);
		
		entrada.close();
	}
}
