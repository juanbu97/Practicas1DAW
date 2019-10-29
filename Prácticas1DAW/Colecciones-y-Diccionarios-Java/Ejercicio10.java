package coleccionesYDiccionarios;

import java.util.HashMap;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

/**
 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
 * (consucorrespondientetraducción). Utilizaunobjetodelaclase HashMap para
 * almacenarlasparejasdepalabras. El programa pedirá una palabra en español y
 * dará la correspondiente traducción en inglés
 * 
 * @author juanbu97
 *
 */
public class Ejercicio10 {
	public static void main(String[] args) {

		/**
		 * Creo el objeto hashmap para crear el diccionario
		 */
		HashMap<String, String> diccionario = new HashMap<String, String>();
		Scanner entrada = new Scanner(System.in);

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
		diccionario.put("gallina", "chiken");
		diccionario.put("chocolate", "chocolate");
		diccionario.put("miel", "honey");

		do {
			System.out.println("¿Qué palabra desea conocer en inglés?");
			String respuesta = entrada.nextLine();

			if (diccionario.containsKey(respuesta)) {
				System.out.println("Su traducción sería: " + diccionario.get(respuesta));
			} else {
				System.err.println("La palabra que quiere traducir no se encuentra en el diccionario");
			}

		} while (deseaContinuar());

	}

	public static boolean deseaContinuar() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿Desea continuar?s/n");
		String respuesta = entrada.nextLine();
		boolean continua = false;

		if (respuesta.equals("s")) {
			continua = true;
		}
		return continua;
	}
}
