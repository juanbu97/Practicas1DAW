package coleccionesYDiccionarios;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Modifica el programa anterior de tal forma que las cartas se muestren
 * ordenadas. Primero se ordenar�n por palo: bastos, copas, espadas, oros.
 * Cuando coincida el palo, se ordenar� por n�mero: as, 2, 3, 4, 5, 6, 7, sota,
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
		 * Ciclo que a�ade objetos de carta al arraylist barja
		 */
		for (Figura figura : Figura.values()) {
			for (Palo palo : Palo.values()) {
				baraja.add(new Carta(figura, palo));
			}
		}

		/**
		 * Desordeno la carta con el m�todo shuffle de la clase Collections
		 */
		Collections.shuffle(baraja);

		/**
		 * Ciclo que saca 10 cartas de la baraja y las a�ade al arrayList pilaDescarte
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
		 * Con el m�todo sort de la clase Collections ordeno el arrayList
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
