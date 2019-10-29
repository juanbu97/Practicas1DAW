package exMayo2019JuanAntonioBujalanceGarcia;
/**
 * Clase Fecha que uso en la clase gráfica ejercicio2
 * @author d18bugaj
 *
 */
public class Fecha {
	
	private int dia;
	private int mes;
	private int anno;
	
	public Fecha(int dia, int mes, int anno) {
		setDia(dia);
		setMes(mes);
		setAnno(anno);		
	}

	

	/**
	 * @return the dia
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * @param dia the dia to set
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}

	/**
	 * @return the mes
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * @param mes the mes to set
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}

	/**
	 * @return the anno
	 */
	public int getAnno() {
		return anno;
	}

	/**
	 * @param anno the anno to set
	 */
	public void setAnno(int anno) {
		this.anno = anno;
	}
	
	/**
	 * En el método toString pongo una serie de condicionales para que si el día y el mes
	 * tienen menos de dos dígitos le ponga un 0 delante para que al validar la fecha no de error
	 */
	@Override
	public String toString() {
		String cadena = "";
		if(getDia()<10 && getMes() < 10) {
			cadena = "0"+dia + "/0" + mes + "/" + anno;
		}else if(getDia()<10) {
			cadena = "0"+dia + "/" + mes + "/" + anno;
		}else if(getMes() < 10) {
			cadena = dia + "/0" + mes + "/" + anno;
		}else {
			cadena = dia + "/" + mes + "/" + anno;
		}
		return cadena;
	}
	
	
	
	
}
