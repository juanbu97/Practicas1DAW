package objetos;
/**
 * Crea una clase TestCirculo que cree una instancia de �Circulo�,
 * muestre su estado, lo haga crecer 27 veces, averig�e su �rea, 
 * lo haga decrecer 10 veces y muestre su estado final.
 * @author d18bugaj
 *
 */
public class TestCirculo {
public static void main(String[] args) {

	
	//Creo el objeto circulo con 5 de radio
	Circulo circulo = new Circulo(5);
	
	//muestro su estado gracias al m�todo toString()
	System.out.println(circulo);
	
	//hago crecer el radio 27 veces	
	circulo.aumentarRadio(27);
	
	//calculo su �rea
	System.out.println(circulo.getArea());
	
	//decrezco el radio 10 veces
	circulo.menguarRadio(10);
	
	//muestro el estado
	System.out.println(circulo);
	
	
	
	//System.out.println(circulo);
	
 }
}
