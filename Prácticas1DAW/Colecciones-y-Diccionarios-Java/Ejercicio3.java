package coleccionesYDiccionarios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Escribe un programa que ordene 10 números enteros introducidos por teclado
 * y almacenados en un objeto de la clase ArrayList.
 * @author juanbu97
 *
 */
public class Ejercicio3 {
	public static void main(String[] args) {
	
		
		//creo el objeto de arrayList y el objeto Scanner
		ArrayList<Integer> lista = new ArrayList<Integer>();
	
		Scanner entrada = new Scanner(System.in);
		
		
		/**
		 * Ciclo for para introducir por teclado el valor de los elementos del arraylist
		 */
		for(int i=0;i<10;i++) {
			System.out.println("Introduzca el número " +(i+1));
			lista.add(entrada.nextInt());
		}
		
		System.out.println("Lista sin ordenar \n" + lista);
		/**
		 * Con el método sort de la clase Collection puedo ordenar los elementos de una lista
		 */
		Collections.sort(lista);
		System.out.println("Lista ordenada de menor a mayor \n" + lista);
		
		
	}
}
