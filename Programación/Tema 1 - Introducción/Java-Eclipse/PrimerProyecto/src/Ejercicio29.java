import java.util.Scanner;
public class Ejercicio29 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca dos números para hacer la multiplicación");
        System.out.println("Introduzca el primer número: ");
        int num1 = entrada.nextInt();
        System.out.println("Introduzca el segundo número:");
        int num2 = entrada.nextInt();
        entrada.close();
        int resultado = 0;
        int contador = 0;
        int res = 0;
        for(int i=1;i<=num2;i++){
            resultado = num1;
            //System.out.println("resultado: "+resultado);
            res = res + resultado;
            //System.out.println("res: "+res);
            contador++;
        }
        System.out.println(num1 + " * " + num2 + " = " + res);
        System.out.println(num1 + " se ha sumado " + contador + " veces");
    }
}
