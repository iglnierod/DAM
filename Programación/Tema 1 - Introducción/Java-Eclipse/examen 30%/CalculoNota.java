import java.util.Scanner;

public class CalculoNota {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca la nota del primer examen: ");
		float nota1 = sc.nextInt();
		System.out.println("¿Qué nota quieres sacar en programación?");
		float calculo = sc.nextFloat();
		sc.close();
		float notaDeseada = calculo;

		nota1 = (float) (nota1 * 0.3);
		calculo = calculo - nota1;
		System.out.println("Para sacar " + notaDeseada + " necesitas " + calculo);
		
	}

}
