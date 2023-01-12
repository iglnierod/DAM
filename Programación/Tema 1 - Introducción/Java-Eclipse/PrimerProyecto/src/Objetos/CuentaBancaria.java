package Objetos;

public class CuentaBancaria {
	private double tipoInteres;
	private double saldo;

	public void setTipoInteres(double tipo) {
		if (tipo < 0) {
			System.out.println("El tipo de interes no puede ser negativo.");
			return;
		}
		tipoInteres = tipo;
	}

	public void ingresar(double cantidad) {
		saldo += cantidad;
	}

	public void retirar(double cantidad) {
		if (cantidad > saldo) {
			System.out.println("Saldo insufuciente");
			return;
		}
		saldo -= cantidad;
	}

	public double getSaldo() {
		return saldo;
	}

	public void abonarIntereses() {
		saldo += saldo * tipoInteres;
	}

	public static void main(String[] args) {
		CuentaBancaria cuenta = new CuentaBancaria();
		cuenta.ingresar(1000);
		cuenta.setTipoInteres(0.02);

		System.out.println("Saldo: " + cuenta.getSaldo());

		cuenta.ingresar(500);
		cuenta.retirar(200);

		System.out.println("Saldo: " + cuenta.getSaldo());

		cuenta.abonarIntereses();
		System.out.println("Saldo: " + cuenta.getSaldo());
	}
}
