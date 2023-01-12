import java.util.Scanner;
public class Ejercicio31 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca un número:");
        double num = entrada.nextDouble();
        entrada.close();
        int contador = 0;
        double aux;
        aux = num;
        do{
            num = (int)(num/10);
            contador++;
        }while(num>0);

        System.out.println(aux + " tiene " + contador + " cifras");
    }
}
