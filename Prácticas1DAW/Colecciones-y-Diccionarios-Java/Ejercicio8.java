package coleccionesYDiccionarios;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Realiza un programa que escoja al azar 10 cartas de la baraja española (10
 * objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
 * almacenarlas y asegúrate de que no se repite ninguna.
 * 
 * @author juanbu97
 *
 */
public class Ejercicio8 {
	public static void main(String[] args) {

		// objeto arrayList
		ArrayList<Carta> baraja = new ArrayList<Carta>();
		ArrayList<Carta> pilaDescarte = new ArrayList<Carta>();

		/**
		 * Ciclo que añade objetos de carta al arraylist baraja
		 */
		for (Figura figura : Figura.values()) {
			for (Palo palo : Palo.values()) {
				baraja.add(new Carta(figura, palo));
			}
		}

		/**
		 * Desordeno la carta con el método shuffle de la clase Collections
		 */
		Collections.shuffle(baraja);

		/**
		 * Ciclo para sacar 10 cartas de la Baraja
		 */
		for (int i = 0; i < 10; i++) {
			pilaDescarte.add(baraja.remove(0));
		}

		/**
		 * Ciclo que muestra las cartas sacadas de la baraja
		 */
		for (Carta x : pilaDescarte) {
			System.out.println(x);
		}

	}
}
