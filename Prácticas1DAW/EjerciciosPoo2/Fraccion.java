package objetosJava;

/**
 * Crea una clase Fraccion (en Java yPython) de forma que podamos hacer las
 * siguientes operaciones:
 *
 * Contruir un objeto Fraccion pasándole al constructor el numerador y el
 * denominador. Obtener la fracción. Obtener y modificar numerador y
 * denominador. No se puede dividir por cero. Obtener resultado de la fracción
 * (número real). Multiplicar la fracción por un número. Multiplicar, sumar y
 * restar fracciones. Simplificar la fracción.
 * 
 * @author d18bugaj
 *
 */
public class Fraccion {

	// atributos
	private int numerador;
	private int denominador = 1;

	// Constructor
	public Fraccion(int numerador, int denominador) {
		setNumerador(numerador);
		setDenominador(denominador);
	}

	// getter
	int getNumerador() {
		return this.numerador;
	}

	int getDenominador() {
		return this.denominador;
	}

	// setter
	private void setNumerador(int num) {
		this.numerador = num;
	}

	private void setDenominador(int num) {
		if (num == 0) {
			System.out.println("El denominador no puede ser 0");
			return;
		}
		this.denominador = num;
	}

	/**
	 * Método que modifica la fracción
	 * 
	 * @param numeradorNuevo
	 * @param denominadorNuevo
	 * @return
	 */
	public String modificarFraccion(int numeradorNuevo, int denominadorNuevo) {
		this.setNumerador(numeradorNuevo);
		this.setDenominador(denominadorNuevo);
		return toString();
	}

	/**
	 * Calcula el resultado de dividir el numerador entre el denominador
	 * 
	 * @return devuelve el resultado real de la fraccion
	 */

	public int calcularFraccion() {
		return this.numerador / this.denominador;

	}

	/**
	 * Multiplica la fracción por un número
	 * 
	 * @param factor
	 * 
	 */
	public void multiplicarNumero(int factor) {
		setNumerador(this.numerador * factor);

	}

	/**
	 *  Método para multiplicar dos fracciones
	 * @param objeto2
	 * @return el resultado de multiplicar una fraccion con otra
	 */
	public Fraccion multiplicar(Fraccion objeto2) {
		return new Fraccion(numerador * objeto2.numerador, denominador * objeto2.denominador);
	}

	/**
	 *  Método para dividir dos fracciones
	 * @param objeto2
	 * @return el resultado de dividir una fraccion con otra
	 */
	
	public Fraccion dividir(Fraccion objeto2) {
		return new Fraccion(numerador * objeto2.denominador, denominador * objeto2.numerador);
	}
	
	
	/**
	 *  Método para sumar dos fracciones
	 * @param objeto2
	 * @return objeto fracción 
	 */
	public Fraccion sumar(Fraccion objeto2) {
		
		int denominadorComun = mcm(denominador,objeto2.denominador);
		
		int n1 = denominadorComun/denominador * numerador;
		int n2 = denominadorComun/objeto2.denominador * objeto2.numerador;
		
		return new Fraccion(n1 + n2, denominadorComun);
	}
	
	public void simplificar() {
		
		int denominadorComun = mcm(numerador, denominador);
		
		setNumerador(numerador/denominadorComun);
		setDenominador(denominador/denominadorComun);
		
		
	}
	
	
	
	
	/**
	 *  Método para cálcular el mcm
	 * @param a
	 * @param b
	 * @return devuelve el minimo comun multiplo
	 */
	private int mcm(int a, int b) {
    int denominador;
    
    if (a>b)
        denominador=a;
    else
        denominador=b;

    while (denominador%a!=0 || denominador%b!=0)
        denominador++;
       
    return denominador;
	}
	
	@Override
	public String toString() {
		return numerador + "/" + denominador;
	}

}
