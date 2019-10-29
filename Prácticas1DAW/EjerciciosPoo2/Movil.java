package herenciaJava;
/**
 * Implementa la clase Movil como subclase de Terminal (la clase del ejercicio
 * anterior que ya no hace falta modificar). Cada móvil lleva asociada una tarifa
 * que puede ser “rata”, “mono” o “bisonte”. El coste por minuto es de 6, 12 y
 * 30 céntimos respectivamente. Se tarifican los segundos exactos. Obviamente,
 * cuando un móvil llama a otro, se le cobra al que llama, no al que recibe la
 * llamada. A continuación se proporciona el contenido del main y el resultado
 * que debe aparecer por pantalla. Para que el total tarificado aparezca con dos
 * decimales, puedes utilizar DecimalFormat.
 * @author d18bugaj
 *
 */

//Pongo extends para que herede de la clase Terminal
public class Movil extends Terminal{

	//creo la variables tarifa
	private String tarifa = "";
	private double dinero = 0;
	
	public Movil(String numeroTerminal, String tarifa) {
		super(numeroTerminal);
		setTarifa(tarifa);
	}
	
	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}
	
	public void llamar(Movil objeto2, int tiempo) {
		if(this.tarifa.equals("rata")) {
			this.dinero = tiempo *0.1;
			setTiempo(tiempo);
	
		}else if(this.tarifa.equals("mono")) {
			this.dinero = tiempo*0.2;
			setTiempo(tiempo);
		
		}else if(this.tarifa.equals("bisonte")) {
			this.dinero = tiempo * 0.5;
			setTiempo(tiempo);
		}
	}

	@Override
	public String toString() {
		return super.toString()+" - tarifados "+dinero+" euros";
	}
}