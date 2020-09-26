package TP3;

public class exercice1 {
	
	/**
	 * Algo : RESULTAT 
		DEBUT
		... écrire(clavier) " Veuillez saisir la note"
		... lire(clavier) la note
		... Si note >= 10
		... ... écrire(écran) "Vous êtes admis(e)"
		... ... Si note < 12
		... ... ... écrire(écran) "Votre mention est assez bien".
		... ... Sinon 
		... ... ... Si note < 14
		... ... ... ... écrire(écran) "Votre mention est bien".
		... ... ... Sinon
		... ... ... ... Si note < 16
		... ... ... ... ... écrire(écran) "Votre mention est très bien".
		... ... ... ... Finsi 
		... ... ... Finsi 
		... ... Finsi 
		... Sinon
		... ... Si note >= 8
		... ... ... écrire(écran) "Vous êtes sur liste d'attente"
		... ... Sinon
		... ... ... écrire (écran) "Vous êtes refusé(e)"
		... ... FinSi
		... FinSi
		FIN
	 */
	
	public static void main(String[] args) {
		int i;
		System.out.println("Veuillez saisir la note");
		i=Clavier.lireInt();
		
		if (i >= 10) {
			System.out.println("Vous êtes amdis");
			if (i < 12) {
				System.out.println("Votre mention est assez bien");
			}
			else {
				if ( i < 14) {
					System.out.println("Votre mention est bien");
				}
				else {
					if (i < 16) {
						System.out.println("Votre mention est très bien");
					}
				}
			}
		}
		else {
			if (i >=8) {
				System.out.println("Vous êtes sur liste d'attente");
			}
			else {
				System.out.println("Vous êtes refusé(e)");
			}
		}
	}
	
}
