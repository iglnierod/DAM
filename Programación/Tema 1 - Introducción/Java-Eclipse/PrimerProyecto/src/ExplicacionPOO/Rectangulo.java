package ExplicacionPOO;

public class Rectangulo {
	public int alto, ancho;

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		if (alto > 10 && alto < 20) {
			this.alto = alto;
		} else {
			System.out.println("El alto debe estar entre 10 y 20");
		}
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		if (ancho > 20 && ancho < 30)
			this.ancho = ancho;
	}

	public static void main(String[] args) {
		Rectangulo r = new Rectangulo();
		r.alto = 5;
	}
}
