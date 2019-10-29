package objetosJava;

/**
 * Crea una clase Fraccion (en Java yPython) de forma que podamos hacer las
 * siguientes operaciones:
 *
 * Contruir un objeto Fraccion pas�ndole al constructor el numerador y el
 * denominador. Obtener la fracci�n. Obtener y modificar numerador y
 * denominador. No se puede dividir por cero. Obtener resultado de la fracci�n
 * (n�mero real). Multiplicar la fracci�n por un n�mero. Multiplicar, sumar y
 * restar fracciones. Simplificar la fracci�n.
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
	 * M�todo que modifica la fracci�n
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
	 * Multiplica la fracci�n por un n�mero
	 * 
	 * @param factor
	 * 
	 */
	public void multiplicarNumero(int factor) {
		setNumerador(this.numerador * factor);

	}

	/**
	 *  M�todo para multiplicar dos fracciones
	 * @param objeto2
	 * @return el resultado de multiplicar una fraccion con otra
	 */
	public Fraccion multiplicar(Fraccion objeto2) {
		return new Fraccion(numerador * objeto2.numerador, denominador * objeto2.denominador);
	}

	/**
	 *  M�todo para dividir dos fracciones
	 * @param objeto2
	 * @return el resultado de dividir una fraccion con otra
	 */
	
	public Fraccion dividir(Fraccion objeto2) {
		return new Fraccion(numerador * objeto2.denominador, denominador * objeto2.numerador);
	}
	
	
	/**
	 *  M�todo para sumar dos fracciones
	 * @param objeto2
	 * @return objeto fracci�n 
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
	 *  M�todo para c�lcular el mcm
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
