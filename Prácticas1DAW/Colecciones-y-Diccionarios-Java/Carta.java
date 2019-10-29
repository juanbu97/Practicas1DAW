package coleccionesYDiccionarios;

/**
 * En esta clase voy a crear la baraja española
 * 
 * @author juanbu97
 *
 */
public class Carta implements Comparable<Carta> {

	// atributos de la clase carta
	private Palo palo;
	private Figura figura;

	public Carta(Figura figura2, Palo palo2) {
		palo = palo2;
		figura = figura2;
	}

	public Palo getPalo() {
		return palo;
	}

	public Figura getFigura() {
		return figura;
	}

	@Override
	public String toString() {
		return figura + " de " + palo;
	}

	@Override
	public int compareTo(Carta carta) {
		if (palo.equals(carta.getPalo())) {
			return figura.compareTo(carta.getFigura());
		} else {
			return palo.compareTo(carta.getPalo());
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((figura == null) ? 0 : figura.hashCode());
		result = prime * result + ((palo == null) ? 0 : palo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		if (figura != other.figura)
			return false;
		if (palo != other.palo)
			return false;
		return true;
	}

}
