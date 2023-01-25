package enumerados;

public class PruebasEnumerados {
	enum Color {
		ROJO, VERDE, AZUL
	}

	public static void main(String[] args) {
		String color;
		color = "rojo";
		color = "verde";
		color = "azul";
		color = "coche";

		Color miColor = Color.VERDE;
		System.out.println(miColor);

		switch (miColor) {
		case ROJO:
			System.out.println("El color es rojo");
			break;
		case VERDE:
			System.out.println("El color es rojo");
			break;
		case AZUL:
			System.out.println("El color es rojo");
			break;
		}

		// RECORRER VALORES ENUM
		for (Color c : Color.values()) {
			System.out.println(c);
		}

		Demarcacion delantero = Demarcacion.DELANTERO;
		Demarcacion defensa = Demarcacion.DEFENSA;

		System.out.println(delantero.name());
		System.out.println(delantero.toString());
		System.out.println(delantero.ordinal());
		System.out.println(delantero.compareTo(defensa));
		System.out.println(defensa.compareTo(delantero));

		for (Demarcacion d : Demarcacion.values()) {
			System.out.print(d.toString().toLowerCase() + " | ");
		}
		System.out.println();

		Equipo villareal = Equipo.VILLARREAL;
		System.out.println(villareal.getNombreClub());
		System.out.println(villareal.getPuestoLiga());

		for (Equipo e : Equipo.values()) {
			System.out.println(e.getPuestoLiga() + ": " + e.getNombreClub());
		}

		String club = "sevilla".toUpperCase();
		Equipo sevilla = Equipo.valueOf(club);
		System.out.println(sevilla.getNombreClub());

		Equipo.mostrarEquipos();

		Futbolista iniesta = new Futbolista("Andres Iniesta", 8, Demarcacion.CENTROCAMPISTA, Equipo.BARÇA);
		System.out.println(iniesta.toString());

	}
}
