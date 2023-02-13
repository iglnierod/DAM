package dam1_07;

public class Hora implements Comparable<Object> {
	// ATRIBUTOS
	private int hora;
	private int minuto;

	// CONSTRUCTOR
	public Hora(int hora, int minuto) {
		this.setHora(hora);
		this.setMinuto(minuto);
	}

	// GETTERS & SETTERS
	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		// Filtramos las horas para que solo sean las posibles
		if (hora >= 0 && hora <= 23)
			this.hora = hora;
		else {
			System.out.println("Hora introducida fuera de los límites [0, 23], por lo que se establece en 0");
			this.hora = 0;
		}
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		// Filtramos los minutos para que solo sean las posibles
		if (minuto >= 0 && minuto <= 59)
			this.minuto = minuto;
		else {
			System.out.println("Minuto introducido fuera de los límites [0, 59], por lo que se establece en 0");
			this.minuto = 0;
		}
	}

	// METODOS
	public void incrementar() {
		if (this.minuto == 59) {
			this.minuto = 0;
			this.hora += 1;
			if (this.hora == 23) {
				this.hora = 0;
			}
		} else {
			this.minuto += 1;
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (this.hora < 10)
			sb.append("0");
		sb.append(this.hora + ":");
		if (this.minuto < 10)
			sb.append("0");
		sb.append(this.minuto);

		return sb.toString();
//		return String.format("%02d:%02d", this.hora, this.minuto);
	}

	public void mostrarHora() {
		System.out.println("Son las " + this.toString() + " horas");
	}

	// ???¿?¿?¿?¿
	public static Hora[] obtenerArrayHorasAleatoriasValidas(int index) {
		Hora[] array = new Hora[index];
		int contador = 0;
		while (contador < index) {
			int hor = (int) (Math.random() * 24);
			int min = (int) (Math.random() * 60);
			array[contador] = new Hora(hor, min);
			contador++;
		}
		return array;

	}

	@Override
	public int compareTo(Object o) {
		Hora h = (Hora) o;
		if (this.hora < h.hora)
			return -1;
		else if (this.hora == h.hora) {
			if (this.minuto < h.minuto) {
				return -1;
			} else if (this.minuto == h.minuto) {
				return 0;
			}
		} else
			return 1;
		return 0;
	}
}
