package Objetos;
import java.util.Scanner;
public class RectanguloTexto {
	private int base;
	private int altura;

	//Setter
	public void establecerBase(int valor) {
		base = valor;
	}
	
	//Getter
	public int obtenerBase(){
		return base;
	}
	
	public void establecerAltura(int valor) {
		altura = valor;
	}
	
	public int obtenerAltura() {
		return altura;
	}
	
	public int obtenerArea() {
		return base * altura;
	}
	
	public void dibujar(char caracter) {
		for(int i = 0; i < altura;i++) {
			for(int j = 0; j < base; j++) {
				System.out.print(caracter);
			}
			System.out.println();
		}
	}
	
	
	public void establecerBaseAltura(int b, int a) {
		base = b;
		altura = a;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RectanguloTexto rt = new RectanguloTexto();
		System.out.print("Introduzca la base: ");
		int base = sc.nextInt();
		System.out.print("Introduzca la altura: ");
		int altura = sc.nextInt();
		sc.close();
		
		rt.establecerBase(5);
		rt.establecerAltura(3);
		System.out.println(rt.obtenerBase());
		System.out.println(rt.obtenerAltura());
		System.out.println(rt.obtenerArea());
		rt.dibujar('*');
		
		System.out.println();
		
		RectanguloTexto rt2 = new RectanguloTexto();
		rt2.establecerBase(rt.obtenerAltura());
		rt2.establecerAltura(rt.obtenerBase());
		rt2.dibujar('#');
		
		System.out.println();
		
		RectanguloTexto rt3 = new RectanguloTexto();
		rt3.establecerBaseAltura(base, altura);
		rt3.dibujar('$');
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
