package objetos;



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
		setRadio(r);
	}
	
	//getter del radio
	public double getRadio() {
		return this.radio;
	}
	
	
	//setter del radio
	private void setRadio(double radio2) {
		if(radio2 < 0) {
			System.out.println("El radio no puede ser negativo, se le asignará 1 por defecto");
			return;
		}
	
		this.radio = radio2;
		
	}
	

	/**
	 * mengua el radio del círulo en n
	 */
	void menguarRadio(int n) {
		double radioMenguado = 0;
		radioMenguado = this.radio;
		radioMenguado-=n;
		if(radioMenguado>0) {
			this.radio = radio-n;
		}else {
		System.out.println("El radio no puede ser negativo");
			
		}
	}
	
	/**
	 * aumenta el radio del círculo en n
	 * @param n
	 */
	void aumentarRadio(int n) {
		this.radio = radio+n;
	}
	
	/**
	 * muestra el area del círculo
	 */
	public double getArea() {
		 return (Math.PI*(Math.pow(radio, 2)));
	}

	/**
	 * Método toString()
	 */
	@Override
	public String toString() {
		return "Soy un círculo de radio " + getRadio() + " metros. Ocupo un área de " + getArea() + " metros cuadrados";
	}
	
	
}
