package Arrays;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int[] numero = new int[15];
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduza 15 números: ");
		
		int contador = 0;
		while(contador<=14) {
			numero[contador] = sc.nextInt();
			contador++;
		}
		sc.close();
		//Muestra array inicial
		System.out.println("Array inicial:");
		for(int i = 0; i < numero.length; i++) {
			System.out.print(numero[i]);
			if(i!=numero.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		
		int aux = numero[numero.length-1];//Como se pierde el ultimo digito, lo guardamos en un auxiliar
		
		//Cambia de orden el array menos el ultimo
		for(int i = 14; i > 0;i--) {
			numero[i] = numero[i-1];
		}
		
		numero[0] = aux;
		//Muestra array final
		System.out.println("\nArray final:");
		for(int i = 0; i < numero.length; i++) {
			System.out.print(numero[i]);
			if(i!=numero.length-1) {
				System.out.print(", ");
			}
		}
	}

}
