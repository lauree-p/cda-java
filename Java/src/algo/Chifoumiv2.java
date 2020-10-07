package algo;

import outils.Clavier;

public class Chifoumiv2 {
;
	public static void main(String[] args) {
		int[][] tableauScoreFinal = new int[3][2];

		clearConsole();
		printTitleGame();
		setTimeout(() -> gameMode(0, 0, tableauScoreFinal, getRound()), 1000);
	}

	/**
	 * Print Title of game
	 */
	public static void printTitleGame() {
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
	 * Print title of game mode 1 player vs IA
	 */
	public static void printTitleMode1() {
		System.out.println("\n                  1 Joueur VS IA                \n");
	}

	/**
	 * Print title of game mode 2 players
	 */
	public static void printTitleMode2() {
		System.out.println("\n                     2 Joueurs                   \n");
	}

	/**
	 * Print menu game mode
	 */
	public static void printMenuGameMode() {
		System.out.println("\n------------ Choisissez un mode de jeu -----------");
		System.out.println("\n(1) - Contre l'IA \n(2) - 2 Joueurs\n(3) - Quitter\n");
	}

	/**
	 * Ask the user for the value of gameMode
	 * 
	 * @return gameMode
	 */
	public static int inputUsergameMode() {
		int gameMode = 0;
		gameMode = Clavier.lireInt();

		return gameMode;
	}

	/**
	 * Different actions to be carried out according to the value of gameMode
	 * @param choicePlayer1 
	 * @param choicePlayer1 
	 * @param choicePlayer2 
	 * @param numberRound 
	 */
	public static void gameMode(int choicePlayer1,int choicePlayer2, int[][] tableauScoreFinal, int numberRound) {
		printMenuGameMode();
		int gameMode = Clavier.lireInt();
		//int gameMode = inputUsergameMode();

		switch (gameMode) {
		case 1:
			clearConsole();
			printTitleGame();
			printTitleMode1();
			printRound();
			askChoice(gameMode);
			clearConsole();
			printChoice(gameMode,choicePlayer1 ,choicePlayer2);
			winnerRound(choicePlayer1,choicePlayer2,tableauScoreFinal,numberRound,gameMode);
			printRound();
			break;
		case 2:
			printTitleGame();
			printTitleMode2();
			newRoundOrFinish(gameMode,tableauScoreFinal,choicePlayer1,choicePlayer2);
			//askChoice(gameMode);
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("Saisissez 1, 2 ou 3");
			gameMode(choicePlayer1,choicePlayer2,tableauScoreFinal,numberRound);
			break;
		}
	}

	/**
	 * Print the number of round
	 */
	public static void printRound() {
		System.out.println("\n--------------------- Manche " + incrementRound(getRound()) + " -------------------\n");
	}

	/**
	 * Allow the user to replay or quit my game
	 */
	public static void endMessage(int numberRound, int choicePlayer1, int choicePlayer2,int[][] tableauScoreFinal, int gameMode) {
		printWinnerOfGame(tableauScoreFinal, gameMode);
		numberRound = 0;
		System.out.println("\n(1) Rejouer                           (2) Quitter");
		int finalChoice = Clavier.lireInt();
		clearConsole();
		printTitleGame();
		switch (finalChoice) {
		case 1:
			gameMode(choicePlayer1,choicePlayer2,tableauScoreFinal,numberRound);
			break;
		case 2:
			System.exit(0);
			break;
		default:
			System.out.println("Saisissez 1 ou 2");
			endMessage(numberRound,choicePlayer1,choicePlayer2,tableauScoreFinal,gameMode);
			printWinnerOfGame(tableauScoreFinal, gameMode);
			break;
		}
	}

	/**
	 * Different actions to be carried out according to the value of numberRound
	 * @param gameMode 
	 * @param tableauScoreFinal 
	 * @param choicePlayer1 
	 * @param choicePlayer2 
	 */
	public static void newRoundOrFinish(int gameMode, int[][] tableauScoreFinal, int choicePlayer1, int choicePlayer2) {
		// 3 rounds
		if (getRound() < 4) {
			printRound();
			askChoice(gameMode);
		} else {
			endMessage(getRound(),choicePlayer1,choicePlayer2,tableauScoreFinal,gameMode);
		}
	}

	/**
	 * 
	 * @param playerTurn
	 */
	public static void printMenuChoice(int playerTurn) {
		System.out.println("Joueur " + playerTurn + " : saisissez un nombre");
		System.out.println("(1) : Pierre\n(2) : Feuille\n(3) : Ciseaux\n");
	}

	/**
	 * Ask choice player with input
	 * 
	 * @return choicePlayer
	 */
	public static int inputChoice() {
		int choicePlayer = Clavier.lireInt();

		return choicePlayer;
	}

	/**
	 * Choice of player , player or computer
	 * 
	 * @param playerTurn
	 * @param gameMode
	 * @param choicePlayer
	 * @return 
	 */
	public static int choicePlayer(int player, int gameMode, int choicePlayer) {
		// if it's the computer's turn
		if (player == 2 && gameMode == 1) {
			choicePlayer = getRandomNumber(3, 1);
		} else {
			printMenuChoice(player);
			choicePlayer = inputChoice();
		}
		return choicePlayer;
	}

	/**
	 * 
	 * @param gameMode
	 */
	public static void askChoice(int gameMode) {
		int choicePlayer = 0;
		// reset value for new game
		int choicePlayer1 = 0;
		int choicePlayer2 = 0;
		int player = 1;

		while (choicePlayer2 == 0 || choicePlayer == 0) {

			if (choicePlayer1 == 0) {
				player = 1;
			} else if (choicePlayer2 == 0) {
				player = 2;
			}

			choicePlayer = choicePlayer(player, gameMode, choicePlayer);

			switch (choicePlayer) {
			case 1:
				if ((player == 1 && gameMode == 1) || (player == 1 && gameMode == 2)) {
					choicePlayer1 = choicePlayer;
				} else if (player == 2 && gameMode == 1 || gameMode == 2) {
					choicePlayer2 = choicePlayer;
				}
				break;
			case 2:
				if ((player == 1 && gameMode == 1) || (player == 1 && gameMode == 2)) {
					choicePlayer1 = choicePlayer;
				} else if (player == 2 && gameMode == 1 || gameMode == 2) {
					choicePlayer2 = choicePlayer;
				}
				break;
			case 3:
				if ((player == 1 && gameMode == 1) || (player == 1 && gameMode == 2)) {
					choicePlayer1 = choicePlayer;
				} else if (player == 2 && gameMode == 1 || gameMode == 2) {
					choicePlayer2 = choicePlayer;
				}
				break;
			default:
				System.out.println("\nSaisissez 1, 2 ou 3\n");
				askChoice(gameMode);
				break;
			}
		}
		
	}

	/**
	 * Get random number
	 * 
	 * @param max
	 * @param min
	 * @return random
	 */
	public static int getRandomNumber(int max, int min) {
		int random = (int) (Math.random() * max + min);

		return random;
	}

	/**
	 * Condition of victory 1 3 2 1 3 2 La Pierre bat le Ciseau, La Feuille bat la
	 * Pierre, Le Ciseau bat la Feuille
	 * @param choicePlayer1 
	 * @param choicePlayer2 
	 */
	public static void winnerRound(int choicePlayer1, int choicePlayer2, int[][] tableauScoreFinal, int numberRound,int gameMode) {
		String egalite = "******************** EGALITE ! *******************";
		String victoryPlayer1 = "*************** VICTOIRE Joueur 1 ***************";
		String victoryPlayer2 = "**************** VICTOIRE Joueur 2 **************";
		String victoryAI = "***************** VICTOIRE de l'IA ***************";
		
		if (choicePlayer1 == choicePlayer2) {
			System.out.println(egalite);
			tableauScoreFinal[numberRound - 1][0]++;
			tableauScoreFinal[numberRound - 1][1]++;
		} 
		
		switch (choicePlayer1) {
		case 1 : 
			if (choicePlayer2 == 3) {
				System.out.println(victoryPlayer1);
				tableauScoreFinal[numberRound - 1][0]++;
			} else {
				if (gameMode == 1) {
					System.out.println(victoryAI);
				} else {
					System.out.println(victoryPlayer2);
				}
				tableauScoreFinal[numberRound - 1][1]++;
			}
			break;
		case 2 : 
			if (choicePlayer2 == 1) {
				System.out.println(victoryPlayer1);
				tableauScoreFinal[numberRound - 1][0]++;
			} else {
				if (gameMode == 1) {
					System.out.println(victoryAI);
				} else {
					System.out.println(victoryPlayer2);
				}
				tableauScoreFinal[numberRound - 1][1]++;
			}
			break;
		case 3 : 
			if (choicePlayer2 == 2) {
				System.out.println(victoryPlayer1);
				tableauScoreFinal[numberRound - 1][0]++;
			} else {
				if (gameMode == 1) {
					System.out.println(victoryAI);
				} else {
					System.out.println(victoryPlayer2);
				}
				tableauScoreFinal[numberRound - 1][1]++;
			}
			break;
		}
	}
	
	/**
	 * 
	 * @param tableauScoreFinal
	 * @param gameMode
	 */
	public static void printWinnerOfGame(int[][] tableauScoreFinal, int gameMode) {
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

	public static void printDelay() {
		System.out.print("\n....3");
		wait(1000);
		System.out.print("....2");
		wait(1000);
		System.out.println("....1");
		wait(1000);
	}

	/**
	 * Print the winner results of choices and winner
	 * @param tableauScoreFinal 
	 */
	public static void printChoice(int gameMode, int choicePlayer1 , int choicePlayer2) {
		printDelay();
		clearConsole();
		printTitleGame();

		if (gameMode == 1) {
			System.out.println("\nJoueur 1 : " + choiceToString(choicePlayer1));
			printGoodDrawLeft(choicePlayer1);
			System.out.println("\n                            L'ordinateur : " + choiceToString(choicePlayer2) + "\n");
			printGoodDrawRight(choicePlayer2);
		} else {
			System.out.println("Joueur 1 : " + choiceToString(choicePlayer1));
			printGoodDrawLeft(choicePlayer1);
			System.out.println("Joueur 2 : " + choiceToString(choicePlayer2) + "\n");
			printGoodDrawRight(choicePlayer2);
		}
	}
	
	//incrementRound(getRound());
	//newRoundOrFinish(gameMode,tableauScoreFinal);
	public static int incrementRound(int round) {
		round = getRound();
		round++;
		
		return round;
	}
	
	public static int getRound() {
		int round = 0;
		return round;
	}

	public static String choiceToString(int choicePlayer) {
		String strchoicePlayer = null;
		switch (choicePlayer) {
		case 1 :
			strchoicePlayer = "Pierre";
			break;
		case 2 :
			strchoicePlayer = "Feuille";
			break;
		case 3:
			strchoicePlayer= "Ciseaux";
			break;
		}
		
		return strchoicePlayer;
	}

	/**
	 * Print rock to the left
	 */
	public static void printRockLeft() {
		System.out.println("       _______");
		System.out.println("  ----'   ____)");
		System.out.println("         (_____)");
		System.out.println("         (_____)");
		System.out.println("         (____)");
		System.out.println("  ----.__(___)");
	}

	/*
	 * Print leaf to the left
	 */
	public static void printLeafLeft() {
		System.out.println("         ________");
		System.out.println("   -----'    ____)____");
		System.out.println("                ______)");
		System.out.println("               _______)");
		System.out.println("              _______)");
		System.out.println("   -----.__________)");
	}

	/*
	 * Print scissors to the left
	 */
	public static void printScissorsLeft() {
		System.out.println("        _______");
		System.out.println("   ----'   ____)____");
		System.out.println("              ______)");
		System.out.println("           __________)");
		System.out.println("          (____)");
		System.out.println("   ----.__(___)");
	}

	/*
	 * Print rock to the right
	 */
	public static void printRockRight() {
		System.out.println("                                   _______       ");
		System.out.println("                                  (____   '------");
		System.out.println("                                 (_____)         ");
		System.out.println("                                 (_____)         ");
		System.out.println("                                 (____)          ");
		System.out.println("                                  (___)__.-------\n");
	}

	/*
	 * Print leaf to the right
	 */
	public static void printLeafRight() {
		System.out.println("                                    ________     ");
		System.out.println("                               ____(____    '----");
		System.out.println("                              (______            ");
		System.out.println("                              (_______           ");
		System.out.println("                               (_______          ");
		System.out.println("                                (__________.-----\n");
	}

	/*
	 * Print scissors to the right
	 */
	public static void printScissorsRight() {
		System.out.println("                                   _______       ");
		System.out.println("                              ____(____   '------");
		System.out.println("                             (______             ");
		System.out.println("                            (__________          ");
		System.out.println("                                  (____)         ");
		System.out.println("                                   (___)__.------\n\n");
	}

	/**
	 * Allows to print the right sign on the left side
	 * 
	 * @param choicePlayer1
	 */
	public static void printGoodDrawLeft(int choicePlayer1) {
		if (choicePlayer1 == 1) {
			printRockLeft();
		} else if (choicePlayer1 == 2) {
			printLeafLeft();
		} else {
			printScissorsLeft();
		}
	}

	/**
	 * Allows to print the right sign on the right side
	 * 
	 * @param choicePlayer2
	 */
	public static void printGoodDrawRight(int choicePlayer2) {
		if (choicePlayer2 == 1) {
			printRockRight();
		} else if (choicePlayer2 == 2) {
			printLeafRight();
		} else {
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

	/**
	 * SetTimeOut the next instruction
	 * 
	 * @param delay
	 */
	public static void wait(int delay) {
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/*
	 * Clear console with println
	 */
	public static void clearConsole() {
		for (int i = 0; i < 50; i++) {
			System.out.println("\n");
		}
	}

}
