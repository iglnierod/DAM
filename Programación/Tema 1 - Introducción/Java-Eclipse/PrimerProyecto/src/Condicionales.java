import java.util.Scanner;
public class Condicionales {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		
		int num = entrada.nextInt();
		
		entrada.close();
		
		//if sin anidar
		if (num<0) {
			System.out.println("El número introducido es negativo");
		} else {
			System.out.println("El número introducido es positivo");
		}
		
		//if anidado
		if (num<0) {
			System.out.println("El número introducido es negativo");
		} else if (num>0){
			System.out.println("El número introducido es positivo");
		} else {
			System.out.println("El número introducido es 0");
		}
		
		
		//switch
		switch (num){
		case 1:
			System.out.println();
			break;
			
		}
		
	}
}
