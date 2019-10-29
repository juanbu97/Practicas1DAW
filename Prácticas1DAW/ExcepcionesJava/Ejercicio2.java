package excepcionesJava;

public class Ejercicio2 {
	public static void main(String[] args) {
	
		Gato gato1 = new Gato("macho");
		Gato gato2 = new Gato("hembra");
		Gato gato3 = new Gato("macho");
		
		try {
			System.out.println(gato1.apareaCon(gato2));
			gato1.apareaCon(gato3);
		} catch (ApareamientoImposible excepcion) {
			System.err.println("Gatos del mismo sexo no se pueden aparear");
			//excepcion.printStackTrace();
		}
		
		
		
	}
}
