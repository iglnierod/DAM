package Arrays;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un mes: ");
		String mes = sc.next();
		sc.close();
		
		String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
				"octubre", "noviembre", "diciembre"};

		String[] months = {"january", "february", "march", "april", "may", "june", "july", "august",
				"september","october", "november", "december"};
		int contador = 1;
		boolean español = false;
		for(int i = 0; i < meses.length; i++) {
			if(mes.equals(meses[i])) {
				español = true;
				contador = i;
				break;
			}
			
			if(mes.equals(months[i])) {
				español = false;
				contador = i;
				break;
			}
		}
		
		if(español == true) {
			System.out.println(mes + " en ingles es: " + months[contador]);
		}
		
		if(español == false) {
			System.out.println(mes + " in spanish is: " + meses[contador]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		boolean esp = false;
//		int i = 0;
//		System.out.println("aa");
//		for(i = 0; i < meses.length; i++) {
//			if(mes.equals(meses[i])) {
//				esp = true;
//				break;
//			}
//			
//			if(mes.equals(months[i])){
//				esp = false;
//				break;
//			}
//		}
//		System.out.println("bb");
//		System.out.println(i);
//		if(esp == true) {
//			System.out.println(mes + " en inglés es: " + months[i]);
//		} 
//		
//		if(esp == false) {
//			System.out.println(mes + " in spanish is: " + meses[i]);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
