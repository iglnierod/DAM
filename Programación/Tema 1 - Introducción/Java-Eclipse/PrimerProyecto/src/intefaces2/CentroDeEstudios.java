package intefaces2;

public interface CentroDeEstudios {
	public static final byte numeroDePisos = 5;
	byte numeroDeAulas = 25;
	byte numeroDeDespachos = 10;

	public abstract short numeroDeAprobados(float[] notas);

	short numeroDeSuspensos(float[] notas);

	float notaMedia(float[] notas);

	float desviacion(float[] notas);
}
