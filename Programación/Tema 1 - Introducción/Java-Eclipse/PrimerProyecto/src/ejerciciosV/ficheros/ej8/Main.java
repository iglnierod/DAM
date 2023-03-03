package ejerciciosV.ficheros.ej8;

public class Main extends Metodos{

	public static void main(String[] args) {
		Coche[] coches = { new Coche("Seat", "León", "blanco"), new Coche("Porsche", "Panamera", "negro"),
				new Coche("Audi", "Q3", "gris") };

		Pelicula[] peliculas = { new Pelicula("El rey león", 1994), new Pelicula("Bolt", 2008),
				new Pelicula("Cars", 2006) };

		Persona p = new Persona("Rodrigo", 1);

		p.setCochesFavoritos(coches);
		p.setPelisFavoritas(peliculas);

		Persona[] personas = { p };
		String ruta = "C:\\Users\\DAM1_Alu07\\Desktop\\DAM_git\\Programación\\Tema 1 - Introducción\\Java-Eclipse\\PrimerProyecto\\src\\ejerciciosV\\ficheros\\ej8\\personasSerializado.txt";
		serializar(personas, ruta);
		
		Persona[] test = deserializar(ruta);
		
		for(int i = 0; i < test.length; i++)
			System.out.println(test[i] +""+ i);
	}

}
