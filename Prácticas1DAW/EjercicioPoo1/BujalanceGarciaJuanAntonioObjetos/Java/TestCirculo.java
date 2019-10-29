package objetos;

public class TestCirculo {
public static void main(String[] args) {

	
	//creo la instancia del Circulo
	Circulo circulo1 = new Circulo(5);
	System.out.println();
	
	//muestro el estado de circulo1 con el método toString
	System.out.println(circulo1);
	System.out.println();
	
	//lo hago crecer 27 veces
	circulo1.aumentarRadio(27);
	System.out.println();
	
	
	//calcular área
	
	System.out.println(circulo1.getArea());
	System.out.println();
	
	//menguo el radio
	circulo1.menguarRadio(10);
	System.out.println(circulo1);
	
	
	
 }
}
