import java.util.Scanner;
public class Ejercicio42 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca la altura de la pirámide:");
        int altura = sc.nextInt();
        System.out.println("Introduzca el carácter que desea usar en la pirámide");
        String caracter = sc.next();
        sc.close();
        String space = " ";
        for(int i=0;i<=altura;i++) {
            for(int j=0;j<=i;j++){
                if(j==0) {
                    for(int k=i;k<=altura;k++) {
                        System.out.print(space);
                    }
                System.out.print(caracter);
                
                }
                else {
                    System.out.print(caracter);
                    System.out.print(caracter);
                }
            }
            System.out.println();
            
        }
        }
}
        
        
        
        
    

