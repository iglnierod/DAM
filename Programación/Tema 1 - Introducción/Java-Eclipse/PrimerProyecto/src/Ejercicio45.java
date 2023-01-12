import java.util.Scanner;
public class Ejercicio45 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un número:");
        int suma = 0;
        int contador = 0;
        do {
            int num = sc.nextInt();
            suma+=num;
            contador++;
        }while(suma<=10000);
        sc.close();
        System.out.println("El total acumulado es: " + suma);
        System.out.println("Has introducido: " + contador + " números");
        System.out.println("La media de los números introducidos es: " + (suma/contador));
    }

}
