
public class CharExplicacion {

	public static void main(String[] args) {

		char car = '#';
		char ca = '@';
		char c = 64; // valor númerico de la tabla ASCII
		int entero = car;

		System.out.println("car = " + car + " c = " + c + " ca = " + ca);

		System.out.println((int) (car));
		System.out.println((char) (35));

		System.out.println(entero);
		System.out.println((char) (entero));

		String num = "12345";
		System.out.println(num.charAt(2) + 3);
		char tres = num.charAt(2);
		System.out.println(tres);
		int t = tres;
		System.out.println(t);
		t = tres;
		System.out.println(t-(int)'0');
		
		char digito = '\u2764';
//		while(digito <= 2000) {
//			System.out.println(digito);
//			digito++;
//		}
		System.out.println(digito);
	}

}
