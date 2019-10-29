package utiles;
/**
 * Permite lectura desde teclado con la clase BufferedReader y InputStreamReader
 * 
 * @author juanbu97
 * @version 1.0
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

/**
 * Permite lectura desde teclado con la clase Scanner
 */
public class Teclado {

	/**
	 * Lee un car�cter del teclado
	 * 
	 * @return car�cter introducido por el usuario
	 */
	public static char leerCaracter() {
		char caracter;
		try {
			caracter = leerCadena().charAt(0);
		} catch (Exception e) {
			caracter = 0;
		}
		return caracter;
	}

	/**
	 * Lee un car�cter del teclado
	 * 
	 * @param msj: mensaje mostrado al usuario
	 * @return car�cter introducido por el usuario
	 */
	public static char leerCaracter(String msj) {
		System.out.println(msj);
		return leerCaracter();
	}

	/**
	 * Lee una cadena del teclado
	 * 
	 * @param msj: mensaje mostrado al usuario
	 * @return cadena introducida por el usuario
	 * @throws IOException 
	 */
	public static String leerCadena(String msj) throws IOException {
		System.out.println(msj);
		return leerCadena();
	}

	/**
	 * Lee una cadena del teclado
	 * 
	 * @return cadena introducida por el usuario
	 * @throws IOException 
	 */

	public static String leerCadena() throws IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		String cadena;
		try {
			cadena = bReader.readLine(); // Lee una l�nea de texto (hasta intro)
		} catch (InputMismatchException e) {
			cadena = "";
		}
		return cadena;
	}

	/**
	 * Lee un entero del teclado
	 * 
	 * 
	 * @return entero introducido por el usuario
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static int leerEntero() throws NumberFormatException, IOException {
		int x;
		try {
			x = Integer.parseInt(leerCadena().trim()); // Quita los espacios del String y convierte a int
		} catch (InputMismatchException e) {
			x = 0;
		}
		return x;
	}

	/**
	 * Lee una entero del teclado
	 * 
	 * @param msj: mensaje mostrado al usuario
	 * @return entero introducida por el usuario
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static int leerEntero(String msj) throws NumberFormatException, IOException {
		System.out.println(msj);
		return leerEntero();
	}

	/**
	 * Lee un decimal del teclado
	 * 
	 * @return decimal introducido por el usuario
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static double leerDecimal() throws NumberFormatException, IOException {
		double x;
		try {
			x = Double.parseDouble(leerCadena().trim()); // Quita los espacios del String y convierte a double
		} catch (InputMismatchException e) {
			x = 0;
		}
		return x;
	}

	/**
	 * Lee una decimal del teclado
	 * 
	 * @param msj: mensaje mostrado al usuario
	 * @return decimal introducida por el usuario
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static double leerDecimal(String msj) throws NumberFormatException, IOException {//
		System.out.println(msj);
		return leerDecimal();
	}
	/**
	 * Pregunta al usuario si desea continuar con la ejecuci�n del programa
	 * @return falso si el caracter introducido es distinto de S/s
	 */
	public static boolean deseaContinuar(){
		boolean deseaContinuar;
		char caracterIntroducido = Teclado.leerCaracter("\nDesea continuar? (s/n)");
		if (caracterIntroducido == 's'|| caracterIntroducido == 'S')
		return deseaContinuar = true;
		else
		return deseaContinuar = false;
		}

}