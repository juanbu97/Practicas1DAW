package negocio;

/**
 * Clase Rectagulo, un rectangulo tiene una altura una base. En este caso el
 * rectángulo no puede tener ni la base ni la altura menores que 0 o mayores que
 * 10
 * 
 * @author juanbu97
 *
 */
public class Rectangulo {
  // atributos del rectángulo
  private int alto;
  private int ancho;

  public Rectangulo(int alto, int ancho) {
    setAlto(alto);
    setAncho(ancho);
  }

  public int getAlto() {
    return alto;
  }

  /**
   * Para poder acceder desde el test a los setter y getter los pongo public y así
   * puede ser modificado
   * 
   * @param alto
   */
  public void setAlto(int alto) {
    if (alto < 0 | alto > 10)
      throw new ArithmeticException("El alto no puede ser ni menor que 0 ni mayor que 10");
    this.alto = alto;
  }

  public int getAncho() {
    return ancho;
  }

  public void setAncho(int ancho) {
    if (ancho < 0 | ancho > 10) {
      throw new ArithmeticException("El ancho no puede ser ni menor que 0 ni mayor que 10");
    }
    this.ancho = ancho;
  }

  @Override
  public String toString() {
    String cadena = "";
    int i, espacios;
    for (i = 0; i < this.ancho; i++) {
      cadena += "￿￿*";
    }
    cadena += "\n";

    for (i = 1; i < this.alto - 1; i++) {
      cadena += "￿￿*";
      for (espacios = 1; espacios < this.ancho - 1; espacios++) {
        cadena += " ";
      }
      cadena += "￿￿*\n";
    }
    for (i = 0; i < this.ancho; i++) {
      cadena += "*";
    }
    cadena += "\n";

    return cadena;

  }

}
