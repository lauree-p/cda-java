package tp4;

/**
 * A l'inverse, il peut être voulu d'arrêter prématurément la boucle, pour une autre condition que celle précisée dans l'en- tête de la boucle.
 * L'instruction break permet d'arrêter une boucle (for ou bien while). Il s'agit, tout comme continue, de l'associer à une structure conditionnelle,
 *  sans laquelle la boucle ne ferait jamais plus d'un tour!
 *  
 * Dans l'exemple de tout à l'heure, par exemple si l'on ne savait pas à quel moment le dénominateur (x-7) s'annule, 
 * il serait possible de faire arrêter la boucle en cas d'annulation du dénominateur, pour éviter une division par zéro !
 */

public class Tp45 {

	public static void main(String[] args) {
		int x = 1; 
		double a = 0;
		
		for( x = 1; x <= 10; x++){
		      a = x - 7;
		      if (a == 0){
		         System.out.println("Division par 0");
		     break; 
		   }
		      System.out.println(1/a);
		}

	}

}
