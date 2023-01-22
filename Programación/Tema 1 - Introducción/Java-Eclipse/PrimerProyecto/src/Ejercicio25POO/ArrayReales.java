package PrimerProyecto.src.Ejercicio25POO;

import java.util.Arrays;

public class ArrayReales implements Estadisticas{
    private double[] array;

    public ArrayReales(int n){
        array = new double[n];
    }

    public void rellenar(){
        for(int i = 0; i < array.length; i++){
            array[i] = (Math.random() * 100);
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(double n : array){
            sb.append(n + "\n");
        }
        return sb.toString();
    }

    @Override
    public double minimo(){
        double min = array[0];
        for(int i = 0; i < array.length; i++){
            if(min > array[i])
                min = array[i];
        }
        return min;
    }

    @Override
    public double maximo(){
        double max = array[0];
        for(int i = 0; i < array.length; i++){
            if(max < array[i])
                max = array[i];
        }
        return max;
    }

    @Override
    public double sumatorio(){
        double suma = 0;
        for(int i = 0; i < array.length; i++){
            suma += array[i];
        }
        return suma;
    }

    public static double obtenerCadenaDecimal(double d,int n){
        return Math.round(d);
    }
}
