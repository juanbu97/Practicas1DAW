package objetos;

import org.omg.Messaging.SyncScopeHelper;

/**
 * Crea la clase �Circulo� en Java que responda al siguiente comportamiento:
*Un c�rculo puede crecer. Aumenta su radio.
*Un c�rculo puede menguar. Decrementa su radio.
*Un c�rculo me devuelve su �rea si se la pido.
*Un c�rculo me dice su estado, por ejemplo 
*�Soy un c�rculo de radio 0.5 metros. Ocupo un �rea de 0.7853981633974483 
*metros cuadrados� (m�todo toString())
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
	 * mengua el radio del c�rulo en 1
	 */
	void menguarRadio(int n) {
		this.radio = radio-n;
	}
	
	/**
	 * aumenta el radio del c�rculo en 1
	 */
	void aumentarRadio(int n) {
		this.radio = radio+n;
	}
	
	/**
	 * muestra el area del c�rculo
	 */
	double getArea() {
		 return (Math.PI*(Math.pow(radio, 2)));
	}

	@Override
	public String toString() {
		return "Soy un c�rculo de radio " + radio + " metros. Ocupo un �rea de " + (Math.PI*(Math.pow(radio, 2))) + " metros cuadrados";
	}
	
	
}