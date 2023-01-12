package Repaso;

public class e1 {

    public static void main(String[] args) {
        // Hacer un programa que asigne números a una matriz de orden 4x5 comprendidos
        // entre 1 y 10. El programa tiene que escribir la suma de los elementos de cada
        // fila y la suma de los números que son pares de cada columna.

        int[][] numeros = new int[4][5];
        int sumaFilas = 0;
        int sumaColumnas = 0;
        int lunna = 0;
        for (int i = 0; i < numeros.length; i++) {
            sumaFilas = 0;
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = (int) (Math.random() * 10 + 1);
                System.out.printf("%3d", numeros[i][j]);
                sumaFilas += numeros[i][j];
            }
            lunna += sumaFilas;
            System.out.print(" = " + sumaFilas);
            System.out.println();
        }
        System.out.printf("%21d",lunna);
        System.out.println();

        for (int i = 0; i < 20; i++) {
            System.out.print("-");
        }

        System.out.println();

        for (int i = 0; i < numeros.length + 1; i++) {
            sumaColumnas = 0;
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[j][i] % 2 == 0) {
                    sumaColumnas += numeros[j][i];
                }
            }
            System.out.printf("%3d", sumaColumnas);
        }

    }

}
