package coleccionesYDiccionarios;

import java.util.HashMap;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

/**
 * Crea un mini-diccionario espa�ol-ingl�s que contenga, al menos, 20 palabras
 * (consucorrespondientetraducci�n). Utilizaunobjetodelaclase HashMap para
 * almacenarlasparejasdepalabras. El programa pedir� una palabra en espa�ol y
 * dar� la correspondiente traducci�n en ingl�s
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
		 * Con el m�todo put a�ado elementos al diccionario
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
		diccionario.put("rat�n", "mouse");
		diccionario.put("tel�fono", "phone");
		diccionario.put("piso", "flat");
		diccionario.put("naranja", "oranje");
		diccionario.put("lim�n", "lemon");
		diccionario.put("cerdo", "porc");
		diccionario.put("gallina", "chiken");
		diccionario.put("chocolate", "chocolate");
		diccionario.put("miel", "honey");

		do {
			System.out.println("�Qu� palabra desea conocer en ingl�s?");
			String respuesta = entrada.nextLine();

			if (diccionario.containsKey(respuesta)) {
				System.out.println("Su traducci�n ser�a: " + diccionario.get(respuesta));
			} else {
				System.err.println("La palabra que quiere traducir no se encuentra en el diccionario");
			}

		} while (deseaContinuar());

	}

	public static boolean deseaContinuar() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("�Desea continuar?s/n");
		String respuesta = entrada.nextLine();
		boolean continua = false;

		if (respuesta.equals("s")) {
			continua = true;
		}
		return continua;
	}
}
