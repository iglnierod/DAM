import java.util.Scanner;
public class AdivinaNumero {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int aleatorio = ((int)(Math.random()*100));
		
		int num = -1;
		int intentos = 0;
		while(num!=aleatorio && intentos<10) {
			System.out.print("\nIntroduzca un número: ");
			num = entrada.nextInt();
			if (aleatorio<num) {
				intentos++;
				System.out.println("Menor");
			}
			else if (aleatorio>num){
				intentos++;
				System.out.println("Mayor");
			}
		}
		entrada.close();
		if (num==aleatorio) {
		System.out.println("Enhorabuena!");
		System.out.println("Has acertado en: " + (intentos+1) + " intentos");
		}
		else {
		System.out.println("Superaste el número de intentos =(");
		System.out.println("El número era: " + aleatorio);
		}
	}

}
