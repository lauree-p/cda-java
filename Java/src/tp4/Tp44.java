package tp4;

/**
 * Il peut être nécessaire de faire sauter à la boucle une ou plusieurs valeurs sans pour autant mettre fin à celle-ci.
 * La syntaxe de cette expression est "continue" (cette instruction se place dans une boucle ! ),
 * on l'associe généralement à une structure conditionnelle, sinon les lignes situées entre cette instruction et la fin de la boucle
 * seraient obsolètes.
 * 
 * Exemple: Imaginons que l'on veuille imprimer, pour x allant de 1 à 10, la valeur de 1/(x-7) ... 
 * Il est évident que pour x=7 il y aura une erreur. ( Car on ne peut pas diviser par 0)
 * Heureusement, grâce à l'instruction continue il est possible de traiter cette valeur à part puis de continuer la boucle!
 */

public class Tp44 {

	public static void main(String[] args) {
		int x = 1;
	    float a;
	    while (x <= 10) {
	      x++;
	      System.out.print("x = " + x);
	      if (x == 7) {
	        System.out.println("\tDivision par zero!");
	        continue;
	      }
	      a = (float) 1 / (x - 7);
	      System.out.println(" \ta = " + a);
	    }

	}

}
