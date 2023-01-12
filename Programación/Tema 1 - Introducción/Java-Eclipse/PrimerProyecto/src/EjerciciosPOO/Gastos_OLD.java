package EjerciciosPOO;

import java.util.Scanner;

public class Gastos_OLD {
	private float gastosAlimentacion;
	private float gastosTransportes;
	private float gastosVivienda;
	private boolean gastosEnEuros;
	private float tipoCambio;

	public Gastos_OLD() {
	}

	// Setters

	public void setGastosAlimentación(float cantidad) {
		this.gastosAlimentacion = cantidad;
	}

	public void setGastosTransporte(float cantidad) {
		this.gastosTransportes = cantidad;
	}

	public void setGastosVivienda(float cantidad) {
		this.gastosVivienda = cantidad;
	}

	public void setTipoCambio(float nuevoValor) {
		this.tipoCambio = nuevoValor;
	}

	public void setEstaEnEuros(boolean moneda) {
		this.gastosEnEuros = moneda;
	}

	public boolean estaEnEuros() {
		return gastosEnEuros;
	}

	public void eliminarTodosLosGastos() {
		this.gastosAlimentacion = 0;
		this.gastosTransportes = 0;
		this.gastosVivienda = 0;
	}

	public float obtenerTotalEuros() {
		if (gastosEnEuros) {
			return gastosAlimentacion + gastosTransportes + gastosVivienda;
		}
		return (gastosAlimentacion + gastosTransportes + gastosVivienda) / tipoCambio;

	}

	public float obtenerTotalDolares() {
		if (!gastosEnEuros) {
			return gastosAlimentacion + gastosTransportes + gastosVivienda;
		}
		return (gastosAlimentacion + gastosTransportes + gastosVivienda) * tipoCambio;
	}

	public void main(String[] args) {
		System.out.println(234);
		Gastos_OLD gastos = new Gastos_OLD();

		Scanner sc = new Scanner(System.in);
		System.out.println("Los datos serán introducidos en euros(true) o dolares(false)?");
		gastos.setEstaEnEuros(sc.nextBoolean());
		System.out.println("Tipo de cambio: ");
		gastos.setTipoCambio(sc.nextFloat());
		System.out.print("Gastos alimentacion: ");
		gastos.setGastosAlimentación(sc.nextFloat());
		System.out.print("Gastos transportes: ");
		gastos.setGastosTransporte(sc.nextFloat());
		System.out.print("Gastos vivienda: ");
		gastos.setGastosVivienda(sc.nextFloat());
		sc.close();

		System.out.println("Total gastos en euros: " + gastos.obtenerTotalEuros() + " €");
		System.out.println("Total gastos en dolares: " + gastos.obtenerTotalDolares() + " $");

	}
}
