package cajeroAutomatico;

public class Cuenta {
	private float saldo;

	public Cuenta() {
	}

	public Cuenta(float saldo) {
		this.saldo = saldo;
	}
	
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
