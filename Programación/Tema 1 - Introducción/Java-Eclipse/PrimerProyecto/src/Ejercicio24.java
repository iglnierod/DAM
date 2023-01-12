public class Ejercicio24 {
    public static void main (String args[]){
        
        double i = 1;
        double media = 0;
        do{
            media += i;
            i++;
        }
        while (i<=30);
        media = media/30;
        System.out.println("La media de los 30 primeros números es: " + media);
    }
}
