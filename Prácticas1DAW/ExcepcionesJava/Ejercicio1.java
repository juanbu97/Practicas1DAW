package excepcionesJava;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Realiza un programa que pida 6 n�meros por teclado y nos diga cu�l es el
 * m�ximo. Si el usuario introduce un dato err�neo (algo que no sea un n�mero
 * entero) el programa debe indicarlo y debe pedir de nuevo el n�mero.
 * 
 * @author juanbu97
 *
 */
public class Ejercicio1 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int maximo = Integer.MIN_VALUE;

		System.out.println("Este progama devuelve el m�ximo de 6 enteros introducidos por teclado");
		
    for (int i = 1; i < 7; i++) {
      
      boolean datoValido = false;
      int numero = 0;

      do {
        try {
          System.out.print("Introduzca el n�mero " + i + ": ");
          numero = Integer.parseInt(entrada.nextLine());
          datoValido = true;
        } catch (Exception e) {
          System.out.println("El dato introducido no es correcto, debe ser un n�mero entero.");
        }
      } while (!datoValido);
      
      if (numero > maximo) {
        maximo = numero;
      }
    }
    
    System.out.println("El valor m�ximo introducido es " + maximo);
  }

}


