package capaPresentacion;

import capaNegocio.Almacen;
import capaNegocio.ArticuloNoExisteException;
import capaNegocio.Iva;
import capaNegocio.IvaInvalidoException;
import capaNegocio.PrecioDeCompraNegativoException;
import capaNegocio.PrecioDeVentaNegativoException;
import capaNegocio.StockNegativoException;
import utiles.*;

public class TestAlmacen {

	static Almacen almacen = new Almacen();
	// Creo el menu statico para poder usarlo en toda la clase
	static Menu menuIva = new Menu("Iva", new String[] { "General", "Reducido", "Super Reducido" });

	public static void main(String[] args) {

		Menu menu = new Menu("Almacen",
				new String[] { "Listado", "Alta", "Baja", "Modificaci�n", "Entrada de mercanc�a", "Salida de mercanc�a" });

		int opcion = 0;

		do {

			try {
				opcion = menu.gestionar();
				gestionar(opcion);

			} catch (PrecioDeCompraNegativoException | PrecioDeVentaNegativoException | ArticuloNoExisteException
					| StockNegativoException e1) {
				System.err.println(e1.getMessage());
			}

		} while (opcion != menu.getSalir());

	}

	/**
	 * Este m�todo lo he a�adido para gestionar el menu del Iva y asignarle el tipo
	 * 
	 * @param opcion
	 *          La opci�n elegida por el usuario
	 * @return
	 * @return El iva tipo enum elegido en el menu por el usuario
	 */
	private static Iva gestionarIva() {

		switch (menuIva.gestionar()) {
		case 1:
			return Iva.GENERAL;
		case 2:
			return Iva.REDUCIDO;
		case 3:
			return Iva.SUPER_REDUCIDO;
		default:
			return null;
		}

	}

	private static void gestionar(int opcion) throws PrecioDeCompraNegativoException, PrecioDeVentaNegativoException,
			ArticuloNoExisteException, StockNegativoException {

		switch (opcion) {

		case 1:
			listarAlmacen();
			break;
		case 2:
			alta();
			break;
		case 3:
			baja();
			break;
		case 4:
			modificar();
			break;
		case 5:
			entradaMercancia();
			break;
		case 6:
			salidaMercancia();
			break;
		default:
			System.out.println("Fin del Programa");
		}
	}

	/**
	 * Resta uno al stock del arrayList el art�culo con el c�digo introducido por
	 * teclado
	 * 
	 * @param codigoIntroducido
	 * @throws StockNegativoException
	 */
	public static void salidaMercancia() throws ArticuloNoExisteException, StockNegativoException {

		listarAlmacen();
		int codigoIntroducido = Teclado.leerEntero("Introduzca el c�digo del producto que desea disminuir su stock");
		almacen.salirMercancia(codigoIntroducido);
		System.out.println("Stock reducido con �xito");

	}

	/**
	 * Suma uno al stock del arrayList el art�culo con el c�digo introducido por
	 * teclado
	 * 
	 * @param codigoIntroducido
	 * @throws StockNegativoException
	 */
	public static void entradaMercancia() throws ArticuloNoExisteException, StockNegativoException {

		listarAlmacen();
		int codigoIntroducido = Teclado.leerEntero("Introduzca el c�digo del producto que desea aumentar su stock");
		almacen.entrarMercancia(codigoIntroducido);
		System.out.println("Stock aumentado con �xito");

	}

	/**
	 * modifica del arrayList el art�culo con el c�digo introducido por teclado
	 * 
	 * @param codigoIntroducido
	 * @throws ArticuloNoExisteException
	 * @throws PrecioDeVentaNegativoException
	 * @throws PrecioDeCompraNegativoException
	 */
	public static void modificar()
			throws ArticuloNoExisteException, PrecioDeCompraNegativoException, PrecioDeVentaNegativoException {
		try {
			listarAlmacen();
			int codigoIntroducido = Teclado.leerEntero("Introduzca el c�digo del producto que desea modificar");
			System.out.println(almacen.get(codigoIntroducido));
			System.out.println("\nMODIFICACI�N DE PRODUCTO");
			System.out.println("===========");
			almacen.modificar(almacen.get(codigoIntroducido), Teclado.leerCadena("Descripci�n"),
					Teclado.leerDecimal("Precio de compra"), Teclado.leerDecimal("Precio de Venta"), Teclado.leerEntero("Stock"),
					gestionarIva());
		} catch (StockNegativoException | IvaInvalidoException e) {
			System.err.println(e.getMessage());
		}
	}

	/**
	 * Borra del arrayList el art�culo con el c�digo introducido por teclado
	 * 
	 * @param codigoIntroducido
	 * @throws ArticuloNoExisteException
	 */
	public static void baja() throws ArticuloNoExisteException {
		listarAlmacen();
		int codigoIntroducido = Teclado.leerEntero("Introduzca el c�digo del producto que desea borrar");
		if (almacen.get(codigoIntroducido) != null) {
			almacen.baja(codigoIntroducido);
			System.out.println("Art�culo borrado correctamente");
		} else {
			System.err.println("No se ha podido borrar el art�culo");
		}

	}

	/**
	 * Introduce un nuevo art�culo en el arraylist
	 * 
	 * @throws PrecioDeVentaNegativoException
	 * @throws PrecioDeCompraNegativoException
	 */
	public static void alta() throws PrecioDeCompraNegativoException, PrecioDeVentaNegativoException {
		try {
			System.out.println("\nNUEVO PRODUCTO");
			System.out.println("===========");
			System.out.println("Por favor, introduzca los datos del producto.");
			almacen.alta(Teclado.leerCadena("Descripci�n"), Teclado.leerDecimal("Precio de compra"),
					Teclado.leerDecimal("Precio de Venta"), Teclado.leerEntero("Stock"), gestionarIva());
			System.out.println("Art�culo a�adido con exito");
		} catch (IvaInvalidoException | StockNegativoException e) {
			System.err.println(e.getMessage() + "No se ha podido a�adir el art�culo");
		}
	}

	/**
	 * Lista los art�culo contenidos en el arrayList
	 */
	public static void listarAlmacen() {
		System.out.println(almacen);
	}
}