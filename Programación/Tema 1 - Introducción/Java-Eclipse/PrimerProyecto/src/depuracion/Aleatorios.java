package depuracion;

public class Aleatorios {

	static int sumar(int a, int b) {
		return a +b;
	}
	public static void main(String[] args) {
		int numElementos = 7;

		int[] numeros = new int[numElementos];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 100);
		}
		
		for(int item : numeros) {
			System.out.println(item);
		}
		int suma = sumar(3,4);
		System.out.println(suma);
	}
}
