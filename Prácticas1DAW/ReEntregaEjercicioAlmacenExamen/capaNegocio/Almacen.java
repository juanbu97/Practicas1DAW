package capaNegocio;
/**
 * Clase que almacena el ArrayList de objetos Articulo
 * @author juanbu97
 *
 */

import java.util.ArrayList;

import capaNegocio.Articulo;

public class Almacen {

	private ArrayList<Articulo> almacen = new ArrayList<Articulo>();

	/**
	 * Modificado para poder aÃ±adir el iva
	 * 
	 * @param descripcionIntroducido
	 * @param precioCompraIntroducido
	 * @param precioVentaIntroducido
	 * @param stockIntroducido
	 * @param iva
	 * @throws ArticuloYaExisteException
	 * @throws IvaInvalidoException
	 * @throws StockNegativoException
	 * @throws PrecioDeVentaNegativoException
	 * @throws PrecioDeCompraNegativoException
	 */
	public void alta(String descripcionIntroducido, double precioCompraIntroducido, double precioVentaIntroducido,
			int stockIntroducido, Iva iva) throws IvaInvalidoException, StockNegativoException,	PrecioDeCompraNegativoException, PrecioDeVentaNegativoException {

		almacen.add(new Articulo(descripcionIntroducido, precioCompraIntroducido, precioVentaIntroducido, stockIntroducido, iva));

	}

	public void baja(int codigoIntroducido) {
		almacen.remove(new Articulo(codigoIntroducido));
	}

	/**
	 * Modificado para poder añadir el Iva, si este no se modifica se queda igual
	 * que el que tenía anteriormente
	 * 
	 * @param articulo
	 * @param descripcionIntroducido
	 * @param precioCompraIntroducido
	 * @param precioVentaIntroducido
	 * @param stockIntroducido
	 * @param iva
	 * @throws CodigoNoExiteException
	 * @throws StockNegativoException
	 * @throws IvaInvalidoException
	 * @throws PrecioDeVentaNegativoException
	 * @throws PrecioDeCompraNegativoException
	 */
	public void modificar(Articulo articulo, String descripcionIntroducido, double precioCompraIntroducido,
			double precioVentaIntroducido, int stockIntroducido, Iva iva) throws StockNegativoException, IvaInvalidoException, PrecioDeCompraNegativoException, PrecioDeVentaNegativoException {
		articulo.set(descripcionIntroducido, precioCompraIntroducido, precioVentaIntroducido, stockIntroducido, iva);
	}

	public void entrarMercancia(int codigo) throws StockNegativoException, ArticuloNoExisteException {

		get(codigo).entraMercancia();

	}

	@Override
	public String toString() {
		return "" + almacen;
	}

	public void salirMercancia(int codigo) throws ArticuloNoExisteException, StockNegativoException {

		get(codigo).saleMercancia();

	}

	public Articulo get(int codigoIntroducido) throws ArticuloNoExisteException {

		try {
			return almacen.get(almacen.indexOf(new Articulo(codigoIntroducido)));
		} catch (IndexOutOfBoundsException e) {
			throw new ArticuloNoExisteException("Este artículo no exite");
		}

	}
}
