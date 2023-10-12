package fr.istic.prg1.tp3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Bouchra Salma <salma.bouchra@etudiant.univ-rennes1.fr>
 * @author Cyril KONE<largaton-ange-cyril.kone@etudiant.univ-rennes1.fr>
 * @version 5.0
 * @since 2023-10-04
 * 
 */

public class Main {

    public static void main(String[] args) {
        System.out.println(Fourmis.next("1"));
        System.out.println(Fourmis.next("1211"));
        System.out.println(Fourmis.next("111221"));
        System.out.println(Fourmis.next("312211"));
        System.out.println("Entrez des valeurs pour InsertionInteger (-1 pour arrêter avant 10 valeurs):");
        InsertionInteger ii = new InsertionInteger();
        Scanner sc = new Scanner(System.in);
        ii.createArray(sc);
        System.out.println(ii.toString());
        System.out.println("Entrez des valeurs pour InsertionPair (-1 pour arrêter avant 10 pairs):");
        InsertionPair ip = new InsertionPair();
        ip.createArray(sc);
        System.out.println(ip.toString());
        System.out.println("InsertionPair lu sur un fichier");
        ip = new InsertionPair();
        sc.nextLine();
        boolean valid = true;
        while (valid) {
            System.out.println("Saisissez le nom d'un fichier:");
            String nomFichier = sc.nextLine();
            File file = new File(nomFichier);
            try {
                Scanner sc1 = new Scanner(file);
                ip.createArray(sc1);
                valid = false;
            } catch (FileNotFoundException e) {
                System.err.println("Fichier non trouvé");
            }
        }
        System.out.println(ip.toString());
    }

}