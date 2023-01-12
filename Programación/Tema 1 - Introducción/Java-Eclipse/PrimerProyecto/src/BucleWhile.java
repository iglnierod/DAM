import java.util.Scanner;
public class BucleWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce números enteros positivos para sumarlos");
		System.out.println("Para finalizar introduzca un número negativo");
		int num = 1, suma = 0, contador = 0;
		while (num>=0) {
			num = entrada.nextInt();
			suma += num;// suma = suma + num
			contador++;//contador = contador + 1
			
		}
		entrada.close();
		System.out.println("Has introducido "+ (--contador) +" numeros positivos");//--contador = contador - 1
		System.out.println("Los números introducidos suman: "+ (suma - num));//le restamos el num negativo para que no de error
	}

}
