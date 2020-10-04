package tamagotchi;

import outils.Clavier;

public class MainTamagotchi {

	public static void main(String[] args) throws InterruptedException {

		Tamagotchi myTama = new Tamagotchi();

		clearConsole();
		menuStart();
		sleep(1000);
		clearConsole();
		menuStart();
		myTama.setType(choiceType());
		
		clearConsole();
		menuStart();
		menuName(myTama.getType());
		myTama.setName(choiceName(myTama.getType()));
		
		sleep(2000);
		clearConsole();
		menuStart();
		mainMyTama(myTama.getName());
		afficheStat(myTama);
		menuTama();

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
		System.out.println("- (1) : Chien\n- (2) : Chat\n- (3) : Poney\n- (4) : Hamster\n- (5) : Souris\n");
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
			case 3:
				typeStr = "Poney";
				break;
			case 4:
				typeStr = "Hamster";
				break;
			case 5:
				typeStr = "Souris";
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
		System.out.println("> Donnez un nom �votre " + type + " :");
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

	public static void menuAction() {
		System.out.println("- action : manger");
		System.out.println("- action : aller au toilette");
		System.out.println("- action : se teindre les cheveux, mais en roux");
		System.out.println("- action : se reposer");
		System.out.println("- action : se reproduire");
		System.out.println("- action : exprimer son humeur ex : sauter de joie");
		System.out.println("- action : voir des amis");
		System.out.println("- action : Faire du sport : augmente la santé");
		System.out.println("- action : mourir");
		System.out.println("- action : il peut enlever le masque ( caractéristique : masqué ou non )");
		System.out.println("- action : se laver");
	}
	
	public static void afficheStat(Tamagotchi myTama) {
		System.out.println("\t\t\t Temps de vie restant : "+myTama.getDayLife()+" jours");
		System.out.println("Vie : "+ myTama.getHealth());
		System.out.println("Faim : "+myTama.getHungry());
		System.out.println("Soif : "+myTama.getThristy());
		
		System.out.println("Poids : "+myTama.getWeight()+" kg");
		System.out.println("Taille : "+myTama.getSize() +" cm");
		
		
	}
	
	public static void menuTama() {
		System.out.println("\n(1) ACTION\t(2) ACTIVITES\t(3) QUITTER");
		System.out.println("________________________________________________________");
	}
	
//	public static void lenghtDecor(String tamaName) {
//		String str = "--------------------------------------------------------";
//		System.out.println(str.length());
//		int nameTamaLenght = tamaName.length();
//		
//	}
	
}
