package dam1_07;

public class HoraExacta extends Hora {
	// ATRIBUTOS
	private int segundo;

	// CONSTRUCTOR
	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);
		this.setSegundo(segundo);
	}

	// GETTERS & SETTERS
	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		if (segundo >= 0 && segundo <= 59)
			this.segundo = segundo;
		else {
			System.out.println("Segundo introducido fuera de los límites [0, 59], por lo que se establece en 0");
			this.segundo = 0;
		}
	}

	// METODOS
	public void incrementar() {
		if (this.segundo == 59) {
			super.incrementar();
			this.segundo = 0;
		} else {
			this.segundo += 1;
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + ":");
		if (this.segundo < 10)
			sb.append("0");
		sb.append(this.segundo);

		return sb.toString();
	}

	public void mostrarHora() {
		System.out.println("Son las " + this.toString() + " horas");
	}
}
