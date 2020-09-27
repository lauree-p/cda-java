package tp4;

/**
 * A l'inverse, il peut �tre voulu d'arr�ter pr�matur�ment la boucle, pour une autre condition que celle pr�cis�e dans l'en- t�te de la boucle.
 * L'instruction break permet d'arr�ter une boucle (for ou bien while). Il s'agit, tout comme continue, de l'associer � une structure conditionnelle,
 *  sans laquelle la boucle ne ferait jamais plus d'un tour!
 *  
 * Dans l'exemple de tout � l'heure, par exemple si l'on ne savait pas � quel moment le d�nominateur (x-7) s'annule, 
 * il serait possible de faire arr�ter la boucle en cas d'annulation du d�nominateur, pour �viter une division par z�ro !
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
