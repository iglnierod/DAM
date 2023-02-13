package dam1_07;

public class Reloj extends HoraExacta {
	// ATRIBUTOS
	private Formato formato;
	private Periodo periodo;

	// CONSTRUCTORES
	public Reloj(int hora, int minuto, int segundo) {
		super(hora, minuto, segundo);
		this.formato = Formato.VEINTICUATROHORAS;
		if (hora >= 0 && hora <= 11)
			this.periodo = Periodo.AM;
		else
			this.periodo = Periodo.PM;
	}

	public Reloj(int hora, int minuto, int segundo, Periodo periodo) {
		super(hora, minuto, segundo);
		this.formato = Formato.DOCEHORAS;
		if (hora < 12) {
			this.periodo = Periodo.AM;
			return;
		} else if (hora < 11) {
			this.periodo = Periodo.PM;
			return;
		}
		System.out.println("La hora y el periodo no concuerdan. Se establece la hora a 00 y periodo a AM");
		this.setHora(0);
		this.periodo = Periodo.AM;
	}

	// GETTERS & SETTERS
	public Formato getFormato() {
		return formato;
	}

	public void setFormato(Formato formato) {
		if (this.periodo.equals(Periodo.PM)) {
			if (this.formato.equals(Formato.DOCEHORAS)) {
				this.setHora(getHora() + 12);
				this.formato = formato;
			} else if (this.formato.equals(Formato.VEINTICUATROHORAS)) {
				this.setHora(getHora() - 12);
				this.formato = formato;
			}
		} else {
			if (this.formato.equals(Formato.DOCEHORAS)) {
				this.setHora(getHora() + 12);
				this.formato = formato;
			} else if (this.formato.equals(Formato.VEINTICUATROHORAS)) {
				this.setHora(getHora() - 12);
				this.formato = formato;
			}
		}
	}

	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}

	// METODOS
	@Override
	public void mostrarHora() {
		if (this.formato.equals(Formato.DOCEHORAS)) {
			System.out.println("Son las " + super.toString() + " " + this.periodo);
			return;
		}

		if (this.formato.equals(Formato.VEINTICUATROHORAS)) {
			System.out.println("Son las " + super.toString() + " horas");
			return;
		}
	}

}
