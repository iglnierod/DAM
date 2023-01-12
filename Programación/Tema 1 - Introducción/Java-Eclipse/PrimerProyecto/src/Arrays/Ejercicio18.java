package Arrays;

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el tamaño de la matriz: ");
        int tamaño = sc.nextInt();
        sc.close();
        int[][] matrizA = new int[tamaño][tamaño];
        System.out.println("MATRIZ A");
        for(int i = 0; i < matrizA.length; i++) {
            for(int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = (int)(Math.random() * 10);
                System.out.printf("%4d",matrizA[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        int[][] matrizB = new int[tamaño][tamaño];
        System.out.println("MATRIZ B");
        for(int i = 0; i < matrizB.length; i++) {
            for(int j = 0; j < matrizB[i].length; j++) {
                matrizB[i][j] = (int)(Math.random() * 9 + 1);
                System.out.printf("%4d",matrizB[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        int[][] suma = new int[tamaño][tamaño];
        System.out.println("A + B");
        for(int i = 0; i < suma.length; i++) {
            for(int j = 0; j < suma[i].length; j++) {
                suma[i][j] = matrizA[i][j] + matrizB[i][j];
                System.out.printf("%4d",suma[i][j]);
            }
            System.out.println();
        }
    }
}
