package intefaces2;

public class ClaseCentroDeEstudios implements CentroDeEstudiosHerederoMultiple {

	@Override
	public short numeroDeAprobados(float[] notas) {
		short resultado = 0;
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] >= 5) {
				resultado++;
			}
		}
		return resultado;
	}

	@Override
	public short numeroDeSuspensos(float[] notas) {
		return (short)(notas.length - this.numeroDeAprobados(notas));
//		short resultado = 0;
//		for (int i = 0; i < notas.length; i++) {
//			if (notas[i] < 5) {
//				resultado++;
//			}
//		}
//		return resultado;
	}

	@Override
	public float notaMedia(float[] notas) {
		float suma = 0;
		for (int i = 0; i < notas.length; i++) {
			suma += notas[i];
		}
		return suma / notas.length;
	}

	@Override
	public float desviacion(float[] notas) {
		float media = this.notaMedia(notas);
		float desviacion = 0;
		for (int i = 0; i < notas.length; i++) {
			desviacion += Math.abs(media - notas[i]);
		}
		return desviacion / notas.length;
	}

}
