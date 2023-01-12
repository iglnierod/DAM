import java.util.Scanner;
public class Ejercicio28 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca el número del que quiere sacar multiplos");
        int num = entrada.nextInt();
        System.out.println("Introduzca cuantos multiplos quiere saber:");
        int divisores = entrada.nextInt();
        entrada.close();
        int multiplo;
        for(int i=1;i<=divisores;i++){
            multiplo = num*i;
            System.out.println(multiplo + " es múltiplo de " + num);
        }
    }
}
