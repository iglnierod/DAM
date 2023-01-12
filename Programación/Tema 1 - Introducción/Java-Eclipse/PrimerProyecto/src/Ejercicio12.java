import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca el valor de X:");
		double X = entrada.nextDouble();
		System.out.println("Introduzca el valor de Y:");
		double Y = entrada.nextDouble();
		
		System.out.println("Ahora mismo los valores son:  X = " + X + " ; Y = " + Y);
		
		double Z = X;
		X=Y;
		Y=Z;
		
		System.out.println("Intercambiando los valores de X e Y queda: X = " + X + " ; Y = " + Y);
		
		entrada.close();
	}
}