import java.util.Scanner;
public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca un número para ver que clase hay a primera hora");
		System.out.println("1. Lunes");
		System.out.println("2. Martes");
		System.out.println("3. Miercoles");
		System.out.println("4. Jueves");
		System.out.println("5. Viernes");
		

		int dia = entrada.nextInt();
		entrada.close();

        switch (dia){
            case 1:
                System.out.println("Sistemas Informáticos");
                break;
            case 2:
                System.out.println("Bases de datos");
                break;
            case 3:
                System.out.println("Contornos");
                break;
            case 4:
                System.out.println("Bases de datos");
                break;
            case 5:
                System.out.println("Programación");
                break;
            default:
                System.out.println("El día introducido no es válido");
        }
	}

}