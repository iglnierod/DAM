import java.util.Scanner;
public class Ejercicio34 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduzca el número del que quiere la tabla de multiplicar: ");
        int num = entrada.nextInt();
        entrada.close();

        for(int i=1;i<=10;i++){
            System.out.println(num + " * " + i + " = " +(num*i));
        }
    }
}