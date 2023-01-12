import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		int[] numeros = new int[4];
		
		numeros[0] = 7;
		numeros[1] = 6;
		numeros[2] = 2;
		numeros[3] = 1;
		System.out.println("for()");
		String cadena = "";
		
		int a = cadena.length();
		for(int i = a; i<4;i++) {
			System.out.println(numeros[i]);
		}
		
		System.out.println("\n--\n");
		
		System.out.println("for each()");
		//BUCLE FOR EACH -MUESTRA ARRAY COMLETO- 
		//--NO VALE PARA UNO EN CONCRETO--
		for(int item : numeros) {
			System.out.println(item);
		}
		
		//Otra manera de definir arrays
		int[] numeros2 = {5, 4, 3, 2,1,23,531,123,53,87};
		for(int item: numeros2) {
			System.out.print(item + ", ");
		}
		
	}

}
