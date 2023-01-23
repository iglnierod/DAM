package Ejercicio25POO;

public class Main {
    public static void main(String[] args) {
        ArrayReales array = new ArrayReales(10);
        array.rellenar();
        System.out.println("Valores:\n" + array.toString());
        System.out.println("Mínimo: " + ArrayReales.obtenerCadenaDecimal(array.minimo(),3));
        System.out.println("Máximo: " + ArrayReales.obtenerCadenaDecimal(array.maximo(),3));
        System.out.println("Sumatorio: " + ArrayReales.obtenerCadenaDecimal(array.sumatorio(),2));
    }
}
