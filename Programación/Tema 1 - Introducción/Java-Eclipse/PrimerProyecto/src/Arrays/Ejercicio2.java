package Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {

		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];
		System.out.println("numero[]\tcuadrado[]\tcubo[]");
		for (int i = 0; i < numero.length; i++) {
			numero[i] = (int) (Math.round(Math.random() * 101));
			cuadrado[i] = (int)(Math.pow(numero[i], 2));
			cubo[i] = (int)(Math.pow(numero[i], 3));
			System.out.println(numero[i] + "\t\t" + cuadrado[i] + "\t\t" + cubo[i]);
		}
	}

}
