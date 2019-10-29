package coleccionesYDiccionarios;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Modifica el programa anterior de tal forma que las cartas se muestren
 * ordenadas. Primero se ordenarán por palo: bastos, copas, espadas, oros.
 * Cuando coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7, sota,
 * caballo, rey.
 * 
 * @author juanbu97
 *
 */
public class Ejercicio9 {
	public static void main(String[] args) {

		/**
		 * ArrayList baraja para almacenar los objetos de carta
		 */
		ArrayList<Carta> baraja = new ArrayList<Carta>();

		/**
		 * ArrayList que almacena las cartas sacadas de la baraja
		 */
		ArrayList<Carta> pilaDescarte = new ArrayList<Carta>();

		/**
		 * Ciclo que añade objetos de carta al arraylist barja
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
		 * Ciclo que saca 10 cartas de la baraja y las añade al arrayList pilaDescarte
		 */
		for (int i = 0; i < 10; i++) {
			pilaDescarte.add(baraja.remove(0));
		}

		/**
		 * Muestro las cartas desordenadas
		 */
		System.out.println("Cartas aleatorias sin ordenar\n");
		for (Carta carta : pilaDescarte) {
			System.out.println(carta);
		}

		/**
		 * Con el método sort de la clase Collections ordeno el arrayList
		 */
		Collections.sort(pilaDescarte);

		/**
		 * Muestro las cartas ordenadas
		 */
		System.out.println("\nCartas ordenadas\n");
		for (Carta carta : pilaDescarte) {
			System.out.println(carta);
		}
	}
}
