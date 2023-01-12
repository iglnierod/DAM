package Strings;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una frase: ");
        String frase = sc.nextLine();
        sc.close();
        
        System.out.println(frase.split(" "));
        
    }

}
