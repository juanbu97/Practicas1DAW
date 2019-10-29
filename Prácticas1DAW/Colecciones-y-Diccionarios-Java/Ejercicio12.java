package coleccionesYDiccionarios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;

/**
 * Escribe un programa que genere una secuencia de 5 cartas de la baraja
 * española y que sume los puntos según el juego de la brisca. El valor de las
 * cartas se debe guardar en una estructura HashMap que debe contener parejas
 * (figura, valor), por ejemplo (“caballo”, 3). La secuencia de cartas debe ser
 * una estructura de la clase ArrayList que contiene objetos de la clase Carta.
 * El valor de las cartas es el siguiente: as → 11, tres → 10, sota → 2, caballo
 * → 3, rey → 4; el resto de cartas no vale nada.
 * 
 * @author juanbu97
 *
 */
public class Ejercicio12 {
	public static void main(String[] args) {

		int puntosTotales = 0;

		/**
		 * Creo el arraylist y el EnumMap
		 */
		EnumMap<Figura, Integer> diccionarioPuntos = new EnumMap<Figura, Integer>(Figura.class);
		ArrayList<Carta> baraja = new ArrayList<Carta>();
		ArrayList<Carta> pilaDescarte = new ArrayList<Carta>();
		
		diccionarioPuntos.put(Figura.AS, 11);
    diccionarioPuntos.put(Figura.DOS, 0);
    diccionarioPuntos.put(Figura.TRES, 10);
    diccionarioPuntos.put(Figura.CUATRO, 0);
    diccionarioPuntos.put(Figura.CINCO, 0);
    diccionarioPuntos.put(Figura.SEIS, 0);
    diccionarioPuntos.put(Figura.SIETE, 0);
    diccionarioPuntos.put(Figura.SOTA, 2);
    diccionarioPuntos.put(Figura.CABALLO, 3);
    diccionarioPuntos.put(Figura.REY, 4);

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
		 * Ciclo que saca 10 cartas de la baraja y las añade al arrayList pilaDescarte
		 */
		for (int i = 0; i < 5; i++) {
			pilaDescarte.add(baraja.remove(0));
		}
		
		
		for(Carta carta : pilaDescarte) {
			System.out.println(carta);
			puntosTotales += diccionarioPuntos.get(carta.getFigura());
		}

		System.out.println("Puntos totales: "+puntosTotales);

	}

}
