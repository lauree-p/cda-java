package algo;

import outils.Clavier;

/**
 * La Pierre bat le Ciseau
 * La Feuille bat la Pierre
 * Le Ciseau bat la Feuille
 */
public class Chifoumi {

	public static void main(String[] args) {
	 
		titleGame();
		setTimeout(() -> gameMode(), 1000);
		//clearConsole();
	}
	
	/**
	 * Results of aswers of Players
	 * @param choixJoueur1
	 * @param choixJoueur2
	 */
	public static void printChoice(String choixJoueur1,String choixJoueur2) {
		
		setTimeout(() -> System.out.print("\n....1"), 1000);
		setTimeout(() -> System.out.print("....2"), 1000);
		setTimeout(() -> System.out.println("....3"), 1000);
		
		System.out.println("Joueur 1 : "+ choixJoueur1);
		System.out.println("Joueur 2 : "+ choixJoueur1);
	}
	
	//-------------------------------------------------------- Global Game
	
	/**
	 * Title of the Game
	 */
	public static void titleGame() {
		System.out.println("--------------------------------------------------");
		System.out.println("*********************CHIFOUMI*********************");
		System.out.println("--------------------------------------------------"); 
	}
	
	/**
	 * Allow user to choose the game mode
	 */
	public static void gameMode() {
		boolean verif = false;
		int gameMode = 0;
		
		while (verif == false) {
			System.out.println("\n-------------Choisissez un mode de jeu------------");
			System.out.println("1 - Contre l'IA \n2 - 2 Joueurs");
			gameMode = Clavier.lireInt();
		}
		
		if (gameMode == 1 || gameMode == 2) {
			verif = true;
			if (gameMode == 1) {
				onePlayer();
			} else {
				twoPlayers();
			}
		}
	
	}
	
//	/**
//	 * Start the game
//	 * @param gameMode 1 or 2
//	 */
//	public static void startGame(int gameMode) {
//
//	}
	
	//-------------------------------------------------------- Contre l'IA
	
	/**
	 * One Player vs AI
	 */
	public static void onePlayer() {
		demandeChoixContreIA(1);
	}
	
	/**
	 * Ask the anwser of the player 
	 * @param PlayerTurn
	 */
	public static void demandeChoixContreIA(int playerTurn) {
		int choicePlayer = 0;
		String choicePlayer1;
		String choicePlayer2;
		int j = 1;
		
		while ((choicePlayer != 1) && (choicePlayer != 2) && (choicePlayer !=3)) {
			
			System.out.println("Joueur" + j +" : saisissez un nombre");
			System.out.println("1 : Pierre\n2 : Feuille\n3 : Ciseau");
			choicePlayer = Clavier.lireInt();
		} 
		
		switch (choicePlayer) {
		case 1 : 
			System.out.println("1");
			if (playerTurn == 1) {
				choicePlayer1 = "Pierre";
			} else {
				choicePlayer2 = "Pierre";
			}
			break;
		case 2  : 
			System.out.println("2");
			if (playerTurn == 1) {
				choicePlayer1 = "Feuille";
			} else {
				choicePlayer2 = "Feuille";
			}
			break;
		case 3  : 
			System.out.println("3");
			if (playerTurn == 1) {
				choicePlayer1 = "Ciseaux";
			} else {
				choicePlayer2 = "Ciseaux";
			}
			break;
		default : 
			System.out.println("Saisissez 1, 2 ou 3");
			break;
		}
		
		j = 2;
	}	
	
	//-------------------------------------------------------- 2 Joueurs
	
	/**
	 * Mode 2 Players
	 */
	public static void twoPlayers() {
		demandeChoix2Joueurs(1);
	}
	
	/**
	 * Ask the anwser of the player 
	 * @param PlayerTurn
	 */
	public static void demandeChoix2Joueurs(int playerTurn) {
		int choicePlayer = 0;
		String choicePlayer1;
		String choicePlayer2;
		int j = 1;
		
		while ((choicePlayer != 1) && (choicePlayer != 2) && (choicePlayer !=3)) {
			
			System.out.println("Joueur" + j +" : saisissez un nombre");
			System.out.println("1 : Pierre\n2 : Feuille\n3 : Ciseau");
			choicePlayer = Clavier.lireInt();
		} 
		
		choiceNumberToString(choicePlayer,playerTurn);
		
	}
	
	/**
	 * Transform number choices to String 
	 * "Pierre","Papier","Ciseaux"
	 * @param choicePlayer 
	 * @param playerTurn 
	 */
	public static void choiceNumberToString(int choicePlayer, int playerTurn){
		
		String[] tabChoix = {"Pierre","Feuille","Ciseaux"};
		
		String choicePlayerStr;
		
		switch (choicePlayer) {
		case 1 : 
			System.out.println("1");
			choicePlayerStr = tabChoix[1];
			break;
		case 2  : 
			System.out.println("2");
			choicePlayerStr = tabChoix[2];
			break;
		case 3  : 
			System.out.println("3");
			choicePlayerStr = tabChoix[3];
			break;
		default : 
			System.out.println("Saisissez 1, 2 ou 3");
			break;
		}
		
//		if (playerTurn == 1 ) {
//			choicePlayer1 =  
//		}

	}
	
	 
	
	/**
	 * Switch turn of Player
	 */
	public static void turnOfPlayer() {
		
	}
	
	
	//--------------------------------------------------------- Utils Functions 
	
	/**
	 * SetTimeOut
	 * @param runnable
	 * @param delay
	 */
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
	
	/*
	 * Clear console
	 */
	public static void clearConsole() {
		for (int i = 0 ; i < 50 ; i++) {
			System.out.println("\n");
		}
	}


}
