
public class Cadenas {

	public static void main(String[] args) {
		
		String nombre="Alvaro";
		System.out.println(nombre.length()); //LONGITUD
		System.out.println(nombre.charAt(2)); //LETRA EN POSICION
		System.out.println(nombre.substring(2,4)); //SUBCADENA
		System.out.println(nombre.equals("Alvaro")); //COMPARAR CADENAS (DIFERENCIA MAYUS Y NO MAYUS)
		System.out.println(nombre.equalsIgnoreCase("alvaro")); //COMPARAR CADENAS
		
		String nome="Alvaro";
		System.out.println("¿nombre==nome? " + (nombre==nome));
		
		String name="Alvar";
		name +="o";
		System.out.println("name= " + name);
		System.out.println("¿nombre == name? " + (nombre==name));
		
		char caracter='A'; //char va con '' NO ""
		System.out.println(caracter);
	}

}
