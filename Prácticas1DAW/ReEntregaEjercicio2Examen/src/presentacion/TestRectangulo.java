package presentacion;

import negocio.Cuadrado;
import negocio.Rectangulo;

/**
 * Clase para probar la clase Rect�ngulo Puede haber errores de orden al
 * mostrarse los mensajes de error por el system.err que altera la salida
 * 
 * @author juanbu97
 *
 */
public class TestRectangulo {
  public static void main(String[] args) {

    Rectangulo rectangulo2 = new Rectangulo(3, 6);
    System.out.println("Imprimo el rectángulo por pantalla");
    System.out.println(rectangulo2);
    System.out.println();

    try {
      Rectangulo rectangulo1 = new Rectangulo(7, 5);

      System.out.println("Creo cuatro cuadrados y los imprimo");

      Cuadrado cuadrado = new Cuadrado(4);
      Cuadrado cuadrado2 = new Cuadrado(3);
      Cuadrado cuadrado3 = new Cuadrado(5);
      Cuadrado cuadrado4 = new Cuadrado(4);
      
      cuadrado4.setLado(6);

      System.out.println(cuadrado);
      System.out.println(cuadrado2);
      System.out.println(cuadrado3);
      System.out.println(cuadrado4);

      System.out.println("Comparo los cuadrados si es igual será 0, \nsi es menor será -1, \ny si es mayor será 1");
      System.out.println("Primer cuadrado con cuadrado2 /equals: "+cuadrado.equals(cuadrado2));//Comprueba si es igual
      System.out.println("Primer cuadrado con cuadrado2: "+cuadrado.compareTo(cuadrado2));
      System.out.println("Primer cuadrado con cuadrado3: "+cuadrado.compareTo(cuadrado3));
      System.out.println("Primer cuadrado con cuadrado4: "+cuadrado.compareTo(cuadrado4));
      
      

      /*
       * Doy valores inválidos para que salte la excepcion
       */
      rectangulo1.setAlto(-9);
      rectangulo1.setAncho(15);
    } catch (ArithmeticException e) {
      System.err.println(e.getMessage());
    }
    System.out.println("He modificado con los setter un rectángulo para que de error");
    
    
    System.out.println("Tambien he creado un cuadrado con lado diferentes para que me de otro error");
  }
}
