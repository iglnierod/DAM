package prueba4_dam;

public class ProductoPeso extends Producto{
	private double peso;
	private double precioKg;
	public ProductoPeso(String nombre, boolean esPerecedero, double peso, double precioKg) {
		super(nombre, esPerecedero);
		this.peso = peso;
		this.precioKg = precioKg;
	}
}
