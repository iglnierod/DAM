package ejerciciosV;

public class ej1 {
	void manipular(int[] numeros, int cantidad) {
        if (cantidad > 1) {
            for (int i = 0; i < cantidad - 1; i++)
                if (numeros[i] < numeros[i + 1]) {
                    int aux = numeros[i + 1];
                    numeros[i + 1] = numeros[i];
                    numeros[i] = aux;
                }
			manipular(numeros, cantidad - 1);
        }
    }

	public static void main(String[] args) {
		int[] array = {1,2203,932,24,56,69,76,84,90,100};
		int c = array.length;
		for(int item : array) {
			System.out.print(item + " ");
		}
		ej1 test = new ej1();
		test.manipular(array, c);
		System.out.println(" - -- - - - ");
		for(int item : array) {
			System.out.print(item + " ");
		}
	}

}
