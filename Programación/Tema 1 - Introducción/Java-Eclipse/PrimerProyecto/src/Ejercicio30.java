import java.util.Scanner;
public class Ejercicio30 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca la base:");
        double base = entrada.nextDouble();
        System.out.println("Introduzca el exponente:");
        double exp = entrada.nextDouble();
        entrada.close();

        double resultado = 1;
        int contador = 0;
        for(int i=1;i<=exp;i++){
            resultado = resultado * base;
            contador++;
        }
        System.out.println(base + "^" + exp + " = " + resultado);
        System.out.println(contador);
    }
}
