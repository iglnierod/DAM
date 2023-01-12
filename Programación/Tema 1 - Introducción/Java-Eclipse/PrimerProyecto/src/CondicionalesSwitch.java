import java.util.Scanner;
public class CondicionalesSwitch {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("CÁLCULO DE AREAS ");
		System.out.println("1.Cuadrado");
		System.out.println("2.Rectangulo");
		System.out.println("3.Triangulo");
		System.out.println("4.Circulo");
		System.out.print("\nElija una opción: ");
		
		int opcion = entrada.nextInt();
		
		switch (opcion) {
		case 1:
			System.out.println("Introduzca el tamañó del lado: ");
			double lado = entrada.nextDouble();
			System.out.println("El área del cuadrado es: " + (lado*lado));
			break;
		case 2:
			System.out.println("Introduzca la base: ");
			double base = entrada.nextDouble();
			System.out.println("Introduzca la altura");
			double altura = entrada.nextDouble();
			System.out.println("El area del rectángulo es: " + (base*altura));
			break;
		case 3:
			System.out.println("Introduzca la base: ");
			base = entrada.nextDouble();
			System.out.println("Introduzca la altura: ");
			altura = entrada.nextDouble();
			System.out.println("El área del triángulo es: " + (base*altura/2));
			break;
		case 4:
			System.out.println("Introduzca el radio: ");
			double radio = entrada.nextDouble();
			System.out.printf("El área del circulo es %.2f", (Math.PI*Math.pow(radio, 2))); //Formatear numero para enseñarlo por pantalla
			break;
		default:
			System.out.println("La opción elegida no es válida");
		}
		
		entrada.close();


	}

}
