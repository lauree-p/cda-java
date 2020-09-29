package algo;

import tp3.Clavier;

/**
 * Pour commencer les joueurs comptent jusqu’à trois en mettant la main dans le dos.
 * Une fois à trois les joueurs révèlent leur main (pierre, feuille ou ciseaux) en même temps.
 * 
 * La plus forte des formes l’emporte et le joueur marque le point gagnant.
 * 
 * La Pierre bat le Ciseau
 * La Feuille bat la Pierre
 * Le Ciseau bat la Feuille
 * 
 * Si les deux joueurs utilisent la même forme c’est un match nul.
 * 
 * A savoir que le jeu se déroule généralement en une manche gagnante.
 * Mais pour plus de plaisir de jeu, il est bien de jouer au meilleur des trois manches (le premier a deux points remporte la partie)
 * ou cinq manches (premier à trois points).
 */
public class Chifoumi {

	public static void main(String[] args) {
		int joueurTour = 0;
		
		
		System.out.println("--------------------------------------------------");
		System.out.println("*********************CHIFOUMI*********************");
		System.out.println("---------------------2 Joueurs--------------------");
		

				 
		//setTimeout(() -> printDelay(choixJoueur1,choixJoueur2), 1000);
		
	}
	
	public static void setTimeout(Runnable runnable, int delay){
	    new Thread(() -> {
	        try {
	            Thread.sleep(delay);
	            runnable.run();
	        }
	        catch (Exception e){
	            System.err.println(e);
	        }
	    }).start();
	}
	
	public static void printChoix(String choixJoueur1,String choixJoueur2) {
		
		setTimeout(() -> System.out.println("....1"), 1000);
		setTimeout(() -> System.out.println("....2"), 1000);
		setTimeout(() -> System.out.println("....3"), 1000);
		
		System.out.println("Joueur 1 : "+ choixJoueur1);
		System.out.println("Joueur 2 : "+ choixJoueur1);
	}
	
	public static void demandeChoix(int joueurTour) {
		int choixJoueur = 0;
		String choixJoueur1;
		String choixJoueur2;
		int j = 1;
		
		while ((choixJoueur != 1) && (choixJoueur != 2) && (choixJoueur !=3)) {
			
			System.out.println("Joueur" + j +" : saisissez un nombre");
			System.out.println("1 : Pierre\n2 : Feuille\n3 : Ciseau");
			choixJoueur = Clavier.lireInt();
		} 
		
		switch (choixJoueur) {
		case 1 : 
			System.out.println("1");
			if (joueurTour == 1) {
				choixJoueur1 = "Pierre";
			} else {
				choixJoueur2 = "Pierre";
			}
			break;
		case 2  : 
			System.out.println("2");
			if (joueurTour == 1) {
				choixJoueur1 = "Feuille";
			} else {
				choixJoueur2 = "Feuille";
			}
			break;
		case 3  : 
			System.out.println("3");
			if (joueurTour == 1) {
				choixJoueur1 = "Ciseaux";
			} else {
				choixJoueur2 = "Ciseaux";
			}
			break;
		default : 
			System.out.println("Saisissez 1, 2 ou 3");
			break;
		}
		
		j = 2;
	}
}
