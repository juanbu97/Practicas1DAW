package negocio;

public class Cuadrado extends Rectangulo implements Comparable<Cuadrado> {
  /**
   *  Mi error era que al crear un cuadrado pedia dos paramatros en vez de solo uno
   * @param alto
   * @throws NoEsCuadradoException
   */
  public Cuadrado(int lado) {
    super(lado, lado);
    
  }
  
  public boolean equals(Cuadrado a) {
    return (super.getAlto() == a.getAncho());   
  }
   
  @Override
  public String toString() {
    return super.toString();
  }

  public int getLado() {
    return super.getAlto();
  }
  
  public void setLado(int lado) {
    super.setAlto(lado);
    super.setAncho(lado);
  }
  
  @Override
  public int compareTo(Cuadrado cuadrado) {
    
    return (super.getAlto()- cuadrado.getAncho());
  }


}
