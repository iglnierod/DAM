package cajeroAutomatico;

public class Cuenta {
	// ATRIBUTOS
	private float saldo;

	// CONSTRUCTOR
	public Cuenta() {
	}

	public Cuenta(float saldo) {
		this.saldo = saldo;
	}

	// METODOS
	public void ingresar(float cantidad) {
		saldo += cantidad;
	}

	public void extraer(float cantidad) {
		saldo -= cantidad;
	}

	public float getSaldo() {
		return saldo;
	}
}
