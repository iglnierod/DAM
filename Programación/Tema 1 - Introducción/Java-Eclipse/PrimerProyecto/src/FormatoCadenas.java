
public class FormatoCadenas {
	public static void main(String [] args) {
		//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Formatter.html#syntax
		//   %[argument_index$][flags][width][.precision]conversion
		String cadena = "hola";
		int entero = 236;
		double primerDoble = 78.849;
		double segundoDoble = -3.6;
		double tercerDoble = 7823.123;
		System.out.printf("%.2f",primerDoble);
		
		System.out.printf("\n%.2f %.2f",primerDoble,segundoDoble);
		System.out.println();
		System.out.printf("Nº: %1.2f\nNº: %1.2f", primerDoble,segundoDoble);
		System.out.printf("Nº: %1.2f\nNº: %1.2f", primerDoble,segundoDoble);
		System.out.println();
		System.out.println();
		System.out.printf("Nº: %10.2f\nNº: %10.2f", tercerDoble,segundoDoble);//Alinear con width
		System.out.println();
		System.out.println();
		System.out.printf("Nº: %1.2f\nNº: %1.2f%%", primerDoble,segundoDoble);//Doble %% para omitir
		System.out.println();
		System.out.println();
		System.out.printf("Nº: %1s\nNº: %1.2f", cadena,segundoDoble); //s -> cadena minuscula
		System.out.println();
		System.out.println();
		System.out.printf("Nº: %1S\nNº: %1.2f", cadena,segundoDoble); //S -> cadena MAYUSCULA


	}
}
