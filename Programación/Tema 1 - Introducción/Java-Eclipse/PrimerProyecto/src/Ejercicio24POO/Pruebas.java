package PrimerProyecto.src.Ejercicio24POO;

public class Pruebas {
    public static void main(String[] args) {
       ImpresionNormal in = new Negativa();
       ImpresionNormal in2 = new Negativa();
       ImpresionNormal in3 = new Positiva();

       in.imprimir();
       in2.imprimir();
       in3.imprimir();

       Neutra neutra = new Neutra();
       neutra.imprimir();
       neutra.imprimirBonito();

       ImpresionNormal in4 = new Neutra();
       in4.imprimir();
    }
}