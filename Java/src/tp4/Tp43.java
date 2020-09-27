package tp4;

import java.util.Scanner;

/**
 * A l’instar de la boucle while, la boucle do/while exécute une série d’instructions tant qu’une expression de contrôle est vrai.
 * La grande différence tient au fait que la boucle while effectue la vérification avant le corps, alors que dans la boucle 
 * do/while la vérification s’effectue en fin de boucle.
 * 
 * La conséquence est simple : avec la boucle while, le corps ne sera jamais exécuté si la condition est fausse au début de la première itération, 
 * alors qu’avec une boucle do/while vous êtes assuré que le corps sera exécuté au moins une fois.
 * 
 * Dans l’exemple suivant, on lit une variable au clavier tant que la valeur de celle-ci n’est pas comprise dans un intervalle déterminé.
 * Notez au passage, l'utilisation de la classe native scanner à la place de la classe clavier.
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
