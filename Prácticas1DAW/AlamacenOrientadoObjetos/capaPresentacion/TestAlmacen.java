package capaPresentacion;

import java.io.IOException;

import capaNegocio.Almacen;
import capaNegocio.Articulo;
import excepciones.ArticuloYaExisteException;
import excepciones.CodigoNoExiteException;
import excepciones.StockNegativoException;
import utiles.*;

public class TestAlmacen {

	static Almacen almacen = new Almacen();

	public static void main(String[] args) {

		Menu menu = new Menu("Almacen",
				new String[] { "Listado", "Alta", "Baja", "Modificaci�n", "Entrada de mercanc�a", "Salida de mercanc�a" });
		almacen.pruebas();

		int opcion = 0;

		do {

			try {
				opcion = menu.gestionar();
			} catch (NumberFormatException | IOException e1) {
				System.err.println("Error al introducir por teclado");
			}

			try {
				gestionar(opcion);
			} catch (NumberFormatException | IOException e) {
				System.err.println("Error al introducir por teclado");
			}
		} while (opcion != menu.getSalir());

	}

	private static void gestionar(int opcion) throws NumberFormatException, IOException {
		int codigoIntroducido;

		switch (opcion) {

		case 1:
			listarAlmacen();
			break;
		case 2:
			alta();
			break;
		case 3:
			listarAlmacen();
			codigoIntroducido = Teclado.leerEntero("Introduzca el c�digo del producto que desea borrar");
			

			try {
				almacen.comprobarCodigo(codigoIntroducido);
			} catch (CodigoNoExiteException e2) {
				System.err.println(e2.getMessage());
				break;
			}

			baja(codigoIntroducido);

			break;
		case 4:
			codigoIntroducido = Teclado.leerEntero("Introduzca el c�digo del producto que desea borrar");
			try {
				almacen.comprobarCodigo(codigoIntroducido);
			} catch (CodigoNoExiteException e1) {
				System.err.println(e1.getMessage());
				break;
			}

			modificar(codigoIntroducido);

			// modificar();

			break;
		case 5:
			listarAlmacen();
			codigoIntroducido = Teclado.leerEntero("Introduzca el c�digo del producto que desea borrar");
			try {
				almacen.comprobarCodigo(codigoIntroducido);
			} catch (CodigoNoExiteException e) {
				System.err.println(e.getMessage());
				break;
			}

			entradaMercancia(codigoIntroducido);

			// entrarMercancia();
			break;
		case 6:
			listarAlmacen();
			codigoIntroducido = Teclado.leerEntero("Introduzca el c�digo del producto que desea borrar");
			try {
				almacen.comprobarCodigo(codigoIntroducido);
			} catch (CodigoNoExiteException e) {
				System.err.println(e.getMessage());
				break;
			}

			salidaMercancia(codigoIntroducido);
			// salirMercancia();
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
	 */
	public static void salidaMercancia(int codigoIntroducido) {
		try {
			almacen.salirMercancia(codigoIntroducido);
		} catch (StockNegativoException e) {
			System.err.println(e.getMessage());
		}
	}

	/**
	 * Suma uno al stock del arrayList el art�culo con el c�digo introducido por
	 * teclado
	 * 
	 * @param codigoIntroducido
	 */
	public static void entradaMercancia(int codigoIntroducido) {
		try {
			almacen.entrarMercancia(codigoIntroducido);
		} catch (StockNegativoException e) {
			System.err.println(e.getMessage());
		}
	}

	/**
	 * modifica del arrayList el art�culo con el c�digo introducido por teclado
	 * 
	 * @param codigoIntroducido
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void modificar(int codigoIntroducido) throws NumberFormatException, IOException {
		Articulo articulo = almacen.get(codigoIntroducido);
		System.out.println(articulo);

		System.out.println("\nMODIFICACI�N DE PRODUCTO");
		System.out.println("===========");

		try {
			almacen.modificar(articulo, Teclado.leerCadena("Descripci�n"), Teclado.leerDecimal("Precio de compra"),
					Teclado.leerDecimal("Precio de Venta"), Teclado.leerEntero("Stock"));
		} catch (CodigoNoExiteException | StockNegativoException e) {
			System.err.println(e.getMessage());
		}
	}

	/**
	 * Borra del arrayList el art�culo con el c�digo introducido por teclado
	 * 
	 * @param codigoIntroducido
	 */
	public static void baja(int codigoIntroducido) {
		Articulo articuloBorrado = almacen.get(codigoIntroducido);
		System.out.println(articuloBorrado);

		try {
			almacen.baja(codigoIntroducido);
			System.out.println("Art�culo borrado correctamente");
		} catch (CodigoNoExiteException e1) {
			System.err.println(e1.getMessage());
		}
	}

	/**
	 * Introduce un nuevo art�culo en el arraylist
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void alta() throws NumberFormatException, IOException {
		System.out.println("\nNUEVO PRODUCTO");
		System.out.println("===========");
		System.out.println("Por favor, introduzca los datos del producto.");
		try {
			almacen.alta(Teclado.leerCadena("Descripci�n"), Teclado.leerDecimal("Precio de compra"),
					Teclado.leerDecimal("Precio de Venta"), Teclado.leerEntero("Stock"));
			System.out.println("Art�culo a�adido con exito");
		} catch (ArticuloYaExisteException e) {
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
