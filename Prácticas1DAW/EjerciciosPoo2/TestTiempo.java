package herenciaJava;

public class TestTiempo {
public static void main(String[] args) {
	
	Tiempo hora = new Tiempo(1, 30, 30);
	Tiempo hora2 = new Tiempo(0,30,30);
	
	
	
	
	Tiempo sumaHora = hora.sumar(hora2);
	

	System.out.println(sumaHora);
}
}
