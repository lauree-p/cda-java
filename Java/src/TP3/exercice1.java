package TP3;

public class exercice1 {
	
	/**
	 * Algo : RESULTAT 
		DEBUT
		... �crire(clavier) " Veuillez saisir la note"
		... lire(clavier) la note
		... Si note >= 10
		... ... �crire(�cran) "Vous �tes admis(e)"
		... ... Si note < 12
		... ... ... �crire(�cran) "Votre mention est assez bien".
		... ... Sinon 
		... ... ... Si note < 14
		... ... ... ... �crire(�cran) "Votre mention est bien".
		... ... ... Sinon
		... ... ... ... Si note < 16
		... ... ... ... ... �crire(�cran) "Votre mention est tr�s bien".
		... ... ... ... Finsi 
		... ... ... Finsi 
		... ... Finsi 
		... Sinon
		... ... Si note >= 8
		... ... ... �crire(�cran) "Vous �tes sur liste d'attente"
		... ... Sinon
		... ... ... �crire (�cran) "Vous �tes refus�(e)"
		... ... FinSi
		... FinSi
		FIN
	 */
	
	public static void main(String[] args) {
		int i;
		System.out.println("Veuillez saisir la note");
		i=Clavier.lireInt();
		
		if (i >= 10) {
			System.out.println("Vous �tes amdis");
			if (i < 12) {
				System.out.println("Votre mention est assez bien");
			}
			else {
				if ( i < 14) {
					System.out.println("Votre mention est bien");
				}
				else {
					if (i < 16) {
						System.out.println("Votre mention est tr�s bien");
					}
				}
			}
		}
		else {
			if (i >=8) {
				System.out.println("Vous �tes sur liste d'attente");
			}
			else {
				System.out.println("Vous �tes refus�(e)");
			}
		}
	}
	
}
