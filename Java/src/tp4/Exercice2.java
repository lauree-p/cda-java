package tp4;

import tp3.Clavier;

/**
 * 
 * �crire un programme qui donne la moyenne de 4 notes ?
 * �crire un programme qui selon la moyenne donne une mention :
 * 
 * � admis �: pour une moyenne sup�rieure ou �gale � 10
 * � admissible � : pour une moyenne entre 8 et 10
 * � recal� � : pour une moyenne strictement inf�rieure � 8
 */

public class Exercice2 {

	public static void main(String[] args) {
		
		int som = 0;
		int i = 0;
		int n;
		int moy;
		int nbNotes = 4;
		
        do {
        	System.out.println("Entrer une note");
            n = Clavier.lireInt();
            som += n;
        	i++;
        } while ( i < nbNotes);
        System.out.println("Somme = " + som);
        moy = som/4;
        System.out.println("La moyenne est de : " + moy);
	}

}
