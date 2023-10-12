package fr.istic.prg1.tp3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Bouchra Salma <salma.bouchra@etudiant.univ-rennes1.fr>
 * @author Cyril KONE<largaton-ange-cyril.kone@etudiant.univ-rennes1.fr>
 * @version 5.0
 * @since 2023-10-04
 * 
 *        Partie II
 *
 *        Lecture, au clavier, d'une suite de doublets d'entiers terminée par -1
 *
 *        Cette suite peut comporter des doublets identiques.
 * 
 *        Construction et affichage d'un tableau contenant les doublets
 *        distincts triés selon l'ordre croissant des doublets, à savoir : (x1,
 *        y1) < (x2, y2) <==> (x1<x2) ou (x1==x2 et y1<y2)
 * 
 *        En entrée : 3 8 1 4 3 8 1 3 -1 ==> En sortie : [1 3] [1 4] [3 8]
 */

public class InsertionPair {

	private static final int SIZE_MAX = 10;
	private static final int END_MARKER = -1;
	/**
	 * nombre de doublets présents dans t, 0 <= size <= SIZE_MAX
	 */
	private int size;
	private Pair[] array;

	/**
	 * @return copie de la partie remplie du tableau
	 */
	public Pair[] toArray() {
		Pair [] copy = new Pair [size];
		for (int i=0; i<size; i++) {
			Arrays.copyOf(array, size);
			
		}
		return copy;
	}

	/**
	 * array est rempli, par ordre croissant, en utilisant la fonction insert, avec
	 * les valeurs lues par scanner.
	 * 
	 * @param scanner
	 */
	public void createArray(Scanner scanner) {
	    int count = 0;
	    for (int i = 0; i < SIZE_MAX; i++) {
	        int x = scanner.nextInt();
	        if (x == END_MARKER) {
	            break;
	        }
	        int y = scanner.nextInt();
	        if (y == END_MARKER) {
	            break;
	        }
	        Pair pair = new Pair(x, y);
	        if (x >= 0 && y >= 0 && insert(pair)) {
	            count++;
	        }
	    }
	    array = this.toArray();
	}



	/**
	 * Si pair n'appartient pas à array[0..size-1] et size < SIZE_MAX, size est
	 * incrémenté de 1, pair est inséré dans array et les entiers array[0..size]
	 * sont triés par ordre croissant. Sinon array est inchangé.
	 * 
	 * @param pair doublet à insérer
	 * 
	 * @pre les doublets de array[0..size-1] sont triés par ordre croissant
	 * 
	 * @return false si pair appartient à array[0..size-1] ou si array est
	 *         complètement rempli; true si pair n’appartient pas à array[0..size-1]
	 */
	public boolean insert(Pair pair) {
	    if (pair == null) {
	        return false;
	    }

	    if (size == array.length) {
	   
	        return false; 
	    }

	    int i;
	    for (i = 0; i < size; i++) {
	        if (array[i].compareTo(pair) > 0) {
	            break;
	        }
	    }

	    for (int j = size; j > i; j--) {
	        array[j] = array[j - 1];
	    }

	    array[i] = pair;
	    size++;
	    return true;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		int i = 0;
		while (i < size) {
			sb.append(array[i]).append("");
			
			i++;
		}
		return sb.toString();
	
	}
}