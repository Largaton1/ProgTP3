package fr.istic.prg1.tp3;

/**
 * @author Bouchra Salma <salma.bouchra@etudiant.univ-rennes1.fr>
 * @author Cyril KONE<largaton-ange-cyril.kone@etudiant.univ-rennes1.fr>
 * @version 5.0
 * @since 2023-10-04
 * 
 */

public class Fourmis {

	/**
	 * @param s un terme de la suite des fourmis
	 * @pre s.length() > 0
	 * @return le terme suivant de la suite des fourmis
	 */
	public static String next(String s) {

		StringBuilder builder = new StringBuilder();

		int compt = 1;
		char first = s.charAt(0);
		for (int i = 1; i < s.length(); i++) {

			if (s.charAt(i) == first) {

				compt = compt+1;
			}

			else {

				builder.append(compt).append(first);
				compt = 1;
				first = s.charAt(i);
			}
		}

		builder.append(compt).append(first);
		return builder.toString();
	}


}