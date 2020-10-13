package tamagotchi;

import outils.Clavier;

public class MainTamagotchi {

	Tamagotchi myTama;

	public static void main(String[] args) throws InterruptedException {

		Tamagotchi myTama = new Tamagotchi();

		// Set type of Tamagotchi
		clearConsole();
		menuStart();
		sleep(1000);
		clearConsole();
		menuStart();
		myTama.setType(choiceType());

		// Set name of Tamagotchi
		clearConsole();
		menuStart();
		menuName(myTama.getType());
		myTama.setName(choiceName(myTama.getType()));

//		sleep(2000);
//		clearConsole();
//		menuStart();
//		mainMyTama(myTama.getName());
//		
//		drawEgg();

		// Egg Tama
		moveEgg(myTama);
		menuStart();
		clearConsole();
		menuTop();
		drawCat();
		menuBot();

	}

	/*
	 * Menu game
	 */
	public static void mainMyTama(String nameMyTama) {
		System.out.println("\n*********************************************************");
		System.out.println(nameMyTama.toUpperCase());
		System.out.println("*********************************************************");
	}

	/**
	 * Menu for choose the type
	 */
	public static void menuType() {
		System.out.println("\n--------------------------------------------------------\n");
		System.out.println("> Choisissez votre type de compagnon :\n");
		System.out.println("- (1) : Chien\n- (2) : Chat");
	}

	/**
	 * Allow the gamer to choose the type of tama
	 * 
	 * @return String typeStr
	 */
	public static String choiceType() {
		int intType = 0;
		String typeStr = null;
		boolean correctChoice = true;

		do {

			if (!correctChoice && typeStr == null) {
				System.out.println("\n--------------------------------------------------------\n");
				System.out.println("Erreur : Saisissez 1,2,3,4 ou 5");
			}

			menuType();

			intType = Clavier.lireInt();

			switch (intType) {
			case 1:
				typeStr = "Chien";
				break;
			case 2:
				typeStr = "Chat";
				break;
			default:
				correctChoice = false;
				break;
			}

		} while (!correctChoice && typeStr == null);

		System.out.println("\n--------------------------------------------------------\n");

		return typeStr;

	}

	/**
	 * Menu for choose a name of tama
	 * 
	 * @param type
	 */
	public static void menuName(String type) {
		System.out.println("\n--------------------------------------------------------\n");
		System.out.println("> Donnez un nom à votre " + type + " :");
		System.out.println("\n--------------------------------------------------------\n");
	}

	/**
	 * Allow the gamer to choose the name of tama
	 * 
	 * @param type
	 * @return String choiceName
	 */
	public static String choiceName(String type) {
		String choiceName = Clavier.lireString();
		System.out.println("\n--------------------------------------------------------\n");
		System.out.println("> Votre " + type + " s'appelle maintenant " + choiceName + ".");

		return choiceName;
	}

	/**
	 * Clear console
	 */
	public static void clearConsole() {
		for (int i = 0; i < 150; i++) {
			System.out.println();
		}

	}

	/**
	 * SetTimeOut
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

	public static void menuStart() {
		System.out.println(" _______                                _       _     _ ");
		System.out.println("|__   __|                              | |     | |   (_)");
		System.out.println("   | | __ _ _ __ ___   __ _  __ _  ___ | |_ ___| |__  _ ");
		System.out.println("   | |/ _` | '_ ` _ \\ / _` |/ _` |/ _ \\| __/ __| '_ \\| |");
		System.out.println("   | | (_| | | | | | | (_| | (_| | (_) | || (__| | | | |");
		System.out.println("   |_|\\__,_|_| |_| |_|\\__,_|\\__, |\\___/ \\__\\___|_| |_|_|");
		System.out.println("                             __/ |                      ");
		System.out.println("                            |___/                       ");
	}

	public static void doNothing() {
	}

	private static Object LOCK = new Object();

	@SuppressWarnings("unused")
	public static void sleepWait() throws InterruptedException {

		Thread.sleep(1000);

		synchronized (LOCK) {
			LOCK.wait(1000);
		}
	}

	@SuppressWarnings("unused")
	public static void sleep(int x) throws InterruptedException {
		Thread.sleep(x);
	}

//	@Override
//	public void wait() throws InterruptedException {
//	    synchronized (LOCK) {
//	        LOCK.wait(1000);
//	    }
//	}

	public static void afficheStat(Tamagotchi myTama) {
		System.out.println("\t\t\t Temps de vie restant : " + myTama.getDayLife() + " jours");
		System.out.println("Vie : " + myTama.getHealth());
		System.out.println("Faim : " + myTama.getHungry());
		System.out.println("Soif : " + myTama.getThristy());

		System.out.println("Poids : " + myTama.getWeight() + " kg");
		System.out.println("Taille : " + myTama.getSize() + " cm");
	}


//	public static void lenghtDecor(String tamaName) {
//		String str = "--------------------------------------------------------";
//		System.out.println(str.length());
//		int nameTamaLenght = tamaName.length();
//		
//	}

	public static void drawEgg() {
		System.out.println("    .''`.");
		System.out.println("   /   " + "  \\");
		System.out.println("  :       :");
		System.out.println("  :       :");
		System.out.println("   `.___,'");
	}

	public static void drawEgg2() {
		System.out.println("   .''`. ¤");
		System.out.println("  /   " + "  \\");
		System.out.println(" :       :");
		System.out.println(" :       :");
		System.out.println("¤ `.___.'");
	}

	public static void moveEgg(Tamagotchi myTama) throws InterruptedException {

		for (int i = 0; i < 2; i++) {
			clearConsole();
			menuStart();
			mainMyTama(myTama.getName());
			drawEgg();
			sleep(2000);
			clearConsole();
			menuStart();
			mainMyTama(myTama.getName());
			drawEgg2();
			sleep(2000);
			clearConsole();
			menuStart();
			mainMyTama(myTama.getName());
			drawEgg();
		}

	}

	public static void drawCat() {

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@#((((((@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@//(####(/%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#//####(//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@**&@#//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#/*@@@@@@@**&@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@**@@#**@@@@@@@**&@%*/@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@#/*(#**%@@@@@@@@@##**(@@,/%@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@(*/####/**********,&@@@@,*%@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@(**######(#(@@@@@@@@@@@@,*&@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@**((#####(###(@@@@@@@@@@@@@@(*(@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@**(###%  *((@@@@@@@@@, *@@@@(*(@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@&****(######&@@@@. *@@@@@@@@@@@(****@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@/*&@@@@@@@@@,,,,,,,@@@@@@@@@(*(@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@&/*((**/@@@@@@@@@@@@@@@@@@@@@**(((**@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@&((((((/*/******************/#((((((@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@&##(((((((**%@@@@/*(&@@@/*/(((((((#(@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@%%#((((//(##**((/**##(//((((%%&@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@&%%%&(((////(((////((#%%%%@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

	}
	
	public static void menuTop() {
		System.out.println("====================================================================");
		System.out.print("  (1)HUNGER METER   ");
		System.out.print("  (2)FEEDING TIME   ");
		System.out.print("  (3)TOILET   ");
		System.out.println("  (4)PLAYTIME   ");
		System.out.println("====================================================================");

	}
	
	public static void menuBot() {
		System.out.println("====================================================================");
		System.out.print("      (5)DISCIPLINE   ");
		System.out.print("  (6)HEALTH   ");
		System.out.print("  (7)LIGHTS   ");
		System.out.println("  (8)NOTEBOOK   ");
		System.out.println("====================================================================");
	}

}
