package capaNegocio;
/**
 * Clase que almacena el ArrayList de objetos Articulo
 * @author juanbu97
 *
 */

import java.util.ArrayList;

import capaNegocio.Articulo;
import excepciones.ArticuloYaExisteException;
import excepciones.CodigoNoExiteException;
import excepciones.StockNegativoException;

public class Almacen {

	private ArrayList<Articulo> almacen = new ArrayList<Articulo>();

	Articulo pipas = new Articulo("pipas", 2, 3, 5);
	Articulo agua = new Articulo("agua", 2, 3, 5);
	Articulo cocacola = new Articulo("cocacola", 2, 3, 5);
	Articulo pan = new Articulo("pan", 2, 3, 5);

	public void pruebas() {
		almacen.add(agua);
		almacen.add(cocacola);
		almacen.add(pan);
		almacen.add(pipas);
	}

	public void alta(String descripcionIntroducido, double precioCompraIntroducido, double precioVentaIntroducido,
			int stockIntroducido) throws ArticuloYaExisteException   {

		Articulo articulo = new Articulo(descripcionIntroducido, precioCompraIntroducido, precioVentaIntroducido,
				stockIntroducido);

		if (!almacen.contains(articulo)) {
			almacen.add(articulo);
		} else {
			throw new ArticuloYaExisteException("El artículo que deseas crear ya existe. ");
		}

	}

	public void baja(int codigoIntroducido) throws CodigoNoExiteException {
		almacen.remove(new Articulo(codigoIntroducido));
	}

	public void modificar(Articulo articulo, String descripcionIntroducido, double precioCompraIntroducido,
			double precioVentaIntroducido, int stockIntroducido) throws CodigoNoExiteException, StockNegativoException {
		articulo.set(descripcionIntroducido, precioCompraIntroducido, precioVentaIntroducido, stockIntroducido);
	}

	public boolean comprobarCodigo(int codigo) throws CodigoNoExiteException {
		boolean codigoEncontrado = false;

		for (Articulo x : almacen) {
			if (x.getCodigo() == codigo) {
				codigoEncontrado = true;
			}
		}
		if (codigoEncontrado == false) {
			throw new CodigoNoExiteException("El código introducido no existe");
		}
		return codigoEncontrado;
	}

	public void entrarMercancia(int codigo) throws StockNegativoException {
		for (Articulo x : almacen) {
			if (x.getCodigo() == codigo) {
				x.entraMercancia();
			}
		}
	}

	@Override
	public String toString() {
		return "" + almacen;
	}

	public void salirMercancia(int codigo) throws StockNegativoException {
		for (Articulo x : almacen) {
			if (x.getCodigo() == codigo) {
				x.saleMercancia();
			}
		}
	}

	public Articulo get(int codigoIntroducido) {
		Articulo articulo = almacen.get(almacen.indexOf(new Articulo(codigoIntroducido)));
		return articulo;
	}
}
