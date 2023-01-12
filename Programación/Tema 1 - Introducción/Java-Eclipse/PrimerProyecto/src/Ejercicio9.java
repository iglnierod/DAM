import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca el primer precio:");
		double precio1 = entrada.nextDouble();
		System.out.println("Introduza el segundo precio:");
		double precio2 = entrada.nextDouble();
		System.out.println("Introduza el tercer precio:");
		double precio3 = entrada.nextDouble();
		
		double media = (precio1+precio2+precio3)/3;
		System.out.println("La precio medio de: ("+precio1+","+precio2+","+precio3+") es igual a : "+media);
		
		entrada.close();
	}

}
