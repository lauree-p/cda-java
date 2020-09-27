package tp4;

import tp3.Clavier;

public class Exercice1 {

	public static void main(String[] args) {
		int i, n, som;
        som = 0;
        for (i = 0; i < 4; i++) {
            System.out.println(i+"-Donnez un entier");
            n = Clavier.lireInt();
            som += n;
        }
        System.out.println("Somme = " + som);

	}
	
	/**
	 * Ecrire ce programme, puis un autre réalisant la même chose en employant une instruction while,
	 * et enfin un autre en utilisant une instruction do ... while.
	 */

}
