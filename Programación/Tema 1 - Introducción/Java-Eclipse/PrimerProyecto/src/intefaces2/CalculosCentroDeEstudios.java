package intefaces2;

public interface CalculosCentroDeEstudios {
	
	public abstract short numeroDeAprobados(float[] notas);

	short numeroDeSuspensos(float[] notas);

	float notaMedia(float[] notas);

	float desviacion(float[] notas);
}
