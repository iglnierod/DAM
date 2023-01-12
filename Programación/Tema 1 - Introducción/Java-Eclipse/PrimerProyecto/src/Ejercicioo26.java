
public class Ejercicioo26 {

	public static void main(String[] args) {
		
		int resPar = 0;
		int resImpar = 0;
		for(int i=1;i<=1000;i++) {
			
			if (i % 2 == 0) {
			resPar += i;	
			}
			else {
				resImpar += i;
			}
		}
		System.out.println("La suma de los números pares es: " + resPar);
		System.out.println("\nLa suma de los números impares es: " + resImpar);
	}

}
