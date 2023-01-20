package ejercicio23POO;

public class PruebaEmpleados {
	public static void main(String[] args) {
		EmpleadoProduccion ep = new EmpleadoProduccion("Luis", 45826623, 30, 1100.00, "tarde");
		EmpleadoDistribuccion ed = new EmpleadoDistribuccion("Marta", 45841234, 32, 1250.34, "Santiago");

		System.out.println(ep.getNombre() + " con nif: " + ep.getNif() + ", tiene " + ep.getDiasVacaciones()
				+ " días de vacaciones," + " tiene un salario neto de: " + ep.getSalario());
		System.out.println(ed.getNombre() + " con nif: " + ed.getNif() + ", tiene " + ed.getDiasVacaciones()
				+ " días de vacaciones," + " tiene un salario neto de: " + ed.getSalario());
	}
}
