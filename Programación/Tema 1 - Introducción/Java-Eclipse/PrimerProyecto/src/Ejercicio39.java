import java.util.Scanner;
public class Ejercicio39 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número:");
        int negativos = 0;
        int positivos = 0;
        do{
            int num = sc.nextInt();
            if (num<0){
                negativos++;
            }
            else{
                positivos++;
            }
        }while(negativos+positivos!=10);
        sc.close();
        System.out.println("Has introducido " + positivos + " números positivos");
        System.out.println("Has introducido " + negativos + " números negativos");
    }
}
