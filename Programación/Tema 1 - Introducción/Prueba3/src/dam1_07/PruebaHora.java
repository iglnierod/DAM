package dam1_07;

import java.util.Arrays;

public class PruebaHora {
	public static void main(String[] args) {
		Hora h = new Hora(12, 27);
		System.out.println("Salida 1: " + h.toString());
		
		h.setHora(25);
		System.out.println("Salida 2: " + h.toString());
		
		h.setMinuto(-3);
		System.out.println("Salida 3: " + h.toString());

		h.setHora(12);
		h.setMinuto(58);
		System.out.print("\nSalida 4: ");
		h.mostrarHora();
		
		h.incrementar();
		h.incrementar();
		h.incrementar();
		System.out.println("\nSalida 5: " + h.toString());

		// El constructor solo establece la hora y/o el minuto si es correcto
		// sino establece el valor 0 (cero).
		System.out.println("Salida 6: " + new Hora(14, 63).toString());

		HoraExacta he = new HoraExacta(23, 59, 59);
		System.out.println("\nSalida 7: " + he.toString());
		he.incrementar();
		System.out.println("Salida 8: " + he.toString());
		he.incrementar();
		System.out.print("Salida 9: ");
		he.mostrarHora();

		Reloj r = new Reloj(15, 23, 32);
		System.out.println("\nSalida 10: " + r.toString());
		r.mostrarHora();

		r = new Reloj(5, 34, 47, Periodo.PM);
		System.out.println("\nSalida 11: " + r.toString());
		r.mostrarHora();

		r.setFormato(Formato.VEINTICUATROHORAS);
		System.out.println("Salida 12: " + r.toString());
		r.mostrarHora();
		
		Hora[] arrayHoras = Hora.obtenerArrayHorasAleatoriasValidas(6);
		System.out.print("\nSalida 13: arrayHoras: ");
		for (Hora hora : arrayHoras)
			System.out.print(hora + " ");
		Arrays.sort(arrayHoras);
		System.out.print("\nSalida 14: arrayHoras (ordenadas): ");
		for (Hora hora : arrayHoras)
			System.out.print(hora + " ");
	}
}
