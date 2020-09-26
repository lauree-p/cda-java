package TP3;

public class exercice2 {

	public static void main(String[] args) {
		//algo1();
		//algo2();
		//algo3();
	}
	
	/** Avec si ... alors ... sinon
	 * The user gives two values, we give it the larger value
	 */
	public static void algo1() {
		System.out.println("Saisissez un nombre");
		int valeur1 = Clavier.lireInt();
		System.out.println("Saisissez un autre nombre");
		int valeur2 = Clavier.lireInt();
		
		System.out.println("Nombres : "+valeur1 +" , "+valeur2);
		
		if (valeur1<valeur2) {
			System.out.println("Le nombre le plus grand que vous avez saisie est :"+ valeur2 );
		} else {
			System.out.println("Le nombre le plus grand que vous avez saisie est :"+ valeur1 );
		}
	}
	
	/** Avec si ... alors
	 * The user gives two values, we give it the larger value
	 */
	public static void algo2() {
		System.out.println("Saisissez un nombre");
		int valeur1 = Clavier.lireInt();
		System.out.println("Saisissez un autre nombre");
		int valeur2 = Clavier.lireInt();
		int lePlusGrand = valeur1;
		
		System.out.println("Nombres : "+valeur1 +" , "+valeur2);
		if ( valeur1 < valeur2 ) {
			lePlusGrand = valeur2;
		}
		System.out.println("Le nombre le plus grand que vous avez saisie est : "+ lePlusGrand );
	}
	
	/**
	 *  The user gives four values, we give it the larger value
	 */
	public static void algo3() {
		System.out.println("Saisissez un nombre");
		int a = Clavier.lireInt();
		System.out.println("Saisissez un autre nombre");
		int b = Clavier.lireInt();
		System.out.println("Saisissez encore un nombre");
		int c = Clavier.lireInt();
		System.out.println("Saisissez enfin le dernier nombre");
		int d = Clavier.lireInt();
		
		System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
		
		if (a<b && c<d) {
			if (b<d) {
				System.out.println("Le nombre le plus grand que vous avez saisie est : " + d);
			} else {
				System.out.println("Le nombre le plus grand que vous avez saisie est : " + b);
			}
		} else if (a<c) {
			System.out.println("Le nombre le plus grand que vous avez saisie est : " + c);
		} else {
			System.out.println("Le nombre le plus grand que vous avez saisie est : " + a);
		}
	}

}
