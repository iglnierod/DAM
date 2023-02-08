package ejercicio30POO;

public enum TipoDeMadera { 
	// VALORES
	ROBLE("Castaño verdoso", (short) 800), CAOBA("Marrón oscuro", (short) 770), NOGAL("Marrón rojizo", (short) 820),
	CEREZO("Marrón cereza", (short) 790), BOJ("Marrón negruzco", (short) 675);
	
	// ATRIBUTOS
	private final String Color;
	private final short PesoEspecifico;

	// CONSTRUCTOR
	private TipoDeMadera(String color, short peso) {
		Color = color;
		PesoEspecifico = peso;
	}

	// METODOS
	public static void mostrarTodasLasCaracteristicas() {
		for (TipoDeMadera tdm : TipoDeMadera.values()) {
			System.out.println(tdm.name() + ": " + tdm.getColor() + " (" + tdm.getPesoEspecifico() + ")");
		}
	}

	@Override
	public String toString() {
		return "La madera de " + this.name() + " es de color " + this.getColor() + " y tiene un peso especifico de "
				+ this.PesoEspecifico + " Kg/m³";
	}

	// GETTERS
	public String getColor() {
		return Color;
	}

	public short getPesoEspecifico() {
		return PesoEspecifico;
	}

	// MAIN
	public static void main(String[] args) {
		TipoDeMadera.mostrarTodasLasCaracteristicas();
		TipoDeMadera nogal = TipoDeMadera.NOGAL;
		System.out.println("\n" + nogal.toString());
	}
}