package Ejercicio29POO;

public class PruebaMes {
	enum Mes {
		ENERO((byte) 1), FEBRERO((byte) 2), MARZO((byte) 3), ABRIL((byte) 4), MAYO((byte) 5), JUNIO((byte) 6),
		JULIO((byte) 7), AGOSTO((byte) 8), SEPTIEMBRE((byte) 9), OCTUBRE((byte) 10), NOVIEMBRE((byte) 11),
		DICIEMBRE((byte) 12);

		private final byte numMes;

		private Mes(byte numMes) {
			this.numMes = numMes;
		}

		public byte getNumMes() {
			return numMes;
		}

		public static void mostrar() {
			for (Mes m : Mes.values()) {
//				System.out.println((m.ordinal() + 1) + " - " + m.name());
				System.out.printf("%2d - %s\n", m.ordinal() + 1, m.name());
			}
		}

		public static void mostrarInvertido() {
//			Mes[] meses = { Mes.ENERO, Mes.FEBRERO, Mes.MARZO, Mes.ABRIL, Mes.MAYO, Mes.JUNIO, Mes.JULIO, Mes.AGOSTO,
//					Mes.SEPTIEMBRE, Mes.OCTUBRE, Mes.NOVIEMBRE, Mes.DICIEMBRE };
			Mes[] meses = Mes.values();
			for (int i = meses.length - 1; i >= 0; i--) {
				System.out.printf("%2d - %s\n", meses[i].getNumMes(), meses[i].name());
			}
		}
	}

	public static void main(String[] args) {
		for (Mes m : Mes.values()) {
			System.out.println(m.getNumMes() + " - " + m.name());
		}
		System.out.println("- - - - - - - - - - - -");
		Mes.mostrar();
		System.out.println("- - - - - - - - - - - -");
		Mes.mostrarInvertido();
	}
}
