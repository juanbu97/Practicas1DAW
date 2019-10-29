package ficheros;
/**
 * Escribe un programa que guarde en un fichero con
 * nombre primos.dat los números primos que hay entre 1 y 500.
 * @author juanbu97
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1 {

  public static boolean esPrimo(int x) {

    boolean esPrimo = true;

    int contador = 2;
    while ((esPrimo) && (contador != x)) {
      if (x % contador == 0)
        esPrimo = false;
      contador++;
    }

    return esPrimo;

  }

  public static void main(String[] args) {
    // System.out.println(esPrimo(7));

    try {
      BufferedWriter escribe = new BufferedWriter(new FileWriter("primos.dat"));

      for (int i = 0; i < 501; i++) {
        if (esPrimo(i) == true)
          escribe.write(" "+i+" \n");
      }
      
      escribe.close();

    } catch (IOException e) {
      System.err.println("No se ha podido escribir en el fichero");
    }

  }
}
