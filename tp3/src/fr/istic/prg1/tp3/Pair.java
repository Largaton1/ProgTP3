package fr.istic.prg1.tp3;

/**
 * 
 * @author Bouchra Salma <salma.bouchra@etudiant.univ-rennes1.fr>
 * @author Cyril KONE<largaton-ange-cyril.kone@etudiant.univ-rennes1.fr>
 * @version 5.0
 * @since 2023-10-04
 * 
 *        Classe représentant des doublets *non modifiables*
 */

public class Pair implements Comparable<Pair> {
	private int x;
	private int y;

	public Pair(int x, int y) {
		this.x=x;
		this.y=y;
	}

	@Override
	public int compareTo(Pair d) {
		if ((this.x < d.x) || (this.x == d.x && this.y < d.y)) {
			return -1;
		}
		else if ((this.x > d.x) || (this.x == d.x && this.y > d.y)) {
			return 1;
		}
		return 0;
	}

	public Pair copyOf() {
		return new Pair (x, y);
	}

	@Override
	public String toString() {
		return "[" + x + "," + y + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Pair)) {
			return false;
		}
		
		// DERNIER CAS À TRAITER
			
		return false;
		
	}
	
}