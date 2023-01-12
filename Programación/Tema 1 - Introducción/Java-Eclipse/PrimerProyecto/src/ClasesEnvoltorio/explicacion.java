package ClasesEnvoltorio;

import java.math.BigInteger;

public class explicacion {

	public static void main(String[] args) {
		int num = 142;
		Integer n = new Integer(142); // Metodo obsoleto
		System.out.println("n = " + n);

		Integer n2 = Integer.valueOf("142");
		System.out.println("n2 = " + n2);

		System.out.println(n2.doubleValue());
		System.out.println(n2.byteValue());

		System.out.println("Byte -> [" + Byte.MIN_VALUE + "," + Byte.MAX_VALUE + "]");

		System.out.println("Long -> [" + Long.MIN_VALUE + "," + Long.MAX_VALUE + "]");

		System.out.println(Integer.toString(num));
		System.out.println(Integer.toHexString(num));
		System.out.println(Integer.toBinaryString(num));
		System.out.println(Integer.parseInt("384"));
		System.out.println(Integer.parseInt("F", 16));
		System.out.println(Integer.compare(7, 7));
		System.out.println(Integer.compare(7, 5));
		System.out.println(Integer.compare(7, 9));

		Integer n3 = Integer.valueOf(10 * 14 + 2);
		System.out.println(n2 == n3); // COMO SON OBJETOS DA FALSE
		System.out.println(n2.equals(n3)); // .equals() COMPARA EL CONTENIDO DE LOS OBJETOS

		System.out.println(Integer.min(15, 12));
		System.out.println(Integer.max(15, 12));

		int entero = n2.intValue();

		int numero = 72;
		System.out.println("numero = " + numero);

		Integer numero2 = 72; // CONVIERTE DIRECTAMENTE INT A INTEGER DIRECTAMENTE
		System.out.println("numero2 = " + numero2);

		// AUTOBOXING - AUTOUNBOXING
		int numero3 = numero;
		System.out.println("numero3 = " + numero3);

		Integer numero4 = numero2 + 3;
		System.out.println("numero4 =" + numero4);

		int numero5 = numero4;
		System.out.println("numero5 = " + numero5);

		System.out.println("--------------------");

		Integer[] nums = { 2, 4, 6 };
		for (Integer nn : nums) {
			System.out.println(nn.doubleValue());
			System.out.println(Integer.toBinaryString(numero5));
			System.out.println();
		}

		BigInteger bi = new BigInteger("123456789123456789123456789123456789");
		System.out.println(bi.add(BigInteger.valueOf(4)));

		bi = BigInteger.ZERO;
		StringBuilder primos = new StringBuilder();
		for (int i = 0; i < 2000; i++) {
			bi = bi.nextProbablePrime();
			primos.append(bi + "\n");
		}
		System.out.println(primos.toString());

	}

}
