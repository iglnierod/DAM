package excepciones;

public class Excepciones {
	
	public static void main(String[] args) {
		String cadena = " 15";
		try {
			int numero = Integer.parseInt(cadena);	
			System.out.println(cadena + " + " + 3 + " = " + (numero + 3));
		} catch (NumberFormatException e){
			System.out.println("Formato numerico incorrecto");
		}
		System.out.println("Fin del programa");
	}
}
