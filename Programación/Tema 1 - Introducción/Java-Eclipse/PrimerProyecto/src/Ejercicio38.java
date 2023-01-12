import java.util.Scanner;
public class Ejercicio38 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        double num = sc.nextDouble();
        sc.close();
        int contador = 0;
        do{
            num = (int)(num/10);
            contador++;
        }while(num>0);
        System.out.println("Tiene " + contador + " cifras");
    }
}
