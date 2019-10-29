package coleccionesYDiccionarios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Realiza un programa que escoja al azar 5 palabras en español del
 * minidiccionario del ejercicio anterior. El programa irá pidiendo que el
 * usuario teclee la traducción al inglés de cada una de las palabras y
 * comprobará si son correctas. Al final, el programa deberá mostrar cuántas
 * respuestas son válidas y cuántas erróneas.
 * 
 */

public class Ejercicio11 {
	public static void main(String[] args) {

		/**
		 * Creo el objeto hashmap para crear el diccionario
		 */
		HashMap<String, String> diccionario = new HashMap<String, String>();
		Scanner entrada = new Scanner(System.in);

		ArrayList<String> diccionarioCompleto = new ArrayList<String>();
		ArrayList<String> palabrasAleatorioas = new ArrayList<String>();

		int contadorAciertos = 0;
		int contadorFallos = 0;
		
		/**
		 * Con el método put añado elementos al diccionario
		 */
		diccionario.put("casa", "house");
		diccionario.put("coche", "car");
		diccionario.put("llave", "key");
		diccionario.put("rojo", "red");
		diccionario.put("azul", "blue");
		diccionario.put("negro", "black");
		diccionario.put("amarillo", "yellow");
		diccionario.put("ordenador", "computer");
		diccionario.put("bicicleta", "bike");
		diccionario.put("mesa", "table");
		diccionario.put("ratón", "mouse");
		diccionario.put("teléfono", "phone");
		diccionario.put("piso", "flat");
		diccionario.put("naranja", "oranje");
		diccionario.put("limón", "lemon");
		diccionario.put("cerdo", "porc");
		diccionario.put("gallina", "chicken");
		diccionario.put("chocolate", "chocolate");
		diccionario.put("miel", "honey");
		diccionario.put("canción", "song");

		diccionarioCompleto.addAll(diccionario.keySet());

		Collections.shuffle(diccionarioCompleto);

		for (int i = 0; i < 5; i++) {
			palabrasAleatorioas.add(diccionarioCompleto.remove(0));
		}

		for (String x : palabrasAleatorioas) {

			String respuesta = "";
			System.out.println("Introduzca la traducción de la palabra "+x+": ");
			respuesta = entrada.nextLine();
			if (respuesta.contains(diccionario.get(x))) {
				contadorAciertos++;
			} else {
				contadorFallos++;
			}
			
		}
		System.out.println("Has acertado " + contadorAciertos + " palabras y has fallado " + contadorFallos + " palabras.");
	}
}
