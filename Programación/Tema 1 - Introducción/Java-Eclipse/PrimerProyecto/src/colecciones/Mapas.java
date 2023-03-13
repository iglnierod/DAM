package colecciones;

import java.util.*;

public class Mapas {

	public static void main(String[] args) {
		HashMap<Integer, String> colores = new HashMap<>();
		colores.put(1, "rojo");
		colores.put(3, "azul");
		colores.put(2, "verde");
		System.out.println(colores);
		colores.put(3, "amarillo"); // REEMPLAZA SI EXISTE
		System.out.println(colores);

		System.out.println("El valor de la clave 2 es: " + colores.get(2));
		colores.put(null, "verde");
		System.out.println(colores);
		colores.put(null, "violeta");
		System.out.println(colores);

		colores.remove(null);
		System.out.println(colores);

		System.out.println("\nLas claves son: ");

		// RECORRER MAP
		for (Integer clave : colores.keySet()) {
			System.out.println(clave + " (" + colores.get(clave) + ")");
		}

		System.out.println("\nLos valores son: ");
		for (String valor : colores.values()) {
			System.out.println(valor + " ");
		}

		for (Map.Entry<Integer, String> entry : colores.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println("El color " + val + " tiene la clave " + key);
		}

		System.out.println(obtenerClave(colores, "violeta"));
		colores.put(5, "violeta");
		colores.put(20, "violeta");
		System.out.println(obtenerClave(colores, "violeta"));
		System.out.println("colores: " + colores);

		System.out.println(colores.containsKey(7));
		System.out.println(colores.containsValue("azul"));

		colores.replace(1, "rojo", "azul");
		colores.replace(10, "blanco");
		System.out.println("colores: " + colores);
		System.out.println(colores.size());

		System.out.println("\n- - - - - RESUMEN - - - - -");

		// SIN ORDEN
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(20, "veinte");
		hashMap.put(10, "diez");
		hashMap.put(1, "uno");
		hashMap.put(null, "nulo");
		hashMap.put(null, null);
		hashMap.put(0, null);
		hashMap.put(5, "cinco");
		System.out.println("hashMap: " + hashMap);

		// ORDEN DE LA KEY
		Map<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(20, "veinte");
		treeMap.put(10, "diez");
		treeMap.put(1, "uno");
//		treeMap.put(null, "nulo");
//		treeMap.put(null, null);
		treeMap.put(0, null);
		treeMap.put(5, "cinco");
		System.out.println("treeMap: " + treeMap);

		// ORDEN QUE AÑADAMOS
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(20, "veinte");
		linkedHashMap.put(10, "diez");
		linkedHashMap.put(1, "uno");
		linkedHashMap.put(null, "nulo");
		linkedHashMap.put(null, null);
		linkedHashMap.put(0, null);
		linkedHashMap.put(5, "cinco");
		System.out.println("linkedHashMap: " + linkedHashMap);

		System.out.println("\nMapa de productos:");

		Map<String, Producto> cestaHash = new HashMap<>();
		cestaHash.put("secador", new Producto("secador pelo", 8, 24.90, 2));
		cestaHash.put("cepillo", new Producto("cepilo antitirones", 24, 6.15, 3));
		cestaHash.put("cortapelo", new Producto("máquina corta pelo a batería", 900, 84, 2));
		cestaHash.put("tijeras", new Producto("tijeras para zurdos", 81, 16.40, 4));
		cestaHash.put("tijeras", new Producto("tijeras para zurdos", 81, 16.40, 4));

		for (Map.Entry<String, Producto> item : cestaHash.entrySet()) {
			System.out.println("    " + item.getKey() + ": " + item.getValue());
		}

		System.out.println("- - - - - -");
		
//		Map<String, Producto> cestaTree = new TreeMap<>(cestaHash);
		Map<String, Producto> cestaTree = new TreeMap<>();
		cestaTree.putAll(cestaHash);
		for (Map.Entry<String, Producto> entry : cestaTree.entrySet()) {
			String key = entry.getKey();
			Producto val = entry.getValue();
			System.out.println("    " + key + ": " + val);
		}
		
		System.out.println("- - - - - -");
		
		
		Map<String, Producto> cestaLinkedHash = new LinkedHashMap<>(cestaHash);
		for (Map.Entry<String, Producto> entry : cestaLinkedHash.entrySet()) {
			String key = entry.getKey();
			Producto val = entry.getValue();
			System.out.println("    " + key + ": " + val);
		}
	}

	public static Integer obtenerClave(Map<Integer, String> diccionario, String valor) {
		for (Map.Entry<Integer, String> entrada : diccionario.entrySet()) {
			if (entrada.getValue().equals(valor)) {
				return entrada.getKey();
			}
		}
		return -1;
	}

}
