package utiles;

import java.util.Scanner;


/**
 * Permite lectura desde teclado
 * 
 * @author Francisco Javier Frías Serrano
 * @author Rafale Miguel Cruz Álvarez
 * @version 1.0
 */
public class Teclado {

	static Scanner entrada = new Scanner(System.in);

	/**
	 * Lee un carácter del teclado
	 * 
	 * @return carácter introducido por el usuario
	 * @throws IOException
	 */
	public static char leerCaracter()  {
		char caracter;
		try {
			return leerCadena().charAt(0);
		} catch (Exception e) {
			caracter = 0;
		}
		return caracter;
	}

	/**
	 * Lee un carácter del teclado
	 * 
	 * @param mensaje mensaje mostrado al usuario
	 * @return carácter introducido por el usuario
	 * @throws IOException
	 */
	public static char leerCaracter(String mensaje)  {
		System.out.println(mensaje);
		return leerCaracter();
	}

	/**
	 * Lee una cadena del teclado
	 * 
	 * @param mensaje mensaje mostrado al usuario
	 * @return cadena introducida por el usuario
	 * @throws IOException
	 */
	public static String leerCadena(String mensaje) {
		System.out.println(mensaje);
		return leerCadena();
	}

	/**
	 * Lee una cadena del teclado
	 * 
	 * @return cadena introducida por el usuario
	 * 
	 */

	public static String leerCadena() {
	  return entrada.nextLine();

	}

	/**
	 * Lee un entero del teclado
	 * 
	 * @return entero introducido por el usuario
	 * @throws NoEsEnteroException 
	 */
	public static int leerEntero() {
		do{
			try {
				return Integer.parseInt(leerCadena().trim()); //sale si todo va bien
			} catch (NumberFormatException e) {
	  			System.err.println("Introduzca un número entero. ");
			}
		}while(true);
	}

	/**
	 * Lee una entero del teclado
	 * 
	 * @param mensaje mensaje mostrado al usuario
	 * @return entero introducida por el usuario
	 * @throws NoEsEnteroException 
	 */
	public static int leerEntero(String mensaje){
		System.out.println(mensaje);
		return leerEntero();
	}

	/**
	 * Lee un decimal del teclado
	 * 
	 * @return decimal introducido por el usuario
	
	 * @throws NoEsDecimalException 
	 */
	public static double leerDecimal() {
		do {	
			try {
				return Double.parseDouble(leerCadena().trim()); 
			} catch (NumberFormatException e) {
				System.err.println("Introduzca un número decimal. ");
			}
		}while(true);
	}

	/**
	 * Lee una decimal del teclado
	 * 
	 * @param mensaje mensaje mostrado al usuario
	 * @return decimal introducida por el usuario
	 * @throws IOException
	 * @throws NumberFormatException
	 * @throws NoEsDecimalException 
	 */
	public static double leerDecimal(String mensaje){
		System.out.println(mensaje);
		return leerDecimal();
	}

}