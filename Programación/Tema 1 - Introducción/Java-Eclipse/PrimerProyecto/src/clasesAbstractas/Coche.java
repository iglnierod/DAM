package clasesAbstractas;

public /*abstract*/ class Coche extends Vehiculo{
	//Sobrecarga
	public void arrancar(String s) {
		System.out.println("arranca un coche con " + s);
	}
	
	@Override
	public void arrancar() {
		System.out.println("Arranca un coche");
	}
}
