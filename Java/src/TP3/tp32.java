package TP3;

public class tp32 {

	public static void main(String[] args) {

		int i;
		System.out.println("Saisissez un nombre");
		i = Clavier.lireInt();
		if (i != 1) {
			System.out.println("Vous avez saisi : "+i);
			System.exit(-1);
		}
		else {
			System.out.println("bravo");
		}

	}

}
