package EjerciciosPOO;

public class ModificarOrdenador {

	public static void main(String[] args) {
		Ordenador omen = new Ordenador();
		omen.setTamañoMemoria(500);
		omen.setTipoMemoria("SSD");
		omen.setVelocidadMemoria(600);
		omen.setTamañoDiscoDuro(1000);
		omen.setNumeroRevolucionesDisco(7200);
		omen.setModeloProcesador("Intel i7 12700K");
		omen.setVelocidadProcesador(2.8f);

		omen.mostrar();
	}

}
