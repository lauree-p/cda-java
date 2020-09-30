package tp3;

import outils.Clavier;

public class Tp33 {

	public static void main(String[] args) {
		int i;
		System.out.println("Saisissez un nombre");
		i=Clavier.lireInt();
		System.out.println(i!=1 ? "Vous avez saisi : "+i: "bravo");
	}

}
