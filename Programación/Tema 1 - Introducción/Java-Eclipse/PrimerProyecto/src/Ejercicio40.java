import java.util.Scanner;
public class Ejercicio40 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int positivos = 0;
        int negativos = 1;
        System.out.println("Introduzca un número:");
        do{
            num = sc.nextInt();
            if (num>=0){
                System.out.println(positivos+ " + " + num + " = " + (positivos+num));
                positivos+=num;
            }
            else{
                System.out.println(negativos + " * " + num + " = " + (negativos*num));
                negativos*=num;

            }
        }while(positivos<=100 && negativos<=1000);
        sc.close();
        System.out.println("La suma de los números positivos es: " + positivos);
        System.out.println("La multiplicación de los números negativos es: " + negativos);
    }
}
