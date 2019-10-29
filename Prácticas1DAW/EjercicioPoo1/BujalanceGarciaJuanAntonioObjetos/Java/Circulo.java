package objetos;

import org.omg.Messaging.SyncScopeHelper;

/**
 * Crea la clase “Circulo” en Java que responda al siguiente comportamiento:
*Un círculo puede crecer. Aumenta su radio.
*Un círculo puede menguar. Decrementa su radio.
*Un círculo me devuelve su área si se la pido.
*Un círculo me dice su estado, por ejemplo 
*“Soy un círculo de radio 0.5 metros. Ocupo un área de 0.7853981633974483 
*metros cuadrados” (método toString())
 * @author d18bugaj
 *
 */
public class Circulo {

	//atributos
	private double radio;


	
	//constructor
	public Circulo( double r ) {
		this.radio = r;
	}
	
	//getter
	double getRadio() {
		return this.radio;
	}
	
	
	//setter
	private void setRadio(int radio) {
		this.radio = radio;
	}
	

	/**
	 * mengua el radio del círulo en 1
	 */
	void menguarRadio(int n) {
		this.radio = radio-n;
	}
	
	/**
	 * aumenta el radio del círculo en 1
	 */
	void aumentarRadio(int n) {
		this.radio = radio+n;
	}
	
	/**
	 * muestra el area del círculo
	 */
	double getArea() {
		 return (Math.PI*(Math.pow(radio, 2)));
	}

	@Override
	public String toString() {
		return "Soy un círculo de radio " + radio + " metros. Ocupo un área de " + (Math.PI*(Math.pow(radio, 2))) + " metros cuadrados";
	}
	
	
}