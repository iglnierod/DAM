package prueba4_dam;

public class ProductoUnitario extends Producto{
	private int cantidad;
	private double precio;
	public ProductoUnitario(String nombre, boolean esPerecedero, int cantidad, double precio) {
		super(nombre, esPerecedero);
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	
}
