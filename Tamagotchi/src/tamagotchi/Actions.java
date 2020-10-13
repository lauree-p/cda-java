package tamagotchi;

import tools.Clavier;
import tools.Utils;

public class Actions {
	
	public static void chooseAction(Tamagotchi myTama) {
		int intAction = Clavier.lireInt();
		switch (intAction) {
		case 1:
			informations(myTama);
			break;
		case 2:
			feedingTime(myTama);
			break;
		case 3:
			toilet();
			break;
		case 4:
			playTime();
			break;
		case 5:
			discipline();
			break;
		case 6:
			healh();
			break;
		case 7:
			lights();
			break;
		case 8:
			noteBook();
			break;
		case 9:
			custom();
			break;
		// TODO accessoires
		default:
			System.out.println("Erreur : Saisissez 1 ou 2");
			chooseAction(myTama);
			break;
		}
	}

	//-------------- Informations

	public static void informations(Tamagotchi myTama) {
		Utils.clearConsole();
		Menus.startGame();
		Menus.menuTopInformations();
		menuInformation(myTama);
		Menus.menuBotEmpty();
		chooseInformation(myTama);
	}

	public static void menuInformation(Tamagotchi myTama) {
		System.out.print("\n\t\t\t\t   Temps de vie restant : " + myTama.getDayLife() + " jours\n");
		System.out.print("\n\n\n");
		System.out.println("| Nom : " + myTama.getName());
		System.out.println("| Sexe : " + myTama.getSexe());
		System.out.println("| Couleur : " + myTama.getColor()+"\n");
		System.out.println("| Vie : " + myTama.getHealth());
		System.out.println("| Faim : " + myTama.getHungry());
		System.out.println("| Soif : " + myTama.getThristy()+"\n");
		System.out.println("| Poids : " + myTama.getWeight() + " kg");
		System.out.println("| Taille : " + myTama.getSize() + " cm"+"\n");
		System.out.println("| Humeur : " + myTama.getMood());
		System.out.println("| Hygiene : " + myTama.getHygiene());
		System.out.println("| Niveau de fatigue : " + myTama.getTirednesse());
		System.out.print("\n\n");
		System.out.println("\t\t\t\t\t\t\t(1)RETOUR\n");
		
	}
	
	public static void chooseInformation(Tamagotchi myTama) {
		int intActionInformation = Clavier.lireInt();

		switch (intActionInformation) {
		case 1:
			Menus.game(myTama);
			chooseAction(myTama);
			break;
		default:
			informations(myTama);
			break;
		}
	}
	
	//-------------- FeedingTime

	public static void feedingTime(Tamagotchi myTama) {
		Utils.clearConsole();
		Menus.startGame();
		Menus.menuTop();
		menuFeedingTime();
		Menus.menuBot();
		chooseFeedingTime(myTama);
	}
	
	public static void menuFeedingTime() {
		System.out.println("(1)MEAL");
		System.out.println("(2)DESSERT");
		System.out.println("(3)CANDY");
		System.out.println("\t\t\t(4)RETOUR");
	}
	
	public static void chooseFeedingTime(Tamagotchi myTama) {
		int intActionFeedingTime = Clavier.lireInt();

		switch (intActionFeedingTime) {
		case 1:
			// TODO eat
			break;
		case 2:
			// TODO eat
			break;
		case 3:
			// TODO eat
			break;
		case 4:
			Menus.game(myTama);
			chooseAction(myTama);
			break;
		case 5:

			break;
		default:
			feedingTime(myTama);
			break;
		}
	}
	
	//-------------- Toilet

	public static void toilet() {

	}

	public static void playTime() {

	}

	public static void discipline() {

	}

	public static void healh() {

	}

	public static void lights() {

	}

	public static void noteBook() {

	}
	
	public static void custom() {

	}
}
