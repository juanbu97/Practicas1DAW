package excepcionesJava;
/**
 * Clase Gato
 * @author juanbu97
 *
 */
public class Gato {

	private String sexo;
	private String color;
	private String raza;
	
	public Gato(String sexo) {
		setSexo(sexo);
	}
	
	public String getSexo() {
		return sexo;
	}

	private void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void maulla() {
		System.out.println("Miau");
	}
	
	public Gato apareaCon(Gato gato2) throws ApareamientoImposible{
		if(this.getSexo().equals(gato2.getSexo())) {
			throw new ApareamientoImposible();
		}
			String hijo = (int)(Math.random() * 2) ==  0 ? "hembra" : "macho";
			return new Gato(hijo);
		
	}

	@Override
	public String toString() {
		return "Gato [sexo=" + sexo + "]\n";
	}

	
	
}
