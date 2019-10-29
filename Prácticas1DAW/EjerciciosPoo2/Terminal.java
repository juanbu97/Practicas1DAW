package herenciaJava;
/**
 * Implementa la clase Terminal. Un terminal tiene asociado un número. Los
 * terminales se pueden llamar unos a otros y el tiempo de conversación corre
 * para ambos.
 * @author d18bugaj
 *
 */
public class Terminal {

	//Declaro las variables
	
	private String numeroTerminal = "";
	private int tiempo  = 0;
	
	
	//Creo el constructor y le paso como parámetro el número del terminal
	
	public Terminal(String numeroTerminal) {
		setNumeroTerminal(numeroTerminal);
	}


	/**
	 * @return the numeroTerminal
	 */
	public String getNumeroTerminal() {
		return numeroTerminal;
	}


	/**
	 * @param numeroTerminal the numeroTerminal to set
	 */
	public void setNumeroTerminal(String numeroTerminal) {
		this.numeroTerminal = numeroTerminal;
	}


	/**
	 * @return the tiempo
	 */
	public int getTiempo() {
		return tiempo;
	}


	/**
	 * @param tiempo the tiempo to set
	 */
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	
	public void llamar(Terminal objeto2 ,int tiempo) {
		this.tiempo += tiempo;
		objeto2.tiempo += tiempo;
	}


	
	@Override
	public String toString() {
		return "Nº "+ numeroTerminal + " - " + getTiempo() + "s de conversación";
	}
	
	
	
	
	
}
