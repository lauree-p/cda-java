package tamagotchi;

import tools.Utils;

public class Menus {
	
	Tamagotchi myTama;

	static String separatorThin = "\n------------------------------------------------------------------\n";
	static String separatorBold = "====================================================================";

	/**
	 * 
	 */
	public static void title() {
		System.out.println("     _______                                _       _     _ ");
		System.out.println("    |__   __|                              | |     | |   (_)");
		System.out.println("       | | __ _ _ __ ___   __ _  __ _  ___ | |_ ___| |__  _ ");
		System.out.println("       | |/ _` | '_ ` _ \\ / _` |/ _` |/ _ \\| __/ __| '_ \\| |");
		System.out.println("       | | (_| | | | | | | (_| | (_| | (_) | || (__| | | | |");
		System.out.println("       |_|\\__,_|_| |_| |_|\\__,_|\\__, |\\___/ \\__\\___|_| |_|_|");
		System.out.println("                                 __/ |                      ");
		System.out.println("                                |___/                       ");
	}

	/**
	 * Menu for choose the type
	 */
	public static void type() {
		System.out.println(separatorThin);
		System.out.println("> Choisissez votre type de compagnon :\n");
		System.out.println("- (1) : Chien\n- (2) : Chat\n");
	}

	/**
	 * 
	 */
	public static void menuTop() {
		System.out.println(separatorBold);
		System.out.print("  (1)INFORMATIONS    ");
		System.out.print("(2)FEEDING TIME     ");
		System.out.print("(3)TOILET      ");
		System.out.println("(4)PLAYTIME     ");
		System.out.println(separatorBold);
	}

	/**
	 * 
	 */
	public static void menuBot() {
		System.out.println(separatorBold);
		System.out.print(" (5)DISCIPLINE   ");
		System.out.print("(6)HEALTH   ");
		System.out.print("(7)LIGHTS   ");
		System.out.print("(8)NOTEBOOK   ");
		System.out.println("(9)CUSTOM");
		System.out.println(separatorBold);
	}	
	
	
	/**
	 *                      
	 */
	public static void menuTotEmpty() {
		System.out.println(separatorBold);
		System.out.println("");
		System.out.println(separatorBold);
	}	
	
	/**
	 *                      
	 */
	public static void menuBotEmpty() {
		System.out.println(separatorBold);
		System.out.println("");
		System.out.println(separatorBold);
	}	

	/**
	 *                      
	 */
	public static void menuTopInformations() {
		System.out.println(separatorBold);
		System.out.println("  (1)INFORMATIONS    ");
		System.out.println(separatorBold);
	}	
	

	
	/**
	 * 
	 */
	public static void startGame() {
		Utils.clearConsole();
		title();
	}

	public static void sexe(Tamagotchi myTama) {
		if (myTama.getSexe() == "Garçon") {
			System.out.println("C'est un garçon !");
		} else {
			System.out.println("C'est une fille !");
		}
	}

	public static void typeChoosen(Tamagotchi myTama) {
		if (myTama.getType() == "Chien") {
			System.out.println("\nVous avez choisit un chien !");
		} else {
			System.out.println("\\nVous avez choisit un chat !");
		}

		System.out.println(separatorThin);
	}

	/**
	 * Menu for choose a name of tama
	 * 
	 * @param type
	 */
	public static void name(String type) {
		System.out.println(separatorThin);
		System.out.println("> Donnez un nom à votre " + type + " :\n");
	}

	/**
	 * Allow the gamer to choose the name of tama
	 * 
	 * @param type
	 * @return
	 * @return String choiceName
	 */
	public static void nameChoosen(Tamagotchi myTama) {
		System.out.println(separatorThin);
		System.out.println("Votre " + myTama.getType() + " s'appelle maintenant " + myTama.getName() + ".");
		System.out.println(separatorThin);
	}

	public static void loading() {
		System.out.print("Chargement ");
		Utils.sleep(1000);
		System.out.print(". ");
		Utils.sleep(1000);
		System.out.print(". ");
		Utils.sleep(1000);
		System.out.println(".");
	}

	// -------------- Game

	public static void game(Tamagotchi myTama) {
		startGame();
		menuTop();
		// TODO : if is cat
		myTama.drawMyTama();
		menuBot();
	}

}
