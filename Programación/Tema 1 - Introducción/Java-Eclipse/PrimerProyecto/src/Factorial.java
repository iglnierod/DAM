public class Factorial {
	
	public static int calcular(int n) {
		if (n == 0)
			return 1;
		int res = 1;
		for (int i = n; i > 0; i--)
			res *= i;
		return res;
	}
	
	// RECURSIVIDAD
	static int factorialRecursivo(int n) {
		if (n == 0) // CASO BASE
			return 1;
		return n * factorialRecursivo(n - 1);
	}
	
	static void imprimir(int n) {
		if (n > 0) {
			imprimir(n - 1);
			System.out.print(n + " ");
		}
	}
	
	static boolean impar(int numero) {
		System.out.println("¿" + numero + " es impar?");
		if(numero == 0)
			return false;
		return par(numero -1);
	}
	
	static boolean par(int numero) {
		System.out.println("¿" + numero + " es par?");		
		if(numero == 0)
			return true;
		return impar(numero - 1);
	}
	
	static int digitos(int num) {
		if(num <= 0)
			return 0;
		return digitos(num / 10) + 1;
	}
	
	public static void main(String[] args) {
		System.out.println(Factorial.calcular(0));
		System.out.println(Factorial.factorialRecursivo(5));
		Factorial.imprimir(3);
		System.out.println("\n" + impar(7));
		System.out.println(digitos(3472));
	}
}

















