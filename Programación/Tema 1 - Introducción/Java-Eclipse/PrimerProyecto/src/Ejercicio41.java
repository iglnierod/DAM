import java.util.Scanner;
public class Ejercicio41 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un número: ");
        int num1 = sc.nextInt();
        System.out.println("Introduzca otro número: ");
        int num2 = sc.nextInt();
        sc.close();
        int i = 0;
        if (num1!=num2) {
            if(num1<num2) {
                for(i=num1;i<=num2;i+=7) {
                    System.out.println(i);
                }
            }
            else {
                for(i=num2;i<=num1;i+=7) {
                    System.out.println(i);
                }
            }
        }
        else {
            System.out.println("ERROR - Los números introducidos son iguales.");
        }
    }

}
