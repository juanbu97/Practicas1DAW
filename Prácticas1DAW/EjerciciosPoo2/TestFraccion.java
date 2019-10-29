package objetosJava;


public class TestFraccion {
public static void main(String[] args) {
	Fraccion fraccion1 = new Fraccion(2, 0);
	Fraccion fraccion2 = new Fraccion(1, 6);
	
	//System.out.println(fraccion1);
	//System.out.println(fraccion2);
	
	//fraccion1.modificarFraccion(8, 3);
	
	//System.out.println(fraccion1);
	
	//System.out.println(fraccion1.calcularFraccion());
	
	//fraccion1.multiplicarNumero(2);
		
	//Fraccion producto = fraccion1.multiplicar(fraccion2);
	//System.out.println(producto);
	
	//Fraccion divisor = fraccion1.dividir(fraccion2);
	//System.out.println(divisor);
	
	Fraccion suma = fraccion1.sumar(fraccion2);
	System.out.println(suma);
	
	
	fraccion1.simplificar();
	System.out.println(fraccion1);

	}
}
