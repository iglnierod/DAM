package Arrays;

import java.util.Scanner;

public class Ejercicio18OP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el tamaño de la matriz: ");
        int tamaño = sc.nextInt();
        sc.close();
        int[][] matrizA = new int[tamaño][tamaño];
        int[][] matrizB = new int[tamaño][tamaño];
        int[][] suma = new int[tamaño][tamaño];
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = (int) (Math.random() * 10);
                matrizB[i][j] = (int) (Math.random() * 10);
                suma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        System.out.println("MATRIZ A");
        for (int[] fila : matrizA) {
            for (int item : fila) {
                System.out.printf("%3d", item);
            }
            System.out.println();
        }
        System.out.println("MATRIZ B");
        for (int[] fila : matrizB) {
            for (int item : fila) {
                System.out.printf("%3d", item);
            }
            System.out.println();
        }
        System.out.println("MATRIZ A + MATRIZ B");
        for (int[] fila : suma) {
            for (int item : fila) {
                System.out.printf("%3d", item);
            }
            System.out.println();
        }
    }
}
