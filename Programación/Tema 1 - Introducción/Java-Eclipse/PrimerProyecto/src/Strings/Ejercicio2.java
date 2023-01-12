package Strings;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una frase: ");
        String frase = sc.nextLine();
        sc.close();

        char[] charFrase = new char[frase.length()];
        for (int i = frase.length() - 1; i >= 0; i--) {
            if (charFrase[i] == frase.charAt(i)) {
                charFrase[i] = frase.charAt(i);
            }

        }
        
        if(frase.equals(charFrase)) {
            System.out.println("si");
        } else {
            System.out.println("no");
        }
    }
}
