package tp4;

public class Tp42 {

	public static void main(String[] args) {
		
		final int fin = 10;// ceci est une constante, mot clé final
        int somme = 0;
        int i = 0;
        while (i < fin) {
            somme += i;
            i++;
        }
        System.out.println("La somme vaut :" + somme);

	}

	/**
	 * Essayez aussi somme += i
	 * Avez vous une explication ?
	 */
}
