package herenciaJava;

public class Tiempo {

	//atributos
	
	private int horas;
	private int minutos;
	private int segundos;
	
	//constructor 
	public Tiempo(int horas, int minutos,int segundos) {
		setHoras(horas);
		setMinutos(minutos);
		setSegundos(segundos);
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	private void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	private void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
	
	//método que suma dos objetos de tipo tiempo
	public Tiempo sumar(Tiempo tiempo2) {
		horas = this.horas + tiempo2.horas;
		minutos = this.minutos + tiempo2.minutos;
		segundos = this.segundos + tiempo2.segundos;
		
		if(minutos >= 60) {
			horas+=1;
			minutos-= 60;
		}
		if(segundos >= 60){
			minutos+=1;
			segundos-=60;
		}
				
		return new Tiempo(horas,minutos,segundos);
		
	}

	@Override
	public String toString() {
		return horas + "h " + minutos + "m " + segundos + "s";
	}
	
	
	
	
	
}
