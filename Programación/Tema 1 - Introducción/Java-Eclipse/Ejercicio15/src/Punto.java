
public class Punto {
	private int x;
	private int y;
	//Constructor
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//Getters & Setters
	public void setX(int x){
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
	//Métodos
	public String obtenerCadenaCoordenadas() {
		return "(" + getX() + "," + getY() + ")";
	}
	
	public void mostrarCoordenadas() {
		System.out.println(this.obtenerCadenaCoordenadas());
	}
	
	public void cambiarCoordenadas(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
