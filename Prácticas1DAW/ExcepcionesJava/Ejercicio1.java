package excepcionesJava;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Realiza un programa que pida 6 números por teclado y nos diga cuál es el
 * máximo. Si el usuario introduce un dato erróneo (algo que no sea un número
 * entero) el programa debe indicarlo y debe pedir de nuevo el número.
 * 
 * @author juanbu97
 *
 */
public class Ejercicio1 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int maximo = Integer.MIN_VALUE;

		System.out.println("Este progama devuelve el máximo de 6 enteros introducidos por teclado");
		
    for (int i = 1; i < 7; i++) {
      
      boolean datoValido = false;
      int numero = 0;

      do {
        try {
          System.out.print("Introduzca el número " + i + ": ");
          numero = Integer.parseInt(entrada.nextLine());
          datoValido = true;
        } catch (Exception e) {
          System.out.println("El dato introducido no es correcto, debe ser un número entero.");
        }
      } while (!datoValido);
      
      if (numero > maximo) {
        maximo = numero;
      }
    }
    
    System.out.println("El valor máximo introducido es " + maximo);
  }

}


