package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import utiles.Teclado;

/**
 * Realiza un programa que sea capaz de ordenar alfabéticamente las palabras contenidas en un fichero de texto.
 * El nombre del fichero que contiene las palabras se debe pasar como argumento en la línea de comandos.
 * El nombre del fichero resultado debe ser el mismo que el original añadiendo la coletilla sort, 
 * por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una línea.
 * @author juanbu97
 *
 */
public class Ejercicio4 {
  public static void main(String[] args) {
    
    ArrayList<String> array = new ArrayList<String>();
    
    String fichero = "";
    try {
      fichero = Teclado.leerCadena("Introduzca el nombre del fichero");
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    try {
      BufferedReader leer = new BufferedReader(new FileReader(fichero+".txt"));
      BufferedWriter escribir = new BufferedWriter(new FileWriter(fichero+"_sort.txt"));
      
      String linea = "";
      while(linea != null) {
        array.add(linea);
        linea = leer.readLine();
      }
      
      leer.close();
      
      Collections.sort(array);
      
      for(String x : array) {
        escribir.write(x + " ");
      }
      
      escribir.close();
     
      
    } catch (FileNotFoundException e) {
      System.err.println("El fichero indicado no existe");
    } catch (IOException e) {
      System.err.println("No se ha podido escribir en el archivo");
    }
  }
}
