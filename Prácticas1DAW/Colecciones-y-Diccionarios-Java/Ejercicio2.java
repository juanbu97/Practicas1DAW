package coleccionesYDiccionarios;

import java.util.ArrayList;

/**
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el m�ximo y el m�nimo de esos
 * n�meros. El tama�o de la lista tambi�n ser� aleatorio y podr� oscilar entre 10
 * y 20 elementos ambos inclusive.
 * @author d18bugaj
 *
 */
public class Ejercicio2 {
	public static void main(String[] args) {
		
		
		int suma = 0;
			
		ArrayList<Integer> arrayListAleatorio = new ArrayList<Integer>();
		
		
		generarArrayList(arrayListAleatorio);
		
		System.out.println(arrayListAleatorio);
		
		/**
		 * ciclo for mejorado que recorre el arraylist y acumula el valor de todos los elementos en la variable suma
		 */
		for(int x : arrayListAleatorio) {
			suma += x;
		}
	
		System.out.println("Suma: " + suma);
		
		/**
		 * Con el nombre del array y el m�todo stream podemos sacar el max y el min de los enteros del array
		 */
		
    System.out.println("M�ximo: " + arrayListAleatorio.stream().mapToInt(i -> i).max().getAsInt());
    System.out.println("M�nimo: " + arrayListAleatorio.stream().mapToInt(i -> i).min().getAsInt());
		System.out.println("Media: " + calcularMedia(suma, arrayListAleatorio));
		
		
	}

	/**
	 *  M�todo para calcular la media aritm�tica del arraylist
	 * @param suma
	 * @param arrayListAleatorio
	 */
	public static int calcularMedia(int suma, ArrayList<Integer> arrayListAleatorio) {
		
		return suma/arrayListAleatorio.size();
	}

	/**
	 *  En este m�todo genero el arrayList con un n�mero aleatorio de elementos y le introduzco un numero aleatorio a cada elemento
	 * 
	 * @param contador
	 * @param arrayListAleatorio
	 * @return
	 */
	public static void generarArrayList(ArrayList<Integer> arrayListAleatorio) {
		
		int contador = 0;
		do {
		contador++;
		arrayListAleatorio.add((int) (Math.random()*101));
		}while(Math.random()*(10-20+1)+20>contador);
		
	}

}