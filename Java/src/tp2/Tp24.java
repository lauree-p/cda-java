package tp2;

/**
 * Une affectation est aussi une expression qui calcule une valeur et l'affecte à une variable.
 * La valeur d'une telle expression est celle calculée dans la partie droite de l'affectation (les opérateurs d'affectation étant binaires infixes).
 * L'opérateur permettant de définir une affectation sera noté =.
 */

public class Tp24 {

	public static void main(String[] args) {
		 int a;
         System.out.println( "Premier = " + (a=10)*2 + ";\t" + "Second = " + a + ";");

	}
	
	/**
	 *  Il est possible de faire une affectation directement dans une opération.
	 *  Attention une variable doit être définie pour pouvoir être affectée.
	 */
	

}
