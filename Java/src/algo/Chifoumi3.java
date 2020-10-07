package algo;

import outils.Clavier;

public class Chifoumi3 {
	
	static int[][] tableauScoreFinal = new int[3][2];
	static int gameMode;
	static String strchoicePlayer1;
	static String strchoicePlayer2;
	static int intChoicePlayer1;
	static int intChoicePlayer2;
	static int numberRound = 1;
	
	public static void main(String[] args) {
//		int[][] tableauScoreFinal = new int[3][2];
//		int gameMode;
//		String strchoicePlayer1;
//		String strchoicePlayer2;
//		int intChoicePlayer1;
//		int intChoicePlayer2;
//		int numberRound;
		clearConsole();
		titleGame();
		setTimeout(() -> gameMode(), 1000);
	}

	/**
	 * Title of game
	 */
	public static void titleGame() {
		System.out.println("--------------------------------------------------");
		System.out.println("    ####  #    # # ######  ####  #    # #    # #  ");
		System.out.println("   #    # #    # # #      #    # #    # ##  ## #  ");
		System.out.println("   #      ###### # #####  #    # #    # # ## # #  ");
		System.out.println("   #      #    # # #      #    # #    # #    # #  ");
		System.out.println("   #    # #    # # #      #    # #    # #    # #  ");
		System.out.println("    ####  #    # # #       ####   ####  #    # #  ");
		System.out.println("--------------------------------------------------");
	}

	/**
	 * Title of game mode 1 player vs IA
	 */
	public static void titleMode1() {
		System.out.println("\n                  1 Joueur VS IA                \n");
	}

	/**
	 * Title of game mode 2 players
	 */
	public static void titleMode2() {
		System.out.println("\n                     2 Joueurs                   \n");
	}

	/**
	 * Allow user to choose the game mode or quit the game
	 */
	public static void gameMode() {
		int gameMode = 0;

		System.out.println("\n------------ Choisissez un mode de jeu -----------");
		System.out.println("\n(1) - Contre l'IA \n(2) - 2 Joueurs\n(3) - Quitter\n");
		gameMode = Clavier.lireInt();

		switch (gameMode) {
		case 1:
			clearConsole();
			titleGame();
			titleMode1();
			round();
			clearConsole();
			demandeChoix();
			break;
		case 2:
			titleGame();
			titleMode2();
			round();
			demandeChoix();
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("Saisissez 1, 2 ou 3");
			gameMode();
			break;
		}
	}

	/**
	 * Condition of victory 1 3 2 1 3 2 La Pierre bat le Ciseau, La Feuille bat la
	 * Pierre, Le Ciseau bat la Feuille
	 */
	public static void winnerRound() {

		if (strchoicePlayer1 == strchoicePlayer2) {
			System.out.println("******************** EGALITE ! *******************"); //
			tableauScoreFinal[numberRound - 1][0]++;
			tableauScoreFinal[numberRound - 1][1]++;
		} else if (strchoicePlayer1 == "Feuille") {

			if (strchoicePlayer2 == "Pierre") {
				System.out.println("*************** VICTOIRE Joueur 1 ***************");
				tableauScoreFinal[numberRound - 1][0]++;
			} else {
				if (gameMode == 1) {
					System.out.println("***************** VICTOIRE de l'IA ***************");
				} else {
					System.out.println("**************** VICTOIRE Joueur 2 **************");
				}
				tableauScoreFinal[numberRound - 1][1]++;
			}

		} else if (strchoicePlayer1 == "Ciseaux") {

			if (strchoicePlayer2 == "Feuille") {
				System.out.println("*************** VICTOIRE Joueur 1 ***************");
				tableauScoreFinal[numberRound - 1][0]++;
			} else {
				if (gameMode == 1) {
					System.out.println("***************** VICTOIRE de l'IA ***************");
				} else {
					System.out.println("**************** VICTOIRE Joueur 2 **************");
				}
				tableauScoreFinal[numberRound - 1][1]++;
			}

		} else if (strchoicePlayer1 == "Pierre") {

			if (strchoicePlayer2 == "Ciseaux") {
				System.out.println("*************** VICTOIRE Joueur 1 ***************");
				tableauScoreFinal[numberRound - 1][0]++;
			} else {
				if (gameMode == 1) {
					System.out.println("***************** VICTOIRE de l'IA ***************");
				} else {
					System.out.println("**************** VICTOIRE Joueur 2 **************");
				}
				tableauScoreFinal[numberRound - 1][1]++;
			}
		}

	}

	/**
	 * 
	 * @param tableauScoreFinal
	 * @param gameMode
	 */
	public static void printWinnerOfGame() {
		int scoreJoueur1 = 0;
		int scoreJoueur2 = 0;

		for (int i = 0; i < tableauScoreFinal.length; i++) {
			scoreJoueur1 += tableauScoreFinal[i][0];
			scoreJoueur2 += tableauScoreFinal[i][1];
		}

		if (gameMode == 1) {
			if (scoreJoueur1 < scoreJoueur2) {
				System.out.println("\nL'IA GAGNE LA PARTIE\n");
				System.out.println("Score IA : " + scoreJoueur2);
				System.out.println("Score Joueur 1 : " + scoreJoueur1);
			} else {
				System.out.println("\nJoueur 1 GAGNE LA PARTIE\n");
				System.out.println("Score Joueur 1 : " + scoreJoueur1);
				System.out.println("Score IA  : " + scoreJoueur2);
			}
		} else if (scoreJoueur1 > scoreJoueur2) {
			System.out.println("\nJoueur 1 GAGNE LA PARTIE\n");
			System.out.println("Score Joueur 1 : " + scoreJoueur1);
			System.out.println("Score Joueur 2 : " + scoreJoueur2);
		} else {
			System.out.println("\nJoueur 2 GAGNE LA PARTIE\n");
			System.out.println("Score Joueur 2 : " + scoreJoueur2);
			System.out.println("Score Joueur 1 : " + scoreJoueur1);
		}

	}

	/**
	 * Print the winner results of choices and winner
	 */
	public static void printChoice() {
		clearConsole();
		titleGame();
		System.out.print("\n....3");
		wait(1000);
		System.out.print("....2");
		wait(1000);
		System.out.println("....1");
		wait(1000);

		if (gameMode == 1) {
			System.out.println("\nJoueur 1 : " + strchoicePlayer1);
			printGoodDrawLeft();
			System.out.println("\n                            L'ordinateur : " + strchoicePlayer2 + "\n");
			printGoodDrawRight();
		} else {
			System.out.println("Joueur 1 : " + strchoicePlayer1);
			printGoodDrawLeft();
			System.out.println("Joueur 2 : " + strchoicePlayer2 + "\n");
			printGoodDrawRight();
		}

		winnerRound();
		numberRound++;
		round();
	}

	/**
	 * Allow the user to replay or quit my game
	 */
	public static void endMessage(int numberRound, int[][] tableauScoreFinal, int gameMode) {
		printWinnerOfGame();
		numberRound = 0;
		System.out.println("\n(1) Rejouer                           (2) Quitter");
		int finalChoice = Clavier.lireInt();
		clearConsole();
		titleGame();
		switch (finalChoice) {
		case 1:
			gameMode();
			break;
		case 2:
			System.exit(0);
			break;
		default:
			System.out.println("Saisissez 1 ou 2");
			endMessage(numberRound, tableauScoreFinal, gameMode);
			break;
		}
	}

	/**
	 * 
	 */
	public static void round() {

		if (numberRound < 4) {
			System.out.println("\n--------------------- Manche " + numberRound + " -------------------\n");
			demandeChoix();
		} else {
			endMessage(numberRound, tableauScoreFinal, gameMode);
		}
	}

	/**
	 * Ask the anwser of players and IA and convert in String
	 * 
	 * @param PlayerTurn
	 */
	public static void demandeChoix() {
		int choicePlayer = 0;
		strchoicePlayer1 = "";
		strchoicePlayer2 = "";
		intChoicePlayer1 = 0;
		intChoicePlayer2 = 0;

		int playerTurn = 1;

		while ((choicePlayer != 1 && choicePlayer != 2 && choicePlayer != 3) || strchoicePlayer2 == "") {

			if (strchoicePlayer1 == "") {
				playerTurn = 1;
			} else if (strchoicePlayer1 != "" && strchoicePlayer2 == "") {
				playerTurn = 2;
			}

			if (playerTurn == 2 && gameMode == 1) {
				choicePlayer = (int) (Math.random() * 3 + 1);
			} else {
				System.out.println("Joueur " + playerTurn + " : saisissez un nombre");
				System.out.println("(1) : Pierre\n(2) : Feuille\n(3) : Ciseaux\n");
				choicePlayer = Clavier.lireInt();
			}

			switch (choicePlayer) {
			case 1:
				if ((playerTurn == 1 && gameMode == 1) || (playerTurn == 1 && gameMode == 2)) {
					strchoicePlayer1 = "Pierre";
				} else if (playerTurn == 2 && gameMode == 2) {
					strchoicePlayer2 = "Pierre";
				} else if (playerTurn == 2 && gameMode == 1) {
					strchoicePlayer2 = "Pierre";
				}
				break;
			case 2:
				if ((playerTurn == 1 && gameMode == 1) || (playerTurn == 1 && gameMode == 2)) {
					strchoicePlayer1 = "Feuille";
				} else if (playerTurn == 2 && gameMode == 2) {
					strchoicePlayer2 = "Feuille";
				} else if (playerTurn == 2 && gameMode == 1) {
					strchoicePlayer2 = "Feuille";
				}
				break;
			case 3:
				if ((playerTurn == 1 && gameMode == 1) || (playerTurn == 1 && gameMode == 2)) {
					strchoicePlayer1 = "Ciseaux";
				} else if (playerTurn == 2 && gameMode == 2) {
					strchoicePlayer2 = "Ciseaux";
				} else if (playerTurn == 2 && gameMode == 1) {
					strchoicePlayer2 = "Ciseaux";
				}
				break;
			default:
				System.out.println("\nSaisissez 1, 2 ou 3\n");
				break;
			}

		}

		printChoice();

	}

	public static void printRockLeft() {
		System.out.println("       _______");
		System.out.println("  ----'   ____)");
		System.out.println("         (_____)");
		System.out.println("         (_____)");
		System.out.println("         (____)");
		System.out.println("  ----.__(___)");
	}

	public static void printLeafLeft() {
		System.out.println("         ________");
		System.out.println("   -----'    ____)____");
		System.out.println("                ______)");
		System.out.println("               _______)");
		System.out.println("              _______)");
		System.out.println("   -----.__________)");
	}

	public static void printScissorsLeft() {
		System.out.println("        _______");
		System.out.println("   ----'   ____)____");
		System.out.println("              ______)");
		System.out.println("           __________)");
		System.out.println("          (____)");
		System.out.println("   ----.__(___)");
	}

	public static void printRockRight() {
		System.out.println("                                   _______       ");
		System.out.println("                                  (____   '------");
		System.out.println("                                 (_____)         ");
		System.out.println("                                 (_____)         ");
		System.out.println("                                 (____)          ");
		System.out.println("                                  (___)__.-------\n");
	}

	public static void printLeafRight() {
		System.out.println("                                    ________     ");
		System.out.println("                               ____(____    '----");
		System.out.println("                              (______            ");
		System.out.println("                              (_______           ");
		System.out.println("                               (_______          ");
		System.out.println("                                (__________.-----\n");
	}

	public static void printScissorsRight() {
		System.out.println("                                   _______       ");
		System.out.println("                              ____(____   '------");
		System.out.println("                             (______             ");
		System.out.println("                            (__________          ");
		System.out.println("                                  (____)         ");
		System.out.println("                                   (___)__.------\n\n");
	}

	public static void printGoodDrawLeft() {

		if (strchoicePlayer1 == "Pierre") {
			printRockLeft();
		} else if (strchoicePlayer1 == "Feuille") {
			printLeafLeft();
		} else if (strchoicePlayer1 == "Ciseaux") {
			printScissorsLeft();
		}
	}

	public static void printGoodDrawRight() {

		if (strchoicePlayer2 == "Pierre") {
			printRockRight();
		} else if (strchoicePlayer2 == "Feuille") {
			printLeafRight();
		} else if (strchoicePlayer2 == "Ciseaux") {
			printScissorsRight();
		}

	}

	/**
	 * ----------------- utils -----------------
	 */

	/**
	 * SetTimeOut function
	 *
	 * @param runnable
	 * @param delay
	 */
	public static void setTimeout(Runnable runnable, int delay) {
		new Thread(() -> {
			try {
				Thread.sleep(delay);
				runnable.run();
			} catch (Exception e) {
				System.err.println(e);
			}
		}).start();
	}

	/*
	 * SetTimeOut the next instruction
	 * 
	 * @param delay int (time in millisecond)
	 */
	public static void wait(int delay) {

		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*
	 * Clear console
	 */
	public static void clearConsole() {
		for (int i = 0; i < 50; i++) {
			System.out.println("\n");
		}
	}

}
