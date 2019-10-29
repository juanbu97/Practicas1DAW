package ficheros;
/**
 * Realiza un programa que lea el fichero creado en el ejercicio anterior y que muestre los números por pantalla.
 * @author juanbu97
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {
  public static void main(String[] args) throws FileNotFoundException {

    try {
      BufferedReader leer = new BufferedReader(new FileReader("primos.dat"));

      String linea = "";
      while (linea != null) {
        System.out.println(linea);
        linea = leer.readLine();
      }
      leer.close();
    } catch (IOException e) {
      System.err.println("No se ha podidio encontrar el fichero");
    }

  }
}
