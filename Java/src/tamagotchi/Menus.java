package tamagotchi;

public class Menus {
	
	Actions actions = new Actions();
	Utils utils = new Utils();

	String separatorThin = "\n--------------------------------------------------------\n";
	String separatorBold = "===========================================================";

	/**
	 * 
	 */
	public void title() {
		System.out.println(" _______                                _       _     _ ");
		System.out.println("|__   __|                              | |     | |   (_)");
		System.out.println("   | | __ _ _ __ ___   __ _  __ _  ___ | |_ ___| |__  _ ");
		System.out.println("   | |/ _` | '_ ` _ \\ / _` |/ _` |/ _ \\| __/ __| '_ \\| |");
		System.out.println("   | | (_| | | | | | | (_| | (_| | (_) | || (__| | | | |");
		System.out.println("   |_|\\__,_|_| |_| |_|\\__,_|\\__, |\\___/ \\__\\___|_| |_|_|");
		System.out.println("                             __/ |                      ");
		System.out.println("                            |___/                       ");
	}

	/**
	 * Menu for choose the type
	 */
	public void type() {
		System.out.println(separatorThin);
		System.out.println("> Choisissez votre type de compagnon :\n");
		System.out.println("- (1) : Chien\n- (2) : Chat\n");
	}

	/**
	 * 
	 */
	public void menuTop() {
		System.out.println(separatorBold);
		System.out.print("  (1)INFORMATIONS  ");
		System.out.print("  (2)FEEDING TIME   ");
		System.out.print("  (3)TOILET   ");
		System.out.println("  (4)PLAYTIME   ");
		System.out.println(separatorBold);
	}

	/**
	 * 
	 */
	public void menuBot() {
		System.out.println(separatorBold);
		System.out.print("      (5)DISCIPLINE   ");
		System.out.print("  (6)HEALTH   ");
		System.out.print("  (7)LIGHTS   ");
		System.out.println("  (8)NOTEBOOK   ");
		System.out.println("  (9)CUSTOM  ");
		System.out.println(separatorBold);
	}

	/**
	 * 
	 */
	public void startGame() {
		utils.clearConsole();
		title();
	}

	public void sexe(Tamagotchi myTama) {
		if (myTama.getSexe() == "Garçon") {
			System.out.println("C'est un garçon !");
		} else {
			System.out.println("C'est une fille !");
		}
	}

	public void typeChoosen(Tamagotchi myTama) {
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
	public void name(String type) {
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
	public void nameChoosen(Tamagotchi myTama) {
		System.out.println(separatorThin);
		System.out.println("Votre " + myTama.getType() + " s'appelle maintenant " + myTama.getName() + ".");
		System.out.println(separatorThin);
	}

	public void loading() {
		System.out.print("Chargement ");
		utils.sleep(1000);
		System.out.print(". ");
		utils.sleep(1000);
		System.out.print(". ");
		utils.sleep(1000);
		System.out.println(".");
	}

	// -------------- Game

	public void game(Tamagotchi myTama) {
		startGame();
		menuTop();
		// TODO : if is cat
		myTama.drawMyTama();
		menuBot();
	}

}
