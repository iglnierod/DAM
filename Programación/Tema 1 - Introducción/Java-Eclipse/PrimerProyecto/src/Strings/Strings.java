package Strings;

public class Strings {

    public static void main(String[] args) {

        String frase = "Un caramelo de limón";
        frase = new String("Un caramelo de limón");

        char[] arrayDia = { 'L', 'u', 'n', 'e', 's' };

        String dia = new String(arrayDia);
        System.out.println(dia);
        System.out.println(dia.length()); // METODO .length()
        System.out.println(arrayDia.length); // PROPIEDAD .length

        String cadParcial = new String(arrayDia, 1, 2);// (array, primerChar, segundoChar)
        System.out.println(cadParcial);

        System.out.println("cadena MAY: " + frase.toUpperCase()); // Todo mayusculas

        System.out.println("cadena min: " + frase.toLowerCase()); // Todo minusculas

        System.out.println("longitud cadena: " + frase.length()); // Longitud cadena

        System.out.println("primer caracter: " + frase.charAt(0)); // Primera letra

        System.out.println("ultimo caracter: " + frase.charAt(frase.length() - 1)); // Ultima letra

        System.out.println("Indice primer caracter 'a': " + frase.indexOf('a')); // Buscar primera letra a
        System.out.println("Indice primer caracter 'a': " + frase.lastIndexOf('a')); // Buscar ultima letra a

        for (int i = 0; i < frase.length(); i++) {
            System.out.printf("%3s", frase.charAt(i)); // cada caracter ocupa 3 caracteres

        }
        System.out.println();

        for (int i = 0; i < frase.length(); i++) {
            System.out.printf("%3s", i);
        }
        System.out.println();

        String sabor = frase.substring(15);// parte de una cadena
        System.out.println("Sabor: " + sabor);
        System.out.println("Caramelo: " + frase.substring(3, 11));// ultimo caracter no está incluido

        System.out.println("Indice primera cadena \"li\": " + frase.indexOf("li")); // Buscar primera cadena li

        // Cuando no se encuentra cadena devuelve -1
        System.out.println("Indice primera cadena \"CARAMELO\": " + frase.indexOf("CARAMELO"));

        // Pasar toda la cadena a mayusc para que encuentre
        System.out.println("Indice primera cadena \"CARAMELO\": " + frase.toUpperCase().indexOf("CARAMELO"));

        System.out.println("sabor == \"limón\": " + (sabor == "limón"));

        System.out.println("sabor.equals(\"limón\"): " + sabor.equals("limón"));

        System.out.println("sabor.compareTo(\"limón\"): " + sabor.compareTo("limon"));

        // Comprobar con que empieza o acaba una cadena
        System.out.println("frase.startsWith(\"un\")" + frase.startsWith("un"));
        System.out.println("frase.endsWith(\"un\")" + frase.endsWith("un"));

        // Concatenar cadenas con .concat()
        String caramelo = frase.substring(3, 11);
        String palabrasConcatenadas = caramelo.concat(sabor);
        System.out.println(palabrasConcatenadas);

        // Sustituir cadena
        System.out.println(palabrasConcatenadas.replace("lim", "mel")); // "lim" pasa a ser "mel"
        System.out.println(palabrasConcatenadas);

        palabrasConcatenadas = palabrasConcatenadas.replace("lim", "mel");

        // .replace() cambia todas esas cadenas

        palabrasConcatenadas = palabrasConcatenadas.replace("me", "ME");
        System.out.println(palabrasConcatenadas);

        // .replaceFirst solo cambia la primera cadena
        System.out.println(palabrasConcatenadas.replaceFirst("o", "0"));

        // Metodos ValueOf
        // Convierte valores de tipo primitivo a String
        String cadena = "";
        System.out.println("cadena: '" + "'");// Comprobar si la cadena está vacia

        System.out.println("cadena: '" + cadena.valueOf(5 < 3) + "'");
        System.out.println("cadena: '" + cadena.valueOf('M') + "'");
        System.out.println("cadena: '" + cadena.valueOf(new char[] { 'l', 'u', 'z' }) + "'");
        System.out.println("cadena: '" + cadena.valueOf(345) + "'");
        System.out.println("cadena: '" + cadena.valueOf(0.276) + "'");
        System.out.println("cadena: '" + cadena.valueOf("casa") + "'");

        // Guardar un numero en una cadena
        double numero = 3.768;
        String cadNumero = String.format("%9.2f", numero);
        System.out.println("'" + cadNumero + "'");

        // Pasar una cadena a un array
        arrayDia = frase.toCharArray();
        for (char caracter : arrayDia) {
            System.out.printf("%2s", caracter);
        }

        System.out.println();

        // Delimitador
        // Separa una cadena por el caracter que se indica en .split()
        String nombres = "anna,pedro,manuel,paco";
        String[] palabras = nombres.split(",");

        for (String palabra : palabras) {
            System.out.println(palabra);
        }

    }

}