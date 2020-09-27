package tp4;

import java.util.Scanner;

/**
 * A l�instar de la boucle while, la boucle do/while ex�cute une s�rie d�instructions tant qu�une expression de contr�le est vrai.
 * La grande diff�rence tient au fait que la boucle while effectue la v�rification avant le corps, alors que dans la boucle 
 * do/while la v�rification s�effectue en fin de boucle.
 * 
 * La cons�quence est simple : avec la boucle while, le corps ne sera jamais ex�cut� si la condition est fausse au d�but de la premi�re it�ration, 
 * alors qu�avec une boucle do/while vous �tes assur� que le corps sera ex�cut� au moins une fois.
 * 
 * Dans l�exemple suivant, on lit une variable au clavier tant que la valeur de celle-ci n�est pas comprise dans un intervalle d�termin�.
 * Notez au passage, l'utilisation de la classe native scanner � la place de la classe clavier.
 */

public class Tp43 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int valeur;
		String chaineLue;
		try {
		    do {
		         // Lecture d'une ligne au clavier
		         chaineLue = sc.nextLine();
		         //Conversion de la chaine en entier
		         valeur=Integer.parseInt(chaineLue);
		       }while ((valeur < 5) || ( valeur > 10));
		} catch (Exception e) {
		    System.out.println("Erreur d'Entree/Sortie " + e.getMessage());
		}

	}

}
