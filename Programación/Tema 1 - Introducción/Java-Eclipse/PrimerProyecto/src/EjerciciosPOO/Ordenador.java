package EjerciciosPOO;

public class Ordenador {
	// Datos de la memoria
	private int tamañoMemoria;
	private String tipoMemoria;
	private int velocidadMemoria;

	// Datos del disco duro
	private int tamañoDiscoDuro;
	private int numeroRevolucionesDisco;

	// Datos del procesador
	private String modeloProcesador;
	private float velocidadProcesador;

	// Setters
	public void setTamañoMemoria(int nuevoTamaño) {
		this.tamañoMemoria = nuevoTamaño;
	}

	public void setTipoMemoria(String nuevoTipoMemoria) {
		this.tipoMemoria = nuevoTipoMemoria;
	}

	public void setVelocidadMemoria(int nuevaVelocidadMemoria) {
		this.velocidadMemoria = nuevaVelocidadMemoria;
	}

	public void setTamañoDiscoDuro(int nuevoTamañoDiscoDuro) {
		this.tamañoDiscoDuro = nuevoTamañoDiscoDuro;
	}

	public void setNumeroRevolucionesDisco(int nuevoNumeroRevolucionesDisco) {
		this.numeroRevolucionesDisco = nuevoNumeroRevolucionesDisco;
	}

	public void setModeloProcesador(String nuevoModeloProcesador) {
		this.modeloProcesador = nuevoModeloProcesador;
	}

	public void setVelocidadProcesador(float nuevaVelocidadProcesador) {
		this.velocidadProcesador = nuevaVelocidadProcesador;
	}

	// Getters

	public int getTamañoMemoria() {
		return tamañoMemoria;
	}

	public String getTipoMemoria() {
		return tipoMemoria;
	}

	public int getVelocidadMemoria() {
		return velocidadMemoria;
	}

	public int getTamañoDiscoDuro() {
		return tamañoDiscoDuro;
	}

	public int getNumeroRevolucionesDisco() {
		return numeroRevolucionesDisco;
	}

	public String getModeloProcesador() {
		return modeloProcesador;
	}

	public float getVelocidadProcesador() {
		return velocidadProcesador;
	}

	public void mostrar() {
		System.out.println("Tamaño memoria: " + getTamañoMemoria());
		System.out.println("Tipo memoria: " + getTipoMemoria());
		System.out.println("Velocidad memoria: " + getVelocidadMemoria());
		System.out.println("Tamaño disco duro: " + getTamañoDiscoDuro());
		System.out.println("Numero revoluciones disco: " + getNumeroRevolucionesDisco());
		System.out.println("Modelo procesador: " + getModeloProcesador());
		System.out.println("Velocidad procesador: " + getVelocidadProcesador());
		System.out.println("Velocidad memoria: " + getVelocidadMemoria());
	}

}
