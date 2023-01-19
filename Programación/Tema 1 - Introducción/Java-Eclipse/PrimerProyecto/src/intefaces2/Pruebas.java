package intefaces2;

public class Pruebas {

	public static void main(String[] args) {
		float[] notas = {3.4f,6.8f,7,2,9,10};
		ClaseCentroDeEstudios grupo = new ClaseCentroDeEstudios();
		System.out.println("Aprobados: " + grupo.numeroDeAprobados(notas));
		System.out.println("Suspensos: " + grupo.numeroDeSuspensos(notas));
		System.out.println("Media: " + grupo.notaMedia(notas));
		System.out.println("Desviación: " + grupo.desviacion(notas));
	}

}
