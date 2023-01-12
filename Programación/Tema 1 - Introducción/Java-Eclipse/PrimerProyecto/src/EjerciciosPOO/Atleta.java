package EjerciciosPOO;

public class Atleta {
	String nombre;
	int edad;
	float altura;
	float peso;
	String nif;
	
	public void visualizar() {
		System.out.println("Nombre: " + nombre);
		System.out.println("NIF: " + nif);
		System.out.println("Altura: " + altura +" m");
		System.out.println("Peso: " + peso + " Kg");
		if(edad >= 18) {
			System.out.println("Mayor de edad");
		} else {
			System.out.println("Menor de edad");
		}
	}
	
	public static void main(String[] args) {
		Atleta at1 = new Atleta();
		at1.nombre = "Carla";
		at1.edad = 21;
		at1.altura = 1.72f;
		at1.peso = 68.5f;
		at1.nif = "12786946X";
		
		at1.visualizar();
		
		Atleta at2 = new Atleta();
		at2.nombre = "Marcos";
		at2.edad = 17;
		at2.altura = 1.79f;
		at2.peso = 70.5f;
		at2.nif = "14964579V";
		System.out.println();
		at2.visualizar();

		

	}
}
