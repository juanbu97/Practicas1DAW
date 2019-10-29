package capaNegocio;
/**
 * Esta excepción controla que el iva no se un null
 * @author juanbu97
 *
 */
public class IvaInvalidoException extends Exception {

  public IvaInvalidoException(String string) {
    super(string);
  }

}