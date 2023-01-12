package EjerciciosPOO;

public class Portatil {
	String marca;
	String cpu;
	int ram;
	int hd;
	boolean usbC;
	
	public void visualizar() {
		System.out.println("Marca: " + marca);
		System.out.println("CPU: " + cpu);
		System.out.println("RAM: " + ram + " Gb");
		System.out.println("HD: " + hd + " Gb");
		if(usbC) {
			System.out.println("Tiene puerto de USB tipo C");
		} else {
			System.out.println("No tiene puerto de USB tipo C");
		}
	}
	
	public static void main(String[] args) {
		Portatil p1 = new Portatil();
		p1.marca = "HP";
		p1.cpu = "i5";
		p1.ram= 16;
		p1.hd = 500;
		p1.usbC = false;
		
		p1.visualizar();
		
		System.out.println();
		Portatil p2 = new Portatil();
		p2.marca = "Lenovo";
		p2.cpu = "i3";
		p2.ram= 16;
		p2.hd = 250;
		p2.usbC = true;
		
		p2.visualizar();
	}
}
