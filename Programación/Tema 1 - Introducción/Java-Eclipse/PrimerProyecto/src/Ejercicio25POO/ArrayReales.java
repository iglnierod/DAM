package Ejercicio25POO;

import java.util.Arrays;

public class ArrayReales implements Estadisticas {
	private double[] array;
	private double[] arrayOrdenado;

	public ArrayReales(int n) {
		array = new double[n];
	}

	public void rellenar() {
		for (int i = 0; i < array.length; i++) {
			array[i] = (Math.random() * 100);
		}
		arrayOrdenado = array.clone();
		Arrays.sort(arrayOrdenado);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (double n : array) {
			sb.append(String.format("%6.3f\n", n));
		}
		return sb.toString();
	}

	@Override
	public double minimo() {
		// METODO 3
		return this.arrayOrdenado[0];

		// METODO 2
//		double[] ar = array.clone();
//		Arrays.sort(ar);
//		return ar[0];

		// METODO 1
//        double min = array[0];
//        for(int i = 0; i < array.length; i++){
//            if(min > array[i])
//                min = array[i];
//        }
//        return min;
	}

	@Override
	public double maximo() {
		// METODO 3
		return this.arrayOrdenado[arrayOrdenado.length - 1];

		// METODO 2
//		double[] ar = array.clone();
//		Arrays.sort(ar);
//		return ar[ar.length - 1];

		// METODO 1
//        double max = array[0];
//        for(int i = 0; i < array.length; i++){
//            if(max < array[i])
//                max = array[i];
//        }
//        return max;
	}

	@Override
	public double sumatorio() {
		double suma = 0.0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		return suma;
	}

	public static String obtenerCadenaDecimal(double valor, int numDecimales) {
		return String.format("%." + numDecimales + "f", valor);
	}
}
