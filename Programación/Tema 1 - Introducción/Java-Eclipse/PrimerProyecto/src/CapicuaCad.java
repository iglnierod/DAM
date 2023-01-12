import java.util.Scanner;
public class CapicuaCad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número para comprobar si es capicúa: ");
		int num = sc.nextInt();
		sc.close();
		
		String cadNum = ""+num; //convertir num a cad
		char caracter = 0;//ultimo digito
		String cadNumInvertido = "";
		
		//Recorrer la cadena del final al principio
		for(int i = cadNum.length()-1; i >= 0; i--) {
			caracter = cadNum.charAt(i);
			cadNumInvertido += caracter;
		}
		
		//Comprobar si el numero invertido es igual al número inicial
		if (cadNumInvertido.equals(cadNum)) {
			System.out.println(cadNumInvertido + " es capicúa");
		}
		else {
			System.out.println(cadNumInvertido + " no es capicúa");
		}
	}

}
