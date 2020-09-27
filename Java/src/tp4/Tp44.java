package tp4;

/**
 * Il peut �tre n�cessaire de faire sauter � la boucle une ou plusieurs valeurs sans pour autant mettre fin � celle-ci.
 * La syntaxe de cette expression est "continue" (cette instruction se place dans une boucle ! ),
 * on l'associe g�n�ralement � une structure conditionnelle, sinon les lignes situ�es entre cette instruction et la fin de la boucle
 * seraient obsol�tes.
 * 
 * Exemple: Imaginons que l'on veuille imprimer, pour x allant de 1 � 10, la valeur de 1/(x-7) ... 
 * Il est �vident que pour x=7 il y aura une erreur. ( Car on ne peut pas diviser par 0)
 * Heureusement, gr�ce � l'instruction continue il est possible de traiter cette valeur � part puis de continuer la boucle!
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
